package it.polito.tdp.borders.model;

public class Evento implements Comparable <Evento> {

	//se avessimo più tipi di evento nella simulazione avremmo
	//una variabile enum che specifica il tipo di eveno considerato 
	
	private int t;
	private Country stato; //lo stato in cui arrivano i migranti al tempo t
	private int n; //il numero di migranti che arrivano in "stato" al tempo t (la metà di essi si sposterà)
	
	
	public Evento(int t, Country stato, int n) {
		super();
		this.t = t;
		this.stato = stato;
		this.n = n;
	}


	public int getT() {
		return t;
	}


	public void setT(int t) {
		this.t = t;
	}


	public Country getStato() {
		return stato;
	}


	public void setStato(Country stato) {
		this.stato = stato;
	}


	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	@Override
	public int compareTo(Evento o) { //funziona solo perchè è un tipo primitivo
		return this.t - o.t;
	}
	
	
	
}
