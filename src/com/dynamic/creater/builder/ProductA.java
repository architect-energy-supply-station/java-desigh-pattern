package com.dynamic.creater.builder;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.builder
 * @Date 2019/9/27 14:52
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ProductA extends AbstractProduct {
    private String partA;
    private String partB;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void disPlay() {
        System.out.println("product 的组件有"+this.partA+","+this.partB);
    }
}
