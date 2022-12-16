package QualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    private Heart heart;
    @Autowired
    @Qualifier("OctopusHeart") //if you are using annotation before
                                // class name setter and getter are no need if any doubt refer Notion notes
    public void setHeart(Heart heart) {
        this.heart = heart;
    }
    public Human(Heart heart) {
        this.heart = heart;
    }
public Human(){

}
    public void startPumping(){
        if (heart != null) {
            heart.pump();
            System.out.println("Name of the Animal is : "+ heart.getNameoftheAnimal()+
                    ", No of heart : "+heart.getNoofHeart());
        }
        else {
            System.out.println("Heart stop beating");
        }
    }
}
