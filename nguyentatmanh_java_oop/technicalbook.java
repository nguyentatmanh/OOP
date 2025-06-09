//Nguyễn Tất Mạnh mssv:0210768 đề thi số 2
public class technicalbook extends Book {
    private String topic;

    public technicalbook(String title, String author, int numberOfPages, String topic) {
        super(title, author, numberOfPages);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return super.toString() + ", Topic: " + topic;
    }

    @Override
    public double calculatePrice() {
        double basePrice = 1000 * getNumberOfPages();
        if (basePrice >= 150000) {
            return basePrice * 0.95;
        } else if (basePrice >= 100000) {
            return basePrice * 0.97;
        } else {
            return basePrice * 0.99;
        }
    }
}
