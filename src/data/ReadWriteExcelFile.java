package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader xls=new Xls_Reader("C:\\Ripal\\QA\\NikulTest.xlsx");
		
		
		System.out.println(xls.getCellData("Data1",2, 2));
		System.out.println(xls.getCellData("Data1",1, 2));
		
		System.out.println(xls.addColumn("Data1", "Prabuddha"));
		
		System.out.println(xls.getRowCount("Data1"));
		
		xls.setCellData("Data1", "Email Error", 12, "RipalPrabuddha");
		

	}

}
