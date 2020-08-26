package com.fwtai.api;

/**
 * 对外暴露的用户接口,一个接口可以有多个实现类哦!
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2019-04-08 2:32
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
*/
public interface UserService{

    String register(String userName,String password);

}