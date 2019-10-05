package com.dynamic.constructor.decorator;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.decorator
 * @Date 2019/9/30 21:24
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class Decorator extends Componet {
    private Componet componet;

    public Decorator(Componet componet) {
        this.componet = componet;
    }

    public Decorator() {
    }

    @Override
    void operation() {
        componet.operation();
    }
}
