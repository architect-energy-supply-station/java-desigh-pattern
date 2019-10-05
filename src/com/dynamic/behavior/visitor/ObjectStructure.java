package com.dynamic.behavior.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.behavior.visitor
 * @Date 2019/10/2 14:56
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class ObjectStructure {
    private ArrayList<Element> elements = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator iterator = elements.iterator();
        while (iterator.hasNext()) {
            ((Element)(iterator.next())).accept(visitor);
        }
    }
    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }
}
