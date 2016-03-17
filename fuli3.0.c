#include<stdio.h>
#include<math.h>

void fuli()
{
	int day;
	double total = 1.0f;
	float money;
	float base;
	double total1;
	printf("------------------------------------------------------------\n");
	printf("每年的年利率比为:");
	scanf("%f",&base);
	printf("------------------------------------------------------------\n");
    printf("输入你存入的年数:");
	scanf("%d",&day);
	total=total*pow(1+base,day);	
	printf("-------------------------------------------------------------\n");
	printf("每年的年利率%f,连续%d年,总受益的利率:%lf\n",base,day,total);
	printf("-------------------------------------------------------------\n");
	printf("输入本金金额:");
	scanf("%f",&money);
	total1=money*total;//总利率
	printf("-------------------------------------------------------------\n");
	printf("你将可以得到:%lf\n",total1);
}
void danli()
{
	int day;
	double total = 1.0f;
	float money;
	float base;
	double total1;
	printf("------------------------------------------------------------\n");
	printf("每年的年利率比为:");
	scanf("%f",&base);
	printf("------------------------------------------------------------\n");
    printf("输入你存入的年数:");
	scanf("%d",&day);
	total=base*day;	
	printf("-------------------------------------------------------------\n");
	printf("每年的年利率%f,连续%d年,总受益的利率:%lf\n",base,day,total);
	printf("-------------------------------------------------------------\n");
	printf("输入本金金额:");
	scanf("%f",&money);
	total1=money+money*total;
	printf("-------------------------------------------------------------\n");
	printf("你将可以得到:%lf\n",total1);
}
void yanglaojin()
{
     float money;
	 float base;
     double total = 1.0f;
	 int day;
	 int x;
	 double total1;
	 printf("请输入你需要得到的金额:\n");
	 scanf("%f",&money);
	 printf("请输入平均年回报率:\n");
	 scanf("%f",&base);
	 printf("请输入存入的年数\n");
	 scanf("%d",&day);
	 printf("若是复利选择1，单利选择2\n");
	 scanf("%d",&x);
	 if(x==1)
	 {
     total=total*pow(1+base,day);
	 total1=money/total;
	 printf("需要的本金为:%f\n",total1);
	 }
	 else
	 {
     total=base*day;
	 money=total1/(1+total);
	 printf("需要的本金为:%f\n",money);
	 }
}
void maigupiao(){
	float day;
	double total = 1.0f;
	float money;
	float base;
	double total1;
	printf("每年的年利率比为:");
	scanf("%f",&base);
	printf("输入本金金额:");
	scanf("%f",&money);
    printf("输入你赢得的钱:");
	scanf("%d",&total1);
	base=base*100;
	day=(72/base);	//该公式只针对翻倍有用
	printf("当本金是%f时，需要%f年才能赢得%d的钱\n",money,day,total1);
}
void bangzhaotouzhi()
{
	double day;
	double money;
	double base;
	double total;
	printf("------------------------------------------------------------\n");
    printf("输入你存入的年数:");
	scanf("%lf",&day);	
	printf("输入本金金额:");
	scanf("%lf",&money);
	printf("输入你赢得的钱:");
	scanf("%lf",&total);
	base= (double) (((total-money)/money)/day);
	printf("-------------------------------------------------------------\n");
	printf("需要投资年利率%lf的理财产品。\n",base);
}
void duocitouzhi()
{	
	double money,year,base,total,total1;
	printf("------------------------------------------------------------\n");
    printf("输入你存入的年数:");
	scanf("%lf",&year);	
	printf("输入本金金额:");
	scanf("%lf",&money);
	printf("输入年利率:");
	scanf("%lf",&base);
	total=money*pow(1+base,year);
	printf("%lf年后，能够得到%lf的总资产。\n",year,total);

}
void main()
{
	int num=4;
	printf("                       -------------------------------------\n");
	printf("                                 欢迎来到未来银行\n");
	printf("                              顾客你可以根据1~3选择\n");
	printf("                                   1.复利计算\n");
	printf("                                   2.单利计算\n");
	printf("                                   3.养老金计算方法\n");
	printf("                                   4.股票计算\n");
	printf("                                   5.帮你找投资\n");
	printf("                                   6.多次投资\n");
	printf("                       -------------------------------------\n");
	printf("                                               \n");
	printf("请根据数字选择你需要的功能(1~6)\n");
	scanf("%d",&num);
	switch(num)
	{
	case 1:
		fuli();
		break;
	case 2:
		danli();
		break;
	case 3:
		yanglaojin();
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
	}
}