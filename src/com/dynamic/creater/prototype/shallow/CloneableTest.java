package com.dynamic.creater.prototype.shallow;


/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.prototype
 * @Date 2019/9/29 10:56
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class CloneableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableObject cloneableObject = new CloneableObject(new RefObject("cindy"));
        cloneableObject.setName("bill");

        CloneableObject copyOfCloneableObject = (CloneableObject) cloneableObject.clone();


        System.out.println(cloneableObject.hashCode());
        System.out.println(copyOfCloneableObject.hashCode());

        System.out.println(cloneableObject==copyOfCloneableObject);

//        普通字段，字符串类型和基本类型
        System.out.println("prototype filed :"+cloneableObject.getName());
        System.out.println("copy filed :"+copyOfCloneableObject.getName());

//        引用类型的拷贝,只拷贝了引用（内存地址），所以他们的hashCode是一样的。修改任意一个，会影响到另一个
        System.out.println("prototype ref filed :"+cloneableObject.getRefObject().getRefName());
        System.out.println("copy ref filed :"+copyOfCloneableObject.getRefObject().getRefName());

        //修改copy对象中的内容,会影响到原对象的内容
        copyOfCloneableObject.getRefObject().setRefName("cindyAndAlice");
        System.out.println(copyOfCloneableObject.getRefObject().getRefName());
        System.out.println(cloneableObject.getRefObject().getRefName());

        System.out.println( cloneableObject.getRefObject().hashCode() == copyOfCloneableObject.getRefObject().hashCode());

        System.out.println(cloneableObject.getName().equals(copyOfCloneableObject.getName()));

    }

}
