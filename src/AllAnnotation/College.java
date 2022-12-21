package AllAnnotation;

import java.security.Principal;


public class College {
    private NewPrincipal principal;
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
    }
}
