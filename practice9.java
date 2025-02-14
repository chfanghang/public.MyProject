package practice;
import java.util.*;
public class practice9 {
	public static void main(String[] args) {
		/*数组
		 1.arr={10,12,45,90}
		 2.标志位置index=i,头、尾、中间
		 3.创建arrNew[arr.length+1]数组
		 4.跳过index的标志位置赋值
		 5.将arr=arrNew
		 6.循环do-while
		 7.输入
		 */
		int[] arr={10,12,45,90};
		do {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请插入一个数: ");
		int insNum=scanner.nextInt();
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(insNum>arr[i]&&insNum<arr[i+1]) {
				index=i+1;
				break;
			}
			if(insNum>arr[arr.length-1]) {
				index=arr.length;
				break;
			}
			if(insNum<arr[0]) {
				index=0;
				break;
			}
		}
			
		int[] arrNew=new int[arr.length+1];
		for(int i=0,j=0;i<arrNew.length;i++) {
			if(i==index) {
				continue;
			}
			arrNew[i]=arr[j];
			j++;
		}
		arrNew[index]=insNum;
		arr=arrNew;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		if(arr.length==10) {
			System.out.println("最大限制10个元素，退出……");
			break;
		}
		}while(true);
	}
}
