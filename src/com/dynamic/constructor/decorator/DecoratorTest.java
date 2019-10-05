package com.dynamic.constructor.decorator;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.decorator
 * @Date 2019/9/30 21:32
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Componet componet = new ConcreteComponent();
        componet.operation();
        Componet d1 = new ConcreteDecoratorA(componet);
//        第一次装饰的结果
        d1.operation();
//        第二次装饰，在第一次装饰的基础上
        Componet d2 = new ConcreteDecoratorB(d1);
        d2.operation();
    }
}
