package ueb01;

class Palindrom extends CharStackImpl {
	static boolean istPalindrom(String s) {
		//Anpassung des Strings (Leerzeichen entfernen und alles klein schreiben)

		s = s.replaceAll(" ", "").toLowerCase();

		//String in ein CharArray packen

		char[] input = s.toCharArray();

		//Wenn das Array bloß eine Größe von eins hat => true

		if (input.length == 1)
			return true;

		// Stack erstellen

		CharStack stack = new CharStackImpl();



		// Die Hälfte des Strings in den Stack pushen

		int i;

		for (i = 0; i < input.length / 2; i++) {
			stack.push(input[i]);
		}

		// Ist das Array ungerade muss die Mitte übersprungen werden

		if (input.length % 2 == 1)
			i++;

		// Den 1. Teil (im Stack) mit dem  zweiten Teil (im Array) vergleichen (

		for (; i < input.length; i++) {

			if (input[i] != stack.pop())
				return false;

		}

		return true;
	}
}
