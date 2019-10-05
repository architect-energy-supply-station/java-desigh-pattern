package com.dynamic.creater.prototype.deepCopy;

import java.io.*;

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
public class CloneableObject implements Serializable {
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

    public Object deepCopy() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        return objectInputStream.readObject();

    }
}
