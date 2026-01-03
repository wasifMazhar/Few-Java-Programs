public class MAKZVG{
public static void main(String[] args){


//M
for(int i = 1; i<=5; i++ ){
    for(int j=1; j<=9; j++){
        if(j==1 || j==9 || j==i || i+j == 10){
        System.out.print("*");
        }else{
        System.out.print(" ");
        }
    }
        System.out.println();
}

System.out.println("\n\n");

//A
for(int i = 1; i<=5; i++ ){
    for(int j=1; j<=5; j++){
        if( i == 1 || i==3 || j==1 || j==5){
        System.out.print("*");
        }else{
        System.out.print(" ");
        }
    }
        System.out.println();
}



// int rows = 5;

// for (int i = 1; i <= rows; i++) {

//     for (int s = 1; s <= rows - i; s++) {
//         System.out.print(" ");
//     }

//     for (int j = 1; j <= 5; j++) {
//         if (
//             i == 1 && j > 1 && j < 5 ||   
//             i == 3 ||                    
//             j == 1 || j == 5              
//         ) {
//             System.out.print("*");
//         } else {
//             System.out.print(" ");
//         }
//     }

//     System.out.println();
// }



System.out.println("\n\n");

//K
for(int i=1; i<=7; i++){
    for(int j=1;j<=4; j++){
        if(j==1 || j+i == 5 || j-i == -3){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
}
            System.out.println();
}


System.out.println("\n\n");
//Z
for(int i=1; i<=4; i++){
    for(int j=1; j<=4; j++){
    if(i==1 || i==4 || i+j == 5){
    System.out.print("*");
    }else{
    System.out.print(" ");
    }
}
    System.out.println();
}

System.out.println("\n\n");

//V
for(int i = 1; i<=5; i++ ){
    for(int j=1; j<=9; j++){
        if(j==i || i+j == 10){
        System.out.print("*");
        }else{
        System.out.print(" ");
        }
    }
        System.out.println();
}

System.out.println("\n\n");

}    
}