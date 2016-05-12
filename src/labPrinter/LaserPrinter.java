package labPrinter;

/**
 * @author Aldo R. Valdes-Dilme
 * CSIS 1410
 *
 */

public class LaserPrinter extends Printer {
	
	private int remainingToner;
	
	public LaserPrinter(int serialNumber) {
		
		super(serialNumber);
		remainingToner = 100;
		
	}
	
	public Integer getRemainingToner() {
		
		return remainingToner;
		
	}
	
	@Override
	void print() {
		// TODO Auto-generated method stub
		StringBuilder printingBuilder = new StringBuilder();
		
		if (remainingToner > 0) {
			
			remainingToner -= 10;
			
			printingBuilder.append(this.getClass().getSimpleName()
					+ " is printing. Remaining toner: ");
			printingBuilder.append(remainingToner + "%");
			
			System.out.println(printingBuilder);
			
		
		}
		else {
			
			printingBuilder.append("The toner of the ");
			printingBuilder.append(this.getClass().getSimpleName() + " is empty!");
			
			System.out.println(printingBuilder);
		}
		
	}

}
