package AllAnnotation;

import java.security.Principal;


public class College {
    private NewPrincipal principal;

    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    //Constructor Injection
    /*public College(NewPrincipal principal) {
        this.principal = principal;
    }*/
//Setter Injection
    public void setPrincipal(NewPrincipal principal) {
        this.principal = principal;
    }

    public void test(){
        principal.princinfo();
        teacher.Mathteacher();
    }
}
