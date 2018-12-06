
package zooExercise;

public class Dog extends Mammals implements Sounds {

	//////////Attributes////////////////
	private String size;
	
	
	
	///////////////Constructors//////////
	
	public Dog(String vSize, String vFur, String vType, String vName, String vSpecies, String vGender, int vWeight, int vAge) {
		super(vFur, vType, vName, vSpecies, vGender, vWeight, vAge);
		this.size = vSize;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	
	/////////////////Method///////////////
	
	public String sound() {
		return "Woof! Woof!";
	}
	public String toString() {
		return sound()+ " - " +this.getName()+ " [This " +this.getSize() + " " +this.getFur() + " " + this.getGender()+ " " +this.getType()+ " is a " +this.getSpecies()+ ", it weighs " +this.getWeight()+ "Kg and is " +this.getAge()+ " years old] ";
	}
}
