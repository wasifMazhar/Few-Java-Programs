import java.util.Scanner;
import java.util.Arrays;

public class ReverseArr{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter the length of array: ");
int n = sc.nextInt();

int[] arr = new int[n];

for(int i=0; i<arr.length; i++){
    arr[i] = sc.nextInt();
}

reverse(arr);

System.out.println(Arrays.toString(arr));

}//main

public static void reverse(int[] arr){

int start = 0;
int end =arr.length -1;

while(start < end){

int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;

start++;
end--;
}

}// reverse 

}//class