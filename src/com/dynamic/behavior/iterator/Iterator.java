package com.dynamic.behavior.iterator;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.iterator
 * @Date 2019/10/1 17:54
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public interface Iterator {
    void first();

    boolean isLast();

    void next();

    Object currentItem();
}
