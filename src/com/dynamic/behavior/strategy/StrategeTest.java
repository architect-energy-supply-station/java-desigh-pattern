package com.dynamic.behavior.strategy;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.strategy
 * @Date 2019/10/1 15:09
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class StrategeTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStratege(new ConcreteStrategeA());
        context.algorithm();
        context.setStratege(new ConcreteStrategeB());
        context.algorithm();
    }
}
