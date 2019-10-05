package com.dynamic.behavior.memotor;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.memotor
 * @Date 2019/10/2 9:08
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class MemoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("bill");
        originator.displayCurrentState();
//        第一次保存状态
        caretaker.setMemo(originator.createMemo());

        //第二次保存状态
        originator.setState("cindy");
        caretaker.setMemo(originator.createMemo());
        originator.displayCurrentState();
//第三次保存状态
        originator.setState("alice");
        caretaker.setMemo(originator.createMemo());
        originator.displayCurrentState();

        originator.reStoreStates(caretaker.getMemo(2));
//        应该打印出Alice
        System.out.println("******************应该打印出Alice");
        originator.displayCurrentState();

        originator.reStoreStates(caretaker.getMemo(1));
//        应该打印出cindy
        System.out.println("=================应该打印出cindy");
        originator.displayCurrentState();
//        应该会报空指针异常，内部已经做处理了
        originator.reStoreStates(caretaker.getMemo(3));

        originator.displayCurrentState();
//        originator.reStoreStates(null);

    }
}
