import java.util.Scanner;
class TypeConversion
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Implicit conversion");
		byte b=7;
		int i=b;
		System.out.println("Byte to Integer:" + i);
		long l=3;
		float f=l;
		System.out.println("Long to Float :" + f);
		int i1=2;
		double d=i1;
		System.out.println("Integer to Double:" + d);
		short s=20;
		float f1=s;
		System.out.println("Short to Float:" + f1);

		System.out.println("Explicit Conversion");		
		long l2=33;
		int i2=(int)l2;
		System.out.println("Long to Integer:" + i2);
		int i3=11;
		byte b1=(byte)i3;
		System.out.println("Integer to Byte:" + b1);
		float f3=22.77f;
		long l3=(long)f3;
		System.out.println("Float to Long:" + l3);
		double db=43;
		float f4=(float)db;
		System.out.println("Double to Float:" + f4);
	}
}