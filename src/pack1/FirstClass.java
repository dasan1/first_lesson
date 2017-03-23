package pack1;


public class FirstClass {
    int int1 = 1;
    double drobu = 65.88;
    boolean xxx = true;
    String strDigit = "string";
    char c = 's';

    public static String nameOfMethod(){
        int secondDigit = 5;

        return "method"+secondDigit;


    }

    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World!";

        int digit1 = 5;
        int digit2 = 6;
        String sum = hello + world;
        if ((digit1 + digit2) >= 11){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
//trertyrtyrtyty
//fggjghjghfjgjfhjf

        System.out.println((digit1 * digit2) / 3);

        if (hello.equals("Hello")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        System.out.println(hello+" "+world);
    }
}
