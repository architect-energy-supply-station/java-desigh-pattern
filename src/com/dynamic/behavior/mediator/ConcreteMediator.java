package com.dynamic.behavior.mediator;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.mediator
 * @Date 2019/10/1 16:46
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteMediator extends Mediator {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void operation() {
        //调用同事类的抽象依赖方法,此处可以加入自己的处理业务逻辑，调用不同的类的不同方法
        if (super.colleagues != null && super.colleagues.size()>0) {


            super.colleagues.forEach(colleague -> System.out.println(colleague.getClass().getSimpleName()));
            if ("bill".equals(name)) {
                super.colleagues.get(0).methodA();
            }
            if ("cindy".equals(name)) {
                super.colleagues.get(1).methodA();
            }
        }
    }
}
