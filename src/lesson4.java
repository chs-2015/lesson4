/**
 * Author: Brandon B.
 * Date: 8-24-15
 */
 
public class lesson4 {
    
    public static void main(String[] args) {
    	int h = 103;
    	int p = 5;
    	System.out.println(++h + p); // 109
    	System.out.println(h); // 104

		int j = 69;
		System.out.println(j++); // 69
		System.out.println(j = j + 1); // 71
		System.out.println(j += 1); // 72

		double def;
		double f = 1992.37;
		def = f;
		System.out.println(def); // 1992.37

		int zulu = 21;
		System.out.println(zulu--); // 21, now set to 20.

		int a = 100;
		int b = 200;
		b/=a;
		System.out.println(b + 1);

		int o = 9000;
		int v = 420;
		System.out.println(v - (o - 30)); // -8550
		v -= o - 30;
		System.out.println(v); // -8550

		int u = 40;
		int y = 4;
		System.out.println(2 + 8 * y / 2 - u); // -22

		int sd = 12;
		int sx = 4;
		System.out.println(sd%(++sx)); // 2
		System.out.println(sx); // 5
		
		/**
		 * int gibmeacompileerrorpls;
		 * 3 = gibmeacompileerrorpls;
		 * System.out.println(++gibmeacompileerrorpls*79);
		*/
		double m = 3.14, e = 3.14, r = 3.14;
		System.out.println(m);
		System.out.println(e);
		System.out.println(r);

		int naw = 36, gaw = 5;
		naw = naw / gaw;
		System.out.println(naw); // 7

		System.out.println(3/4 + 5*2/33 - 3+8*3); // What's 9 + 10?

		int straightoutta = 42;
		int compton = 99;
		int dawg = straightoutta % compton;
		System.out.println(dawg);

		int pepe = 2;
		System.out.println(7%3 + pepe++ +(pepe - 2));
		
		int nope = 25;
		System.out.println(--nope);
		whatarethose();
    }

    public static void whatarethose() {
    	
    	int i = 3;
    	double p;
    	double j = 47.2;
    	p = j; // p is now equal to 47.2; p and j are the same.

		double d, mud, puma; // declare variables
		double x = 31.2, m = 37.09, zu, g = 43.917; // x, m, & g declared and initializted
													// zu is just declared
		System.out.println(5 + 3 * 4 - 7); // 10
		System.out.println(8 - 5 * 6 / 3 + (5 - 6) * 3); // -5

		int count = 15;
		count = count + 3; // Illegal in algebra, okay in computers..
		System.out.println(count); // 18
		
		int k = 409;
		k += 5;
		System.out.println(k); // 414
		
		int c = 5;
		c++; // giggle
		System.out.println(c++); // 6
		System.out.println(c); // 7
		
		
		
    }
}
