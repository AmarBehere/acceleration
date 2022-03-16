package com.constructer.practice;

public class Constructerpractice {

	int p;
	int q;
	boolean r;
	boolean s;
	
	public Constructerpractice () {
	//this(11,12);
	p=50;
	q=60;
	r=true;
	s=false;
	System.out.println("this is a non parameterized constructer");
	
	}
	public Constructerpractice(int p , int q) {
	System.out.println(" this is paramiterized constructer");
	System.out.println(p);
	System.out.println(q);
	this.p=p;
	this.q=q;
	r=true;
	}
	      public static void main(String[] args) {
			
		Constructerpractice obj= new Constructerpractice();
	      System.out.println(obj.p);
	      System.out.println(obj.q);
	      System.out.println(obj.r);
	    System.out.println(obj.s);
	    
	    
	    Constructerpractice obj1= new Constructerpractice(35,45);
	      System.out.println(obj.p);
	      System.out.println(obj.q);
	      System.out.println(obj.r);
	    System.out.println(obj.s);

	    
	    
	    
	    
	      
	      }
			
	      {
				
			}
	
	
	
	
	
	
	
	
}
