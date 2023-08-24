package annotationBased;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {
    public void working() {
        System.out.println("Doctor is busy in demo 2!");
    }
}
