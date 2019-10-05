package com.dynamic.behavior.visitor;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.visitor
 * @Date 2019/10/2 14:57
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteVisitorA extends Visitor {
    @Override
    void visit(ConcreteElementA concreteElementA) {
        System.out.println("ConcreteVisitorA visit ConcreteElementA ");
    }

    @Override
    void visit(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteElementB are visited by ConcreteVisitorA ");

    }
}
