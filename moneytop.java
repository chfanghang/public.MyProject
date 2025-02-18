package com.hspeds.copyOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class moneytop {
    public static void main(String[] args) {
        boolean loop = true;

        double earnings = 0.0;
        double balance = 0.0;
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner scanner = new Scanner(System.in);
        String detial = "-----------零钱通明细----------\n";

        do {
            System.out.println("-----------零钱通菜单---------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消   费");
            System.out.println("\t\t\t4 退   出");
            System.out.println("请选择(1-4):");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(detial);
                    break;
                case 2:
                    System.out.println("请输入收益金额:");
                    double sum = scanner.nextDouble();
                    if (sum <= 0.0) {
                        System.out.println("输入有误！");
                        break;
                    }
                    earnings += sum;
                    balance += earnings;
                    date = new Date();
                    detial = detial + "\n收益入账\t+" + earnings + "\t" +
                            simpleDateFormat.format(date)+ "\t" + balance;
                    break;


                case 3:
                    System.out.println("请输入消费金额:");
                    double subtract = scanner.nextDouble();
                    balance -= subtract;

                    if (subtract <= 0 || subtract > balance) {
                        System.out.println("输入有误！");
                        return;
                    }

                    System.out.println("请输入消费说明:");
                    String note = scanner.next();

                    date = new Date();
                    detial = detial + "\n" + note + "\t-" + subtract + "\t" +
                            simpleDateFormat.format(date)+ "\t" + balance;
                    break;
                case 4:
                    System.out.println("退出了零钱通……");
                    loop = false;
                    break;
                default:
                    System.out.println("输入有误,请重新输入……");
            }
        } while (loop);

    }
}
