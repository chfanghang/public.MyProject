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
        System.out.println("���һ������" + low + "��" + high + "֮�������,����" + attempts + "�λ��ᡣ");

        Scanner scanner = new Scanner(System.in);
        for (int attempt = 0; attempt < attempts; attempt++) {
            System.out.print("��������Ĳ²�: ");
            int guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("̫С��!");
            } else if (guess > secretNumber) {
                System.out.println("̫����!");
            } else {
                System.out.println("��ϲ��,�¶���!����������" + secretNumber + "��");
                return;
            }
        }

        System.out.println("���ź�,���Ѿ����������еĲ²����������������" + secretNumber + "��");
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