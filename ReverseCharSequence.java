public class ReverseCharSequence implements CharSequence{
    public static void main(String[] args){
    }
    private char[] str;

    public ReverseCharSequence(String s){
        char[] oldarray = s.toCharArray();
	char[] newarray = new char[s.length()];
	for (int x = s.length(); x >= 0; x--){
	    newarray[s.length()-x] = oldarray[x];
	}
    }

    public char charAt(int index){
	return str[index];
    }

    public int length(){
	return str.length;
    }


}