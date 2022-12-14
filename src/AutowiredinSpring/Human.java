package AutowiredinSpring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    private  Heart heart;

    public void setHeart(Heart heart) {
        this.heart = heart;
    }
@Autowired
    public Human(Heart heart) {
        this.heart = heart;
    }
public Human(){

}
    public void startPumping(){
        if (heart != null) {
            heart.pump();
        }
        else {
            System.out.println("Heart stop beating");
        }
    }
}
