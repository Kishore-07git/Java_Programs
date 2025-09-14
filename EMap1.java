import java.util.*;
class EMap1
{
    enum Days{January, February, March, April, May, June, July, August, September, October, November, December}
    public static void main(String[] args)
    {
        EnumMap<Days, String> map=new EnumMap<Days, String>(Days.class);
        map.put(Days.January, "1");
        map.put(Days.February, "2");
        map.put(Days.March, "3");
        map.put(Days.April, "4");
        map.put(Days.May, "5");
        map.put(Days.June, "6");
        map.put(Days.July, "7");
        map.put(Days.August, "8");
        map.put(Days.September, "9");
        map.put(Days.October, "10");
        map.put(Days.November, "11");
        map.put(Days.December, "12");
        for(Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}