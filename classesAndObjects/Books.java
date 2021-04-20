package classesAndObjects;

import java.util.Scanner;

public class Books {
	
	private String title;
	private String author;
	private int cost;
	private int no_of_books;
	
	public Books() {
		// TODO Auto-generated constructor stub
	}
	
	public Books(String title, String author, int cost, int no_of_books) {
		super();
		this.title = title;
		this.author = author;
		this.cost = cost;
		this.no_of_books = no_of_books;
	}

	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getCost() {
		return cost;
	}

	public int getNo_of_books() {
		return no_of_books;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Books[] books = new Books[3];
		for(int i=0; i<books.length; i++) {
			System.out.println("Enter details of book "+ (i+1) +"\nBook title, Book author, Book cost and No_of_Books");
			books[i] = new Books(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
		}
		
		System.out.println("Enter book name");
		String name = sc.next();
		System.out.println("Enter number of books");
		int count = sc.nextInt();
		int total = 0;
		for(Books book : books)
		{
			if(book.getTitle().equals(name))
			{
				if(book.getNo_of_books() >= count)
				{
					total = book.getCost() * count;
					System.out.println("Total : "+total);
				}
				else
				{
					System.out.println("We have only "+book.getNo_of_books()+" books available");
					break;
				}
			}
			else
			{
				System.out.println(name+" is not available");
				break;
			}
		}
	}
}
