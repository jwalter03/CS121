package weekThirteen;

public class genericArray {
    //NO MAIN METHOD
    public void printArray(int [] inputArray){
        for(int element : inputArray){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public <E> void printArrayGenerics(E[] inputArray){
        for(E element: inputArray){
            System.out.printf("%s", element);
        }
        System.out.println();
    }
}
