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
	printf("ÿ��������ʱ�Ϊ:");
	scanf("%f",&base);
	printf("------------------------------------------------------------\n");
    printf("��������������:");
	scanf("%d",&day);
	total=total*pow(1+base,day);	
	printf("-------------------------------------------------------------\n");
	printf("ÿ���������%f,����%d��,�����������:%lf\n",base,day,total);
	printf("-------------------------------------------------------------\n");
	printf("���뱾����:");
	scanf("%f",&money);
	total1=money*total;//������
	printf("-------------------------------------------------------------\n");
	printf("�㽫���Եõ�:%lf\n",total1);
}
void danli()
{
	int day;
	double total = 1.0f;
	float money;
	float base;
	double total1;
	printf("------------------------------------------------------------\n");
	printf("ÿ��������ʱ�Ϊ:");
	scanf("%f",&base);
	printf("------------------------------------------------------------\n");
    printf("��������������:");
	scanf("%d",&day);
	total=base*day;	
	printf("-------------------------------------------------------------\n");
	printf("ÿ���������%f,����%d��,�����������:%lf\n",base,day,total);
	printf("-------------------------------------------------------------\n");
	printf("���뱾����:");
	scanf("%f",&money);
	total1=money+money*total;
	printf("-------------------------------------------------------------\n");
	printf("�㽫���Եõ�:%lf\n",total1);
}
void yanglaojin()
{
	double money;
	double base;
	double total = 1.0f;
	double day;
	double x;
	double total1;
	printf("����������Ҫ�õ��Ľ��:\n");
	scanf("%f",&money);
	printf("������ƽ����ر���:\n");
	scanf("%f",&base);
	printf("��������������\n");
	scanf("%d",&day);
	printf("���Ǹ���ѡ��1������ѡ��2\n");
	scanf("%d",&x);
	if(x==1)
	{
		total=total*pow(1+base,day);
		total1=money/total;
		printf("��Ҫ�ı���Ϊ:%f\n",total1);
	}
	else
	{
		total=base*day;
		money=total1/(1+total);
		printf("��Ҫ�ı���Ϊ:%f\n",money);
	}
}
void maigupiao(){
	float day;
	double total = 1.0f;
	float money;
	float base;
	double total1;
	printf("ÿ��������ʱ�Ϊ:");
	scanf("%f",&base);
	printf("���뱾����:");
	scanf("%f",&money);
    printf("������Ӯ�õ�Ǯ:");
	scanf("%d",&total1);
	base=base*100;
	day=(72/base);	//�ù�ʽֻ��Է�������
	printf("��������%fʱ����Ҫ%f�����Ӯ��%d��Ǯ\n",money,day,total1);
}
void bangzhaotouzhi()
{
	double day;
	double money;
	double base;
	double total;
	printf("------------------------------------------------------------\n");
    printf("��������������:");
	scanf("%lf",&day);	
	printf("���뱾����:");
	scanf("%lf",&money);
	printf("������Ӯ�õ�Ǯ:");
	scanf("%lf",&total);
	base= (double) (((total-money)/money)/day);
	printf("-------------------------------------------------------------\n");
	printf("��ҪͶ��������%lf����Ʋ�Ʒ��\n",base);
}
void duocitouzhi()
{	
	double money,year,base,total;
	printf("------------------------------------------------------------\n");
    printf("��������������:");
	scanf("%lf",&year);	
	printf("���뱾����:");
	scanf("%lf",&money);
	printf("����������:");
	scanf("%lf",&base);
	total=money*pow(1+base,year);
	printf("%lf����ܹ��õ�%lf�����ʲ���\n",year,total);
	
}
void daikuan()
{
	double P,i,money;
	double N,month;
    printf("����������\n");
	scanf("%lf",&P);
	printf("�����������ʣ�\n");
	scanf("%lf",&i);
	printf("������黹���ޣ�\n");
	scanf("%lf",&N);
	i = i/12;
	month = N*12;
	money = P*i*pow((1.0+i),month)/(pow(1.0+i,month)-1);
	printf("ÿ�µȶϢ����%lfԪ��\n",money);
	
}
void main()
{
	int num=4;
	printf("                       -------------------------------------\n");
	printf("                                 ��ӭ����δ������\n");
	printf("                              �˿�����Ը���1~3ѡ��\n");
	printf("                                   1.��������\n");
	printf("                                   2.��������\n");
	printf("                                   3.���Ͻ���㷽��\n");
	printf("                                   4.��Ʊ����\n");
	printf("                                   5.������Ͷ��\n");
	printf("                                   6.���Ͷ��\n");
	printf("                                   7.����\n");
	printf("                       -------------------------------------\n");
	printf("                                               \n");
	printf("���������ѡ������Ҫ�Ĺ���(1~7)\n");
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
	case 7:
		daikuan();
		break;
	}
}