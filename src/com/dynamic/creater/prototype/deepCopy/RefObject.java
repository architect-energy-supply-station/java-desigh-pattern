package com.dynamic.creater.prototype.deepCopy;

import java.io.Serializable;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.prototype
 * @Date 2019/9/29 11:35
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class RefObject implements Serializable {
    private String refName;

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public RefObject(String refName) {
        this.refName = refName;
    }
}
