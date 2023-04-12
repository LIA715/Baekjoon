import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h= sc.nextInt(); //시
        int m= sc.nextInt(); //분
        int n= sc.nextInt(); //요리하는데 필요한 시간

        int a = h*60+m+n;
        h = a/60;
        m = a%60;

        if(h>=24){
            h=h-24;
        }
        System.out.println(h + " " + m);
    }
}
