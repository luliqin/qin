import java.util.Scanner;

public class FuLi {

    public static void main(String[] args) {
        double N=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("��ѡ��������(1)or��������(2)or���㱾��(3)orͶ������(4)or������(5)or���ʲ���ֵ(6)or���ʲ���ֵ(7):");
        int choose=scanner.nextInt();
      
        
        if(choose==1){
            System.out.println("�����뱾��");
            float P=scanner.nextInt();
            System.out.println("���������ʣ�");
            float i=scanner.nextFloat();
            System.out.println("����ʱ�䣺");
            float n=scanner.nextFloat();
            fuli(N, P, i, n);
        }
        if(choose==2){
            System.out.println("�����뱾��");
            float P=scanner.nextInt();
            System.out.println("���������ʣ�");
            float i=scanner.nextFloat();
            System.out.println("����ʱ�䣺");
            float n=scanner.nextFloat();
            danLi(P, i,n);
        }
        if(choose==3){
            System.out.println("�������ý�Ǯ��");
            double total=scanner.nextDouble();
            System.out.println("���������ʣ�");
            double i=scanner.nextDouble();
            System.out.println("����ʱ�䣺");
            double n=scanner.nextDouble();
    		yangLaoJin(i,total,n);
            
        }
        if(choose==4){
            System.out.println("����ʱ��\n"); 
            System.out.println("------------------------------\n");             
            System.out.println("��������������ı���\n");
            double P=scanner.nextDouble();
            System.out.println("------------------------------\n");   
            System.out.println("������������ı����ʣ�\n"); 
            double i=scanner.nextDouble();
            System.out.println("------------------------------\n");  
            System.out.println(" ����������Ľ�\n");  
            double total=scanner.nextDouble();
            maiGuPiao(P,i,total);
        }
        if(choose==5)
        {     
            System.out.println("�󱨳���\n"); 
            System.out.println("------------------------------\n");             
            System.out.println("��������������ı���\n");
            double P=scanner.nextDouble();
            System.out.println("------------------------------\n");   
            System.out.println(" ������������Ĵ��ʱ����\n"); 
            double n=scanner.nextDouble();
            System.out.println("------------------------------\n");  
            System.out.println(" ����������Ľ�\n");  
            double total=scanner.nextDouble();
            bangZhaoTouZhi(P,n,total);
        }
        if(choose==6)
        { 
            System.out.println("һ������ʽ��ܶ�\n"); 
            System.out.println("------------------------------\n");             
            System.out.println("��������������ı���\n");
            double P=scanner.nextDouble();
            System.out.println("------------------------------\n");   
            System.out.println("������������ı����ʣ�\n"); 
            double i=scanner.nextDouble();
            System.out.println("------------------------------\n");  
            System.out.println("������������Ĵ��ʱ����\n");  
            double n=scanner.nextDouble();
            duoCiTouZhi(P,i,n);
        }
        if(choose==7)
        { 
        	
        	 System.out.println("�µȶϢ�������\n"); 
             System.out.println("------------------------------\n");             
             System.out.print("���������������\n");
             double total=scanner.nextDouble();
             System.out.println("------------------------------\n");   
             System.out.println("��������������������ʣ�\n"); 
             double i=scanner.nextDouble();
             System.out.println("------------------------------\n");  
             System.out.println("�����������Ļ���ʱ�����£���\n");  
             double m=scanner.nextDouble();
             daiKuan(total,i,m);
             
        }

    }
    private static void daiKuan(double total,double i,double m) {
    	
    	double n = m*12;
    	double money = total*i*Math.pow((1.0+i),n)/(Math.pow(1.0+i,n)-1);
    	System.out.println("��ÿ�µȶϢ�����ǣ�"+money);  
		
	}
	private static void duoCiTouZhi(double P,double i,double n) {
    	double total=P*Math.pow(1+i,n);
        System.out.println("------------------------------\n");  
        System.out.println("������õ��ܽ����:"+total); 
    	
	}
	private static void maiGuPiao(double P,double i,double total) {
    	i=i*100;
    	double n=(72/i);
        System.out.println("------------------------------\n");  
        System.out.println("ͨ�������Ĺ�Ʊ�ʹ��õ��������������Ҫ����ݣ�\n"+n); 
		
	}
	private static void bangZhaoTouZhi(double P,double n,double total) {
    	double base= (double) (((total-P)/P)/n);
    	System.out.println("ͨ�������Ĺ�Ʊ�ʹ��𷭱��ı�����Ϊ��"+base); 
		
	}
	private static void yangLaoJin(double i, double total,double n) {//n ʱ��       i ����
    	for(int j=1;j<=n;j++){
            i=(1+n)*i;
        }
        double money=total/i;
        System.out.println("��Ҫ����"+money);
	}

	private static void danLi(double P, double i,double n) {
        double G; 
        
        G=P+P*i*n;
        System.out.println("������ֵΪ��"+G);
    }

    private static void fuli(double N, double P, double i, double n) {
        for(int j=1;j<=n;j++){
            
            N=(1+i)*N;
        }
        double F;
        F=P*N;
        System.out.println("������ֵΪ��"+F);
    }
    
}

    /*    int num=scanner.nextInt();
    	   	System.out.println("                       -------------------------------------\n");
    	   	System.out.println("                                 ��ӭ����δ������");
    	   	System.out.println("                              �˿�����Ը���1~3ѡ��");
    	   	System.out.println("                                   1.��������");
    	   	System.out.println("                                   2.��������");
    	   	System.out.println("                                   3.���Ͻ���㷽��");
    	   	System.out.println("                                   4.��Ʊ����");
    	   	System.out.println("                                   5.������Ͷ��");
    	   	System.out.println("                                   6.���Ͷ��");
    	   	System.out.println("                                   7.����");
    	   	System.out.println("                       -------------------------------------");
    	   	System.out.println("                                               ");
    	   	System.out.println("���������ѡ������Ҫ�Ĺ���(1~7)");
    	switch(num)
    	{
    	case 1:
            System.out.println("�����뱾��");
            float P=scanner.nextInt();
            System.out.println("���������ʣ�");
            float i=scanner.nextFloat();
            System.out.println("����ʱ�䣺");
            float n=scanner.nextFloat();
            System.out.println("ÿ�������"+i+",����%"+n+"��");
            fuli(N, P, i, n);        
    		break;
    	case 2:
            System.out.print("�����뱾��");
            float P=scanner.nextInt();
            System.out.print("���������ʣ�");
            float i=scanner.nextFloat();
            System.out.print("����ʱ�䣺");
            float n=scanner.nextFloat();
            danli(P, i,n);
    		break;
    	case 3:
            System.out.print("�������ý�Ǯ��");
            float money=scanner.nextInt();
            System.out.print("���������ʣ�");
            float i=scanner.nextFloat();
            System.out.print("����ʱ�䣺");
            float n=scanner.nextFloat();
    		yanglaojin(i,money,n);

    		break;
    	case 4:
    		maigupiao();
    		break;
    	case 5:
    		bangzhaotouzhi();
    		break;
    	case 6:
    		duocitouzhi();
    		break;
    	case 7:
    		daikuan();
    		break;
    	}*/
