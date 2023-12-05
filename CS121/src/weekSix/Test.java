package weekSix;

public class Test {
    public static void main(String[] args) {
        //Scanner console = new Scanner(System.in);
        //console.nextLine();
        //creating an instance of my Car Class
        Car Tesla = new Car("Tesla","%s",2022,1000);
        Car Honda = new Car();
        System.out.println(Tesla.getYear());
        Tesla.setYear(2023);
        System.out.println(Tesla.getYear());
        System.out.println(Tesla.Color);

    }
}
