package trecipaket;

import java.util.Scanner;

public class TreciDomaciZadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, novB = 0;
		System.out.println("Unesite broj: ");
		n = sc.nextInt();
		int p = n;
		while (n > 0) {
			int c = n % 10;
			novB *= 10;
			novB += c;
			n /= 10;
		}
		if (p == novB) {
			System.out.println("Uneti broj jeste palindrom");
		} else
			System.out.println("Uneti broj nije palindrom");
	}

}
