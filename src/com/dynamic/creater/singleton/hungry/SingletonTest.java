package com.dynamic.creater.singleton.hungry;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.singleton
 * @Date 2019/9/27 21:10
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        System.out.println(singleton1==singleton2);
    }

}
