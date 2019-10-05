package com.dynamic.behavior.observer;

import java.util.List;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.observer
 * @Date 2019/10/1 15:51
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public abstract class Subject {
    protected List<Observer> observerList ;

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    abstract void attach(Observer observer);

    abstract void detach(Observer observer);

    abstract void update();
}
