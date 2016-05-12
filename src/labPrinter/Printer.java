package labPrinter;

/**
 * @author Aldo R. Valdes-Dilme
 * CSIS 1410
 *
 */

public abstract class Printer {

	private int serialNumber;
	
	public Printer(int number) {
		
		this.serialNumber = number;
		
	}
	
	abstract void print();
	
	public String toString() {
		
		StringBuilder printerBuilder = new StringBuilder();
		
		printerBuilder.append(this.getClass().getSimpleName() + " ");
		printerBuilder.append("#" + this.serialNumber);
		
		return printerBuilder.toString();
		
	}
	
}
