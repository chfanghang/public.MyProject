package array;
import java.util.*;
public class practive1 {
	public static void main(String[] args) {
		//请求数组int[]最大值{4，-1,9,10,23},并得到对应下标
		//1.循环比较
		//2.下标
		int[] arr={4,-1,9,10,23,65,28,8,29,55};
		int max=arr[0];
		int sub=0;
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				sub=i;			//大的那个数会交换，小的那个不会交换        		
			}					//所以max的下标就是最大数的下标
		}
		System.out.print("max= "+max);		
		System.out.println();		
		System.out.print("下标为 "+sub);
	}
}