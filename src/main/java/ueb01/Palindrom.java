package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!

		s = s.replaceAll("\\s+","");
		s = s.toLowerCase();

		if(s == null)
			throw new NullPointerException();

		int length = s.length();

		// Wenn String nur eine Buchstabe dann true
		if (length < 2) // If the string only has 1 char or is empty
			return true;

		else {

		// Wenn die erste Buchstabe mit der letzten nicht übereinstimmt dann false
			if (s.charAt(0) != s.charAt(length - 1))
				return false;

		//		// Function call for string with the two ends snipped off
			else
				return istPalindrom(s.substring(1, length - 1));
		}


	}
}
