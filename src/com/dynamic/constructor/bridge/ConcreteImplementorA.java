package com.dynamic.constructor.bridge;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.bridge
 * @Date 2019/10/1 8:34
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA operationImpl ");
    }
}
