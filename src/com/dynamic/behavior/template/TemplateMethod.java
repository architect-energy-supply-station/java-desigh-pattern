package com.dynamic.behavior.template;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.template
 * @Date 2019/10/1 14:49
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public abstract class TemplateMethod {
    private void baseMethod() {
        System.out.println("i am base method ");
    }

    abstract void basicMethod();

    public void basicMethod2() {
        System.out.println("decided by subClass is needed overwrite");
    }

    public void templateMethod() {
        baseMethod();
        basicMethod();
        if (isDispaly()) {
            basicMethod2();
        }
        System.out.println("==============");
    }
    boolean  isDispaly() {
        return true;
    }
}
