package SimpleProject;

public class Airtel {
    private Service services;

    public void setServices(Service services) {
        this.services = services;
    }

    public void activate(){
        services.service();
   }
}
