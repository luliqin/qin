import java.util.Scanner;


public class num1 {
	{ 
	double F;
    Scanner scanner=new Scanner(System.in);
    System.out.print("��������\n"); 
    System.out.print("------------------------------\n");             
    System.out.print("��������������ı���\n");
    double P=scanner.nextDouble();
    System.out.print("------------------------------\n");   
    System.out.print("������������������ʱȣ�\n"); 
    float i=scanner.nextFloat();
    System.out.print("------------------------------\n");  
    System.out.print("����������������ޣ�\n");  
    int n=scanner.nextInt();
    System.out.print("------------------------------\n"); 
    System.out.print("������������ĸ���������\n");    
    int k=scanner.nextInt();
    F=P*Math.pow(i/k+1,k*n);
    System.out.print("------------------------------\n");  
    System.out.print("ͨ��������������õĽ��Ϊ��\n"+String.format("%.2f", F)+"\n"); 
	}
}
