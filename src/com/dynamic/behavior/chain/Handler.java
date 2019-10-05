package com.dynamic.behavior.chain;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.chain
 * @Date 2019/10/2 11:56
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public abstract class Handler {
    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    abstract void doRequest(String state);
}
