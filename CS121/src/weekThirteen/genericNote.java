package weekThirteen;

public class genericNote {
    public static void main(String[] args) {
        genericArray intMethod = new genericArray();
        genericArray genericMethod = new genericArray();

        int intarray[] = {2,9,5,4,7};
        double doublearray[] = {1.2,2.9,3.5,4.4,7.7};
        char chararray[] = {'L','I','V','H','E'};
        String stringarray[] = {"Hello","From","The","Other","Side"};

        Integer[] intArray = {2, 9, 5, 4, 7};
        Double[] doubleArray = {1.2, 2.9, 3.5, 4.4, 7.7};
        Character[] charArray = {'L','I','V','H','E'};
        String[] stringArray = {"Hello", "From", "The", "Other", "Side"};

        intMethod.printArray(intarray);
        System.out.println();
        System.out.print("Integer array: ");
        genericMethod.printArrayGenerics(intArray);
        System.out.print("Double array: ");
        genericMethod.printArrayGenerics(doubleArray);
        System.out.print("Char array: ");
        genericMethod.printArrayGenerics(charArray);
        System.out.print("String array: ");
        genericMethod.printArrayGenerics(stringArray);

    }
}
