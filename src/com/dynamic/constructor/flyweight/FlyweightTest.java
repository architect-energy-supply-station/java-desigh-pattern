package com.dynamic.constructor.flyweight;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.flyweight
 * @Date 2019/9/30 11:23
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFacotry flyweightFacotry = new FlyweightFacotry();

 Flyweight flyweightA1=        flyweightFacotry.getFlyweight("A");
 Flyweight flyweightA2=        flyweightFacotry.getFlyweight("A");
 Flyweight flyweightA3=        flyweightFacotry.getFlyweight("A");



        Flyweight flyweight1 = flyweightFacotry.getFlyweight("B");
        Flyweight flyweight2 = flyweightFacotry.getFlyweight("B");



        flyweightA1.operation("red");
        flyweightA2.operation("blue");
        flyweightA3.operation("yellow");


        flyweight1.operation("green");
        flyweight2.operation("black");

        Flyweight flyweightUnShared = new UnSharedConcreteFlyweight();
        flyweightUnShared.operation("red");

        System.out.println("使用共享的客户端的个数"+flyweightFacotry.getCountSharedTimes());
        System.out.println("被共享的对象个数为"+flyweightFacotry.getTotalSharedFlyweights());


    }
}
