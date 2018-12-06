package zooExercise;

public abstract class Birds extends Animals {
	
	////////////Attributes/////////////
	
	int wingspan;
	
	///////////Constructors////////////
	public Birds(int vWingSpan, String vType, String vName, String vSpecies, String vGender, int vWeight, int vAge) {
		super(vType, vName, vSpecies, vGender, vWeight, vAge);
		this.wingspan = vWingSpan;
	}
	
	/////////////Methods/////////////
	
	public int getWingSpan() {
		return wingspan;
	}
	
	
	public void setWingSpan(int wingspan) {
		this.wingspan = wingspan;
	}
	
}
