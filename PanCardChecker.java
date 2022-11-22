import java.util.Scanner;

class InvalidPanException extends Exception{
    InvalidPanException(String s){
        super(s);
    }
}

public class PanCardChecker {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.next();
        System.out.println("Enter Pan-card Number");
        String pan=sc.next();
        try{
        if(pan.charAt(4) == name.charAt(0)){
            System.out.println("valid");}
        else{
             throw new InvalidPanException("Exception: Invalid Pan-Card Number");
            }
        }catch (InvalidPanException e){
            System.out.println(e.getMessage());
            System.out.println("Please provide a valid pan-card Number");

        }
        }
    }
