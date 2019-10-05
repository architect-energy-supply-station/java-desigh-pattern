package com.dynamic.constructor.flyweight;

import java.util.HashMap;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.flyweight
 * @Date 2019/9/30 11:23
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class FlyweightFacotry {
    private int countSharedTimes =0;
    private HashMap<String, Flyweight> flyweights = new HashMap<>(2);

    /**
     *   所有能封装到类库中的行为，如无必要不允许暴露给客户端
     * @param type
     * @param flyweight
     */
    private void addFlyweight(String type,Flyweight flyweight) {
        if (flyweight instanceof UnSharedConcreteFlyweight) {
            throw new RuntimeException("should not add UnSharedFlyweight object");
        }
        flyweights.put(type, flyweight);
    }

    public FlyweightFacotry( ) {

            addFlyweight("A", new SharedConcreteFlyweight("A"));


            addFlyweight("B", new SharedConcreteFlyweightB("B"));
    }

    public Flyweight getFlyweight(String type) {
        //将同一个keys对应多个对象，会发生什么？
        if (type == null) {
            throw new RuntimeException("should not be null");
        }
        if (flyweights.containsKey(type)) {
            this.countSharedTimes++;
            return flyweights.get(type);
        } else {
            System.out.println("没有可共享的对象");
            return null;
        }
    }

    public int getTotalSharedFlyweights() {
        return flyweights.size();
    }
    public int getCountSharedTimes() {
        return this.countSharedTimes;
    }

}
