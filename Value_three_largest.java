import java.util.*;

import java.util.*;

/**
 * ���ࣺValue_three_largest�������ҳ������������������е����ֵ������
 */
public class Value_three_largest {

    /**
     * ���������������
     *
     * @param args �����в���
     */
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Enter_value(a, b, c); // ��������ֵ�ķ���                                               /*���η�*/
    }

    /**
     * ������������ֵ�ķ���
     *
     * @param a ��һ������
     * @param b �ڶ�������
     * @param c ����������
     */
    public static void Enter_value(int a, int b, int c) {        /*�շ�������*/
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("��������������"); 
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            int max = Return_Max_value(a, b, c); // ���û�ȡ���ֵ�ķ���
            System.out.print("���������Ϊ��" + max);
        }
    }

    /**
     * �����ҳ��������е����ֵ���������ķ���
     *
     * @param a ��һ������
     * @param b �ڶ�������
     * @param c ����������
     * @return �������е����ֵ
     */
    public static int Return_Max_value(int a, int b, int c) {
        int max = a;
        if (a > b && a > c) {				  // ��� a ���
            if (b > c) {  					  // ��� b ���� c
                System.out.print("�Ӵ�С����");
                System.out.print(a + ">" + b + ">" + c);
                return max;
            } else {  						  // ��� c ���� b
                System.out.print("�Ӵ�С����");
                System.out.print(a + ">" + c + ">" + b);
                return max;
            }
        }
        if (b > a && b > c) { 				  // ��� b ���
            if (a > c) { 					  // ��� a ���� c
                System.out.print("�Ӵ�С����"); 
                System.out.print(b + ">" + a + ">" + c);
                max = b; 
                return max;
            } else { 					      // ��� c ���� a
                System.out.print("�Ӵ�С����"); 
                System.out.print(b + ">" + c + ">" + a);
                max = b; 
                return max;
            }
        }
        if (c > b && c > a) {  				  // ��� c ���
            if (b > a) {  				      // ��� b ���� a
                System.out.print("�Ӵ�С����"); 
                System.out.print(c + ">" + b + ">" + a);
                max = c;  
                return max;
            } else { 						  // ��� a ���� b
                System.out.print("�Ӵ�С����"); 
                System.out.print(c + ">" + a + ">" + b);
                max = c; 
                return max;
            }
        }
        return max;
    }
}