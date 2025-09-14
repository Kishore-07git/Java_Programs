package studentutil;
public class StudentGrades
{
    public char GradeCalc(float per)
    {
        if(per>=90)
            return 'A';
        else if(per>=70)
            return 'B';
        else if(per>=50)
            return 'C';
        else if(per>=35)
            return 'D';
        else
            return 'F';
    }
}