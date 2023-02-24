class Manusia
{
  //properties
  private String nama;
  private Boolean punyaTV;

  //constructor
  public Manusia()
  {
    nama = "noname";
    punyaTV = false;
  }

  public Manusia(String n)
  {
    nama = n;
  }

  //methods
  public String namaSaya()
  {
    return nama;
  }
  public void beliTV(TV tv)
  {
    punyaTV = true;
  }

  public void jualSemuaTV()
  {
    punyaTV = false;
  }

  public Boolean cekTV()
  {
    return punyaTV;
  }
}