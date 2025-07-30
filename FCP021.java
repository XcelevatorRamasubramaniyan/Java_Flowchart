import java.util.Scanner;

public class FCP021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=s.nextInt();
	int e=s.nextInt();
	int f=s.nextInt();
	int g=s.nextInt();
	int h=s.nextInt();
	int max=0;
	int min=0;
	if(a<b){
		min=a;
		max=b;
	}else{
		min=b;
		max=a;
	}
	// for c
	if(max<c){
		min=max;
		max=c;
	}else{
		if(min<c){
			min=c;
		}
	}
	//for d
	if(max<d){
		min=max;
		max=d;
	}else{
		if(min<d){
			min=d;
		}
	}
	//for e
	if(max<e){
		min=max;
		max=e;
	}else{
		if(min<e){
			min=e;
		}
	}
	//for f
	if(max<f){
		min=max;
		max=f;
	}else{
		if(min<f){
			min=f;
		}
	}
	//for g
	if(max<g){
		min=max;
		max=g;
	}else{
		if(min<g){
			min=g;
		}
	}
	if(max<h){
		System.out.println(max);
	}
	else{
		if(min>h){
		System.out.println(min);
		}
		else{
		System.out.println(min);
		}
	}
}
}	