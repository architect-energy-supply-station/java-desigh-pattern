package com.dynamic.constructor.proxy;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.proxy
 * @Date 2019/9/30 21:57
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ProxyTest {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.doSomething();
    }

}
