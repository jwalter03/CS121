package weekSix.overLoaded;

import java.sql.SQLOutput;

public class ClassTest {
    public static void main(String[] args) {
        Class one = new Class("one");
        Class two = new Class("two","three","four");
        Class zero = new Class();

        one.setOne("one");
        System.out.println(one.getOne());
        System.out.println();
    }
}
