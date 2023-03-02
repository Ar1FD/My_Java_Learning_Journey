import java.util.ArrayList;

public class Tes
{
	public static void main(String[] args)
	{
		// siapkan customernya
		Customer ct1 = new Customer();
		ct1.setNama("Adit");
		
		Customer ct2 = new Customer();
		ct2.setNama("Fahrezi");
		
		// siapkan kendaraan
		Kendaraan mbl1 = new Kendaraan();
		Kendaraan mbl2 = new Kendaraan();
		Kendaraan mbl3 = new Kendaraan();
		
		mbl1.setNoRangka("AK0001");
		mbl2.setNoRangka("AK0002");
		mbl3.setNoRangka("AK0003");
		
		//dealer
		Dealer bintangMotor = new Dealer();
		bintangMotor.addKendaraan(mbl1);
		bintangMotor.addKendaraan(mbl2);
		bintangMotor.addKendaraan(mbl3);
		
		bintangMotor.getListKendaran();
		bintangMotor.getListNoRangkaKendaran();
		
		bintangMotor.addCustomer(ct1);
		bintangMotor.getListCustomer();
		bintangMotor.getListNamaCustomer();
		
		bintangMotor.Pembelian(ct1,"AK0002");
	
	}


}