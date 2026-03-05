import java.util.Scanner;


interface Student {
    void getAcademicScore(int marks);
}


interface Sports {
    void getSportsScore(int score);
}


class Result implements Student, Sports {

    int academicMarks;
    int sportsMarks;

    public void getAcademicScore(int marks) {
        academicMarks = marks;
    }

    public void getSportsScore(int score) {
        sportsMarks = score;
    }

    void display() {
        System.out.println("Academic Score: " + academicMarks);
        System.out.println("Sports Score: " + sportsMarks);
    }
}


public class sports {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Academic Score: ");
        int a = sc.nextInt();

        System.out.print("Enter Sports Score: ");
        int s = sc.nextInt();

        r.getAcademicScore(a);
        r.getSportsScore(s);

        System.out.println("\nStudent Result");
        r.display();

        sc.close();
    }
}