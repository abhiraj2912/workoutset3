import java.util.Scanner;

public class InputCounter {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int lines=0, words=0, vowels =0 ;

          String str = sc.nextLine().replace("\\n","\n");

          for(int i=0; i<str.length();i++)
          {
              if(str.charAt(i)==' '){
                  words++;
              }
              if (str.charAt(i)=='\n') {
                  lines++;
                  words++;
              }
              if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
                  vowels++;
              }
          }

        System.out.println(str);
        System.out.println("Number of words: "+words);
        System.out.println("Number lines: "+lines);
        System.out.println("Number of vowels: "+vowels);

    }
}
