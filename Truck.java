
public class Truck extends Vehicle{
	public Truck(){
		System.out.println("Truck Constructed");
		drive(10);
		drive(10.0);
		}
	@Override
	public void drive(int miles){
		super.drive(miles);
		location += miles;
	}
	@Override
	public void drive(double miles){
		super.drive(miles);
		location += miles;
		System.out.println("Truck Location: " + location);
	}
}
