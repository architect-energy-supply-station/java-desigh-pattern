package com.dynamic.behavior.mediator;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.mediator
 * @Date 2019/10/1 16:56
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class MediatorTest {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Colleague colleague = new ConcreteColleagueA(mediator);
        Colleague colleagueB = new ConcreteColleagueB(mediator);
        mediator.register(colleague);
        mediator.register(colleagueB);

//        mediator.setName("bill");
        mediator.setName("cindy");
        colleague.methodA();
        colleague.methodB();
        System.out.println("*************************");
        colleagueB.methodA();
        colleagueB.methodB();

    }
}
