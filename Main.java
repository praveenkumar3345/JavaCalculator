import java.util.Scanner;
public class Main
{
    void Sum(int a,int b){
        int sum=a+b;
        System.out.println("Sum ="+sum);
       
    }void Sub(int a,int b){
        int sub=a-b;
        System.out.println("Subtract ="+sub);
       
    }void Mul(int a,int b){
        int mul=a*b;
        System.out.println("Product ="+mul);
       
    }void Div(int a,int b){
        if(b==0){
            System.out.println("Error");
        }else{
        float div=a/b;
        System.out.println("Division ="+div);}
       
    }
	public static void main(String[] args) {
	   while(true){
	        System.out.println("Choose the below operations to perfrom:");
	    System.out.println("1.Addition");
	    System.out.println("2.Subraction");
	    System.out.println("3.Multiplication");
	    System.out.println("4.Division");
	    System.out.println("5.End");
	    Scanner pk=new Scanner(System.in);
	    int n=pk.nextInt();
	    if (n == 5) {
                System.out.println("Thankyou!");
                break;
            }
	     
	     
	    Main obj1=new Main();
	        System.out.println("enter 1st number:");
	        int n1=pk.nextInt();
	        System.out.println("enter 2nd number:");
	        int n2=pk.nextInt();
	    
	    
	        
	        switch(n){
	        case 1:
	             obj1.Sum(n1,n2);
	             break;
	        case 2:
	             obj1.Sub(n1,n2);
	             break;
	        case 3:
	             obj1.Mul(n1,n2);
	             break;
	       case 4:
	           obj1.Div(n1,n2);
	           break;
	       default:
	        System.out.println("Invalid choice! Please try again.");
	        
	    }
	    
	}
}}
