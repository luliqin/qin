
public class FuLiTest {
	public static double daiKuan(double total,double i,double m) {
    	
    	double n = m*12;
    	double money = total*i*Math.pow((1.0+i),n)/(Math.pow(1.0+i,n)-1);
    	return money;
		
	}
	public static double duoCiTouZhi(double P,double i,double n) {
    	double total=P*Math.pow(1+i,n);
        return total;
    	
	}
	public static double maiGuPiao(double P,double i,double total) {
    	i=i*100;
    	double n=(72/i);
        return n;
	}
	public static double bangZhaoTouZhi(double P,double n,double total) {
    	double base= (double) (((total-P)/P)/n);
    	return base;
		
	}
	public static double yangLaoJin(double i, double total,double n) {//n 时间       i 利率
    	for(int j=1;j<=n;j++){
            i=(1+n)*i;
        }
        double money=total/i;
        return money;
	}

	public static double danLi(double P, double i,double n) {
        double G; 
        
        G=P+P*i*n;
       return G;
    }

    public static double fuli(double N, double P, double i, double n) {
        for(int j=1;j<=n;j++){
            
            N=(1+i)*N;
        }
        double F;
        F=P*N;
       return F;
    }
}
