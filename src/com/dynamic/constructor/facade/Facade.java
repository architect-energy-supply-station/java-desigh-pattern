package com.dynamic.constructor.facade;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.facade
 * @Date 2019/9/30 9:09
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class Facade {
    private ServiceA serviceA;
    private ServiceB serviceB;
    private ServiceC serviceC;

    public Facade( ) {
        this.serviceA = new ServiceA();
        this.serviceB = new ServiceB();
        this.serviceC = new ServiceC();
    }

    public void someMethod() {
        serviceA.methodA();
        serviceB.methodB();
        serviceC.methodC();
    }



}
