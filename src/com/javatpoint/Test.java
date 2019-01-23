package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.logging.Level;

public class Test {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        //Bean Factory IOC Container
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        //Application Context IOC Container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Object created with bean factory
        Student student = (Student)factory.getBean("studentbean");
        student.displayInfo();

        //Object created with context object
        Employee student2 = (Employee)context.getBean("e");
        student2.show();

        //CI with collection
        Question questionOne = (Question)factory.getBean("q");
        questionOne.displayInfo();

        //CI with collection 2
        Question2 questionTwo = (Question2)factory.getBean("r");
        questionTwo.displayInfo();

        //CI with Map
        Question3 questionThree = (Question3)factory.getBean("z");

        LoggerSingleton.getInstance().log(
                Level.INFO, "Object from tutorial CI with Map : {0} \r\n", questionThree);

        LoggerSingleton.getInstance().log(
                Level.INFO, "Map from tutorial CI with Map : {0} \r\n", questionThree.displayMap());

        //CI with Map2
    }
}
