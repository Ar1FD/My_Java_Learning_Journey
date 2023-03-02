import java.util.ArrayList;

public class Dealer
{
	ArrayList<Kendaraan> listKendaraan;
	ArrayList<Customer> listCustomer;
	Dealer()
	{
		listKendaraan = new ArrayList<Kendaraan>();
		listCustomer = new ArrayList<Customer>();
	}
	
	void addKendaraan(Kendaraan knd)
	{
		listKendaraan.add(knd);
	}
	
	void addCustomer(Customer udin)
	{
		listCustomer.add(udin);
	}
	
	void getListKendaran()
	{
		for(Kendaraan k:listKendaraan)
			System.out.println(k);
	}
	
	void getListNoRangkaKendaran()
	{
		for(Kendaraan k:listKendaraan)
			System.out.println(k.getNoRangka());
	}
	
	void getListCustomer()
	{
		for(int i=0;i<listCustomer.size();i++)
			System.out.println(listCustomer.get(i));
	}
	
	void getListNamaCustomer()
	{
		for(int i=0;i<listCustomer.size();i++)
			System.out.println(listCustomer.get(i).getNama());
	}
	
	void Pembelian(Customer udin, String noRangka)
	{
		boolean jadibeli = false;
		for(Kendaraan k:listKendaraan)
		{
			if(k.getNoRangka() == noRangka)
				jadibeli = true;
		}
		if(jadibeli)
			System.out.println(udin.getNama()+" akhirnya membeli mobil dengan no rangka "+noRangka);
		else
			System.out.println(udin.getNama()+" ga jadi beli, ga ada mobilnya");
	}
	

}