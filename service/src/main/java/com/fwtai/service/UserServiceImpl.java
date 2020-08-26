package com.fwtai.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fwtai.api.UserService;

/**
 * 对外暴露的用户接口实现
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2019-04-08 2:41
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
*/
@Service(version = "1.0.1",retries = 0)//注意:如果注解@Service已标注有 version = "1.0.1" ,则在调用方也必要写上对应的 @Reference(version = "1.0.1") [两个都是alibaba的注解]这样才一一对应的调用,这功能好使!
public class UserServiceImpl implements UserService{

    @Override
    public String register(String userName,String password){
        System.out.println("---------------------------------------------------------");
        System.out.println(String.format("接收到注册用户请求 - {userName:%s, password:%s}",userName, password));
        System.out.println("---------------------------------------------------------");
        return userName+",[20880],"+password;
    }
}