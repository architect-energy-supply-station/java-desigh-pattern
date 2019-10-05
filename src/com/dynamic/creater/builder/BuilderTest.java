package com.dynamic.creater.builder;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.builder
 * @Date 2019/9/27 15:06
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();
        AbstractBuilder concurrentBuilder = new ConcurrentBuilder();
        director.Constructor(concurrentBuilder);

        ProductB productB = new ProductB();
        AbstractBuilder concurrentBuilderB = new ConcurrentBuilderB(productB);
        director.Constructor(concurrentBuilderB);

    }
}
