package session4;

public class Problem2_2 {

    public static void main(String[] args) {
        String grade;

        //해당 부분은 문제에서 주어지지않음(추후 사용자 입력 사용으로 업데이트 예정 :: 2024.01.06)
        grade = "B";

        switch(grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다!");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
    }
}
