package lqb_A;

public class ppp {
	public static class Main {
		public static void main(String[] args) {
			
			boolean ans = false;
			equal();
		//	ans="long".equalsIgnoreCase(sign);
		//	System.out.println(ans);
			ans=cal(ans);
			System.out.println(ans);
			poin();
		}
		
		public static boolean cal(boolean ans){
			String n="i";
			if(n.length()==0)
				return ans=false;
			else
				return ans=true;
			
		
			}
		public static void equal() {
			boolean ans;String n="I";
			String sign="Love you ";
			System.out.println(""+n+" "+sign+"my baby!");
			String signer=sign.substring(0,4)+" P!";
			System.out.println(signer);
		//	String all=String.join("\\","F","O","Y");
		//	String all=String.join("/","F","O","Y");
			String all=String.join(" ","F","O","Y");
			System.out.println(all);
			System.out.println(sign);
			sign=sign.substring(0,2)+"ng";
			System.out.println(sign);
			ans=sign.equals(signer);
			System.out.println(ans);
		}
		public static void poin() {
			String greeting="Miss you";		
			int n=greeting.length();   	//加上空格有八个
			int cpCount=greeting.codePointCount(0,greeting.length());
			char frist=greeting.charAt(0);
			char last=greeting.charAt(4);
			int index=greeting.offsetByCodePoints(0,4);
			int cp=greeting.codePointAt(index);
		//	int cpt=sentence.codePointAt(k);
		//	k+=Character.charCount(cpt);
			System.out.println(n);
			System.out.println(cpCount);
			System.out.println(frist);
			System.out.println(last);
			System.out.println(index);
			System.out.println(cp);
			
		}
	}
	

}
