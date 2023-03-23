import javax.swing.*;
import java.awt.*;

public class SelectionSort extends JPanel{

    private int[] arr;
    private int i = 0,j=0,k=0;

    private SelectionSort() {
        JFrame frame = new JFrame("SelectionSort");
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
            if(j<arr.length){
                if(arr[j]>arr[k])k=j;
                j++;
            }else{
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                i++;
                j=i;
                k=i;
            }
            repaint();
        } else {
            System.out.println("Finished!");
        }
    }

    public static void main(String[] args) {
        new SelectionSort();
        int[]arr={9,2,5,3,2,10,6,7,99,8,10,14,14,13,17,19,16,28,20,2214,64,34,23,32,57,69};
        for(int i=0;i<arr.length;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        }
        for(int val:arr)System.out.println(val);
    }
}

