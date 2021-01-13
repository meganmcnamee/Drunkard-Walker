/**
 * Class that represents a Street Corner 
 * Instances of this Class will be used to track the history and current location of DrunkWalker(s)
 */
//Megan McNamee CSC 330 Lab#5 DrunkWalker
package edu.cuny.csi.csc330.lab5;

public class Intersection {
	
	private int avenue;
	private int street; 

	public Intersection() {
		this(0,0);
	}
	
	
	// !!!!!!!!!!!!!!!!!  
	/**
	 * Constructor that takes ave and street values as parameters ... 
	 */
	public Intersection(int ave, int st)
	{
		this.avenue = ave;
		this.street = st;
	}
	
	
	/**
	 * toString() method  !!!!!!!!!!!!!!!!!
	 */
	@Override
	public String toString() {
		return "Intersection [avenue=" + avenue + ", street=" + street + "]";
	}
	
	
	/**
	 * Getters/Setters !!!!!!!!!!!!!!!!!!!
	 */
	public int getAvenue() {
		return avenue;
	}
	
	
	public void setAvenue(int avenue) {
		this.avenue = avenue;
	}
	
	
	public int getStreet() {
		return street;
	}
	
	
	public void setStreet(int street) {
		this.street = street;
	}
	
	public void incStreet() {
		this.street++;
	}
	
	public void incAvenue() {
		this.avenue++;
	}
	
	public void decStreet() {
		this.street--;
	}
	
	public void decAvenue() {
		this.avenue--;
	}
	
	public void copyIntersection(Intersection otherI)
	{
		avenue = otherI.getAvenue();
		street = otherI.getStreet();
	}
	

	/**
	 * hashCode() and equals() methods 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avenue;
		result = prime * result + street;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Intersection other = (Intersection) obj;
		if (avenue != other.avenue)
			return false;
		if (street != other.street)
			return false;
		return true;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Intersection test1 = new Intersection(9,16);
		Intersection test2 = new Intersection(3,5);
		
		System.out.println(test2.toString());
		System.out.println(test1.toString());
		
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		
		if(test1.equals(test2))
			System.out.println("test1 and test2 are equal.");
		
		else
			System.out.println("test1 and test2 are not equal.");
	}
}