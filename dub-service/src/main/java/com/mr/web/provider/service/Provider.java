package com.mr.web.provider.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/1/7.
 */
public class Provider {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"http://127.0.0.1/dub-service/remote-provider.xml"});
        context.start();
        System.in.read();//��������˳�
    }
}
