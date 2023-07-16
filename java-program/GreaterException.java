import java.io.IOException;
class GreaterException1 extends Exception
{
GreaterException1(String msg) throws IOException
{
super(msg);
}
}
class GreaterException
{
    public static void main(String a[]) throws IOException

{
try
{
int n1=12;
int n2=10;
if (n1>n2)
throw new GreaterException1("No.1 is greater");
else
System.out.println("No.2 is greater");
}
catch(GreaterException1 ge)
{
System.out.print(ge);
}
}
}