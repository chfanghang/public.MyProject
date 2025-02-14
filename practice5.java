package practice;
import java.util.*;
public class practice5 {
	public static void main(String[] args) {
		/*顺序查找
		 有一个数列：白眉鹰王，金毛狮王，紫衫龙王，青翼蝠王猜数游戏
		 从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】
		 要求：如果找到了，就提示找到，并给出下标
		 */
		String[] arr= {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入名称：");
		String scan=scanner.nextLine();
		int index=-1;
		for(int i=0;i<=arr.length-1;i++) {
			if(scan.equals(arr[i])) {
				System.out.println("找到了，数组下标为"+i);
				index=1;
				break;
			}	
			}
			if(index==-1) {
				System.out.println("对不起，没找到");
		}
		
	}
}
