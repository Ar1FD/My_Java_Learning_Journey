class Binatang
{
    //property
    int kaki;
    String jenis;

    //method konstruktor
    Binatang()
    {
        kaki = 2;
        jenis = "mamalia";
    }

    //method biasa
    void printKaki()
    {
        System.out.println("jumlah kaki="+kaki);
    }
    
    void printJenis()
    {
        System.out.println("Jenis Hewan="+jenis);
    }

    void setKaki(int kakibaru)
    {
        kaki = kakibaru;
    }

    void setJenis(String jenisbaru)
    {
        jenis = jenisbaru;
    }

    //main
    public static void main(String[] args) 
    {
        System.out.print("Hello World!\n\n");
        System.out.print("Biodata Anjing:\n");
        Binatang anjingGuguk = new Binatang();
        anjingGuguk.printKaki();
        anjingGuguk.setKaki(4);
        anjingGuguk.printKaki();
        anjingGuguk.printJenis();
        anjingGuguk.setJenis("tetap Mamalia");
        anjingGuguk.printJenis();
        
        System.out.print("\nBiodata Ular:\n");
        Binatang Ular = new Binatang();
        Ular.printKaki();
        Ular.setKaki(0);
        Ular.printKaki();
        Ular.printJenis();
        Ular.setJenis("Jadi Reptil");
        Ular.printJenis();
    }
}