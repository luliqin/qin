import java.util.Scanner;


public class num1 {
	{ 
	double F;
    Scanner scanner=new Scanner(System.in);
    System.out.print("复利计算\n"); 
    System.out.print("------------------------------\n");             
    System.out.print("请输入你所存入的本金：\n");
    double P=scanner.nextDouble();
    System.out.print("------------------------------\n");   
    System.out.print("请输入你所存的年利率比：\n"); 
    float i=scanner.nextFloat();
    System.out.print("------------------------------\n");  
    System.out.print("请输入你所存的年限：\n");  
    int n=scanner.nextInt();
    System.out.print("------------------------------\n"); 
    System.out.print("请输入你所存的复利次数：\n");    
    int k=scanner.nextInt();
    F=P*Math.pow(i/k+1,k*n);
    System.out.print("------------------------------\n");  
    System.out.print("通过复利存款，你所获得的金额为：\n"+String.format("%.2f", F)+"\n"); 
	}
}
