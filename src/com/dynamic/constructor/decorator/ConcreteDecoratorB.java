package com.dynamic.constructor.decorator;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.decorator
 * @Date 2019/9/30 21:28
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteDecoratorB extends Decorator {
    private String addState;

    public ConcreteDecoratorB(Componet componet) {
        super(componet);
        this.addState = "add special state in ConcreteDecoratorB";
    }

    @Override
    void operation() {
        super.operation();
        System.out.println(this.addState);
    }
}
