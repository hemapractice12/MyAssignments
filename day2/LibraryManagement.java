package week2.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library manage=new Library();
		String Title ="Wings Of Fire";
		manage.addbook(Title);
		manage.issueBook();
}
}
