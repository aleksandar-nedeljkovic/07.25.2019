package trecipaket;

import java.util.Scanner;

public class TreciDomaciZadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, sum = 0;
		System.out.println("Unesi m: ");
		m = sc.nextInt();
		System.out.println("Unesi n: ");
		n = sc.nextInt();

		if (n < m) {
			int c = m;
			m = n;
			n = c;

			System.out.println("Parni brojevi izmedju " + m + " i " + n + " su: ");
		}

		for (int i = m; i <= n; i += 1) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				sum = sum + i;

			}

		}

		System.out.println("\nZbir unetih brojeva je: " + sum);
	}
}
