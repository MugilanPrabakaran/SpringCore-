package Depinjectionobjecttype;

public class Studentdemo {
    int id;
    Mathcheat matchcheat;

    public void setId(int id) {
        this.id = id;
    }

    public  void setMatchcheat(Mathcheat matchcheat) {
        this.matchcheat = matchcheat;
    }

    public void cheating(){
         matchcheat.outputmathcheat();
        System.out.println("The value of id "+ id +"..");
    }
}
