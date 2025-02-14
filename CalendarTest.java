package lqb_A;

import java.time.LocalDate; // ���� Java 8 �е� LocalDate ��
import java.time.DayOfWeek; // ���� Java 8 �е� DayOfWeek ��

/**
 * CalendarTest �࣬���ڴ�ӡ��ǰ�·ݵ�����
 */
public class CalendarTest {

    /**
     * ���������������
     *
     * @param args �����в���
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // ��ȡ��ǰ����
        int mouth = date.getMonthValue(); // ��ȡ��ǰ�·�
        int today = date.getDayOfMonth(); // ��ȡ��ǰ�Ǳ��µĵڼ���

        date = date.minusDays(today - 1); // ����������Ϊ���µĵ�һ��

        DayOfWeek weekday = date.getDayOfWeek(); // ��ȡ��һ�������ڼ�
        int value = weekday.getValue(); // ��ȡ���ڼ���Ӧ����ֵ��1 ��ʾ����һ��7 ��ʾ�����գ�

        System.out.println("Mon Tue Wed Thu Fri Sat Sun"); // ��ӡ���ڵı�ͷ

        // ��ӡ��һ��֮ǰ�Ŀո�
        for (int i = 1; i < value; i++)
            System.out.print("    ");

        // ѭ����ӡ���µ�ÿһ��
        while (date.getMonthValue() == mouth) {
            System.out.printf("%3d", date.getDayOfMonth()); // ��ӡ����

            // ����ǽ��죬����Ǻţ������ӡ�ո�
            if (date.getDayOfMonth() == today) 
                System.out.print("*");
            else
                System.out.print(" ");

            date = date.plusDays(1); // ���ڼ�һ��

            // ���������һ����
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }

        // ������һ�첻�������ջ���
        if (date.getDayOfWeek().getValue()!= 1)
            System.out.println();
    }
}
