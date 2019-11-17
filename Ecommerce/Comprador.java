package Ecommerce;

public class Comprador implements Observer{

	private String oferta;
	private String name;
	
	public Comprador(String name) {
		this.name = name;
	}
	 
	public void update(Subject s, Object o) {
		oferta = (String) o;
		System.out.println("Comprador "+name+
				           "oferta :"+oferta);
		                  
		
		

	}

}
