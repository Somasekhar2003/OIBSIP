import javax.swing.*;

public class OnlineExamination {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Examination exam = new Examination();
            exam.start();
        });
    }
}
