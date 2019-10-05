package com.dynamic.creater.factory;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.factory
 * @Date 2019/9/27 16:18
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcurrentProductB implements Product{
    @Override
    public void play() {
        System.out.println("product B play");
    }
}
