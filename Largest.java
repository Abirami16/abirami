import java.util.Scanner;
class greatestnumber
{
public static void main(String[] args) 
{
int a,b,c,large;
Scanner s=new Scanner(System.in);
System.out.println("Enter any three numbers: ");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
large=(a>b)?(a>c?a:c):(b>c?b:c);
System.out.println("Largest number: "+large);
}
}
