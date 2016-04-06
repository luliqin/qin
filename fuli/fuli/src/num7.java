import java.util.Scanner;


public class num7 {
	{
	Scanner scanner=new Scanner(System.in);
    System.out.print("月等额本息还款计算\n"); 
    System.out.print("------------------------------\n");             
    System.out.print("请输入你所贷款金额：\n");
    double a=scanner.nextDouble();
    System.out.print("------------------------------\n");   
    System.out.print("请输入你所贷款的年利率：\n"); 
    float b=scanner.nextFloat();
    System.out.print("------------------------------\n");  
    System.out.print("请输入你贷款的还款时长（月）：\n");  
    int d=scanner.nextInt();
    double c=a*(b*Math.pow(1+b,d))/(Math.pow(1+b,d)-1);
    System.out.print("------------------------------\n");  
    System.out.print("你每月等额本息还款是：\n"+c+"\n"); 
	}
}
