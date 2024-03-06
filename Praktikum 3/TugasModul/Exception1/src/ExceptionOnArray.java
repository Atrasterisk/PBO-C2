public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4]; //Adanya index 0,1,2,3
        try
        {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception)
        {
            exception.printStackTrace(); //Method untuk ngeluarin error umum
        } finally // Finally pasti dijalankan
        {
            System.out.println("clean up code...");
            // Beda dengan assertion, exception membuat try-catch dimana jika ada error pada blok try, akan dilakukan pengecekan kondisi catch yang cocok
            // Membuat sebuah handler untuk error pada try kemudian me-record error pada catch
        }
    }
}