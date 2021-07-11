package homework_05_07.exeption;

public class InvalidAgeException extends Exception{
//    private static final String EXEPTION_MESSAGE = "Age value must be greater than 0. But -6 value was given!";
    private int age;

    public InvalidAgeException(int age) {
        this.age = age;


    }

    @Override
    public String getMessage() {
        return String.format("Age value must be greater than 0. But %d value was given!", age);
    }
}
