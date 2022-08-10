package Main;

import java.util.Locale;
import java.util.Scanner;

import valores.valor;

public class MainProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		valor add;
		add = new valor();

		System.out.println("produt Name: ");
		add.name = sc.next();

		System.out.println("produt price: ");
		add.price = sc.nextDouble();

		System.out.println("add produt quantity: ");
		add.stock = sc.nextDouble();

		double total = add.somar();

		System.out.printf("Product data: " + add.name + "," + "$ " + add.price + ", " + add.stock + " Units, "
				+ "Total: $ " + "%.2f", total);

		System.out.println("\n \n \nEnter the number of products to be added in stock: ");
		double somaradd = sc.nextDouble();

		add.stock = add.stock + somaradd;
		total = add.somar();

		System.out.printf("Updated data: " + add.name + "," + "$ " + add.price + ", " + add.stock + " Units, "
				+ "Total: $ " + "%.2f", total);

		System.out.println("\n \nRemoved produt quantity: ");

		double removedd = sc.nextDouble();
		add.stock = removedd - add.stock;
		
		double dimi = removedd * add.price - total;
		
		System.out.printf("\n \n \nremoved data: " + add.name + "," + "$ " + add.price + ", " + add.stock + " Units, "
				+ "Total: $ " + "%.2f", dimi);

	}

}
