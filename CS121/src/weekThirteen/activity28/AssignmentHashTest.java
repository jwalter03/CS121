package weekThirteen.activity28;

public class AssignmentHashTest {
    public static void main(String[] args) {

        //Map<String, String> list= new HashMap<>();
        AssignmentsHash list = new AssignmentsHash();

        list.addToAssignmentList("activity 1",98);
        list.addToAssignmentList("activity 2", 93);
        list.addToAssignmentList("activity 3", 86);
        
        list.displayGrades();
        System.out.println(list.getScore("activity 1"));
        list.removeFromAssignmentList("activity 2");
        System.out.println(list.getScore("activity 2"));

        list.displayGrades();







    }

}
