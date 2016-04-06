import java.util.Scanner;


public class num5 {
	{
    Scanner scanner=new Scanner(System.in);
    System.out.print("求报酬率\n"); 
    System.out.print("------------------------------\n");             
    System.out.print("请输入你所存入的本金：\n");
    double a=scanner.nextDouble();
    System.out.print("------------------------------\n");   
    System.out.print(" 请输入你所存的存款时长：\n"); 
    float d=scanner.nextFloat();
    System.out.print("------------------------------\n");  
    System.out.print(" 到最后期望的金额：\n");  
    double c=scanner.nextDouble();
    float b=72/d;
    System.out.print("------------------------------\n");  
    System.out.print("通过复利的股票型存款本金翻倍的报酬率为："+b+"%\n"); 
	}
}
