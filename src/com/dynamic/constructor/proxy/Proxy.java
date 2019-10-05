package com.dynamic.constructor.proxy;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.proxy
 * @Date 2019/9/30 21:56
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void doSomething() {
        System.out.println("before you do something");
        realSubject.doSomething();
        System.out.println("after you do something");

    }
}
