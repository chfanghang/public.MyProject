package recursion;

public class recursion02 {
	public static void main(String[] args) {
		/*
		 * 斐波那契数列
		 * 前两个的数为后一个数的和
		 */
		FibonacciClass F1=new FibonacciClass();
		int ans=F1.Fibonacci(40);
		if(ans==-1) {
			System.out.println("输入是有误的！");
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
		System.out.println("要求n>=1的……");
		return -1;
	}
}