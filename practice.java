package array;
import java.util.*;
public class practice {
	public static void main(String[] args) {
		double[] henss={3.5,4.5,5.5};
		double sum = 0,aver=0;
		//Scanner scanner=new Scanner(System.in);
		//double[] hens=new double[henss.length];
		for(int i=0;i<henss.length;i++) {
			//hens[i]=scanner.nextDouble();
			sum+=henss[i];
		}
		aver=sum/henss.length;
		System.out.println("sum= "+sum);		
		System.out.println("aver= "+aver);		
	}

}
