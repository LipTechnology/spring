package net.lip.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

    public static void main(String[] args) {
        //r
        Resource r = new FileSystemResource("helloMessage.xml");
        //bf xmlbf
        BeanFactory f = new XmlBeanFactory(r);
        
        Person person = (Person) f.getBean("person");
        String s = person.sayHello();
        System.out.println(s);
    }

}
