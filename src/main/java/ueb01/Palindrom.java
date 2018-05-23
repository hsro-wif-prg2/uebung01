package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
        if(s.length() == 1) {
            return true;
        }
		CharStack stack = new CharStackImpl();

        char[] c = s.toLowerCase().replaceAll(" ", "").toCharArray();
        int i = 0;

        for (; i < c.length / 2; i++) {
            stack.push(c[i]);
        }
		if(c.length % 2 == 1) {
            i++;
        }
        for (; i < c.length; i++) {
            if (stack.pop() != c[i])
                return false;
        }

        return true;
	}
}
