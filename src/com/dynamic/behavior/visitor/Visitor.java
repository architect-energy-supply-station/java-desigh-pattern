package com.dynamic.behavior.visitor;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.visitor
 * @Date 2019/10/2 14:53
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public abstract class Visitor {
    abstract void visit(ConcreteElementA concreteElementA);
    abstract void visit(ConcreteElementB concreteElementB);

    public void visit(ConcreteElementC concreteElementC) {
        System.out.println("abstractVisitor are visiting ConcreteElementC");
    }
}
