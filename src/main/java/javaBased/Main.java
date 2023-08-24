package javaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//        Nurse nurse = context.getBean(Nurse.class);
//        nurse.working();
//        Staff staff = context.getBean(Doctor.class);
//        staff.working();

        Doctor dr = context.getBean(Doctor.class);
        dr.working();
    }
}
