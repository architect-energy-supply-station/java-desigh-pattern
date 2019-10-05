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
public class
Leaf implements Component {

    @Override
    public void add(Component component) {

        System.out.println("could not add , it's leaf already");

    }

    @Override
    public void remove(Component component) {
        System.out.println("could not add , it's leaf already");

    }

    @Override
    public void display() {
        System.out.println("hello ,this is leaf speaking!");
    }
}
