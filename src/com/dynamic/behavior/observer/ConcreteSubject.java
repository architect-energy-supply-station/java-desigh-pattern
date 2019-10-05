package com.dynamic.behavior.observer;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.observer
 * @Date 2019/10/1 15:58
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ConcreteSubject extends Subject  {

    @Override
    void attach(Observer observer) {
        super.observerList.add(observer);
    }

    @Override
    void detach(Observer observer) {
        super.observerList.remove(observer);
    }

    @Override
    void update() {
super.observerList.forEach(observer -> observer.update());
    }
}
