public class EasyPatterns{
public static void main(String[] args){


// rectangle
for(int i = 0; i < 5; i++ ){
    for(int j=0; j<5; j++){
        System.out.print("* ");
    }
    System.out.println();
}    

        System.out.println("\n\n");

//hollow rectangle
for(int i=0; i<5; i++){
    for(int j=0; j<5; j++){
        if(i==0 || i==4 || j==0 || j==4){
        System.out.print("* ");
        }else{
        System.out.print("  ");
        }
    }
        System.out.println();

}

System.out.println("\n\n");

//triangle
for(int i=0; i<5; i++){
    for(int j=0; j<=i; j++){
        System.out.print("*");
    }
        System.out.println();
}


// hollow triangle

System.out.println("\n\n");

for(int i=0; i<5; i++){
    for(int j= 0; j<=i; j++){
        if(i==j || j==0 || i == 4){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
    System.out.println();
}


System.out.println("\n\n");

//fliped triangle

for(int i=5; i>0; i--){
    for(int j = 0; j<i-1; j++){
    System.out.print(" ");
    }

    for(int j=5; j>=i; j--){
        System.out.print("*");
    }
    System.out.println();
}

System.out.println("\n\n");

//hollow filped triangle
for (int i = 1; i <= 6; i++) {

    // spaces
    for (int s = 1; s <= 6 - i; s++) {
        System.out.print(" ");
    }

    // stars
    for (int j = 1; j <= i; j++) {
        if (i == 6 || j == 1 || j == i) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    System.out.println();
}



//Piramid

System.out.println("\n\n");

for (int i = 1; i <= 5; i++) {
    for (int s = 1; s <= 5 - i; s++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}


//Inverted triangle

System.out.println("\n\n");

for (int i = 5; i > 0; i--) {
    for (int j = 0; j < i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}


//inverted hollow triangle
System.out.println("\n\n");

for(int i = 5; i>=0 ; i--){
    for(int j=0; j<=i; j++){
        if(i==5 || j==0 || j==i){
        System.out.print("* ");
        }else{
        System.out.print("  ");
        }
    }
    System.out.println();

}


//fliped triangle
System.out.println("\n\n");

for(int i=5; i>=0; i--){
    for(int j= 0; j<=(5-i); j++){
        System.out.print(" ");
    }
    for(int j=0; j<=i; j++){
     System.out.print("*");
    }
    System.out.println();
}

 }
}