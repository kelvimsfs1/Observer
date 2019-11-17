package Youtube;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class  Canal implements Subject{
	
	private List<Observer> list;
	private String video;
	
	public Canal() {
        list = new ArrayList<Observer>();
	}
	
	public void lancarNovoVideo() {
		//Random random = new Random();
		// a informacao foi modificada
		video = "video";
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
			o.update(this, video);
		}
		
	}

}
