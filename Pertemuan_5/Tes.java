public class Tes
{
	public static void main(String[] a)
	{
		MakananKering objM1 = new MakananKering();
		System.out.println("ObjM1 adalah makanan "+objM1.getNama());
		
		MakananBasah objM2 = new MakananBasah();
		System.out.println("ObjM1 adalah makanan "+objM2.getNama());
		objM2.rasa = "Manis";
		objM2.CekRasa();
		
		objM1.setNama("Intip aka Nasi Kering basi yang dijemur");
		System.out.println("ObjM1 adalah makanan "+objM1.getNama());
		
	}
}