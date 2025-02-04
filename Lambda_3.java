package lLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda_3 {

	public static void main(String[] args) {
		
		List <Integer> myList = new ArrayList<>(Arrays.asList(7, 12, 14, 4, 9, 2, 4, 12, 16));
		
		ilkD�rtEleman(myList);
	System.out.println();
	
		ilkD�rtElemanGec(myList);
	System.out.println();
	
		�cElemanYazdir(myList);
	
	}

	// 1) K�c�kten b�y�ge sirala sonra ilk 4 elemani yazdirin.
	public static void ilkD�rtEleman(List <Integer> myList) {
		
		myList.stream().sorted().limit(4).forEach(Lambda_Methods::bosluklaYazdir); // 2 4 4 7 
		// limit() --> Istenildigi kadar elemani getirmeye yarayan method'dur.
	}
	
	// 2) K�c�kten b�y�ge sirala, sonra ilk 4 elemani atlayarak yazdirin.
	public static void ilkD�rtElemanGec(List <Integer> myList) {
		
		myList.stream().sorted().skip(4).forEach(Lambda_Methods::bosluklaYazdir); // 9 12 12 14 16 
		// skip() --> Istenildigi kadar elemani atladiktan sonra kalani yazdiran method'dur.
	}
	
	// 3) K�c�kten b�y�ge sirali, 4. 5. 6. elemanlari yazdirin.
	public static void �cElemanYazdir(List <Integer> myList) {
		
		// I. YOL
		myList.stream().sorted().skip(3).limit(3).forEach(Lambda_Methods::bosluklaYazdir); // 7 9 12 
		
		System.out.println();
		
		// II.YOL
		myList.stream().sorted().limit(6).skip(3).forEach(Lambda_Methods::bosluklaYazdir); // 7 9 12
		
		// sorted(): List'i natural order'a g�re siralar. (K�c�kten b�y�ge)
		
	}

}
