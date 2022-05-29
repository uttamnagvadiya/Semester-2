class Book{
    private String author_name = "Uttam";
    Book(){}
    Book(String author_name){
        this.author_name = author_name;
    }
    void displayData(){
        System.out.println("Author Name : "+author_name);
    }
}
class Book_Publication extends Book{
    private String title;
    Book_Publication(String title){
        this.title = title;
    }
    void displayData(){
        System.out.println("Book Title : "+title);
    }
}
class Paper_Publication extends Book{
    private String title;
    Paper_Publication(String title){
        this.title = title;
    }
    void displayData(){
        System.out.println("Paper Title : "+title);
    }
}
public class BookDemo{
    public static void main(String[] args){
        Book b1 = new Book(args[0]);
        b1.displayData();

        Book bk1 = new Book_Publication(args[1]);
        bk1.displayData();

        Book bk2 = new Paper_Publication(args[2]);
        bk2.displayData();
    }
}