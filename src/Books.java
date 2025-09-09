class MyBooks {
    String title;
    String author;
    int price;

    MyBooks(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void Details() {
        System.out.println("title= " + title + " author= " + author + " price= " + price);
    }

}
public class Books {
    public static void main(String[] args) {

        MyBooks Record = new MyBooks("Science", "Yash", 890);
        MyBooks Record2 = new MyBooks("Science2", "Yash2", 8902);


        Record.Details();
        Record2.Details();
    }
}

//Assignment:
//
//Create Student class:
//
//Private fields: name, marks
//
//Validate marks (0–100)
//
//Display student details