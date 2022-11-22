import java.util.Scanner;

class ExceptionLineTooShort extends Exception{
    ExceptionLineTooShort(String s){
        super(s);
    }
}
class ExceptionLineTooLong extends Exception{
    ExceptionLineTooLong(String s){
        super(s);
    }
}

public class StringChecker {
    static void LengthChecker(String str) throws  ExceptionLineTooLong, ExceptionLineTooShort{
        if(str.length()>10){
            throw new ExceptionLineTooLong("Exception: The input is too long");
        } else if (str.length()<5) {
            throw new ExceptionLineTooShort("Exception: The input is too short");
        }
        else {
            System.out.println(str);
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Line");
        String str= sc.next();
        try {
            LengthChecker(str);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
