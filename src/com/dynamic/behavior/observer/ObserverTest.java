package com.dynamic.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.observer
 * @Date 2019/10/1 16:01
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ObserverTest {
    public static void main(String[] args) {
        Observer observer = new ConcreteObserver();
        Observer observer2 = new ConcreteObserverA();
        Observer observer3 = new ConcreteObserverB();

        Subject subject = new ConcreteSubject();
        subject.setObserverList(new ArrayList<>());
        subject.attach(observer);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.update();

//        移除一个观察者，在调用更新方法
        System.out.println("================");
        subject.detach(observer);
        subject.update();

    }
}
