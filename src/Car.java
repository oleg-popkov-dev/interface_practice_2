
public class Car implements ICar{


    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }


    private String name;



    @Override
    public void drive() {
        System.out.println(getName() + " drive");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " stop");
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
