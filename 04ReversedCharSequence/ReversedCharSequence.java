public class ReversedCharSequence implements CharSequence{
	private String reversed;
	public ReversedCharSequence(String s){
		reversed = "";
	for (int i = s.length() -1 ; i > -1; i--){
		reversed += s.charAt(i);
	}
	}
	public char charAt(int x){
		return reversed.charAt(x);
		
	} 
	public int length(){
	return reversed.length();
	}
	public String toString(){
		return reversed;
		}
	public CharSequence subSequence(int start, int end){
		return reversed.subSequence(start, end);
		}
public static void main(String[]args){	
ReversedCharSequence s = new ReversedCharSequence("hello world");
	System.out.println(s.length() + ".... expecting 11");
	System.out.println(s + ".... expecting dlrow olleh");
	System.out.println(s.charAt(1) + ".... expecting l");
	System.out.println(s.subSequence(2, 7) + ".... expecting row o");
}
}


