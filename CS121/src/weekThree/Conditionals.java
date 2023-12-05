package weekThree;

public class Conditionals {
    public static void main(String[] args) {
        int age;
        double gpa;
        //0.0
        char letterGrade;
        boolean csMajor, isStudent, isTeacher, isNotCsMajor;
        String name;


        age = 20;
        name = "Jessica";
        letterGrade = 'A';
        csMajor = false;
        gpa = 3.4;
        isStudent = true;
        isTeacher = true;
        isNotCsMajor = false;

        /*if(condition) {
            //executes the code if the condition is true
        }

        if (condition){
            //executes the code if the condition is true
        }else{
            //executes if condition is false
        }
        //if else if statement
        if (condition1){

        } else if(condition2){
                //executes if condition 2 is true

        } else if (condition3) {
            //executes if condition 3 is true

            if (age <= 21) {
                System.out.println("You are 21 or younger.\n");

            } else {
                System.out.println("You are older than 21.\n");

            }
        }
*/
        if (gpa>= 4.0)
        {    System.out.println("You recieve an A");
        }else if (gpa >= 3.6){
            System.out.println("You recieve a A-----");
        }else if(gpa >=2.7) {
            System.out.println("you recieve a B");
        }else if (gpa >= 1.7) {
            System.out.println("you recieve a C");
        }


        //relational operator
        //<, >, <=, >=, ==
        //.equals() --> for Strings
        if(csMajor == isStudent){
            System.out.println("this person is a student and a cs major");
        }else{
            System.out.println("one of the values for the student or cs major is false");
        }

        String name2 ="jessica";
        if(!name.equals(name2)){
            System.out.printf("the name %s is equal to name2 %s", name, name2);
        }else {
            System.out.println("the names are equal");

        }



    }

}
