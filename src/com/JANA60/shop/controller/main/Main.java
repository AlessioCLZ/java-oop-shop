package com.JANA60.shop.controller.main;

import java.util.Scanner;

public class Main {



	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Catalogue flyer= new Catalogue();
		
		System.out.println("Hello and welcome to the shop's catalogue.\n How many items would you like to list?");
		flyer.length=Integer.parseInt(keyboard.nextLine());
		
		System.out.println("All right. So the catalogue will be made of " +flyer.length+ " products.");
		
		for (int i=0; i<flyer.length;i++)
		{
			
			System.out.println("Inserisci la marca del prodotto numero "+(i+1));
			String brand = keyboard.nextLine();
			System.out.println("Inserisci il nome del prodotto numero "+(i+1));
			String name = keyboard.nextLine();
			System.out.println("Inserisci il prezzo del prodotto numero "+(i+1));
			double price = Double.parseDouble(keyboard.nextLine());
			System.out.println("Inserisci l'IVA del prodotto numero "+(i+1));
			int vat = Integer.parseInt(keyboard.nextLine());
			
			Good good = new Good(brand, name, price, vat);
			
			flyer.goods[i]=good;
		}
		
		for(int i=0; i<flyer.length;i++)
		{
			System.out.format(flyer.goods[i].toTable());
		}
		
		keyboard.close();
	}

}
