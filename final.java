class a
{
final void display()
{
System.out.print("good ");
}
}
class b extends a
{
void display() //error it goes to this side
{              but before it is initialized by final
System.out.print("evening");
}
}
class finalfunc
{
public static void main(String geetu[])
{
b obj=new b();
obj.display();
}
}
