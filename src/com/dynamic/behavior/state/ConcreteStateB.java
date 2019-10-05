package com.dynamic.behavior.state;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.state
 * @Date 2019/10/1 15:22
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteStateB extends State  {
    @Override
    void handle(Context context) {
        System.out.println("concreteStateB handle, set state ConcreteStateC");
        context.setState(new ConcreteStateC());
    }
}
