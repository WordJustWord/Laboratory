package com.pigmo.netty.firstdemo;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;

public class HttpServerHander extends SimpleChannelInboundHandler<HttpObject> {
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, HttpObject httpObject) throws Exception {
        ByteBuf bf = Unpooled.copiedBuffer("Hello world", CharsetUtil.UTF_8);
        DefaultFullHttpResponse res = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK,bf);
        res.headers().set(HttpHeaderNames.CONTENT_TYPE,"text/plain");
        res.headers().set(HttpHeaderNames.CONTENT_LENGTH,bf.readableBytes());
        channelHandlerContext.writeAndFlush(res);
    }
}
