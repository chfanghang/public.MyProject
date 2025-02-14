import java.util.*;

import java.util.*;

/**
 * 主类：Value_three_largest，用于找出并输出输入的三个数中的最大值及排序
 */
public class Value_three_largest {

    /**
     * 主函数，程序入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Enter_value(a, b, c); // 调用输入值的方法                                               /*分治法*/
    }

    /**
     * 用于输入三个值的方法
     *
     * @param a 第一个整数
     * @param b 第二个整数
     * @param c 第三个整数
     */
    public static void Enter_value(int a, int b, int c) {        /*驼峰命名法*/
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("请输入三个数："); 
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            int max = Return_Max_value(a, b, c); // 调用获取最大值的方法
            System.out.print("三个数最大为：" + max);
        }
    }

    /**
     * 用于找出三个数中的最大值并输出排序的方法
     *
     * @param a 第一个整数
     * @param b 第二个整数
     * @param c 第三个整数
     * @return 三个数中的最大值
     */
    public static int Return_Max_value(int a, int b, int c) {
        int max = a;
        if (a > b && a > c) {				  // 如果 a 最大
            if (b > c) {  					  // 如果 b 大于 c
                System.out.print("从大到小排序：");
                System.out.print(a + ">" + b + ">" + c);
                return max;
            } else {  						  // 如果 c 大于 b
                System.out.print("从大到小排序：");
                System.out.print(a + ">" + c + ">" + b);
                return max;
            }
        }
        if (b > a && b > c) { 				  // 如果 b 最大
            if (a > c) { 					  // 如果 a 大于 c
                System.out.print("从大到小排序："); 
                System.out.print(b + ">" + a + ">" + c);
                max = b; 
                return max;
            } else { 					      // 如果 c 大于 a
                System.out.print("从大到小排序："); 
                System.out.print(b + ">" + c + ">" + a);
                max = b; 
                return max;
            }
        }
        if (c > b && c > a) {  				  // 如果 c 最大
            if (b > a) {  				      // 如果 b 大于 a
                System.out.print("从大到小排序："); 
                System.out.print(c + ">" + b + ">" + a);
                max = c;  
                return max;
            } else { 						  // 如果 a 大于 b
                System.out.print("从大到小排序："); 
                System.out.print(c + ">" + a + ">" + b);
                max = c; 
                return max;
            }
        }
        return max;
    }
}