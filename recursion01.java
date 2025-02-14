package recursion;

public class recursion01 {
	public static void main(String[] args) {
		/*µÝ¹é
		 1.´òÓ¡
		 2.½×³Ë
		 */
		int cass=6;
		printClass print=new printClass();
		print.print(cass);
		factorialClass f1=new factorialClass();
		int f=f1.factorial(cass);
		System.out.println("½×³Ë"+cass+"µÄÖµÎª"+f);
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