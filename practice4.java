package practice;
import java.util.*;
public class practice4 {
	public static void main(String[] args) {
		/*
		 ��һ������arr={1,2,3,4,5,6},���Խ�������������ʾ�û��Ƿ����������
		 �����������һ�����飬����������
		 1.����һ������arrNew
		 2.������arr[i]->arrNew[i]
		 3.��arr=arrNew��ԭ�����Ǹ���jvm������
		 4.���arr
		 5.����Scanner
		 6.do-while,if,break�˳�ѭ��
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
		System.out.println("�Ƿ��������(n���˳�)��");
		char key=scanner.next().charAt(0);
		if(key=='n') {
			System.out.println("�˳���������");
			break;
		}
		if(arr.length==1) {
			System.out.println("ֻʣ���һ���ˣ��˳�����");
			break;
		}
		}while(true);
		
	}

}