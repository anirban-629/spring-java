package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Doctor doctor = context.getBean(Doctor.class);
//        Nurse nurse = context.getBean(Nurse.class);
//        Nurse nurse = (Nurse) context.getBean("nurse");
//        doctor.working();
//        nurse.working();

//        Staff staff = context.getBean(Doctor.class);
//        Staff staff = context.getBean(Nurse.class);

//        staff.working();

        Doctor doctor = context.getBean(Doctor.class);
        doctor.working();
        System.out.println(doctor.getQualifications());
//        doctor.setQualifications("DNS");
        System.out.println(doctor.getQualifications2());
    }
}
