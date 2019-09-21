package trecipaket;

import java.util.Scanner;

public class TreciDomaciZadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;

		System.out.println("Unesite broj: ");
		a = sc.nextInt();

		boolean prost = true;

		for (int i = 2; i < a && prost == true; i = i + 1)
			if (a % i == 0)
				prost = false;

		if (prost != true)
			System.out.print("Uneti broj nije prost.");

		else
			System.out.print("Uneti broj je prost");

	}

}
