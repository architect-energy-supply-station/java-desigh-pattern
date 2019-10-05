package com.dynamic.behavior.chain;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.chain
 * @Date 2019/10/2 11:57
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteHandlerC extends Handler {
    @Override
    void doRequest(String state) {
        if ("alice".equals(state)) {
            System.out.println("ConcreteHandlerC handler this request");
        } else {
            if (this.handler != null) {

                this.handler.doRequest(state);
            }
        }
    }
}
