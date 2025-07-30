import java.util.Scanner;

public class FCP026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int m=scanner.nextInt();
	int n=scanner.nextInt();
	int sum=0;
	for(int i=m;i<=n;i++){
		sum=sum+m;
	}
	System.out.println(sum);
}
}