package Youtube;

public class Inscrito implements Observer{

	private String video;
	private String name;
	
	public Inscrito(String name) {
		this.name = name;
	}
	 
	public void update(Subject s, Object o) {
		video = (String) o;
		System.out.println("Inscrito "+name+
				           "Video :"+video);
		                  
		
		

	}

}
