public class Asersi1
{
    public static void main(String[] args)
    {
        int x = 0;
        if (x > 0)
        {
            System.out.println("x bilangan positif");
        } else
        {
            assert (x < 0) : "ada kesalahan kode"; //Jika run -enableassert, maka hanya line ini yang jalan, bawahnya di terminate
            System.out.println("x bilangan negatif"); //Jika run normal, maka line ini yang jalan
        }
    }
}

