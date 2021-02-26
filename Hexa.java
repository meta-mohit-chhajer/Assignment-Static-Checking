import java.math.*;
import java.util.*;
class Hexa
{
  
  /*------------------------------------
  	Add HexaDecimal Values
        
        @return : BigInteger type Sum of  values

  ------------------------------------*/

  public static BigInteger Addition()
  {
    String s1,s2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First HexaDecimal Number.. : ");
    s1=sc.nextLine();
    System.out.println("Enter Second HexaDecimal Number.. :");
    s2=sc.nextLine();
    BigInteger b1=new BigInteger(s1,16);
    BigInteger b2=new BigInteger(s2,16);
    BigInteger sum=b1.add(b2);
    return sum;
  }
  
  /*---------------------------------
  	Subtract HexaDecimal Values 
       
        @return : BigInteger type Difference of values

  ---------------------------------*/
  
  public static BigInteger Subtraction()
  {
    String s1,s2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First HexaDecimal Number.. : ");
    s1=sc.nextLine();
    System.out.println("Enter Second HexaDecimal Number.. :");
    s2=sc.nextLine();
    BigInteger b1=new BigInteger(s1,16);
    BigInteger b2=new BigInteger(s2,16);
    BigInteger diff=b1.subtract(b2); 
    return diff;
  }

  /*---------------------------------
  	Multiply HexaDecimal Values
        
        @return : BigInteger type Multiplication of values

  ---------------------------------*/
  
  public static BigInteger Multiplication()
  {
    String s1,s2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First HexaDecimal Number.. : ");
    s1=sc.nextLine();
    System.out.println("Enter Second HexaDecimal Number.. :");
    s2=sc.nextLine();
    BigInteger b1=new BigInteger(s1,16);
    BigInteger b2=new BigInteger(s2,16);
    BigInteger mul=b1.multiply(b2);
    return mul;
  }

  	
  /*---------------------------------
  	Divide HexaDecimal Values 
       
        @return : BigInteger type Division of values

  ---------------------------------*/

  public static BigInteger Division()
  {
    String s1,s2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First HexaDecimal Number.. : ");
    s1=sc.nextLine();
    System.out.println("Enter Second HexaDecimal Number.. :");
    s2=sc.nextLine();
    BigInteger b1=new BigInteger(s1,16);
    BigInteger b2=new BigInteger(s2,16);
    BigInteger div=b1.divide(b2);
    return div;
  }

  /*---------------------------------
  	Compare HexaDecimal Values 
        @return :Boolean Expression
        
  ---------------------------------*/

  public static boolean Compare()
  {
    String s1,s2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First HexaDecimal Number.. : ");
    s1=sc.nextLine();
    System.out.println("Enter Second HexaDecimal Number.. :");
    s2=sc.nextLine();
    BigInteger b1=new BigInteger(s1,16);
    BigInteger b2=new BigInteger(s2,16);
    int cmp=b1.compareTo(b2);
    if(cmp>=0)
    	return true;
    return false;
  }   

 

  

  public static void main(String...arg)
  {
    
    Scanner sc=new Scanner(System.in);
    String url;
    Integer i;
    do
    {
      System.out.println("Enter Choice from the below : ");
      System.out.println("1: Add HexaDecimal Number ");
      System.out.println("2: Subtract HexaDecimal Number ");
      System.out.println("3: Multiply HexaDecimal Number ");
      System.out.println("4: Divide HexaDecimal Number ");
      System.out.println("5: Compare HexaDecimal Number ");
      i=sc.nextInt();
      switch(i)
      {
        case 1:System.out.println(Addition().toString(16));
  	       break;
        case 2:System.out.println(Subtraction().toString(16));
               break;
        case 3:System.out.println(Multiplication().toString(16));
               break;
        case 4:System.out.println(Division().toString(16));
               break;
        case 5:System.out.println(Compare());
               break;
        default:System.out.println("Invalid Choice");
       }
       System.out.println("Want to perfom More (Y/N)");
       url=sc.next();
     }while(url.equals("Y")||url.equals("y"));
  }
}

   
      
     