package com.dynamic.util;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author bill-smith liuwb
 * @Package com.dynamic.util
 * @Date 2019/10/3 10:31
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class XMLUtil {
    private XMLUtil() {

    }

    public static Object getBean(String configPith,String tagName) throws ParserConfigurationException, IOException, SAXException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //创建文档对象
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(configPith);
        //获取文档对象中的值
        NodeList nodeList = document.getElementsByTagName(tagName);

        String className=nodeList.item(0).getFirstChild().getNodeValue().trim();

//        返回需要的数据,通过类名生成
        Object Bean = Class.forName(className).newInstance();

        return Bean;

    }


}
