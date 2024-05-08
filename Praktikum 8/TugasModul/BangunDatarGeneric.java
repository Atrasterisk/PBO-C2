public class BangunDatarGeneric<iniNamaTipe extends BangunDatar> {
    private iniNamaTipe bangundatar;

    public void set (iniNamaTipe tipebangundatar)
    {
        bangundatar = tipebangundatar;
    }

    public iniNamaTipe get()
    {
        return bangundatar;
    }

    public double hitungKeliling()
    {
        return bangundatar.hitungKeliling();
    }
}
