
public class Type_Coercion {
 public static void main(String[] args) {
	byte b=2;
	//b=b+3; //b+3默认为int类型,大不能转小
	b+=3;  //等价于b=(byte)(b+3);
	b++;   //等价于b=(byte)(b+1);
	//b=b+1;//b+1默认为int类型,大不能转小
 }
}
