package weekThirteen.activity29;

import weekThirteen.genericArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        GenericsMethod Method = new GenericsMethod();


        ArrayList <Integer> intArray = new ArrayList<>(Arrays.asList(2,4,6,7));

        ArrayList<Double> doubleArray = new ArrayList<>(Arrays.asList(3.2,5.5,5.8,3.5));

        ArrayList<Character> charArray = new ArrayList<>(Arrays.asList('g','d','g','e'));

        ArrayList<String> stringArray =new ArrayList<>(Arrays.asList("hello","Print","out"));


        System.out.print("Integer array: ");
        Method.printArrayList(intArray);
        System.out.print("Double array: ");
        Method.printArrayList(doubleArray);
        System.out.print("Char array: ");
        Method.printArrayList(charArray);
        System.out.print("String array: ");
        Method.printArrayList(stringArray);
    }
}
