package array;
import java.util.*;
public class practive1 {
	public static void main(String[] args) {
		//��������int[]���ֵ{4��-1,9,10,23},���õ���Ӧ�±�
		//1.ѭ���Ƚ�
		//2.�±�
		int[] arr={4,-1,9,10,23,65,28,8,29,55};
		int max=arr[0];
		int sub=0;
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				sub=i;			//����Ǹ����ύ����С���Ǹ����ύ��        		
			}					//����max���±������������±�
		}
		System.out.print("max= "+max);		
		System.out.println();		
		System.out.print("�±�Ϊ "+sub);
	}
}