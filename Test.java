package lqb_A;
import java.util.*;

public class Test {
    public static void main(String[] args) {
    	int[] a=new int[20];
    	int[] s= {2,3,4,5,6,7};
    	String[] sign= {
    		"fanghang",
    		"∑Ω∆Ê≈º",
    	};
    	String[] name=new String[10];
    	for(int i=0;i<name.length;i++) {
    		name[i]="i ";
    	}
    	for(int i=0;i<a.length;i++) {
    		a[i]=i;
    	}
    	for(int i=0;i<a.length;i++) {
    		System.out.print(a[i]);
    		System.out.print(" ");
    	}System.out.print("\n");
    	for(int i=0;i<s.length;i++) {
    		System.out.print(s[i]);
    		System.out.print(" ");
    	}
       	System.out.print("\n");
       	for(int ans:a) {System.out.print(ans);} 	
       	System.out.print("\n");
       	System.out.print(Arrays.toString(sign));
     	System.out.print("\n"); 
     	System.out.print(Arrays.toString(name));
        }	
    }