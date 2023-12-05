package weekEleven.activity23;

public class Recursion {

    public static String countdown(int num) {
        //1. Base case
        if (num == 0) {
            System.out.println("Blast Off");
            return("Blast Off!");
            //2. recursive call + modification
        } else {
            System.out.println(num);
            return countdown(num-1);
        }
    }
    public static char alphaBackwards(char letter){
        if (letter == 'a'){
            System.out.println("a");
            return ('a');
        }else{
            System.out.println(letter);
            return alphaBackwards((char)(letter -1));
        }
    }
}
