public class Barcode implements Comparable<Barcode>{
    private String zip;

    public Barcode (String zip) {
	if (zip.length() != 5) {
	    throw new IllegalArgumentException();
	}
	for (int x = 0; x < zip.length(); x++) {
	    if((int)zip.charAt(x) - '0' < 0 || (int)zip.charAt(x) - '0' > 9) {
		throw new IllegalArgumentException();
	    }
	}
	this.zip = zip;
    }

    public String getZip() {
	return zip;
    }

    public String getCode() {
	return toCode(zip);
    }

    public static String toZip(String code) {
	String ans = "";
	String[] codeary = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
	if (code.length() != 32 || code.charAt(31) != '|' || code.charAt(0) != '|') {
	    throw new IllegalArgumentException();
	}
	int checknum = 0;
	int checkSum = 0;
	String zip = "";
	for (int i = 1; i <= 30; i += 5) {
	    for (int n = 0; n < 10; n++) {
		if (code.substring(i, i + 5).equals(codeary[n])) {
		    if (i < 25) {
			zip += n;
			checknum += n;
		    }
		    else checkSum = n;
		}
	    }
	}
	
	if (checkSum != checknum % 10) {
	    throw new IllegalArgumentException();
	}
	return zip;
    }
    
     public static String toCode(String zip) {
	if (zip.length() != 5) {
	    throw new IllegalArgumentException();
	}
	for (int i = 0; i < zip.length(); i++) {
	    if( (int)zip.charAt(i) - '0' > 9 || (int)zip.charAt(i) - '0' < 0 ) {
		throw new IllegalArgumentException();
	    }
	}
	String[] codeary = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
	String begin  = "|";
	int checkSum = 0;
	for (int i = 0; i < zip.length(); i++) {
	    begin += codeary[(int)zip.charAt(i) - '0'];
	    checkSum += (int)zip.charAt(i)- '0';
	}
	return begin + codeary[checkSum % 10] + "|";
    }	    

    public String toString() {
	return getCode() + " (" + zip + ")";
    }

    public int compareTo(Barcode b) {
	return getZip().compareTo(b.getZip());
    }

    public boolean equals(Barcode b) {
	return getZip().equals(b.getZip());
    }

/*
    public static void main(String[] args) {
	Barcode b = new Barcode("00000");
	Barcode c = new Barcode("13523562");
	Barcode d = new Barcode("11111");
	System.out.println(b.getZip()); 
	System.out.println(b.getCode()); 
	System.out.println(b.toString()); 
	System.out.println(b.compareTo(c)); 
	System.out.println(b.equals(c)); 		   
}*/
    
}
