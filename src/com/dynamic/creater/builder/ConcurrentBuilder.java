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
public class ConcurrentBuilder  extends AbstractBuilder {
    private ProductA product;

    public ConcurrentBuilder() {
        this.product = new ProductA();
    }

    @Override
    void buildPartA() {
        product.setPartA("partA");
    }

    @Override
    void buildPartB() {
        product.setPartB("partB");
    }

    @Override
    public AbstractProduct getResult() {
        product.disPlay();
        return product;
    }
}
