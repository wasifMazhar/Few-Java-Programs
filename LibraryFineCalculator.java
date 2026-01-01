import java.util.Scanner;
public class LibraryFineCalculator{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);

int totalFine = 0;
int ZeroFineBooks= 0; 
int maxFine =0;
int Fine = 0;
for(int i=0; i < 10; i++){
System.out.print("Enter days for overdue books: ");
int Days = sc.nextInt(); 

if(Days >= 1){
    Fine = Days * 2;
    totalFine += Fine;
    if(Fine > maxFine){
    maxFine = Fine;
    }
}else if(Days == 0){
    ZeroFineBooks++;
}else{
    System.out.println("invalid");
}


}

    System.out.println("total fine: " + totalFine);
    System.out.println("No of books with Zero fine: " + ZeroFineBooks);
    System.out.println("Maximum fine charged for single book: " + maxFine);


}
}