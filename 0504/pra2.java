import java.util.Scanner;

public class pra2 {
    public static boolean findEvenOdd(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int num= sc.nextInt();

        if(findEvenOdd(num)){
            System.out.println(num+" is Even(짝수)");
        }else{
            System.out.println(num+" is Odd(홀수)");
        }
    }

}
