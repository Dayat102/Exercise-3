
public class main {

	public static void main(String[] args) {
		
		car a=new car();
		
		System.out.println("Cars Name : "+a.name);
		System.out.println("Cars Model : "+a.model);
		System.out.println("Cars Colour : "+a.colour);
		System.out.println("Engine Size : "+a.engine);
		System.out.println("Price car : "+a.price);
		System.out.println("Roadtax price: "+a.roadtax);
		System.out.println("Total price (roadtax + price car) : "+a.totalprice);
	
		car b=new car("Toyota","Vios","Red",2.0,750.0);
		
		System.out.println("Cars Name : "+b.name);
		System.out.println("Cars Model : "+b.model);
		System.out.println("Cars Colour : "+b.colour);
		System.out.println("Engine Size : "+b.engine);
		System.out.println("Price car : "+b.price);
		System.out.println("Roadtax price: "+b.roadtax);
		System.out.println("Total price (roadtax + price car) : "+b.totalprice);
	}
}
