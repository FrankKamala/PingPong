import java.util.Scanner;
import java.util.ArrayList;
public class PingPong {
    public ArrayList<Object> runPingPong(int countUpTo){
        ArrayList<Object> result = new ArrayList<Object>();
     for (int i = 1; i<= countUpTo; i++){
         if (i%3 ==0 && i%5 == 0){
             result.add("pingpong");
         }else if (i%3==0)
         {
             result.add("ping");
         }else if (i%5 == 0 ){
             result .add ("pong");
         }

         else{
             result.add(i);
         }

        }

        return result;
    }
//    public static void main(String[] args) {
////        Scanner myScanner = new Scanner(System.in);
////
////        System.out.println("Enter number gazee");
////        Integer number = myScanner.nextInt();
////
////        if (number %3==0){
////            System.out.println("Ping" );
////        }else if(number%5==0){
////            System.out.println("Pong" );
////        }else if (number %3==0 && number%5==0){
////            System.out.println("PingPong" );
////        }
//
//
//    }
}
