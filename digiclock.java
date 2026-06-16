import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class digiclock extends JFrame {

    JLabel label;
    int sec = 0, min = 0, hour = 0;

    public digiclock() {
        setTitle("Digital Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("00:00:00");
        label.setFont(new Font("Arial", Font.BOLD, 30));
        add(label);

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sec++;

                if (sec == 60) {
                    sec = 0;
                    min++;
                }

                if (min == 60) {
                    min = 0;
                    hour++;
                }

                label.setText(
                    String.format("%02d:%02d:%02d", hour, min, sec)
                );
            }
        });

        timer.start();
        setVisible(true);
    }

    public static void main(String[] args) {
        new digiclock();
    }
}