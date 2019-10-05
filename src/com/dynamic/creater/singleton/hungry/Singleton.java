package com.dynamic.creater.singleton.hungry;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.singleton
 * @Date 2019/9/27 21:05
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        System.out.println("return singleton instance");
        return instance;
    }
}
