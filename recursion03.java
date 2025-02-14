package recursion;

public class recursion03 {
	public static void main(String[] args) {
		/*递归
		 * 猴子吃桃子问题有一堆桃子，猴子第一天吃了其中的一半儿，并再多吃一个。
		 * 以后每天猴子都吃其中的一半儿，然后再多吃一个。当到第十天时，
		 * 想再吃时，发现只有一个桃子。问最初共有几个桃子？
		 * 
		1.day10的时候，1个桃子
		2.day9的时候，(day10+1)*2
		3.day8的时候，(day9+1)*2
		 */
		MonkeysClass peach=new MonkeysClass();
		int ans=peach.peaches(3);
		System.out.print("ans="+ans);
	}
}
class MonkeysClass{
	public int peaches(int n) {	//天数						
		if(n==10) {
			return 1;
		}
		else {
			return (peaches(n+1)+1)*2;
		}
		
	}
}