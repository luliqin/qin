import java.util.Scanner;

public class Fulijava {

    public static void main(String[] args) {
        // TODO Auto-generated3 method stub
        Scanner scanner=new Scanner(System.in);
        System.out.print("��ѡ��  :\n1.��������\n2.��������\n3.���㱾��\n4.����ʱ��\n5.�󱨳���\n6.һ������ʽ��ܶ�\n7.�µȶϢ�������\n8.Ͷ�ʱȽ�\n");
        System.out.print("��ѡ��������ͣ�");
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
            System.out.print("������Ͷ��������\n");
            int c=scanner.nextInt();	//cΪͶ����Ŀ
            for(int a=1;a<=c;a++){
             System.out.print("��"+a+"���ʽ�\n"); 
             System.out.print("��ѡ��Ͷ�����ͣ�1Ϊ��������  | 2Ϊ��������\n");
             int x=scanner.nextInt();		//xΪͶ������
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