

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

	//Jose Mora
	//CS 141
	//ICE2
	public class Vehicle {
		private String make, model;
		private int year;
		double location = 0.0;
		protected int numberParts;
		public Vehicle(){
			this.make = "";
			this.model = "";
			this.year = 0;
			this.location = 0;
		}
		
		protected void drive(int miles){
			System.out.println("Message");
		}
		protected void drive(double miles){
			System.out.println("Message");
		}
		public int getNumberParts(){
			return numberParts;
		}
		public void setNumberParts(int numParts){
			numberParts = numParts;
		}
		/*Public Vehicle(String make, String model, int year, int location){
			this.make = make;
			this.model = model;
			this.year = year;
			this.location = location;
		}*/

		public double getLocation(){
			return location;
		}
		public int getYear(){
			return year;
		}
		public void setYear(int y){
			year = y;
		}
		
		public void setMake(String m){
			make = m;
		}
		public String getMake(){
			return make;
		}
		public void setModel(String mod){
			model = mod;
		}
		public String getModel(){
			return model;
		}
		public void depressHorn(){
			System.out.println("HONK");
		}
		/*public void drive(int drive){
			location += drive;
		}*/
		public void reverse(int reverse){
			location += reverse;
		}
		public void setLocation(int l){
			location = l;
		}
		public void finalize(){
			System.out.println("Car Destroyed");
		}
		public String toString(){
			String s;
			s = "Make: " + getMake() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nLocation " + getLocation();
			return s;
		}

		public void saveData(String fileName) throws IOException {
			DataOutputStream outputFile = new DataOutputStream(new FileOutputStream((fileName)));
			outputFile.writeUTF(make);
			outputFile.writeUTF(model);
			outputFile.writeInt(year);
			//outputFile.writeInt(location);
			outputFile.close();
		}
		public void LoadData(String fileName) throws IOException {
			DataInputStream inputFile = new DataInputStream(new FileInputStream(fileName));
			make = inputFile.readUTF();
			model = inputFile.readUTF();
			year = inputFile.readInt();
			location = inputFile.readInt();
			//System.out.println("Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nLocation: " + location);
			inputFile.close();
		}
		public static void main(String []args) throws IOException{
			Vehicle car = new Car();
			Vehicle truck = new Truck();

		}
}
