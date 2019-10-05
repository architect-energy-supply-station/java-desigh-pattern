package com.dynamic.behavior.iterator;

import com.sun.org.apache.xpath.internal.operations.String;

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
public class ConcreteAggregatorCollectionA implements AggregatorCollection {
    private Object[] testData= {"bill", "cindy", "alice", "sally"};


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
                return currentIndex==testData.length;
            }

            @Override
            public void next() {
                if (currentIndex < testData.length) {
                    currentIndex++;
                }
            }

            @Override
            public Object currentItem() {
                return testData[currentIndex];
            }
        };
    }
}
