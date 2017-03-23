package pack3;

/**
 * Created by User on 02.03.2017.
 */
public class ThirdClass {
    public static void main(String[] args) {



//        for (i = 1; i < 500; i += 2 ) {
//            if (i >= 239) {
//                break;
//            }
//            System.out.println(i);
//        }
        for (int i =1 ; i< 500; i++){
            if (i >= 239){ break; }
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
       /* int i;
        for (i = 0; i < 5; i++) {
            if (i >= 3) {
                break;
            }
            System.out.println("Yuhu");
            if (i >= 1) {
                continue;
            }
            System.out.println("Tata");
        }
        System.out.println(i);*/

    }
}
