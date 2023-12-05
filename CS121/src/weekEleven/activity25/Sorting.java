package weekEleven.activity25;

import java.util.Scanner;




public class Sorting {
    public int[] getArray(){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 unsorted integers: ");
        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;


    }
    public void sortArray(int[] array){
        if(array.length<-1){
            return;
        }
        int[] leftHalf = new int[array.length/2];
        int[] rightHalf = new int [array.length - leftHalf.length];
        for(int i = 0; i < leftHalf.length; i++){
            leftHalf[i] = array[i];
        }
        for(int i = 0; i< rightHalf.length; i++){
            rightHalf[i] = array[leftHalf.length+i];
        }
        sortArray(leftHalf);
        sortArray(rightHalf);


    }
}
