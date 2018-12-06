package zooExercise;

public class Bat extends Mammals implements Sounds {

	////////////Attributes////////////////
	private int speed;
		
	
	
	///////////Constructor///////////////
	
	public Bat(int vSpeed, String vFur, String vType, String vName, String vSpecies, String vGender, int vWeight, int vAge) {
		super(vFur, vType, vName, vSpecies, vGender, vWeight, vAge);
		this.speed = vSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	//////////////Method////////////////
	public String sound() {
		return "Screeeech!";
	}


	public String toString() {
		return sound()+ " - " +this.getName()+ " [This " +this.getFur() + " " +this.getGender()+ " " +this.getType()+ " is an " +this.getSpecies()+ ", it has a speed of " +this.getSpeed()+ "km/h, it weighs " +this.getWeight()+ " pounds and is " +this.getAge()+ " years old] ";
	}



}
