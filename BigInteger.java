package lqb_A;
import java.util.*;

public class BigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩: ");
        int score = scanner.nextInt();
        switch (score / 60) {
        	case 1:
            case 2:
                System.out.println("成绩合格");
                break;
            default:
                System.out.println("成绩不合格");
                break;
        }
    }
}