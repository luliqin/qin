import java.util.Scanner;


public class num2 {
	{
       	double F;
        Scanner scanner=new Scanner(System.in);
        System.out.print("单利计算\n"); 
        System.out.print("------------------------------\n");             
        System.out.print("请输入你所存入的本金：\n");
        double P=scanner.nextDouble();
        System.out.print("------------------------------\n");   
        System.out.print("请输入你所存的周期利息：\n"); 
        float i=scanner.nextFloat();
        System.out.print("------------------------------\n");  
        System.out.print("请输入你所存的周期数：\n");  
        int n=scanner.nextInt();
        F=P*(1+i*n);
        System.out.print("------------------------------\n");  
        System.out.print("通过单利存款，你所获得的金额为：\n"+String.format("%.2f", F)+"\n"); 
	}
}
