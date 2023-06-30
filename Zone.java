import java.util.ArrayList;

public class Zone {
	String zoneType;
	String animalZoneName;
	String riskLevel;
	String zoneLetter;
	String name;
	String type;
	boolean eat;
	public ArrayList<Animal> animalInfo = new ArrayList<Animal>();
	
	public Zone(String animalZoneName, String riskLevel, String zoneLetter){
		this.animalZoneName = animalZoneName;
		this.zoneLetter = zoneLetter;
		this.riskLevel = riskLevel;
	}
	
	public String toString() {
		return this.zoneLetter + ": " + this.animalZoneName + " Zone " + "(" + this.riskLevel + ")\n" + "--------------------------\n";
	}
	
	public String getAnimalZoneName() {
		return animalZoneName;
	}
	
	public void setAnimalZoneName(String animalZoneName) {
		this.animalZoneName = animalZoneName;
	}
	
	public String getZoneLetter() {
		return zoneLetter;
	}
	
	public void setZoneLetter(String zoneLetter) {
		this.zoneLetter = zoneLetter;
	}
	
	public String getRiskLevel() {
		return riskLevel;
	}
	
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	
	public void addAnimal(Animal e) {
		animalInfo.add(e);
	}
	
	public void removeAnimal(int e) {
		animalInfo.remove(e);
	}
	
}