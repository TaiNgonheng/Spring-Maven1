package com.Tai_Ngonheng.Learn_Spring_Framework.example.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//                                                video     6

@Component
class YourBusinessClass{
    Dependency dependency1;
    Dependency2 dependency2;

    @Autowired
    public YourBusinessClass(Dependency dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection - YourBusiness Class");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
//    @Autowiredg
//    public void setDependency1(Dependency dependency1) {
//        System.out.println("setter Injection -setDependency 1");
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("setter Injection -setDependency 2");
//        this.dependency2 = dependency2;
//    }

    public String toString(){
        return "Using "+dependency1+" and " + dependency2;
    }

}
@Component
class Dependency{

}
@Component
class Dependency2{

}
@Configuration
@ComponentScan("com/Tai_Ngonheng/Learn_Spring_Framework.example.a1")
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println );
        System.out.println(context.getBean(YourBusinessClass.class));
    }
  }
}

