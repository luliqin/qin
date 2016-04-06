import java.util.Scanner;


public class num3 {
	{
	    Scanner scanner=new Scanner(System.in);
      	System.out.print("请输入你希望获得的最终金额为：\n"); 
        double F=scanner.nextDouble();
        System.out.print("请输入<<复利>>存款的信息\n"); 
        System.out.print("------------------------------\n");   
        System.out.print("请输入你所存的年利率比：\n"); 
        float i1=scanner.nextFloat();
        System.out.print("------------------------------\n");  
        System.out.print("请输入你所存的年限：\n");  
        int n1=scanner.nextInt();
        System.out.print("------------------------------\n"); 
        System.out.print("请输入你所存的复利次数：\n");    
        int k=scanner.nextInt();
        double P1=F/Math.pow(i1/k+1,k*n1);
        System.out.print("------------------------------\n");  
        System.out.print("通过复利存款，你所需要的存款金额为：\n"+P1+"\n"); 
      
        System.out.print("请输入<<单利>>存款的信息\n"); 
        System.out.print("------------------------------\n");   
        System.out.print("请输入你所存的周期利息：\n"); 
        float i2=scanner.nextFloat();
        System.out.print("------------------------------\n");  
        System.out.print("请输入你所存的周期数：\n");  
        int n2=scanner.nextInt();
        System.out.print("------------------------------\n"); 
        double P2=F/(1+i2*n2);
        System.out.print("------------------------------\n");  
        System.out.print("通过单利存款，你所需要的存款金额为：\n"+P2+"\n"); 
    	
	}
}
