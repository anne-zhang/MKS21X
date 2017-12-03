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
	public ReversedCharSequence subSequence(int start, int end){
		ReversedCharSequence output = new ReversedCharSequence(reversed.substring(start, end));
		return output;
		}
}


