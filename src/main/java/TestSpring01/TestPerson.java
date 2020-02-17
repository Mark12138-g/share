package TestSpring01;

import TestSpring2.AB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@ComponentScan("com")
@Configuration
public class TestPerson {
    @Bean("a1")
    public Person a(){
        return
                 new Person(11,"ss");

    }
    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destory")
    public  Student student(){
        return  new Student(1002200,"sb");
    }

}
