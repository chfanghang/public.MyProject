package lqb_A;
import java.util.*;

public class BigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������ɼ�: ");
        int score = scanner.nextInt();
        switch (score / 60) {
        	case 1:
            case 2:
                System.out.println("�ɼ��ϸ�");
                break;
            default:
                System.out.println("�ɼ����ϸ�");
                break;
        }
    }
}