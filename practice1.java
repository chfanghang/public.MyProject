package practice;
import java.util.*;
public class practice1 {
	public static void main(String[] args) {
		//判断一个三位数是否为水仙花数
	//	daff();
		System.out.println("请输入一个数：");
		  while(true) { Scanner scanner=new Scanner(System.in); 
		  int number=scanner.nextInt();
		  int Hun=number/100; 
		  int Ten=(number%10)%10; 
		  int Sin=number%10; 
		  if(number==((Hun*Hun*Hun)+(Ten*Ten*Ten)+(Sin*Sin*Sin))) {
		  System.out.println(number+"为水仙花数!"); } else {
		  System.out.println(number+"不是水仙花数!"); } 
		  }
		 
}
/*
 * public static void daff() { for(int i=0;;i++) { int number=i; int
 * Hun=number/100; int Ten=(number%10)%10; int Sin=number%10;
 * if(number==((Hun*Hun*Hun)+(Ten*Ten*Ten)+(Sin*Sin*Sin))) {
 * System.out.println("水仙花数为："+number); } }
 * 
 * }
 * 水仙花数为：0
水仙花数为：496
水仙花数为：1000
水仙花数为：-1000
水仙花数为：-496
 */
}
