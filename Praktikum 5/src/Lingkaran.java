import static java.lang.Math.PI;

class Lingkaran implements IArea
{
    private double jejari;

    public Lingkaran(double r)
    {
        jejari = r;
    }

    @Override
    public double hitungLuas()
    {
        return PI*jejari*jejari;
    }
}
