package com.dynamic.behavior.template;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.template
 * @Date 2019/10/1 14:54
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteTemplate extends TemplateMethod {
    @Override
    void basicMethod() {
        System.out.println("Override by ConcreteTemplate");
    }

    @Override
    boolean isDispaly() {
        System.out.println("never display the super default method");
        return false;
    }
}
