package com.dynamic.creater.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.builder
 * @Date 2019/9/27 15:30
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ProductB extends AbstractProduct {
    List<String> productStruct = new ArrayList<>();

    public void addPart(String part) {
        productStruct.add(part);
    }

    public void disPlayProduct() {
        productStruct.forEach(productStruct-> System.out.println("展示product产品的组成部分："+ productStruct));
    }
}
