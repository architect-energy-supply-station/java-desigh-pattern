package com.dynamic.constructor.composite;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.composite
 * @Date 2019/9/30 9:54
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class Client {
    public static void main(String[] args) {
        Component componentLeaf = new Leaf();
        Component componentLeaf2 = new Leaf();
        Component componentLeaf3 = new Leaf();
        Component componentLeaf4 = new Leaf();

        componentLeaf.display();
        //应该抛出运行时异常
        componentLeaf.add(componentLeaf2);
        //抛出运行时异常
        componentLeaf.remove(componentLeaf2);

        Component componentComposite = new Composite();
        componentComposite.add(componentLeaf);
        componentComposite.add(componentLeaf2);
        componentComposite.add(componentLeaf3);
        componentComposite.add(componentLeaf4);

        componentComposite.remove(componentLeaf2);

        componentComposite.display();

    }
}
