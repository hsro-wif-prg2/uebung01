package ueb01;



class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!

		s = validateString(s);

		CharStackImpl cs = new CharStackImpl(s.toCharArray());

		for (int i = 0; i < cs.size(); i++) {
			if(!(cs.pop() == s.charAt(i))){
				return false;
			}
		}

		return true;
	}

	public static String validateString(String s){
		s = s.replace(" ", "");
		s = s.toLowerCase();

		return s;
	}
}
