import java.util.Scanner;


public class num3 {
	{
	    Scanner scanner=new Scanner(System.in);
      	System.out.print("��������ϣ����õ����ս��Ϊ��\n"); 
        double F=scanner.nextDouble();
        System.out.print("������<<����>>������Ϣ\n"); 
        System.out.print("------------------------------\n");   
        System.out.print("������������������ʱȣ�\n"); 
        float i1=scanner.nextFloat();
        System.out.print("------------------------------\n");  
        System.out.print("����������������ޣ�\n");  
        int n1=scanner.nextInt();
        System.out.print("------------------------------\n"); 
        System.out.print("������������ĸ���������\n");    
        int k=scanner.nextInt();
        double P1=F/Math.pow(i1/k+1,k*n1);
        System.out.print("------------------------------\n");  
        System.out.print("ͨ��������������Ҫ�Ĵ����Ϊ��\n"+P1+"\n"); 
      
        System.out.print("������<<����>>������Ϣ\n"); 
        System.out.print("------------------------------\n");   
        System.out.print("�������������������Ϣ��\n"); 
        float i2=scanner.nextFloat();
        System.out.print("------------------------------\n");  
        System.out.print("���������������������\n");  
        int n2=scanner.nextInt();
        System.out.print("------------------------------\n"); 
        double P2=F/(1+i2*n2);
        System.out.print("------------------------------\n");  
        System.out.print("ͨ��������������Ҫ�Ĵ����Ϊ��\n"+P2+"\n"); 
    	
	}
}
