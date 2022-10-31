package fs;

import java.util.Scanner;

public class rp {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sweet Name: ");
		String n = sc.nextLine();
		System.out.println("Enter the selling price: ");
		float selling = sc.nextFloat();
		Revised rp = new Revised();
		rp.calculateTotal(selling);
	}
}
class Revised
{
	private double price;
	
	void calculateTotal(float selling)
	{
		price= selling+0.05 ;
		System.out.println("revised price:\t"+price);
	}
}
