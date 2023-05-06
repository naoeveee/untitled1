import java.util.Scanner;

class Rectangle1{
    public int width;
    public int height;
    Rectangle1(int width,int height){
        this.width=width;
        this.height=height;
    }
    public void area(){
        System.out.println(width*height);
    }
}
public class pra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        Rectangle1 r1 = new Rectangle1(width,height);
        r1.area();
    }
}