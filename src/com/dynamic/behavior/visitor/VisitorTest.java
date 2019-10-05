package com.dynamic.behavior.visitor;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.visitor
 * @Date 2019/10/2 14:56
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class VisitorTest {
    public static void main(String[] args) {
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();
        Element elementC = new ConcreteElementC();

        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(elementA);
        objectStructure.addElement(elementB);
        objectStructure.addElement(elementC);

        objectStructure.accept(visitorA);
        System.out.println("********************");
        objectStructure.removeElement(elementB);
        objectStructure.accept(visitorB);



    }
}
