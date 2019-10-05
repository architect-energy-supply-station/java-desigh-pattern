package com.dynamic.behavior.chain;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.chain
 * @Date 2019/10/2 12:02
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class HandlerTest {
    public static void main(String[] args) {
        Handler handler = new ConcreteHandlerA();
        Handler handler1 = new ConcreteHandlerB();
        Handler handler2 = new ConcreteHandlerC();
        handler.setHandler(handler1);
        handler1.setHandler(handler2);
        handler.doRequest("cindy");
    }
}
