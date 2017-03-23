package Lesson2;

import java.util.Arrays;

public class Lesson2 {

    int[] arrDigits = new int[10];
    int[] secondArr = { 0, 1, 2, 3, 4 };
    String[] popos = new String[2];
    String[] arrString = {"str1" , "str2" , "str3"};

    int [] aarTwo = new int[5];
    int [] arrThree = {9, 8, 7, 6, 5, 4};

    public void meth(){
        arrDigits[0] = 1;
        arrDigits[8] = 9;


    }

    public static void main(String[] args) {
        Lesson2 sc = new Lesson2();
        sc.meth();
        /*System.out.println(Arrays.toString(sc.arrDigits));
        System.out.println(Arrays.toString(sc.secondArr));

        System.out.println(Arrays.toString(sc.popos));
        System.out.println(Arrays.toString(sc.arrString));*/

     /*   System.out.println(Arrays.toString(sc.aarTwo));
        System.out.println(Arrays.toString(sc.arrThree));

        sc.aarTwo[4] = sc.arrThree[5];
        sc.aarTwo[3] = sc.arrThree[4];
        System.out.println(Arrays.toString(sc.aarTwo));

*/
      /*  for (int i = 9; i >= 0; i--) {
            sc.arrDigits[i] = i;
            System.out.println(i);
        }*/

       /* int j = 0;
        while (j < sc.arrDigits.length){
            System.out.println(j);
            j++;
        }
       */// System.out.println(Arrays.toString(sc.arrDigits));
        int[] mass = new int[8];
        int[] mass2 = new int[12];

        for(int x = 7; x >= 0; x--){
            mass[x] = x;
            System.out.println(Arrays.toString(mass));
        }

    }
}




/*
    public int digit = 5;
    protected String str = "dsfsdf sdfsdfs sdfsd";
    private boolean bool = true;
    double doub = 5.25;

    public static void main(String[] args) {
        String strTemp = "value";
        char dff = 'f';
    }
*/
