package lqb_A;
import java.util.*;
public class sanyuanyunsuanqiuzuidazhi {

	public static void main(String[] args) {
		int initial=0;
		int end=200;
		int sum=0;
		int divisor=0;
		int a1=initial;
		int Remov=5;
		int noRemov=3;
		do {
			System.out.println(++a1);
			sum=sum+a1;
			if(a1%Remov==0&&a1%noRemov!=0) {
				divisor++;
			}
		}
		while(a1<end);
		System.out.println("��ֵΪ��"+sum);
		System.out.println("�ܱ�5�����ܱ�3�������ֵĸ���Ϊ��"+divisor);
		 }
	}

