package com.dynamic.behavior.mediator;

import java.util.LinkedList;
import java.util.List;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.mediator
 * @Date 2019/10/1 16:40
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public abstract class Mediator {
    protected List<Colleague> colleagues = new LinkedList<>();;

    public void register(Colleague colleague) {

        colleagues.add(colleague);
    }
    abstract void operation();

}
