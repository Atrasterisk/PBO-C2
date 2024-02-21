/**
 * File     	: Titik.java		01/03/23
 * Nama penulis : Muhamad Farhan Hafiz Alkirami
 * NIM          : 24060122140043
 * Deskripsi 	: Kelas yang berisi main dari Titik
 * 
 */

class Titik
{
	double absis, ordinat;
	static double counterTitik;

	Titik()
	{
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	Titik(double abs, double ord)
	{
		absis = abs;
		ordinat = ord;
		counterTitik++;
	}
	
	void setAbsis(double abs)
	{
		absis = abs;
	}

	void setOrdinat(double ord)
	{
		ordinat = ord;
	}

	double getAbsis()
	{
		return absis;
	}

	double getOrdinat()
	{
		return ordinat;
	}

	static double getCounterTitik()
	{
		return counterTitik;
	}
}