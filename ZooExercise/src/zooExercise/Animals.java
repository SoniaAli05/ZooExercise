package zooExercise;

public abstract class Animals {

	//////////Attributes///////////
	private String type;
	private String name;
	private String species; 
	private String gender;
	private int weight;
	private int age;	
	
	/////////Constructors/////////
	public Animals(String vType, String vName, String vSpecies, String vGender, int vWeight, int vAge) {
		this.type = vType;
		this.name = vName;
		this.species = vSpecies;
		this.gender = vGender;
		this.weight = vWeight;
		this.age = vAge;
	}

	/////////Method//////////////
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}