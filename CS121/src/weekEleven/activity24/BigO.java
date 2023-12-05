package weekEleven.activity24;

public class BigO {

    public static void printOnce(int n){
        System.out.println("This is a phrase printed, i:"+(n));
            }

    public static void printNTimes(int n){
        for(int i = 0; i <n; i++){
            System.out.println("This phrase printed i:"+(i+1));
        }
    }
    public static void printNSquaredTimes(int n){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j<= 0; j++){
                System.out.println("This is a phrase printed, i:"+(i+1)+"times j:"+(j+1));
            }
        }
    }
}
