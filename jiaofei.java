package home_work;

public class jiaofei {
	public static void main(String[] args) {			
	double Totalmoney=100000;
	int once=0;
	while(true) {
		if(Totalmoney>50000) {
		Totalmoney=Totalmoney-Totalmoney*(5/100);
		once++;
	}
		
		else {
		Totalmoney=Totalmoney-1000;
		once++;
	}
		if(Totalmoney<1000) {
			break;
		}
	}
	System.out.println(Totalmoney+"元可以经过"+once+"次");
}

}
