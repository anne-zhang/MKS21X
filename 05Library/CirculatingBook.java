public class CirculatingBook extends LibraryBook{

    private String patron;
    private String dueDate;

	public String getPatron(){
	return patron + "";
    }
    public String getDueDate(){
	return dueDate + "";
    }
    public CirculatingBook(String author, String title, String ISBN, String callNumber){
	super(author, title, ISBN, callNumber);
    }

    

    public void getPatron(String patron){
	this.patron = patron;
    }
    public void getDueDate(String dueDate){
	this.dueDate = dueDate;
    }

    public void checkout(String patron, String dueDate){
	if (patron == "null" && dueDate == "null"){
	    this.patron = patron;
	    this.dueDate = dueDate;
	}
    }

    public void returned(){
	patron = "null";
	dueDate = "null";
    }

    public String circulationStatus(){
	String x = "";
	if (patron == "null"){
	    x = "BOOK AVAILABLE";
	}
	else{
	    x = "Current Holder:" + patron + "\nDue Date:" + dueDate;
	}
	return x;
    }

    public String toString(){
        String x = super.toString();
	if (patron != "null"){
	    x += "\n Patron: " + patron;
	}
	if (dueDate != "null"){
	    x += "\n Due: " + dueDate;
	}
	return x;
    }
    
}