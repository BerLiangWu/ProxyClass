package com.liang.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImplTwo userService=new UserServiceImplTwo();
        //代理角色
        ProxyImvocationHandler pin =new ProxyImvocationHandler();
        //设置要代理对象
        pin.setTarget(userService);
        //动态生成代理类
        UserService proxy=(UserService)pin.getProxy();
        //利用proxy调用方法

    }
}
