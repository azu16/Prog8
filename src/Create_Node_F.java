import java.util.Scanner;


public class Create_Node_F {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Link a = new Link();
		Link t = a;
		System.out.println("Enter value for info field of node a: ");
		a.info = s.nextInt();
		for(;;){
			System.out.println("Enter Y if you want to create more node otherwise N");
			char c = s.next(".").charAt(0);
			if(c == 'N' || c == 'n'){
				break;
			}
			Link b = new Link();
			System.out.println("Enter value for info part of node b: ");
			b.info = s.nextInt();
			a.next = b;
			a = b;
		}
		a = t;
		while(a != null){
			System.out.print(a.info +"-->");
			a = a.next;
		}
          System.out.print("Null");
	}

}
