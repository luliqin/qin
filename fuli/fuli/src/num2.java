import java.util.Scanner;


public class num2 {
	{
       	double F;
        Scanner scanner=new Scanner(System.in);
        System.out.print("��������\n"); 
        System.out.print("------------------------------\n");             
        System.out.print("��������������ı���\n");
        double P=scanner.nextDouble();
        System.out.print("------------------------------\n");   
        System.out.print("�������������������Ϣ��\n"); 
        float i=scanner.nextFloat();
        System.out.print("------------------------------\n");  
        System.out.print("���������������������\n");  
        int n=scanner.nextInt();
        F=P*(1+i*n);
        System.out.print("------------------------------\n");  
        System.out.print("ͨ��������������õĽ��Ϊ��\n"+String.format("%.2f", F)+"\n"); 
	}
}
