package com.pigmo.exceldemo.service;

import com.pigmo.exceldemo.annotation.ExcelElement;
import com.pigmo.exceldemo.bean.DemoBean;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

    public void export(String[] cols, HttpServletResponse response) throws NoSuchFieldException, IllegalAccessException, IOException {
        List<DemoBean> beans = new ArrayList<>();
        DemoBean demoBean = null;
        for (int i = 0; i < 10; i++) {
            demoBean = new DemoBean();
            demoBean.setName("测试名字"+i);
            demoBean.setCode("测试编码"+i);
            demoBean.setType("测试类型"+i);
            demoBean.setClient("测试客户端"+i);
            beans.add(demoBean);
        }


        SXSSFWorkbook book = new SXSSFWorkbook();
        SXSSFSheet sheet = book.createSheet("demo");
        SXSSFRow row = sheet.createRow(0);
        for (int i = 0; i < cols.length; i++) {
            Field field = DemoBean.class.getDeclaredField(cols[i]);
            String value = field.getAnnotation(ExcelElement.class).value();
            row.createCell(i).setCellValue(value);
        }
        for (int i = 0; i < beans.size(); i++) {
            row = sheet.createRow(i+1);
            for (int j = 0; j < cols.length; j++) {
                Field field = beans.get(i).getClass().getDeclaredField(cols[j]);
                field.setAccessible(true);
                Object o = field.get(beans.get(i));
                row.createCell(j).setCellValue(o.toString());
            }
        }
        ServletOutputStream outputStream = response.getOutputStream();
        book.write(outputStream);
    }
}
