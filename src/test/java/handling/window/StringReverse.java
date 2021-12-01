package handling.window;

public class StringReverse {

	public static void main(String[] args) {
		//By using typical method
		System.out.println(reverschar("abcd"));
		//by using stringbuffer class
		StringBuffer r = new StringBuffer("kumar");
		System.out.println(r.reverse());
	}
public static String reverschar (String s) {
	String rev = "";
	for(int i =s.length()-1;i>=0;i--) {
		rev = rev+ s.charAt(i);			
	}
	return rev;

}
}
