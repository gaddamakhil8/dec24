package dec24;

public class PrimeNumber {

	public static void main(String[] args) {
	int num=56545667;
	int i = 10,r = 0,t=0;
	while(num!=0) {
	r = num%i;
	num=num/10;
	t=t+r;
	if(num==0) {
		if(t>=10) {
			num=t;
			t=0;
		}
	}
	}
	System.out.println(t);
	}
}
