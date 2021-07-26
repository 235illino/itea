package homework_io_26_07_2021;

///home/ilya/Desktop/car.txt
public class App {
    public static void main(String[] args) {
        TextScanner textScanner = new TextScanner();
        Car car = textScanner.parseXmlToObject("/home/ilya/Desktop/car.txt");
        System.out.println(car.toString());
    }
}
