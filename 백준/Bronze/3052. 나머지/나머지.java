import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        boolean a; //n번째와 n+1번째 비교
        int cnt = 0; //서로 다른 나머지 개수 측정

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() % 42; //42로 나눈 나머지 구하기
        }
        for (int i = 0; i < arr.length; i++) {
            a = false; //기본값 false
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) { //배열의 n번째와 n+1번째의 값을 비교
                    a = true; //같다면 a를 true로 변경
                    break; //한번만 비
                }
            }
            if (a == false) {
                cnt++; //a값이 false일 때 1증가
            } //만약 true면 나머지 같음. 카운트를 올릴 필요x
        }
        System.out.println(cnt);
    }
}
