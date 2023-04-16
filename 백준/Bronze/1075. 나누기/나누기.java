import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException { //throws IOException을 써서 bufferreader,writer IO예외처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        n/=100;
        n*=100;

        int f = Integer.parseInt(br.readLine());
        int answer = 0;

        while (n%f !=0){ //f로 나누어 떨어지지 않으면 계속 +
            n++;
            answer++;
        }
        if (answer<10){
            System.out.println("0"+answer);
        }else {
            System.out.println(answer);
        }
    }
}
