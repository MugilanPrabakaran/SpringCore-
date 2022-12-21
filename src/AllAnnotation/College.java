package AllAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
    @Value("${my.collegeName}")//using @Value to injecting values directly to the Variable using property files
    private String CollegeName;
    private NewPrincipal principal;
    @Autowired
    @Qualifier("scienceTeacher")//Remember 1st letter  will be small letter
    private Teacher teacher;//In Teacher Interface there is no implement
    //1. MatchTeacher
    //2.ScienceTeacher so it will throw  2 same name bean ,
    // solution--> use @Component and @Primary or @Qualifier
    @Autowired //Don't know about Autowire please check Notion notes
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    //Constructor Injection
    /*public College(NewPrincipal principal) {
        this.principal = principal;
    }*/
//Setter Injection
    @Autowired
    public void setPrincipal(NewPrincipal principal) {
        this.principal = principal;
    }

    public void test(){
        principal.princinfo();
        teacher.teach();
        System.out.println("my College name is : "+ CollegeName);
    }
}
