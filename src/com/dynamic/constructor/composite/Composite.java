package com.dynamic.constructor.composite;

import java.util.ArrayList;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.constructor.composite
 * @Date 2019/9/30 9:57
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class Composite implements Component {
    private ArrayList<Component> composites = new ArrayList<>();

    @Override
    public void add(Component component) {
        this.composites.add(component);
    }

    @Override
    public void remove(Component component) {
        this.composites.remove(component);
    }

    @Override
    public void display() {
composites.forEach(component -> component.display());
    }
}
