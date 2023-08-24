package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

//        Doctor dr = context.getBean(Doctor.class);
//        dr.working();
//        dr.setQualification("MBBS");
//        System.out.println(dr);
//
//        Doctor dr1 = context.getBean(Doctor.class);
//        System.out.println(dr1);
//
        /* Output - By default Singleton Design pattern (Scope of Beans
        Doctor is busy in demo 2!
        Doctor{qualification='MBBS'}
        Doctor{qualification='MBBS'}
        */

        // After changing in Doctor
        Doctor dr = context.getBean(Doctor.class);
        dr.working();
        dr.setQualification("MBBS");
        System.out.println(dr);

        Doctor dr1 = context.getBean(Doctor.class);
        System.out.println(dr1);

    }
}
