
public class Animal {
	String animalName;
	String animalType;
	boolean meatEater;
	String eatType;
	String zoneCode;
	
	public Animal(String animalName, String animalType, boolean meatEater, String zoneCode){
		this.animalType = animalType;
		this.animalName = animalName;
		if (meatEater == true) {
			this.eatType = "Carnivore";
		}else {
			this.eatType = "Vegetarian";
		}
		this.zoneCode = zoneCode;
	}
	
	public String toString() {
		return ">> " + this.animalType + " - " + this.animalName + " (" + this.eatType + ")\n";
	}
	
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}
	
	public void setMeatEater(boolean meatEater) {
		this.meatEater = meatEater;
	}
	
	public String getZoneCode() {
		return zoneCode;
	}
	
	public String getAnimalName() {
		return this.animalName;
	}
	
	public String getAnimalType() {
		return this.animalType;
	}
	
	public String getMeatEater() {
		return eatType;
	}
}
