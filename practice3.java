package practice;
import java.util.*;
public class practice3 {
	public static void main(String[] args) {
		/*
		 ����̬�������Ԫ��Ч����ʵ����������
		 1.����һ���µ�����
		 2.��ԭ��������Ԫ�ظ���������,�������������������Ԫ��
		 3.�����������ԭ�������飬ԭ������jvm���Զ�����
		 4.���ԭ�������飬�õ�����
		 5.����Scanner����������
		 6.��do-while,break����ѭ��
		 */
		    int[] arr= {1,2,3};
		    do {
			int[] arrnew=new int[arr.length+1];
			Scanner scanner=new Scanner(System.in);
			System.out.println("���������֣�");
			int arrAdd=scanner.nextInt();
			for(int i=0;i<arrnew.length-1;i++) {
			arrnew[i]=arr[i];
			arrnew[arrnew.length-1]=arrAdd;
		}
			arr=arrnew;
			for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
			System.out.println("�Ƿ�Ҫ�����������(����Ϊn)��");
			char judgAdd=scanner.next().charAt(0);
			if(judgAdd=='n') {
				System.out.println("���˳��ˡ���");
				break;
			}
		    }while(true);
		    
			
		
	}
}
