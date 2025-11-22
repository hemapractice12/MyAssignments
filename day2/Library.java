package week2.day2;

public class Library {
public String addbook(String bookTitle) {
	System.out.println("Book added successfully");
	return bookTitle;
}
public void issueBook()
{
	System.out.println("Book issued successfully");
}
public static void main(String[] args) {
	Library obj=new Library();
	    String Title=obj.addbook("Wings of Fire");
    System.out.println("Book Name:"+" "+Title);
    obj.issueBook();
}
}
