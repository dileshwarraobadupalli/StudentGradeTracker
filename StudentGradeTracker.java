import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Input student details
        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();

            names.add(name);
            grades.add(grade);
        }

        // Calculate average, highest and lowest
        double total = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);

        for (double grade : grades) {

            total += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = total / grades.size();

        // Display summary
        System.out.println("\n=================================");
        System.out.println("       STUDENT GRADE REPORT");
        System.out.println("=================================");

        System.out.printf("%-20s %-10s%n", "Student Name", "Grade");
        System.out.println("---------------------------------");

        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%-20s %-10.2f%n",
                    names.get(i), grades.get(i));
        }

        System.out.println("---------------------------------");
        System.out.printf("Average Grade : %.2f%n", average);
        System.out.printf("Highest Grade : %.2f%n", highest);
        System.out.printf("Lowest Grade  : %.2f%n", lowest);

        System.out.println("=================================");

        sc.close();
    }
}