// Nguyễn Tất Mạnh đề thi số 2 mssv 0210768
public class fictionbook extends Book {
    private String genre;

    public fictionbook(String title, String author, int numberOfPages, String genre) {
        super(title, author, numberOfPages);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Genre: " + genre;
    }

    @Override
    public double calculatePrice() {
        return 1000 * getNumberOfPages();
    }
}
