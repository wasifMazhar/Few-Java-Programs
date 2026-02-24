import java.util.Scanner;
public class StudentsPassed{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the length of array: ");
int n = sc.nextInt();

int[] marks = new int[n];

for(int i=0; i<marks.length; i++){

while (true) {
        System.out.print("Enter marks for student " + (i + 1) + ": ");
        int input = sc.nextInt();

        if (input >= 0 && input <= 100) { // If valid
            marks[i] = input;
            break; // Exit the while loop and move to the next student
        } else {
            System.out.println("Invalid! Please enter marks between 0 and 100.");
        }
    }
} 

int passed = countPassed(marks);

System.out.println("Number of students passed are "+ passed);

}//main

public static int countPassed(int[] marks){
int passed = 0;

for(int i=0; i<marks.length; i++){
    if(marks[i] >= 40){
        passed++;
    }
}
return passed;
}//count passed

}//class