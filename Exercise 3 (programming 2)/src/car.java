import java.util.Scanner;
public class car {
	
		Scanner sc=new Scanner(System.in);
		String name,colour,model;
		double price,engine,roadtax,totalprice;
		
		car() {
			System.out.println("Please Enter Cars Name?");
			this.name=sc.nextLine();
			System.out.println("Please Enter Cars Colour?");
			this.colour=sc.nextLine();
			System.out.println("Please Enter Cars Model?");
			this.model=sc.nextLine();
			System.out.println("Please Enter size engine(1.5/2.0/1.8)?");
			this.engine=sc.nextDouble();
				if (engine==2.0) {
					this.price= 90000;
				}
				else if (engine==1.8) {
					this.price= 85000;
				}
				else if (engine==1.5) {
					this.price= 72000;
				}
			this.roadtax=855.0;
			this.totalprice=this.roadtax+this.price;
		}
		car(String name,String model,String colour,double engine, double roadtax) {
			this.name=name;
			this.colour=colour;
			this.model=model;
			this.engine=engine;
				if (engine==2.0) {
					this.price= 90000;
				}
				else if (engine==1.8) {
					this.price= 85000;
				}
				else if (engine==1.5) {
					this.price= 72000;
				}
			this.roadtax=roadtax;
			this.totalprice=this.roadtax+this.price;
		}

}
