//Nguyễn Tất Mạnh lớp 68CS2 mssv 0210768 đề thi số 2
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TechnicalBookForm extends JFrame {
    private JTextField titleField;
    private JTextField authorField;
    private JTextField pagesField;
    private JTextField topicField;
    private JList<String> bookList;
    private DefaultListModel<String> listModel;
    private ArrayList<technicalbook> technicalBooks;

    public TechnicalBookForm() {
        setTitle("Quản lý sách kỹ thuật");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        technicalBooks = new ArrayList<>();

        titleField = new JTextField(20);
        authorField = new JTextField(20);
        pagesField = new JTextField(20);
        topicField = new JTextField(20);

        JLabel titleLabel = new JLabel("Tên sách:");
        JLabel authorLabel = new JLabel("Tác giả:");
        JLabel pagesLabel = new JLabel("Số trang:");
        JLabel topicLabel = new JLabel("Chủ đề:");

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(titleLabel);
        inputPanel.add(titleField);
        inputPanel.add(authorLabel);
        inputPanel.add(authorField);
        inputPanel.add(pagesLabel);
        inputPanel.add(pagesField);
        inputPanel.add(topicLabel);
        inputPanel.add(topicField);

        JButton addButton = new JButton("Thêm");
        inputPanel.add(new JLabel());
        inputPanel.add(addButton);

        listModel = new DefaultListModel<>();
        bookList = new JList<>(listModel);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(bookList), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBook();
            }
        });
    }

    private void addBook() {
        String title = titleField.getText();
        String author = authorField.getText();
        String pagesText = pagesField.getText();
        String topic = topicField.getText();

        if (title.isEmpty() || author.isEmpty() || pagesText.isEmpty() || topic.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tất cả các trường đều phải nhập.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int numberOfPages;
        try {
            numberOfPages = Integer.parseInt(pagesText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số trang phải là số nguyên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        technicalbook book = new technicalbook(title, author, numberOfPages, topic);
        technicalBooks.add(book);
        listModel.addElement(book.toString());

        titleField.setText("");
        authorField.setText("");
        pagesField.setText("");
        topicField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TechnicalBookForm().setVisible(true);
            }
        });
    }
}
