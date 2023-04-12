import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class joon25314 {
    public static void main(String[] args) throws IOException
    //throw~ 필수임. inputStream==null일때 대비해서 예외처리 미리 해줘야함.
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //여기 통해서 N값을 입력 받음
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N / 4; i++)
        //여기 조건문에서 N/4를 이용해 4의 배수 만큼 반복
        {
            System.out.print("long ");
        }
        System.out.println("int"); //for문 벗어나면 int 출력
    }
}
