package com.dynamic.creater.factory;

import com.dynamic.util.XMLUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.creater.factory
 * @Date 2019/9/27 16:13
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class FacotryTest {
    public static void main(String[] args) {
//        Factory concurrentFactory = new ConcurrentFactoryOne();
        Factory concurrentFactory = null;
        try {
            concurrentFactory = (Factory) XMLUtil.getBean("E:\\practice\\Java\\java-design-pattern\\src\\com\\dynamic\\config\\config.xml","className");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

//        Factory concurrentFactoryOne = new ConcurrentFactoryOne();
//        Factory concurrentFactoryTwo = new ConcurrentFactoryTwo();
        Product concurrentProductA =concurrentFactory.produceProduct();
//        Product concurrentProductB =concurrentFactoryTwo.produceProduct();

        concurrentProductA.play();
//        concurrentProductB.play();



    }
}
