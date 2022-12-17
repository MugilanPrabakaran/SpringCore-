package PropertyfilesInjectuingDemo;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

    private String name;
    private String hobby;
    private String Address;
    @Value("${student.name}") // Dynamic initiation
    //@Value("Mugilan") //While using @Value annotation  there no need of properties file
    public void setName(String name) {
        this.name = name;
    }
    @Required
    @Value("${student.hobby}")
//    @Value("Cricket")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
//    @Value("Salem")
    @Value("${student.Address}")
    public void setAddress(String address) {
        Address = address;
    }

    public void displayinfo(){
        System.out.println("Student name is : "+ name );
        System.out.println("Student hobby : " + hobby);
        System.out.println("Student Address : " + Address);
    }
}
