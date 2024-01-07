package session4;

public class GetExRate_3 {

    public static void main(String[] args) {
        int dollar;

        //해당 부분은 문제에서 주어지지않음(추후 사용자 입력 사용으로 업데이트 예정 :: 2024.01.06)
        dollar = 15;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원입니다.");
        }
    }
}
