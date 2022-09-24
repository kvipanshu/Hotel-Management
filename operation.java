/* wap  to perform arithmetic operation 
if choice of user is 1   add to number 
                     2   subtract
                     3   multiply 

                     4 exit
*/

class operation
{
public static void main(String args[])
{
int a=10;
int b=20;

int choice =1;
//switch variable should be either int /char/string
switch(choice)
{
case 1:   System.out.println("sum ="+a+b);
          System.out.println("bye");
          break;
          
case 2:   System.out.println("subtract ="+a-b);
          break;
case 3:   System.out.println("sum ="+a*b);
          break;

default:   System.out.println("wrong choice");
           break;

}}
