package demo2;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {
    public void working() {
        System.out.println("Nurse is Assisting in demo2!");
    }

}
