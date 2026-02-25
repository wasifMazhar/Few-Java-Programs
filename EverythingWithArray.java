import java.util.*;
public class EverythingWithArray{

static Scanner sc = new Scanner(System.in);

public static void main(String[] args){

int[] arr = {3,4,5,6,7,8,9,1,3,2,7,10};

// sorting(arr);

// removeDuplicates(arr);

System.out.println(Arrays.toString(arr));
keyFinding(arr);

}//main

public static void sorting(int[] arr){
for(int i=0; i<arr.length - 1 ; i++){
    for(int j=0; j<arr.length - 1 -i; j++){
        if(arr[j] > arr[j +1]){
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            
        }
    }
}
}//sorting

public static void removeDuplicates(int[] arr){

    int[] noDuplicateArr = new int[arr.length];
    int idx = 0;

    for(int i = 0; i < arr.length; i++){

        boolean isDuplicate = false;

        for(int j = 0; j < idx; j++){
            if(arr[i] == noDuplicateArr[j]){
                isDuplicate = true;
                break;
            }
        }

        if(!isDuplicate){
            noDuplicateArr[idx] = arr[i];
            idx++;
        }
    }

    System.out.println(Arrays.toString(Arrays.copyOf(noDuplicateArr, idx)));
}// remove duplicates

public static void keyFinding(int[] arr){
int key = sc.nextInt();

for(int i=0; i<arr.length; i++){

        if(arr[i] == key){
            System.out.println("Key is found at index " + i);
            return;
        }
}

    System.out.println("Key not found!");
}// key finding


}//class