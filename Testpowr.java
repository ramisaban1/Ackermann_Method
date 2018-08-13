import java.util.Scanner;
public class Testpowr {
  public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Please input a number");
    int num = input.nextInt();
    System.out.println("Please input an exponent");
    int pwr = input.nextInt();
    System.out.println("\nMy recursive powr method outputs: " + powr(num,pwr));
    System.out.println("java.lang.Math.pow outputs: " + Math.pow(num,pwr));
    System.out.println("\nPlease enter two integers for Ackermans method: ");
    int m = input.nextInt(), n = input.nextInt();
    System.out.println("\nAckerman's recursive method outputs:\nm = " + m + "\tn = " + 
                       n + "\tack(m,n) = " + ack(m,n));
  }
  
  public static int powr(int num, int times){
    if(times == 1)
      return num;
    return num * powr(num,times-1);
  }
  
  public static int ack(int m, int n){
    if (m == 0)
      return n+1;
    if (n == 0)
      return ack(m-1,1);
    else
      return ack(m-1, ack(m,n-1));
  }
}