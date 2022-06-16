package com.JANA60.shop.controller.main;

import java.text.DecimalFormat;

public class Good 
{
	/*
	 * 		Nel progetto java-oop-shop, jana60.shop e creare la classe Prodotto che gestisce i prodotti dello shop.
			Un prodotto è caratterizzato da:
			- marca ;
			- nome ;
			- prezzo ;
			- iva ;
			Scegliere opportunamente il tipo di dato per gli attributi.
			Aggiungere un costruttore che inizializza tutti gli attributi.
			Aggiungere dei metodi per:
			- calcolare il prezzo comprensivo di iva ;
			- formattare il prezzo restituendo una stringa con un determinato numero di decimali e il carattere €.
	 */
	
	String brand, name;
	double basePrice;
	int VAT;
	
	DecimalFormat df= new DecimalFormat ("#.00€"); //importiamo la classe Decimal Format e impostiamo una formattazione decimale per gli euro
	
	//public Good() {} // creo un costruttore vuoto per comodità

	public Good(String brand, String name, double basePrice, int VAT)  // costruttore con parametri in entrata per avere la sicurezza che ogni oggetto abbia queste variabili in entrata
	{
		super();
		this.brand = brand;
		this.name = name;
		this.basePrice = basePrice;
		this.VAT = VAT;
	}

	
	public double getTotalPrice()
	{
		return basePrice + ((basePrice /100) * VAT);
	}
	
	public String toString()
	{
		return "Il prezzo del prodotto " +name+" di marca" +brand+" è: " + df.format(getTotalPrice()); //stampa su schermo il nome, il brand e il prezzo ivato e formattato
	}
	
	public String toTable()
	{
		return brand+ " | " + name+ " | " +basePrice+ " + " +VAT+ " = " +getTotalPrice(); 
	}
	
	
}
