import java.util.Scanner;


public class num6 {
	{
	    Scanner scanner=new Scanner(System.in);
        System.out.print("一定年份资金总额\n"); 
        System.out.print("------------------------------\n");             
        System.out.print("请输入你所存入的本金：\n");
        double a=scanner.nextDouble();
        System.out.print("------------------------------\n");   
        System.out.print("请输入你所存的报酬率：\n"); 
        float b=scanner.nextFloat();
        System.out.print("------------------------------\n");  
        System.out.print("请输入你所存的存款时长：\n");  
        int d=scanner.nextInt();
        double c=a*Math.pow(1+b,d);
        System.out.print("------------------------------\n");  
        System.out.print("你所获得的总金额是：\n"+c+"\n"); 
	}
}
