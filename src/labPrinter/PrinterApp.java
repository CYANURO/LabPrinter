package labPrinter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aldo R. Valdes-Dilme
 * CSIS 1410
 *
 */

public class PrinterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Printer myPrinter = new Printer(123456789);		// An abstract class cannot be instantiated
		
		InkjetPrinter myInkjetPrinter = new InkjetPrinter(1235813);
		
		System.out.println(myInkjetPrinter);
		System.out.println("Remaining Cartridge: " 
				+ myInkjetPrinter.getRemainingCartridges() + "%");
		System.out.println();
		
		LaserPrinter myLaserPrinter = new LaserPrinter(21345589);
		
		System.out.println(myLaserPrinter);
		System.out.println("Remaining Toner: " 
				+ myLaserPrinter.getRemainingToner() + "%");
		System.out.println();
		System.out.println("Array of Printers:");
		
		List<Printer> myPrinterArray = new ArrayList<Printer>();
		myPrinterArray.add(myInkjetPrinter);
		myPrinterArray.add(myLaserPrinter);
		
		for(Printer iterationOverPrinterArray: myPrinterArray) {
			
			System.out.println(iterationOverPrinterArray.toString());
			
			for(int i = 0; i <= 1; i++) {
				
				iterationOverPrinterArray.print();
				
			}
			
			System.out.println();
			
		}
	}
}
