package SpringBasicDemo;

public class airtel implements Sim {
    public airtel() {
        System.out.println("Airtel Constructor calling ");
    }

    @Override
    public void data() {
        System.out.println("using data in Airtel");
    }

    @Override
    public void calling() {
        System.out.println("Calling in Airtel");
    }
}
