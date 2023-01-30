package Class16;

public class Task6 {
    String score(int score) {
        if ((score > 0) && (score <= 50)) {
            return "your grade is F";
        } else if ((score > 50) && (score <= 70)) {
            return "your grade is D";
        } else if ((score > 70) && (score <= 80)) {
            return "Your grade is C";
        } else if ((score > 80) && (score <= 90)) {
            return "Your grade is B";
        } else if (score > 90) {
            return "Your grade is A";
        }
        return " false input";
    }

}


