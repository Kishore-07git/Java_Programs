import studentutil.StudentDetails;
import studentutil.StudentGrades;
import studentutil.StudAttendance;
class StudInfo
{
	public static void main(String args[])
	{
		StudentDetails std=new StudentDetails("kk",10,"CME");
		StudentGrades grd=new StudentGrades();
		StudAttendance sad=new StudAttendance();
		std.print();
		System.out.println("Grade of a Student:" + grd.GradeCalc(97));
		System.out.println("Attandence Calculation: ");
		sad.AttendanceCalc();
	}
}
