package com.pigmo.exceldemo.controller;

import com.pigmo.exceldemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class DemoController {
    @Autowired
    DemoService demoService;

    @PostMapping("/export")
    public ResponseEntity export(@RequestBody String cols, HttpServletResponse response){
        try {
            demoService.export(cols.split(","),response);
        } catch (NoSuchFieldException | IllegalAccessException | IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
