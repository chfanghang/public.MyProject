package lqb_A;
import java.util.*;
public class 多重循环控制 {
	public static void main(String[] args) {
		int yan=1000;
		for(int i=1;i<=yan;i++) {
			for(int k=1;k<=yan-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			for(int k=1;k<=yan-i;k++) {
				System.out.print(" ");
			}
			/*
			 * for(int k=1;k<=5-i;k++) { System.out.print(" "); }
			 */
			/*
			 * for(int j=1;j<=2*i-1;j++){ System.out.print("*"); }
			 */
			for(int k=1;k<=yan-i;k++) {
				System.out.print(" ");
			}
			/*
			 * for(int k=0;k<=5-i;k++) { System.out.print("*"); }
			 */
			System.out.println("");
		}
	}
}
