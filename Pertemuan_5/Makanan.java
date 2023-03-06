public class Makanan
{
	protected String nama;
	protected String rasa;
	
	Makanan(){
		nama="nasi";
		rasa="hambar";
	}
	
	void setNama(String nama)
	{
		this.nama = nama;
	}
	
	String getNama()
	{
		return this.nama;
	}
	
	void CekRasa()
	{
		System.out.println("Rasanya adalah: "+rasa);
	}
}