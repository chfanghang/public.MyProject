package recursion;

public class recursion03 {
	public static void main(String[] args) {
		/*�ݹ�
		 * ���ӳ�����������һ�����ӣ����ӵ�һ��������е�һ��������ٶ��һ����
		 * �Ժ�ÿ����Ӷ������е�һ�����Ȼ���ٶ��һ����������ʮ��ʱ��
		 * ���ٳ�ʱ������ֻ��һ�����ӡ���������м������ӣ�
		 * 
		1.day10��ʱ��1������
		2.day9��ʱ��(day10+1)*2
		3.day8��ʱ��(day9+1)*2
		 */
		MonkeysClass peach=new MonkeysClass();
		int ans=peach.peaches(3);
		System.out.print("ans="+ans);
	}
}
class MonkeysClass{
	public int peaches(int n) {	//����						
		if(n==10) {
			return 1;
		}
		else {
			return (peaches(n+1)+1)*2;
		}
		
	}
}