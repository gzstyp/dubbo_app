package com.fwtai.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fwtai.api.UserService;
import com.fwtai.tool.ToolClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2018年5月6日 22:09:27
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
*/
@Controller
@RequestMapping("/user")
public class UserController{

    protected final Log logger = LogFactory.getLog(getClass());

    @Reference(version = "1.0.1")//注意:如果注解@Reference已标注有 version = "1.0.1" ,那接口实现的类肯定也有对应的 @Service(version = "1.0.1") [两个都是alibaba的注解]这样才一一对应的调用,这功能好使!
    private UserService userService;

    @RequestMapping({"","/","/index"})//http://localhost/user
    public String index(){
        return "hello";
    }

    @RequestMapping("/sys")//http://localhost/user/sys?name=typ&password=123456
    @ResponseBody
    public final void sys(final HttpServletRequest request,final HttpServletResponse response) throws IOException{
        final String name = request.getParameter("name");
        final String password = request.getParameter("password");
        final String result = userService.register(name,password);
        final String json = ToolClient.queryJson(result);
        ToolClient.responseJson(json,response);
    }
}