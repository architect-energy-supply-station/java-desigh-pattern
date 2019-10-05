package com.dynamic.constructor.decorator;

import com.sun.org.apache.bcel.internal.classfile.Deprecated;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.decorator
 * @Date 2019/9/30 21:25
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Componet componet) {
        super(componet);
    }

    @Override
    void operation() {
        super.operation();
        addBehavior();
    }

    void addBehavior() {
        System.out.println("special Behavior in ConcreteDecoratorA");
    }
}
