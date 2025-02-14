package practice;
import java.util.*;
public class practice3 {
	public static void main(String[] args) {
		/*
		 给动态数组添加元素效果，实现数组扩容
		 1.创建一个新的数组
		 2.将原来的数组元素赋给新数组,并且贴上新数组的数组元素
		 3.将新数组给到原来的数组，原来数组jvm机自动销毁
		 4.输出原来的数组，得到扩容
		 5.创建Scanner，用来输入
		 6.用do-while,break结束循环
		 */
		    int[] arr= {1,2,3};
		    do {
			int[] arrnew=new int[arr.length+1];
			Scanner scanner=new Scanner(System.in);
			System.out.println("请输入数字：");
			int arrAdd=scanner.nextInt();
			for(int i=0;i<arrnew.length-1;i++) {
			arrnew[i]=arr[i];
			arrnew[arrnew.length-1]=arrAdd;
		}
			arr=arrnew;
			for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
			System.out.println("是否还要继续添加数字(结束为n)：");
			char judgAdd=scanner.next().charAt(0);
			if(judgAdd=='n') {
				System.out.println("你退出了……");
				break;
			}
		    }while(true);
		    
			
		
	}
}
