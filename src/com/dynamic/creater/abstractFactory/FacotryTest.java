package com.dynamic.creater.abstractFactory;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.factory
 * @Date 2019/9/27 16:13
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class FacotryTest {
    public static void main(String[] args) {
        Factory concurrentFactoryOne = new ConcurrentFactoryOne();
        Factory concurrentFactoryTwo = new ConcurrentFactoryTwo();
        ProductA concurrentProductA1 =concurrentFactoryOne.produceProductA();
        ProductB concurrentProductA2 =concurrentFactoryOne.produceProductB();

        ProductA concurrentProductB1 =concurrentFactoryTwo.produceProductA();
        ProductB concurrentProductB2 =concurrentFactoryTwo.produceProductB();

        concurrentProductA1.play();
        concurrentProductA2.display();

        concurrentProductB1.play();
        concurrentProductB2.display();



    }
}
