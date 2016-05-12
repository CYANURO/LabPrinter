package labPrinter;

/**
 * @author Aldo R. Valdes-Dilme
 * CSIS 1410
 *
 */

public class InkjetPrinter extends Printer {
	
	private int remainingCartridge;
	
	public InkjetPrinter(int serialNumber) {
		
		super(serialNumber);
		remainingCartridge = 100;
		
		
		
	}
	
	public Integer getRemainingCartridges() {
		
		return remainingCartridge;
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		StringBuilder printingBuilder = new StringBuilder();
		
		if (remainingCartridge > 0) {
			
			remainingCartridge -= 10;
			
			printingBuilder.append(this.getClass().getSimpleName()
					+ " is printing. Remaining cartridge: ");
			printingBuilder.append(remainingCartridge + "%");
			
			System.out.println(printingBuilder);
			
		}
		else {
			
			printingBuilder.append("The cartridge of the ");
			printingBuilder.append(this.getClass().getSimpleName() + " is empty!");
			
			System.out.println(printingBuilder);
		}
		
	}

}
