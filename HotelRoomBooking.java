import java.util.Scanner;
public class HotelRoomBooking{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);

int totalBooked = 0;
int toalRevenue = 0;

for(int i = 1; i <= 10; i++){
System.out.println("Do you want to book room (Y or N): ");
char Responce = sc.nextLine().toUpperCase().charAt(0);
// Responce =  sc.next();

if(Responce == 'N'){
System.out.println("User do not want to book room !");
System.out.println("=====================================");
    continue;
}else if(Responce == 'Y'){
    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Howe many nights do you want to stay: ");
    int nights = sc.nextInt();
    sc.nextLine();
    int PerGuestPrice = nights * 100;
    totalBooked++;
    toalRevenue += PerGuestPrice;
    System.out.println("Thanks for book Sir/Mam: " + name);
    System.out.println("Price for you booking is : " + PerGuestPrice);
}else{
System.out.println("Invalid !");
    
}

System.out.println("=====================================");


}

System.out.println("Total number of rooms booked are : " + totalBooked);
System.out.println("Total money made is : " + toalRevenue);


}}