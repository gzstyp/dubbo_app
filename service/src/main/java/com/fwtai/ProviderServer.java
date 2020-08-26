package com.fwtai;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 这个只是在main测试时用,上线或部署后可以删除本类和方法
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2019-04-08 2:40
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
*/
public class ProviderServer{

    public static void main(String[] args) throws IOException{
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
        context.start();
        System.in.read();
    }

}