package DependencySetterInjectionDemo;

public class studentdetails {
    private String  stuName;
    private int id;

    public studentdetails(String stuName, int id) {
        this.stuName = stuName;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void studentDetails(){
        System.out.println("Student name is : " + stuName+ " and the student ID is "+id);
    }

}
