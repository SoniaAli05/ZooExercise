package zooExercise;

public class Eagle extends Birds implements Sounds {
	
	//////////Attributes///////////////
	String stiffFeathers;
	
	
	
	////////////Constructors///////////
	public Eagle(String vStiffFeathers, int vWingSpan, String vType, String vName, String vSpecies, String vGender, int vWeight, int vAge) {
		super (vWingSpan, vType, vName, vSpecies, vGender, vWeight, vAge);
		this.stiffFeathers = vStiffFeathers; 
	}
	public String getStiffFeathers() {
		return stiffFeathers;
	}
	public void setStiffFeathers(String stiffFeathers) {
		this.stiffFeathers = stiffFeathers;
	}
		
	//////////////Methods//////////////
	public String sound() {
		return "Chirp";
	}
	
	public String toString() {
		return sound()+ " - " +this.getName()+ " [This " +this.getStiffFeathers() + " " +this.getGender()+ " " +this.getType()+ " is an " +this.getSpecies()+ ", it has a wingspan of " +this.getWingSpan()+ " it weighs " +this.getWeight()+ "Kg and is " +this.getAge()+ " years old] ";
	}
	
	
}
