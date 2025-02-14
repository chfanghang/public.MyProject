import java.util.Random;
import java.util.Scanner;
//import java.util.Random;

public class number_game {

    public static void main(String[] args) {
        int low = 1;
        int high = 5000;
        int attempts = 10;
        guessNumberGame(low, high, attempts);
    }

    public static void guessNumberGame(int low, int high, int attempts) {
        Random random = new Random();
        int secretNumber = random.nextInt(high - low + 1) + low;
       // int  secretNumber =1314;
        System.out.println("请猜一个介于" + low + "和" + high + "之间的整数,你有" + attempts + "次机会。");

        Scanner scanner = new Scanner(System.in);
        for (int attempt = 0; attempt < attempts; attempt++) {
            System.out.print("请输入你的猜测: ");
            int guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("太小了!");
            } else if (guess > secretNumber) {
                System.out.println("太大了!");
            } else {
                System.out.println("恭喜你,猜对了!秘密数字是" + secretNumber + "。");
                return;
            }
        }

        System.out.println("很遗憾,你已经用完了所有的猜测次数。秘密数字是" + secretNumber + "。");
    }
}

/*  if(num<number) {
			min_number();
			if(num>number) {
			 max_number(); 
			 if(num==number) {
			succeed();
			break;
		}
			
		}
			
		}
		else {
			error_due();
		}  */