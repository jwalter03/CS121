package weekTen.activity20;


import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add(0,"Jeff");
        names.add(1,"Tim");
        names.add(2,"Rob");
        names.remove(2);
        System.out.println(names.size());
        System.out.println(names.get(0));
        for(String name : names){
            System.out.println(name);
        }
        for(int i=0; i< names.size(); i++){
            System.out.println(names.get(i));
        }

    }
}
