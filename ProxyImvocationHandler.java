package com.liang.demo03;
/**
 * 通用代理类
 * */
import com.liang.demo02.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//自动生成代理类
public class ProxyImvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //得到生成代理类
    public Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }




    //处理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        //动态代理的本质就是反射
        Object result=method.invoke(target,args);
        return result;
    }
}
