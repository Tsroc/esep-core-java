import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String [] gradesPrompt = {"first", "second", "third"};

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of students");
        String input = keyboard.nextLine();
        int numberStudents = Integer.parseInt(input);

        int [][] studentGrades = new int[numberStudents][3];
        for(int i= 0; i < studentGrades.length; i++) {
            for (int j = 0; j < studentGrades[i].length; j++) {
                System.out.printf("Please enter the %s grade for student %d  %n",
                        gradesPrompt[j], (i + 1));
                input = keyboard.nextLine();
                studentGrades[i][j] = Integer.parseInt(input);
            }
        }
        System.out.println("Students Grade Are :");
        for(int i= 0; i < studentGrades.length; i++){
            System.out.printf("The grades for student %d  are: %d %d %d%n", (i+1),
                    studentGrades[i][0],
                    studentGrades[i][1],
                    studentGrades[i][2]);

        }
    }
}
