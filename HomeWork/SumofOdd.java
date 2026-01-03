import java.util.Scanner;
public class SumofOdd{

public static void OddAddition(int num){
int sum = 0;
for(int i=num; i>=1; i-=2){
sum+=i;
}

System.out.println("Sum of all the Odd number below " +num+ " is: "+ sum );

}

public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.print("Enter an odd number: ");
int num =sc.nextInt();

boolean isValid = true;

while(isValid){
if(num % 2 == 0 || num <=0){
    System.out.print("Enter an odd number: ");
    num = sc.nextInt();
}else{
    OddAddition(num);
    isValid = false;
}

}
}
}