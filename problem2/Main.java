import java.util.*;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        if (marks == null || marks.length == 0) return 0.0;

        int sum = 0;
        for (int m : marks) sum += m;

        return (double) sum / marks.length;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int n = sc.nextInt();

        int[] marks = new int[n];
        for (int i = 0; i < n; i++) marks[i] = sc.nextInt();

        Student s = new Student(name, marks);
        System.out.println(s.calculateAverage());

        sc.close();
    }
}