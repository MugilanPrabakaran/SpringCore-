package AllAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mathteacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Hi i am you match teacher Mukil");
    }
}
