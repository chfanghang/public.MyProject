package practice;
import java.util.*;
public class practice {
	public static void main(String[] args) {
		/*�����ڴ��������飬���򽻻������������飬ʵ�ֽ�������
		System.out.println();
		 for (int i=0; i<=arr1.length-1; i++)
		 System.out.print(arr1[i] + "  ");
		1.���ȴ�����һ���µ��������� `arr2` ���䳤���� `arr1` ��ͬ��Ȼ��ͨ��һ��ѭ��
		2.�� `arr1` �����һ��Ԫ�ؿ�ʼ���������θ�ֵ�� `arr2` �ĵ�һ��Ԫ�ء��ڶ���Ԫ�ء���
		3.���ţ��� `arr2` ��ֵ�� `arr1` ��ʵ���˶� `arr1` �����������
		4.ͨ����һ��ѭ����ӡ�������� `arr1` ������Ԫ�ء�
		eg1:�� `i = 8` ʱ��`arr1[8]` ��ֵ 8 ����ֵ�� `arr2[0]` ��
		eg2:�� `i = 7` ʱ��`arr1[7]` ��ֵ 66 ����ֵ�� `arr2[1]` 
		*/
		int[] arr1= {1,7,56,43,34,98,94,66,8};//arr1.lengthΪ����
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
