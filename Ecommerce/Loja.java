package Ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class  Loja implements Subject{
	
	private List<Observer> list;
	private String oferta;
	
	public Loja() {
        list = new ArrayList<Observer>();
	}
	
	public void ofertaDoDia() {
		//Random random = new Random();
		// a informacao foi modificada
		oferta = "oferta";
		// aviso a todos os observadores
		notifyObservers();
	}
        
	@Override
	public void attach(Observer o) {
        list.add(o);
	}

	@Override
	public void detach(Observer o) {
		list.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		//aviso a cada um dos observadores
		for(Observer o : list) {
		//Atualiza a informacao no observador
			o.update(this, oferta);
		}
		
	}

}
