public class RumusMatematika {

	double a, t;												//deklarasi variabel
	double l_segitiga;

	public static void main(String[] args) {					//method main
		RumusMatematika rm = new RumusMatematika();				//deklarasi objek dengan nama rm
		rm.luasSegitiga();										//pemanggilan method luas segitiga
	}

	void luasSegitiga() {
		a = 7;
		t = 10;
		l_segitiga = 0.5 * a * t;
		System.out.println("Luas Segitiga = " + l_segitiga);
	}
	
}

/**
*	pemanggilan method luassegitiga harus dideklarasikan object classnya terlebih dahulu
*	karena method luasSegitiga tergolong method bukan static
*/