import java.util.Scanner;

public class Substring {
    public static void main(String [] args){
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
