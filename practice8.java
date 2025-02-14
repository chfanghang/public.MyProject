package practice;
import java.util.*;
public class practice8 {
	public static void main(String[] args) {
		/*ц╟ещеепР
		 1.arr={10,12,45,90}
		 */
		int[] arr={-3,10,12,45,90,34,76,88};
		for(int j=0;j<arr.length;j++) {
			for(int i=0;i<arr.length-1-j;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
