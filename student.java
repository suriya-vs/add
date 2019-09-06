class student
{
String name;
public student(String s)
{
name=s;
}
public student()
{
name="unknown";
}
}
class ans
{
public static void main(String[]args)
{
student s=new student("xyz");
student a=new student();
System.out.println(s.name);
System.out.println(a.name);
}
}