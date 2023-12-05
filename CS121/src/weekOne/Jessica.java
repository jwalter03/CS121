package weekOne;

public class Jessica {
    public static void main(String[] args) {
        int age;
        double gpa;
        //0.0
        char letterGrade;
        boolean csMajor;
        String name;

        age = 20;
        name = "Jessica";
        letterGrade = 'A';
        csMajor = true;
        gpa = 3.4;

        String favoriteColor = "Purple";
        //%s is string
        //%d is int
        System.out.printf("My name is: %s." ,name);
        System.out.printf(" I am: %d years old.",age);
        System.out.printf(" Are you a computer science major?: %b.",csMajor);
        //System.out.flush();
        System.out.printf(" I want to get an: %c in the class.",letterGrade);
        System.out.printf(" My gpa is: %.2f." ,gpa);
        System.out.printf(" My favorite color is: %s. ",favoriteColor);
    }
}
