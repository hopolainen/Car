
public class CarProject {

	public static void main(String[] args) {


		Car car = new Car("", "", 5);
		car.setModel("Ceed");

	}
}
		
class Car {
		
			
			private String brand;

			private String model;

			private int amountOfFuel;
		
			public Car(String brandName, String brandModel, int fuelLeft)

			{

				brand = brandName;

				model = brandModel;

				amountOfFuel = 5;
				
				printData();
			}


			
			public String getModel() {

				return model;

			}

			public void setModel(String model) {

				this.model = model;

			}

			public void brake()

			{

				System.out.println("Car is breaking");
		

			}

			public void printData()

			{

				System.out.println("Brand: " + brand);

				System.out.println("Model: " + model);

				System.out.println("Fuel: " + amountOfFuel);

			}

			public void accelerate()

			{

				amountOfFuel=amountOfFuel+1;

			

			if (amountOfFuel>0)

			{

				System.out.println("Car is now accelerating");

			}

			else

			{

				System.out.println("");

			}



		}

		
	

}
