package lesson_21_06;

public class Car implements Vehicle {
    private String type;
    private String name;
    private Passport passport;
    private Wheel wheel;
    private Engine engine;
    @Override
    public void start() {

    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setType(String type) {
        this.type = type;

    }
    public void drive(){
        System.out.println("go");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

}
