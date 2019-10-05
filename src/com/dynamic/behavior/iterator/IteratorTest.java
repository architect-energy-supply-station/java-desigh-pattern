package com.dynamic.behavior.iterator;

import java.util.ArrayList;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.iterator
 * @Date 2019/10/1 18:11
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class IteratorTest {
    public static void process(AggregatorCollection aggregatorCollection) {
        Iterator iterator = aggregatorCollection.createIterator();
        while (!iterator.isLast()) {
            System.out.println("当前元素的值：" + iterator.currentItem());
            iterator.next();
        }
    }
    public static void main(String[] args) {

        AggregatorCollection aggregatorCollection = new ConcreteAggregatorCollectionA();

        AggregatorCollection aggregatorCollection1 = new ConcreteAggregatorCollectionB();
        process(aggregatorCollection);
        System.out.println("*****************");
        process(aggregatorCollection1);
    }
}
