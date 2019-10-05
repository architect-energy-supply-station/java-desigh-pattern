package com.dynamic.behavior.strategy;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.strategy
 * @Date 2019/10/1 15:08
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class Context {
    private Stratege stratege;

    public void algorithm() {
        this.stratege.algorithm();
    }
    public void setStratege(Stratege stratege) {
        this.stratege = stratege;
    }
}
