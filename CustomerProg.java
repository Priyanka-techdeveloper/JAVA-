import java.util.Scanner;
class CustomerProg
{
	public static void main(String[] args)
	{
		  Scanner sc=new Scanner(System.in);
		  System.out.println("no.of custumerID: ");
		  int n= sc.nextInt();
		  String[] a= new String[n];
		  System.out.println("enter custumerID: ");
		  for(int i=0;i<n;i++)
		  {
			  a[i]=sc.next();
		  }
		  System.out.println("invalid custumerID: ");
		  for(int i=0;i<n;i++)
		  {
			  if(a[i].length()<6)
			  System.out.print(a[i]+" ");
		}
	}
}
