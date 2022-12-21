package AllAnnotation;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Hi i am your Science Teacher Kapil Dev");
    }
}
