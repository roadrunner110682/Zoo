import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
	String zooName;
	
	public ArrayList<Zone> zoneInfo = new ArrayList<Zone>();

	Zoo(String zooName){
		this.zooName = zooName;
		}
	
	public String toString() {
		System.out.print("Welcome to " + zooName + "\n" + "=========================\n");
		for(int i = 0; i < zoneInfo.size(); i += 1) {
			System.out.print("\n" + zoneInfo.get(i));
			for(int j = 0; j < zoneInfo.get(i).animalInfo.size(); j += 1) {
				System.out.print(zoneInfo.get(i).animalInfo.get(j));
			}
		}
		return "";
	}
	
	public void loadZones(String fileToRead) {
		File file = new File(fileToRead);
		
		try {
			Scanner inputStream = new Scanner(file);
			inputStream.useDelimiter(",");
			while(inputStream.hasNext()) {
				String data = inputStream.nextLine();
				String[] values = data.split(",");
				Zone zone = new Zone(values[0], values[1], values[2]);
				zoneInfo.add(zone);
			}inputStream.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public boolean convertBoolean(String value) {
		return Boolean.valueOf(value);
	}
	
	public void loadAnimals(String fileToRead) {
		File file = new File(fileToRead);
		try {
			Scanner inputStream = new Scanner(file);
			inputStream.useDelimiter(",");
			while(inputStream.hasNext()) {
				String data = inputStream.nextLine();
				String[] values = data.split(",");
				Animal animal = new Animal(values[0], values[1], convertBoolean(values[2]), values[3]);
				findZone(animal);
			}inputStream.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void relocate(String animalName, String animalZone) {

	}
	
	public void save() throws IOException {
			String filepath = "newanimals.csv";
			FileWriter fw = new FileWriter(filepath,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for(int i = 0; i < zoneInfo.size(); i += 1) {
				for(int j = 0; j < zoneInfo.get(i).animalInfo.size(); j += 1) {
					pw.println(zoneInfo.get(i).animalInfo.get(j) + ",");			
				}
			}
			pw.flush();
			pw.close();
			
	}
	
	public void findZone(Animal animal) {
		for(Zone zone: zoneInfo) {
			if(zone.getZoneLetter().equals(animal.getZoneCode())) {
				zone.addAnimal(animal);
				return;
			}
		
		}
	}
}
