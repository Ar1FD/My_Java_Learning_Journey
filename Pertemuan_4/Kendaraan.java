public class Kendaraan
{
	//property
	private String noRangka;
	
	//konstruktor
	public Kendaraan()
	{
		noRangka = "N/A";
	}
	public Kendaraan(String nr)
	{
		noRangka = nr;
	}
	
	//method getter
	public String getNoRangka()
	{
		return noRangka;
	}
	//setter
	public void setNoRangka(String nr)
	{
		noRangka = nr;
	}
}