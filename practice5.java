package practice;
import java.util.*;
public class practice5 {
	public static void main(String[] args) {
		/*˳�����
		 ��һ�����У���üӥ������ëʨ����������������������������Ϸ
		 �Ӽ�������������һ�����ƣ��ж��������Ƿ���������ơ�˳����ҡ�
		 Ҫ������ҵ��ˣ�����ʾ�ҵ����������±�
		 */
		String[] arr= {"��üӥ��","��ëʨ��","��������","��������"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("���������ƣ�");
		String scan=scanner.nextLine();
		int index=-1;
		for(int i=0;i<=arr.length-1;i++) {
			if(scan.equals(arr[i])) {
				System.out.println("�ҵ��ˣ������±�Ϊ"+i);
				index=1;
				break;
			}	
			}
			if(index==-1) {
				System.out.println("�Բ���û�ҵ�");
		}
		
	}
}
