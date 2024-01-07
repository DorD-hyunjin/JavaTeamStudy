package session4;

public class Problem2_1 {

    public static void main(String[] args) {
        double rating;

        //해당 부분은 문제에서 주어지지않음(추후 사용자 입력 사용으로 업데이트 예정 :: 2024.01.06)
        rating = 7.1;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
