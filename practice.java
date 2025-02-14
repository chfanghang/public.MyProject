package practice;
import java.util.*;
public class practice {
	public static void main(String[] args) {
		/*数组内创建新数组，逆序交换，销毁新数组，实现交换数组
		System.out.println();
		 for (int i=0; i<=arr1.length-1; i++)
		 System.out.print(arr1[i] + "  ");
		1.首先创建了一个新的整数数组 `arr2` ，其长度与 `arr1` 相同。然后通过一个循环
		2.从 `arr1` 的最后一个元素开始，将其依次赋值给 `arr2` 的第一个元素、第二个元素……
		3.接着，将 `arr2` 赋值给 `arr1` ，实现了对 `arr1` 的逆序操作。
		4.通过另一个循环打印出逆序后的 `arr1` 的所有元素。
		eg1:当 `i = 8` 时，`arr1[8]` 的值 8 被赋值给 `arr2[0]` ；
		eg2:当 `i = 7` 时，`arr1[7]` 的值 66 被赋值给 `arr2[1]` 
		*/
		int[] arr1= {1,7,56,43,34,98,94,66,8};//arr1.length为个数
		int[] arr2=new int[arr1.length];
		for (int i =arr1.length-1,j=0;i>=0; i--,j++) {
            arr2[j] = arr1[i];
		}	
		 arr1=arr2;
		 System.out.println();
		 for (int i=0; i<=arr1.length-1; i++)
		 System.out.print(arr1[i] + "  ");
	}
}
