package recursion;

public class recursion01 {
	public static void main(String[] args) {
		/*�ݹ�
		 1.��ӡ
		 2.�׳�
		 */
		int cass=6;
		printClass print=new printClass();
		print.print(cass);
		factorialClass f1=new factorialClass();
		int f=f1.factorial(cass);
		System.out.println("�׳�"+cass+"��ֵΪ"+f);
	}
}
class printClass{
	public void print(int n) {
		if(n>2) {
			print(n-1);
		}
		System.out.println("n="+n);
	}
}
class factorialClass {
	public int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return 	n*factorial (n-1);
	}
}