import java.util.Scanner;

public class FuLi {

    public static void main(String[] args) {
        double N=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择复利计算(1)or单利计算(2)or计算本金(3)or投资年数(4)or报酬率(5)or年资产总值(6)or月资产总值(7):");
        int choose=scanner.nextInt();
      
        
        if(choose==1){
            System.out.println("请输入本金：");
            float P=scanner.nextInt();
            System.out.println("请输入利率：");
            float i=scanner.nextFloat();
            System.out.println("存入时间：");
            float n=scanner.nextFloat();
            fuli(N, P, i, n);
        }
        if(choose==2){
            System.out.println("请输入本金：");
            float P=scanner.nextInt();
            System.out.println("请输入利率：");
            float i=scanner.nextFloat();
            System.out.println("存入时间：");
            float n=scanner.nextFloat();
            danLi(P, i,n);
        }
        if(choose==3){
            System.out.println("请输入获得金钱：");
            double total=scanner.nextDouble();
            System.out.println("请输入利率：");
            double i=scanner.nextDouble();
            System.out.println("存入时间：");
            double n=scanner.nextDouble();
    		yangLaoJin(i,total,n);
            
        }
        if(choose==4){
            System.out.println("求存款时长\n"); 
            System.out.println("------------------------------\n");             
            System.out.println("请输入你所存入的本金：\n");
            double P=scanner.nextDouble();
            System.out.println("------------------------------\n");   
            System.out.println("请输入你所存的报酬率：\n"); 
            double i=scanner.nextDouble();
            System.out.println("------------------------------\n");  
            System.out.println(" 到最后期望的金额：\n");  
            double total=scanner.nextDouble();
            maiGuPiao(P,i,total);
        }
        if(choose==5)
        {     
            System.out.println("求报酬率\n"); 
            System.out.println("------------------------------\n");             
            System.out.println("请输入你所存入的本金：\n");
            double P=scanner.nextDouble();
            System.out.println("------------------------------\n");   
            System.out.println(" 请输入你所存的存款时长：\n"); 
            double n=scanner.nextDouble();
            System.out.println("------------------------------\n");  
            System.out.println(" 到最后期望的金额：\n");  
            double total=scanner.nextDouble();
            bangZhaoTouZhi(P,n,total);
        }
        if(choose==6)
        { 
            System.out.println("一定年份资金总额\n"); 
            System.out.println("------------------------------\n");             
            System.out.println("请输入你所存入的本金：\n");
            double P=scanner.nextDouble();
            System.out.println("------------------------------\n");   
            System.out.println("请输入你所存的报酬率：\n"); 
            double i=scanner.nextDouble();
            System.out.println("------------------------------\n");  
            System.out.println("请输入你所存的存款时长：\n");  
            double n=scanner.nextDouble();
            duoCiTouZhi(P,i,n);
        }
        if(choose==7)
        { 
        	
        	 System.out.println("月等额本息还款计算\n"); 
             System.out.println("------------------------------\n");             
             System.out.print("请输入你所贷款金额：\n");
             double total=scanner.nextDouble();
             System.out.println("------------------------------\n");   
             System.out.println("请输入你所贷款的年利率：\n"); 
             double i=scanner.nextDouble();
             System.out.println("------------------------------\n");  
             System.out.println("请输入你贷款的还款时长（月）：\n");  
             double m=scanner.nextDouble();
             daiKuan(total,i,m);
             
        }

    }
    private static void daiKuan(double total,double i,double m) {
    	
    	double n = m*12;
    	double money = total*i*Math.pow((1.0+i),n)/(Math.pow(1.0+i,n)-1);
    	System.out.println("你每月等额本息还款是："+money);  
		
	}
	private static void duoCiTouZhi(double P,double i,double n) {
    	double total=P*Math.pow(1+i,n);
        System.out.println("------------------------------\n");  
        System.out.println("你所获得的总金额是:"+total); 
    	
	}
	private static void maiGuPiao(double P,double i,double total) {
    	i=i*100;
    	double n=(72/i);
        System.out.println("------------------------------\n");  
        System.out.println("通过复利的股票型存款，得到期望金额大概所需要的年份：\n"+n); 
		
	}
	private static void bangZhaoTouZhi(double P,double n,double total) {
    	double base= (double) (((total-P)/P)/n);
    	System.out.println("通过复利的股票型存款本金翻倍的报酬率为："+base); 
		
	}
	private static void yangLaoJin(double i, double total,double n) {//n 时间       i 利率
    	for(int j=1;j<=n;j++){
            i=(1+n)*i;
        }
        double money=total/i;
        System.out.println("需要本金："+money);
	}

	private static void danLi(double P, double i,double n) {
        double G; 
        
        G=P+P*i*n;
        System.out.println("单利终值为："+G);
    }

    private static void fuli(double N, double P, double i, double n) {
        for(int j=1;j<=n;j++){
            
            N=(1+i)*N;
        }
        double F;
        F=P*N;
        System.out.println("复利终值为："+F);
    }
    
}

    /*    int num=scanner.nextInt();
    	   	System.out.println("                       -------------------------------------\n");
    	   	System.out.println("                                 欢迎来到未来银行");
    	   	System.out.println("                              顾客你可以根据1~3选择");
    	   	System.out.println("                                   1.复利计算");
    	   	System.out.println("                                   2.单利计算");
    	   	System.out.println("                                   3.养老金计算方法");
    	   	System.out.println("                                   4.股票计算");
    	   	System.out.println("                                   5.帮你找投资");
    	   	System.out.println("                                   6.多次投资");
    	   	System.out.println("                                   7.贷款");
    	   	System.out.println("                       -------------------------------------");
    	   	System.out.println("                                               ");
    	   	System.out.println("请根据数字选择你需要的功能(1~7)");
    	switch(num)
    	{
    	case 1:
            System.out.println("请输入本金：");
            float P=scanner.nextInt();
            System.out.println("请输入利率：");
            float i=scanner.nextFloat();
            System.out.println("存入时间：");
            float n=scanner.nextFloat();
            System.out.println("每年的利率"+i+",连续%"+n+"年");
            fuli(N, P, i, n);        
    		break;
    	case 2:
            System.out.print("请输入本金：");
            float P=scanner.nextInt();
            System.out.print("请输入利率：");
            float i=scanner.nextFloat();
            System.out.print("存入时间：");
            float n=scanner.nextFloat();
            danli(P, i,n);
    		break;
    	case 3:
            System.out.print("请输入获得金钱：");
            float money=scanner.nextInt();
            System.out.print("请输入利率：");
            float i=scanner.nextFloat();
            System.out.print("存入时间：");
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
