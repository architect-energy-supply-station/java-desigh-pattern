package com.dynamic.behavior.state;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.state
 * @Date 2019/10/1 15:21
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handle();
        context.handle();
        context.handle();
    }
}

