package practice;
import java.util.*;
public class practice9 {
	public static void main(String[] args) {
		/*����
		 1.arr={10,12,45,90}
		 2.��־λ��index=i,ͷ��β���м�
		 3.����arrNew[arr.length+1]����
		 4.����index�ı�־λ�ø�ֵ
		 5.��arr=arrNew
		 6.ѭ��do-while
		 7.����
		 */
		int[] arr={10,12,45,90};
		do {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����һ����: ");
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
			System.out.println("�������10��Ԫ�أ��˳�����");
			break;
		}
		}while(true);
	}
}
