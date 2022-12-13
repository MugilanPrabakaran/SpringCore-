package SimpleProject;

public class Vodafone {
    private Service services;

    public void setServices(Service services) {
        this.services = services;
    }

    public void vodafActivating(){
        services.service();
    }
}
