package zooExercise;

public class Parrot extends Birds implements Sounds{

	//////////Attributes///////////////
	String colourfulFeathers;
	
	////////////Constructors///////////
	public Parrot(String vColourfulFeathers,int vWingSpan, String vType, String vName, String vSpecies, String vGender, int vWeight, int vAge) {
		super (vWingSpan, vType, vName, vSpecies, vGender, vWeight, vAge);
		this.colourfulFeathers = vColourfulFeathers;
	}
	public String getColourfulFeathers() {
		return colourfulFeathers;
	}
	public void setColourfulFeathers(String colourfulFeathers) {
		this.colourfulFeathers = colourfulFeathers;
	}
		
	//////////////Methods//////////////
		
	public String sound() {
		return "Roll Call! Meow Meow Schreeeech!Schreeeech!Schreeeech! Woof!Woof!";
	}
		
	public String toString() {
		return sound()+ " - " +this.getName()+ " [This " +this.getColourfulFeathers() + " " +this.getGender()+ " " +this.getType()+ " is an " +this.getSpecies()+ ", it has a wingspan of " +this.getWingSpan()+ " it weighs " +this.getWeight()+ "Kg and is " +this.getAge()+ " years old] ";
	}
	
	
}
