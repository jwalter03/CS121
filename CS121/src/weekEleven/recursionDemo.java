package weekEleven;

public class recursionDemo {
    public static void main(String[] args) {
        //factorial

        int num = 7;
        System.out.println("The factorial of 7 is " + factorial(num));
    }
        public static int factorial(int num){
            //1. Base case
            if(num == 0){
                return 1;
                //2. recursive call + modification
            }else{
                return num*factorial(num-1);
            }


        }
    }

