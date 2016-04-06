import java.util.Scanner;


public class num4 {
	{
	    Scanner scanner=new Scanner(System.in);
        System.out.print("求存款时长\n"); 
        System.out.print("------------------------------\n");             
        System.out.print("请输入你所存入的本金：\n");
        double a=scanner.nextDouble();
        System.out.print("------------------------------\n");   
        System.out.print("请输入你所存的报酬率：\n"); 
        float b=scanner.nextFloat();
        System.out.print("------------------------------\n");  
        System.out.print(" 到最后期望的金额：\n");  
        double c=scanner.nextDouble();
        float d=72/b;
        System.out.print("------------------------------\n");  
        System.out.print("通过复利的股票型存款，得到期望金额大概所需要的年份：\n"+d+"\n"); 
	}
}
