
public class Car extends Vehicle{
	public Car(){
		System.out.println("Car Constructed");
		drive(10);
		drive(10.0);
	}
	public void drive(int miles){
		super.drive(miles);
		location += miles*2;
	}
	@Override
	public void drive(double miles){
		super.drive(miles);
		location += miles*2;
		System.out.println("Car Location: " + location);
	}
}
