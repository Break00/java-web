package com.jason.lee;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @author huanli9
 * @description XML解析
 * @date 2020/11/10 13:43
 */
public class Test {
    public static void main(String[] args) {
        parseXMLBySAX();
        parseXMLByXpath();
    }

    private static void parseXMLBySAX(){
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read("example.xml");
            Element rootElement = document.getRootElement();
            List<Element> list = rootElement.elements();
            for (Element element:list) {
                String id = element.attributeValue("id");
                String name = element.elementText("name");
                String age = element.elementText("age");
                System.out.println("id: " + id + ",name: " + name +",age: "+age);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    private static void parseXMLByXpath(){
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read("example.xml");
            Element element = (Element) document.selectSingleNode("/students/student[@id=2]");
            String id = element.attributeValue("id");
            String name = element.elementText("name");
            String age = element.elementText("age");
            System.out.println("id: " + id + ",name: " + name +",age: "+age);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
