package lqb_A;

import java.time.LocalDate; // 导入 Java 8 中的 LocalDate 类
import java.time.DayOfWeek; // 导入 Java 8 中的 DayOfWeek 类

/**
 * CalendarTest 类，用于打印当前月份的日历
 */
public class CalendarTest {

    /**
     * 主函数，程序入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // 获取当前日期
        int mouth = date.getMonthValue(); // 获取当前月份
        int today = date.getDayOfMonth(); // 获取当前是本月的第几天

        date = date.minusDays(today - 1); // 将日期设置为本月的第一天

        DayOfWeek weekday = date.getDayOfWeek(); // 获取第一天是星期几
        int value = weekday.getValue(); // 获取星期几对应的数值（1 表示星期一，7 表示星期日）

        System.out.println("Mon Tue Wed Thu Fri Sat Sun"); // 打印星期的表头

        // 打印第一天之前的空格
        for (int i = 1; i < value; i++)
            System.out.print("    ");

        // 循环打印本月的每一天
        while (date.getMonthValue() == mouth) {
            System.out.printf("%3d", date.getDayOfMonth()); // 打印日期

            // 如果是今天，标记星号，否则打印空格
            if (date.getDayOfMonth() == today) 
                System.out.print("*");
            else
                System.out.print(" ");

            date = date.plusDays(1); // 日期加一天

            // 如果是星期一换行
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }

        // 如果最后一天不是星期日换行
        if (date.getDayOfWeek().getValue()!= 1)
            System.out.println();
    }
}
