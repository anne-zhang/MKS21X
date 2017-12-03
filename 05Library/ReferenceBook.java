public class ReferenceBook extends LibraryBook{

    private String collection;

    public ReferenceBook(String author, String title, String ISBN, String callNumber, String collection){
	super(author, title, ISBN, callNumber);
	this.collection = collection;
    }

    public String getCollection(){
	return collection + "";
    }

    public void setCollection(String collection){
	this.collection = collection;
    }

    public void checkout(String patron, String dueDate){
	System.out.println("Cannot Check out a Reference Book."); 
    }


    public void returned(){
	System.out.println("Reference Book could not have been checked out--return impossible");
    }


    public String circulationStatus(){
	return "non-circulating reference book";
    }

    public String toString(){
	return super.toString()+ "\n Collection: " + collection;
    }
}