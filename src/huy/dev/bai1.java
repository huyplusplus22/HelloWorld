package huy.dev;

public class bai1 {
	public static void main(String[] args) {
		System.out.println("hello world");
		int a=1;
		int b=2;
		int c=3;
		float x1;
		float x2;
		float delta= b*b-4*a*c;
		if (a==0) {
			if (b==0) {
				System.out.println("Phuong trinh vo nghiem");
			}	else {
				System.out.println("Phuong trinh co 1 nghiem la: " + (-c/b));
			}
		}
		if (delta > 0) {
			x1 =(float) (-b+Math.sqrt(delta)/(2*a));
			x2 =(float) (-b-Math.sqrt(delta)/(2*a));
			System.out.println("Phuong trinh co nghiem x1 la: " +x1);
			System.out.println("Phuong trinh co nghiem x2 la: " +x2);
		} else if (delta==0){
			x1= (-b/(2*a));
		System.out.println("Phuong trinh co nghiem kep la: " + "x1 = x2 =" +x1);
		} else {
			System.out.println("Phuong trinh vo nghiem");
		}	
	}
}
