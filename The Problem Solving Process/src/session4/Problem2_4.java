package session4;

public class Problem2_4 {

    public static void main(String[] args) {
        int x;

        //해당 부분은 문제에서 주어지지않음(추후 사용자 입력 사용으로 업데이트 예정 :: 2024.01.06)
        x = 2;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }

}
