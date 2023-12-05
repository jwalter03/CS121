package weekThirteen.activity28;

import java.util.HashMap;
import java.util.Map;

public class AssignmentsHash {
    private Map<String, Integer> assignmentMap = new HashMap<>();


    public void addToAssignmentList(String assignment, int score) {
        assignmentMap.put(assignment, score);
    }

    public void removeFromAssignmentList(String assignment) {
        assignmentMap.remove(assignment);
    }

    public Object getScore(String assignment) {
        Object score;
        if (assignmentMap.containsKey(assignment)) {
            score = assignmentMap.get(assignment);
        } else {
            score = "assignment not found";
        }
        return score;
    }
    public void displayGrades(){
        assignmentMap.forEach((assignment, score)-> {
            System.out.printf("Assignment: %s  Score: %d\n", assignment, score);
            });
    }
}