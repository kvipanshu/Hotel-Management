//wap to print a table of a given number 
import java.util.*;
class table
{
public static void main(String a[])
{
Scanner s= new Scanner(System.in);
System.out.println("enter number");
int y=s.nextInt();
for(int r=1;r<=10; r++)
{
 System.out.println(y +" * "+r +" = "+ y*r);
}



}


}