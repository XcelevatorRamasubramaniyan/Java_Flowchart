import java.util.Scanner;

public class FCP019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	int n=s.nextInt();
        double r1 = 0.50;
        double r2 = 0.75;
        double r3 = 1.20;
        double r4 = 1.50;
        
	double b=0;
	double sr=0.2;
	double r = 0;
	double sc = 0;
	
	if(n<=50){
	b=n*r1;
	}else if(n<=150){
	r=n-50;
	b=2500+(r*r2);
	}else if(n<=250){
	r=n-150;
	b=(50*r1)+(100*r2)+(r*r3);
	}else{
	r=n-250;
	b=(50*r1)+(100*r2)+(100*r3)+(r*r4);
	}

         sc = b * sr;
        int tot =(int)( b + sc);
        System.out.println(tot);
    }
}
