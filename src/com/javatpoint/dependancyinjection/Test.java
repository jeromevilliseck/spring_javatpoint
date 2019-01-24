package com.javatpoint.dependancyinjection;

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
        Employee student2 = (Employee)context.getBean("emp");
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
        Question4 questionFour = (Question4)factory.getBean("questionMap2");
        LoggerSingleton.getInstance().log(Level.INFO, "Object form tutorial CI With Map2 : {0} \r\n", questionFour);

        //CI Inheriting Bean
        Employee e1 = (Employee)factory.getBean("e2");
        e1.show();

        //Setter Injection
        Employee specificEmployee = (Employee)factory.getBean("obj");
        LoggerSingleton.getInstance().log(
                Level.INFO, "Setter Injection : member initialisation with setters : {0} \r\n",
                specificEmployee);

        //Autowiring -> use with applicationContext object
        A a = context.getBean("a", A.class);
        a.display();

        A abis = context.getBean("abis", A.class);
        abis.display();

        A aconst = context.getBean("aconst", A.class);
        aconst.display();

        //Singleton with dependency injection
        SingletonA singletonAObject = (SingletonA)context.getBean("singletonA"); //The bean in application context which has factory-method attribute
        singletonAObject.msg();

        //Static factory method
        Printable p = (Printable)context.getBean("singletonFactory");
        p.print();
    }
}
