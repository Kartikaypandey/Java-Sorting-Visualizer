import javax.swing.*;
import java.awt.*;

public class BubbleSort extends JPanel {
    private int[] arr;
    private int i = 0, j = 0;

    private BubbleSort() {
        JFrame frame = new JFrame("BubbleSort");
        setPreferredSize(new Dimension(800, 500));
        setBackground(Color.BLACK);
        frame.getContentPane().add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - frame.getWidth()) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - frame.getHeight()) / 2);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        arr = new int[800];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * getHeight());
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        for (int i = 0; i < arr.length; i++) {
            g.drawLine(i, getHeight(), i, arr[i]);
        }
        if (i < arr.length) {
            if (j < arr.length - 1 - i) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
                j++;
            } else {
                i++;
                j = 0;
            }
            repaint();
        } else {
            System.out.println("Finished!");
        }
    }

    public static void main(String[] args) {
        new BubbleSort();
    }
}