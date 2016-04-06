import java.util.Scanner;

public class Fulijava {

    public static void main(String[] args) {
        // TODO Auto-generated3 method stub
        Scanner scanner=new Scanner(System.in);
        System.out.print("请选择  :\n1.复利计算\n2.单利计算\n3.计算本金\n4.求存款时长\n5.求报酬率\n6.一定年份资金总额\n7.月等额本息还款计算\n8.投资比较\n");
        System.out.print("请选择计算类型：");
        int num=scanner.nextInt();
      
        if(num==1){
        	num1 num1=new num1();
        }
        if(num==2){
        	num2 num2=new num2();
        }
        if(num==3){
        	num3 num3=new num3();
        }
        if(num==4){
        	num4 num4=new num4();
        }
        if(num==5)
        {
        	num5 num5=new num5();
        }
        if(num==6)
        { 
        	num6 num6=new num6();
        }
        if(num==7)
        { 
        	num7 num7=new num7();
         }
        if(num==8)
        { 
            System.out.print("请输入投资数量：\n");
            int c=scanner.nextInt();	//c为投资数目
            for(int a=1;a<=c;a++){
             System.out.print("第"+a+"笔资金\n"); 
             System.out.print("请选择投资类型：1为复利计算  | 2为单利计算\n");
             int x=scanner.nextInt();		//x为投资类型
             if(x==1)
             {
             	num1 num1=new num1();
             }
             if(x==2)
             {
             	num2 num2=new num2();
             }
            }
         }
    }


}