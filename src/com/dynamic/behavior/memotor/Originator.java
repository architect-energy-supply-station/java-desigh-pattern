package com.dynamic.behavior.memotor;

import org.jetbrains.annotations.NotNull;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.memotor
 * @Date 2019/10/2 9:06
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class Originator {
    public String getState() {
        return state;
    }

    private String state;

    public Memo createMemo() {
        return new Memo(this);
    }


    public void reStoreStates(Memo memo) {
        if (memo == null) {
            System.out.println("没有获取到指定的备份内容");
            return;
        }
        this.state = memo.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public void displayCurrentState() {
        System.out.println("当前的state值："+this.state);
    }

}
