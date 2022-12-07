package DependencyInjectionDemo;

public class studentdetails {
    private String  stuName;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void studentDetails(){
        System.out.println("Student name is : " + stuName);
    }

}
