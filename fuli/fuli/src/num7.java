import java.util.Scanner;


public class num7 {
	{
	Scanner scanner=new Scanner(System.in);
    System.out.print("�µȶϢ�������\n"); 
    System.out.print("------------------------------\n");             
    System.out.print("���������������\n");
    double a=scanner.nextDouble();
    System.out.print("------------------------------\n");   
    System.out.print("��������������������ʣ�\n"); 
    float b=scanner.nextFloat();
    System.out.print("------------------------------\n");  
    System.out.print("�����������Ļ���ʱ�����£���\n");  
    int d=scanner.nextInt();
    double c=a*(b*Math.pow(1+b,d))/(Math.pow(1+b,d)-1);
    System.out.print("------------------------------\n");  
    System.out.print("��ÿ�µȶϢ�����ǣ�\n"+c+"\n"); 
	}
}
