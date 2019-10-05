package com.dynamic.creater.builder;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.builder
 * @Date 2019/9/27 15:36
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcurrentBuilderB extends AbstractBuilder {
    private ProductB product;

    public ConcurrentBuilderB(ProductB product) {
        this.product = product;
    }

    @Override
    void buildPartA() {
        product.addPart("partA");
    }

    @Override
    void buildPartB() {
product.addPart("partB");
    }

    @Override
    ProductB getResult() {
        product.disPlayProduct();

        return product;
    }
}
