package com.dynamic.behavior.memotor;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.memotor
 * @Date 2019/10/2 9:05
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
 class Memo {
    public Memo(Originator originator) {
        this.state = originator.getState();
    }

    private String state;


    String getState() {
        return state;
    }

    void setState(String state) {
        this.state = state;
    }
}
