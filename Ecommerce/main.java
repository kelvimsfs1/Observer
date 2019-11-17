package Ecommerce;

public class main {

	public static void main(String[] args) {
		Loja loja= new Loja();
		Comprador o1 = new Comprador("Descontão aqui");
		Comprador o2 = new Comprador("100% python ");
		Comprador o3 = new Comprador("compre aqui");
		
		loja.attach(o1);
		loja.attach(o2);
		loja.attach(o3);
		
		loja.ofertaDoDia();
	}

}
