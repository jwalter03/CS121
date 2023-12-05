package weekThree;

public class ternaryOperator {
    public static void main(String[] args) {
      /*  boolean isSunny, isWarm;
        isSunny = true;
        isWarm = false;
        //logic operators
        //&& and
        // || or
        if(isSunny || isWarm){
            System.out.println("lets get ice cream.");

        }*/
        //condition ? expression1 : expresstion2
        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is : " +result);

    }
}
