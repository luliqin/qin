import java.util.Scanner;

public class FuLi {

    public static void main(String[] args) {
        double N=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择复利计算(1)单利计算(2)复利计算(3)养老金计算方法(4)股票计算(5)帮你找投资(6)多次投资(7)贷款");
        int choose=scanner.nextInt();
      
        
        if(choose==1){
            System.out.println("(1)单利计算"); 
            System.out.println("------------------------------");    
            System.out.println("请输入本金：");
            double P=scanner.nextDouble();
            System.out.println("请输入利率：");
            float i=scanner.nextFloat();
            System.out.println("存入时间：");
            float n=scanner.nextFloat();
            fuLi(N, P, i, n);
        }
        if(choose==2){
            System.out.println("(2)复利计算"); 
            System.out.println("------------------------------");    
            System.out.println("请输入本金：");
            float P=scanner.nextInt();
            System.out.println("请输入利率：");
            float i=scanner.nextFloat();
            System.out.println("存入时间：");
            float n=scanner.nextFloat();
            danLi(P, i,n);
        }
        if(choose==3){
            System.out.println("(3)养老金计算方法"); 
            System.out.println("------------------------------");
            System.out.println("请输入获得金钱：");
            double total=scanner.nextDouble();
            System.out.println("请输入利率：");
            double i=scanner.nextDouble();
            System.out.println("存入时间：");
            double n=scanner.nextDouble();
    		yangLaoJin(i,total,n);
            
        }
        if(choose==4){
            System.out.println("(4)股票计算"); 
            System.out.println("------------------------------");             
            System.out.println("请输入你所存入的本金：");
            double P=scanner.nextDouble();
            System.out.println("------------------------------");   
            System.out.println("请输入你所存的报酬率："); 
            double i=scanner.nextDouble();
            System.out.println("------------------------------");  
            System.out.println(" 到最后期望的金额：");  
            double total=scanner.nextDouble();
            maiGuPiao(P,i,total);
        }
        if(choose==5)
        {     
            System.out.println("(5)帮你找投资"); 
            System.out.println("------------------------------");             
            System.out.println("请输入你所存入的本金：");
            double P=scanner.nextDouble();
            System.out.println("------------------------------");   
            System.out.println(" 请输入你所存的存款时长："); 
            double n=scanner.nextDouble();
            System.out.println("------------------------------");  
            System.out.println(" 到最后期望的金额：");  
            double total=scanner.nextDouble();
            bangZhaoTouZhi(P,n,total);
        }
        if(choose==6)
        { 
            System.out.println("(6)多次投资"); 
            System.out.println("------------------------------");             
            System.out.println("请输入你所存入的本金：");
            double P=scanner.nextDouble();
            System.out.println("------------------------------");   
            System.out.println("请输入你所存的报酬率："); 
            double i=scanner.nextDouble();
            System.out.println("------------------------------");  
            System.out.println("请输入你所存的存款时长：");  
            double n=scanner.nextDouble();
            duoCiTouZhi(P,i,n);
        }
        if(choose==7)
        { 
        	
        	 System.out.println("(7)贷款"); 
             System.out.println("------------------------------");             
             System.out.print("请输入你所贷款金额：");
             double total=scanner.nextDouble();
             System.out.println("------------------------------");   
             System.out.println("请输入你所贷款的年利率："); 
             double i=scanner.nextDouble();
             System.out.println("------------------------------");  
             System.out.println("请输入你贷款的还款时长（月）：");  
             double m=scanner.nextDouble();
             daiKuan(total,i,m);
             
        }

    }
    private static void daiKuan(double total,double i,double m) {
    	
    	double n = m*12;
    	double money = total*i*Math.pow((1.0+i),n)/(Math.pow(1.0+i,n)-1);
        System.out.println("------------------------------");  
    	System.out.println("你每月等额本息还款是："+money);  
		
	}
	private static void duoCiTouZhi(double P,double i,double n) {
    	double total=P*Math.pow(1+i,n);
        System.out.println("------------------------------");  
        System.out.println("你所获得的总金额是:"+total); 
    	
	}
	private static void maiGuPiao(double P,double i,double total) {
    	i=i*100;
    	double n=(72/i);
        System.out.println("------------------------------");  
        System.out.println("通过复利的股票型存款，得到期望金额大概所需要的年份："+n); 
		
	}
	private static void bangZhaoTouZhi(double P,double n,double total) {
    	double base= (double) (((total-P)/P)/n);
        System.out.println("------------------------------");  
    	System.out.println("通过复利的股票型存款本金翻倍的报酬率为："+base); 
		
	}
	private static void yangLaoJin(double i, double total,double n) {//n 时间       i 利率
    	for(int j=1;j<=n;j++){
            i=(1+n)*i;
        }
        double money=total/i;
        System.out.println("------------------------------");  
        System.out.println("需要本金："+money);
	}

	private static void danLi(double P, double i,double n) {
        double G; 
        
        G=P+P*i*n;
        System.out.println("------------------------------");  
        System.out.println("单利终值为："+G);
    }

    private static void fuLi(double N, double P, double i, double n) {
        for(int j=1;j<=n;j++){
            
            N=(1+i)*N;
        }
        double F;
        F=P*N;
        System.out.println("------------------------------");  
        System.out.println("复利终值为："+F);
    }
    
}
