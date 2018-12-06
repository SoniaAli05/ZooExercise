package zooExercise;

public class Cat extends Mammals implements Sounds{
	
	/////////////Attributes/////////////
	String colour;
	
	
	////////////Constructors////////////

	public Cat(String vColour, String vFur, String vType, String vName, String vSpecies, String vGender, int vWeight, int vAge) {
		super (vFur, vType, vName, vSpecies, vGender, vWeight, vAge);
		this.colour = vColour;
	}

	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
		
	//////////////Method///////////////
	
	public String sound() {
		return "Meow";
	}

	public String toString() {
		return sound()+ " - " +this.getName()+ " [This " +this.getColour() + " " +this.getFur()+ " " +this.getGender()+ " " +this.getType()+ " is a " +this.getSpecies()+ ", it weighs " +this.getWeight()+ "Kg and is " +this.getAge()+ " years old] ";
	}
}