package zooExercise;

public abstract class Mammals extends Animals {
	
		////////////Attributes/////////////
		String fur;
	
		
		///////////Constructors////////////
		public Mammals(String vFur, String vType, String vName, String vSpecies, String vGender, int vWeight, int vAge) {
			super(vType, vName, vSpecies, vGender, vWeight, vAge);
			this.fur = vFur;
		}
		
		/////////////Methods/////////////
		public String getFur() {
			return fur;
		}
		public void setFur(String fur) {
			this.fur = fur;
		}
	
}