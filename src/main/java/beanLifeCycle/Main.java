package beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor dr = context.getBean(Doctor.class);
        dr.working();
        dr.setQualification("MBBS");
        System.out.println(dr);
    }
}
