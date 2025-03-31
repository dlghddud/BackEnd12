public class BookExam {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "자바";
        b.price = 30000;
        b.company = "패스트캠퍼스";
        b.author = "박매일";
        b.pages = 700;
        b.isbn = "1199110";
        System.out.println(b.title + "\n" + b.price + "\n" + b.company + "\n" + b.author + "\n" + b.pages + "\n" + b.isbn);
    }
}
