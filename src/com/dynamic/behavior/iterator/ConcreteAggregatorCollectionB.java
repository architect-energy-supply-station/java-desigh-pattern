package com.dynamic.behavior.iterator;

import java.util.ArrayList;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.iterator
 * @Date 2019/10/1 17:58
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteAggregatorCollectionB implements AggregatorCollection {
    private ArrayList testData = new ArrayList();

    public ConcreteAggregatorCollectionB() {
        this.testData.add("bill");
        this.testData.add("alice");
        this.testData.add("cindy");
    }

    @Override
    public Iterator createIterator() {
        return new Iterator() {
            private int currentIndex =0;
            @Override
            public void first() {
                  currentIndex=0;
            }

            @Override
            public boolean isLast() {
                return currentIndex==testData.size();
            }

            @Override
            public void next() {
                if (currentIndex < testData.size()) {
                    currentIndex++;
                }
            }

            @Override
            public Object currentItem() {
                return testData.get(currentIndex);
            }
        };
    }
}
