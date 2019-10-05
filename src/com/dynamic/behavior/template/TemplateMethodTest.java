package com.dynamic.behavior.template;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.template
 * @Date 2019/10/1 14:57
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        TemplateMethod concreteTemplate = new ConcreteTemplate();
        TemplateMethod concreteTemplateA = new ConcreteTemplateA();
        concreteTemplate.templateMethod();
        concreteTemplateA.templateMethod();

    }
}
