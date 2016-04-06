
public class fulitest {
	public double fuli1(double P, float i, int n,int k) {
		          double F;
		          F=P*Math.pow(i/k+1,k*n);
		          return F;
		      }
	public double fuli2(double P, float i, int n) {
        double F;
        F=P*(1+i*n);
        return F;
    }
	public double fuli31(double F, float i1, int n1,int k) {
        double P1;
        P1=F/Math.pow(i1/k+1,k*n1);
        return P1;
    }
	public double fuli32(double F, float i2, int n2) {
        double P2;
        P2=F/(1+i2*n2);
        return P2;
    }
	public double fuli4(double b) {
        double d;
        d=72/b;
        return d;
    }
	public double fuli5(double d) {
        double b;
        b=72/d;
        return b;
    }
	public double fuli6(double a, float b, int d) {
        double c;
        c=a*Math.pow(1+b,d);
        return c;
    }
	public double fuli7(double a, float b, int d) {
        double c;
        c=a*(b*Math.pow(1+b,d))/(Math.pow(1+b,d)-1);
        return c;
    }
}
