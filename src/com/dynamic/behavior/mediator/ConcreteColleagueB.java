package com.dynamic.behavior.mediator;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.mediator
 * @Date 2019/10/1 16:42
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }


    @Override
    void methodA() {
        System.out.println("ConcreteColleagueB doing things by myself");
    }

    @Override
    void methodB() {
        System.out.println("calling college methodA====");
        super.mediator.operation();
    }
}
