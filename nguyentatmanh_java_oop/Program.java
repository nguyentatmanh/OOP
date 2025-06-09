//Nguyễn Tất Mạnh 0210768 lớp 68cs2 đề thi số 2
import java.util.Scanner;

public class Program {
    public static void printDetail(Book book) {
        if (book == null) {
            return;
        }
        System.out.println("\nThong tin sach:");
        System.out.println(book.toString());
        System.out.printf("Gia cua cuon sach: %.2f", book.calculatePrice());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon loai sach:");
        System.out.println("1. Truyen");
        System.out.println("2. Ky thuat");
        System.out.print("Chon mot trong cac gia tri (1 hoac 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Book book = null;
        switch (choice) {
            case 1:
                System.out.print("Nhap ten sach: ");
                String fictionTitle = scanner.nextLine();
                System.out.print("Nhap tac gia: ");
                String fictionAuthor = scanner.nextLine();
                System.out.print("Nhap so trang: ");
                int fictionPages = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhap the loai: ");
                String genre = scanner.nextLine();

                book = new fictionbook(fictionTitle, fictionAuthor, fictionPages, genre);
                break;
            case 2:
                System.out.print("Nhap ten sach: ");
                String technicalTitle = scanner.nextLine();
                System.out.print("Nhap tac gia: ");
                String technicalAuthor = scanner.nextLine();
                System.out.print("Nhap so trang: ");
                int technicalPages = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhap chu de: ");
                String topic = scanner.nextLine();

                book = new technicalbook(technicalTitle, technicalAuthor, technicalPages, topic);
                break;
            default:
                System.out.println("Lua chon khong hop le.");
                System.exit(0);
        }
        printDetail(book);
    }
}
