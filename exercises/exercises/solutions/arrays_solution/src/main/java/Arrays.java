import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of students");
        String input = keyboard.nextLine();
        int numberStudents = Integer.parseInt(input);

        int [] studentGrades = new int[numberStudents];
        for(int i= 0; i < studentGrades.length; i++){
            System.out.printf("Please enter the grade for student %d  %n", (i+1));
            input = keyboard.nextLine();
            studentGrades[i] = Integer.parseInt(input);
        }

        System.out.println("Students Grade Are :");
        int total = 0;
        for(int i= 0; i < studentGrades.length; i++){
            System.out.printf("The grade for student %d  is %d%n", (i+1),
                    studentGrades[i]);
            total += studentGrades[i];
        }
        System.out.printf("Average grade is %d%n ", total/studentGrades.length);


        int lowestGrade = 101;
        int highestGrade = 0;
        for(int i= 0; i < studentGrades.length; i++){
            if(studentGrades[i] > highestGrade){
                highestGrade = studentGrades[i];
            }
            if(studentGrades[i] < lowestGrade){
                lowestGrade = studentGrades[i];
            }
        }
        System.out.printf("The highest grade is  %d  and lowest is %d%n",
                highestGrade,lowestGrade);



    }

}
