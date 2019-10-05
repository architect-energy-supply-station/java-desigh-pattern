package com.dynamic.constructor.adapter;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.adapter
 * @Date 2019/9/30 9:29
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
