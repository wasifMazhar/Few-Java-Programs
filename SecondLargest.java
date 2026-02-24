import java.util.Scanner;
public class SecondLargest{

static Scanner sc = new Scanner(System.in);


public static int[] ArrMaker(int n){
// Scanner sc = new Scanner(System.in);

int[] arr = new int[n];

for(int i=0; i<arr.length; i++){

arr[i] = sc.nextInt();
}

return arr;

}//array maker 

public static void main(String[] args){
System.out.print("Enter the length of array: ");
int n = sc.nextInt();


int[] arr = ArrMaker(n); 

int NumFound = secondLargest(arr);

System.out.println("Second largest number in the array is "+ NumFound);
}// main

public static int secondLargest(int[] arr){

int SecLargest = Integer.MIN_VALUE;
int Largest = Integer.MIN_VALUE;

for(int i=0; i<arr.length; i++){

        if(Largest < arr[i]){
            SecLargest = Largest;
            Largest = arr[i];
        }

}// arr loop

return SecLargest;
}//second largest finder
}//class