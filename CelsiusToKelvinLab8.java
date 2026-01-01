import java.util.Scanner;
public class CelsiusToKelvinLab8{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);

System.out.println("Celsius | Fahrenheit");
System.out.println("--------------------");
int f = 0;
int c = 0;
while(c <= 100){
f = c * 9/5 + 32;
System.out.println("\t" + c + " | " +  f);
c = c + 10;
}




}}