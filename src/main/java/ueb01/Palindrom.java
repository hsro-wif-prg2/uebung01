package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!

		CharStackImpl ch1 = new CharStackImpl();

		// Buchstaben umwandeln. Leerzeichen entfernen
		s = s.replaceAll("\\s+", "");
		s = s.toLowerCase();
		String reverse = "";

		// String spliten
		char[] sChar = s.toCharArray();

		//Char Array mit werte füllen  -> push Methode aufrufen
		for (int i = 0; i < sChar.length; i++) {
			ch1.push(sChar[i]);
		}

		if (ch1.size() == 0)
			throw new NullPointerException();

		// Wenn nur zwei Buchtaben, dann immer True
		if (ch1.size() < 2)
			return true;

		// Wenn länge größer als zwei, buchstaben durch "pop()" entfernen und in dem String "reverse" speichern
		if (ch1.size() >= 2) {

			while (ch1.size() != 0) {
				reverse = reverse + ch1.pop();
			}
		// Zwei String-Objekte miteinander vergleichen, bei gleichheit True ausgeben
			if (s.equals(reverse))

			return true;

		}

		return false;
	}
}
