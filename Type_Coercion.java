
public class Type_Coercion {
 public static void main(String[] args) {
	byte b=2;
	//b=b+3; //b+3Ĭ��Ϊint����,����תС
	b+=3;  //�ȼ���b=(byte)(b+3);
	b++;   //�ȼ���b=(byte)(b+1);
	//b=b+1;//b+1Ĭ��Ϊint����,����תС
 }
}
