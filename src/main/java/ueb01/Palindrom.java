package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!
			String stringNew1 =s.replaceAll(" ", "");
			String stringNew = stringNew1.toLowerCase();
			CharStackImpl stack1 = new CharStackImpl();
			for(int i=0; i<stringNew.length(); i++) {
				stack1.push(stringNew.charAt(i));
			}
			String string1 = "";
			for(int i=0; i<stringNew.length(); i++) {
				string1 = string1 + stack1.pop();
			}
			if(string1.equals(stringNew)) {
				return true;
			}
		return false;
	}
}
