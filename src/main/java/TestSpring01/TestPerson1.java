package TestSpring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerson1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(TestPerson.class);
        Student p = (Student) app.getBean("student");
        System.out.println(p);
     String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String a:beanDefinitionNames
             ) {
            System.out.println(a);}

        app.close();
        }


    }


