import java.util.Scanner;


public class num6 {
	{
	    Scanner scanner=new Scanner(System.in);
        System.out.print("һ������ʽ��ܶ�\n"); 
        System.out.print("------------------------------\n");             
        System.out.print("��������������ı���\n");
        double a=scanner.nextDouble();
        System.out.print("------------------------------\n");   
        System.out.print("������������ı����ʣ�\n"); 
        float b=scanner.nextFloat();
        System.out.print("------------------------------\n");  
        System.out.print("������������Ĵ��ʱ����\n");  
        int d=scanner.nextInt();
        double c=a*Math.pow(1+b,d);
        System.out.print("------------------------------\n");  
        System.out.print("������õ��ܽ���ǣ�\n"+c+"\n"); 
	}
}
