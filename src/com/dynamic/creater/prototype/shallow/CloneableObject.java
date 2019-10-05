package com.dynamic.creater.prototype.shallow;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.prototype
 * @Date 2019/9/29 10:55
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class CloneableObject implements Cloneable {
    public CloneableObject(RefObject refObject) {
        this.refObject = refObject;
    }

    private String name;

    private RefObject refObject;

    public RefObject getRefObject() {
        return refObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
