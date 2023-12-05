package weekNine;

public class InClassArray {
    public static void main(String[] args) {
        //declare an array
        String name1 = "lizzi";
        String name2 = "bob";

        String [] name = new String [3];//most common way
        String nameS [];

        int [] years;
        years = new int[5];

        // data type [] nameOfArray = new dataType[#];
        float [] pay = new float[3];
        final int MaxCapacity = 30;
        int [] classRoomSize = new int[MaxCapacity];


        //process the array
        String [] names = {"libby","Jacob","Jessica","John"};
        System.out.println(names[0]);
        for(int i = 0; i < names.length; i++){
            System.out.println("the names in the names array are: "+(i + 1) +" "+names[i]);
        }
        //years[]
        years[1]++; //post
        ++years[1]; //pre

        if(names[1].length() < names[3].length()){

        }

    }
}
