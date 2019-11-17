package Youtube;

public class main {

	public static void main(String[] args) {
		Canal canal= new Canal();
		Inscrito o1 = new Inscrito("Odeio java");
		Inscrito o2 = new Inscrito("java é ruim");
		Inscrito o3 = new Inscrito("morte ao java");
		
		canal.attach(o1);
		canal.attach(o2);
		canal.attach(o3);
		
		canal.lancarNovoVideo();
	}

}
