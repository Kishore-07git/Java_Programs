package studentutil;
import java.util.Scanner;
public class StudAttendance
{
	public void AttendanceCalc()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter total No.Of classes:");
		double total=scn.nextDouble();
		System.out.println("Enter Attended classes:");
		double attended=scn.nextDouble();
		double per=(attended/total)*100;
		System.out.println("Total percentage:"+ per);
	}
}