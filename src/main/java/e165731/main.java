package e165731;

import java.awt.Container;
import javax.swing.*;

public class main extends JFrame {

    public main() {
        // タイトルを設定
        setTitle("スライムがぐるぐるするだけ");

        // パネルを作成
        slime panel = new slime();
        Container contentPane = getContentPane();
        contentPane.add(panel);

        // パネルサイズに合わせてフレームサイズを自動設定
        pack();
    }

    public static void main(String[] args) {
        main frame = new main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}