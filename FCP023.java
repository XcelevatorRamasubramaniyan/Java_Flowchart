import java.util.Scanner;

public class FCP023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int a=scanner.nextInt();
	scanner.nextLine();

	String input = scanner.nextLine();
	for(int i=0;i<a;i++){
	System.out.println(input);
	}
scanner.close();
}
}