package practice;
import java.util.*;
public class practice1 {
	public static void main(String[] args) {
		//�ж�һ����λ���Ƿ�Ϊˮ�ɻ���
	//	daff();
		System.out.println("������һ������");
		  while(true) { Scanner scanner=new Scanner(System.in); 
		  int number=scanner.nextInt();
		  int Hun=number/100; 
		  int Ten=(number%10)%10; 
		  int Sin=number%10; 
		  if(number==((Hun*Hun*Hun)+(Ten*Ten*Ten)+(Sin*Sin*Sin))) {
		  System.out.println(number+"Ϊˮ�ɻ���!"); } else {
		  System.out.println(number+"����ˮ�ɻ���!"); } 
		  }
		 
}
/*
 * public static void daff() { for(int i=0;;i++) { int number=i; int
 * Hun=number/100; int Ten=(number%10)%10; int Sin=number%10;
 * if(number==((Hun*Hun*Hun)+(Ten*Ten*Ten)+(Sin*Sin*Sin))) {
 * System.out.println("ˮ�ɻ���Ϊ��"+number); } }
 * 
 * }
 * ˮ�ɻ���Ϊ��0
ˮ�ɻ���Ϊ��496
ˮ�ɻ���Ϊ��1000
ˮ�ɻ���Ϊ��-1000
ˮ�ɻ���Ϊ��-496
 */
}
