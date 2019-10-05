package com.dynamic.behavior.memotor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.memotor
 * @Date 2019/10/2 9:07
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class Caretaker {

    private int stateIndex=0;

    private Map<Integer, Memo> memos = new HashMap<>();

    public void setMemo(Memo memo) {

        memos.put(stateIndex++, memo);

    }

    public Memo getMemo(Integer stateIndex) {
        //判空和其他业务逻辑处理
        return memos.get(stateIndex);
    }
}
