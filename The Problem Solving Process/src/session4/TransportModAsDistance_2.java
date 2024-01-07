package session4;

public class TransportModAsDistance_2 {

    public static void main(String[] args) {
        int distance;

        //해당 부분은 문제에서 주어지지않음(추후 사용자 입력 사용으로 업데이트 예정 :: 2024.01.06)
        distance = 25;

        if (distance <= 1) {
            System.out.println("도보를 이용하세요.");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요.");
        } else if (distance <= 100) {
            System.out.println("자동차를 이용하세요.");
        } else {
            System.out.println("비행기를 이용하세요.");
        }
    }
}
