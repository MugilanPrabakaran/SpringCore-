package PropertyfilesInjectuingDemo;

public class Student {
    private String name;
    private String hobby;
    private String Address;

    public void setName(String name) {
        this.name = name;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void displayinfo(){
        System.out.println("Student name is : "+ name );
        System.out.println("Student Roll no : " + hobby);
        System.out.println("Student Address : " + Address);
    }
}
