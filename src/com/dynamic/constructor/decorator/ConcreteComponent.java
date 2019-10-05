package com.dynamic.constructor.decorator;

import java.awt.*;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.decorator
 * @Date 2019/9/30 21:22
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteComponent extends Componet {
    @Override
    void operation() {
        System.out.println("ConcreteComponent operation ! ");
    }
}
