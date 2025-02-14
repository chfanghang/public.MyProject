package practice;
import java.util.*;
public class practice4 {
	public static void main(String[] args) {
		/*
		 有一个数组arr={1,2,3,4,5,6},可以将数组缩减，提示用户是否继续缩减，
		 当缩减到最后一个数组，不能再缩减
		 1.创建一个数组arrNew
		 2.将数组arr[i]->arrNew[i]
		 3.将arr=arrNew，原来的那个被jvm机销毁
		 4.输出arr
		 5.创建Scanner
		 6.do-while,if,break退出循环
		 */
		Scanner scanner=new Scanner(System.in);
		int[] arr={1,2,3,4,5,6};
		do {
		int[] arrNew=new int[arr.length-1];
		for(int i=0;i<=arrNew.length-1;i++) {
			arrNew[i]=arr[i];
		}
		arr=arrNew;
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("是否继续缩减(n会退出)：");
		char key=scanner.next().charAt(0);
		if(key=='n') {
			System.out.println("退出缩减……");
			break;
		}
		if(arr.length==1) {
			System.out.println("只剩最后一个了，退出缩减");
			break;
		}
		}while(true);
		
	}

}