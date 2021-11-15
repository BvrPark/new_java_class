package chapters10;

public class GenericPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter<Powder> printerP = new ThreeDPrinter<Powder>();
		ThreeDPrinter<Plastic> printerPt = new ThreeDPrinter<Plastic>();
		
		
		printerP.setMaterial(new Powder());
		Powder p2 = printerP.getMaterial();
		
		/*
		Powder p1 = new Powder();
		Powder p2;
		printerP.setMaterial(p1);
		System.out.println(printerP.toString());
		p2 = (Powder)printerP.getMaterial();
		p2.doPrinting();
		System.out.println(p2);
		
		
		
		Plastic pt1 = new Plastic();
		Plastic pt2;
		printerPt.setMaterial(pt1);
		System.out.println(printerPt.toString());
		pt2 = (Plastic)printerPt.getMaterial();
		pt2.doPrinting();
		System.out.println(pt2);
		*/
	}

}
