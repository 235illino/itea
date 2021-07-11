package homework_05_07.exeption;

public class AgeExample {
    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException(age);
        }
        this.age = age;
    }

    public static void main(String[] args) {
        AgeExample ageExample = new AgeExample();
        try {
            ageExample.setAge(-4);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}
