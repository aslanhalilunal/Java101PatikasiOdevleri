import  java.util.Scanner;
public class suggestion {
    public static void  main(String[] args) {
        int heat;
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the air temperature: ");
        heat=input.nextInt();
        if (heat<5){
        System.out.print("You can go skiing.");
    }   else if (heat<=25) {
        if (heat<15) {
            System.out.println("You can go to the cinema.");
        }
        if (heat>10){
            System.out.println("You can go to the picnic.");
        }
    }   else {
        System.out.println("You can go swimming.");
     }
    }
}
