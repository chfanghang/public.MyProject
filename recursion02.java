package recursion;

public class recursion02 {
	public static void main(String[] args) {
		/*
		 * 쳲���������
		 * ǰ��������Ϊ��һ�����ĺ�
		 */
		FibonacciClass F1=new FibonacciClass();
		int ans=F1.Fibonacci(40);
		if(ans==-1) {
			System.out.println("����������ģ�");
		}else
		System.out.println("ans="+ans);
	}
}
class FibonacciClass{
	public int Fibonacci(int n) {
		if(n>=1) {
		if(n==1||n==2) {
			return 1;
		}else
		return n=Fibonacci(n-1)+Fibonacci(n-2);
	}
		else
		System.out.println("Ҫ��n>=1�ġ���");
		return -1;
	}
}