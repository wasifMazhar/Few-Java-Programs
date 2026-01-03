import java.util.Scanner;
public class Average{
public static float AverageFinder(int firstNum, int secNum){

return (firstNum + secNum) / 2.0f;
}
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the first number: ");
int firstNum = sc.nextInt();

System.out.print("Enter the second number: ");
int secNum = sc.nextInt();


float Avg = AverageFinder(firstNum, secNum);

System.out.print("Here is the average of 2 numbers you have entered: " + Avg);

}
}