package AllAnnotation;

import java.security.Principal;


public class College {
    private NewPrincipal principal;

    public College(NewPrincipal principal) {
        this.principal = principal;
    }
    public void test(){
        principal.princinfo();
    }
}
