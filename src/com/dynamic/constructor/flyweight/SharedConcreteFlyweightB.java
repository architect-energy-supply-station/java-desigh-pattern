package com.dynamic.constructor.flyweight;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.flyweight
 * @Date 2019/9/30 11:22
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class SharedConcreteFlyweightB implements Flyweight {
    public SharedConcreteFlyweightB(String type) {
        Type = type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    private String Type;

    @Override
    public void operation(String extriniState) {

        System.out.println("Flyweight type is :" + this.Type+"extriniState value is :" + extriniState);
    }}
