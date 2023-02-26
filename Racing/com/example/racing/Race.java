package java_stepik.Racing.com.example.racing;

import javax.swing.*;
import java.awt.*;

public class Race {
    protected static final int WIDTH = 1500;
    protected static final int HEIGHT = 750;
    protected static JPanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Race");

        panel = new JPanel(null);
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        Player[] players = new Player[]{
                new Player("C:\\Users\\user\\IdeaProjects\\Racing\\src\\main\\java\\com\\example\\racing\\dima.png", "Chupik", 20),
                new Player("C:\\Users\\user\\IdeaProjects\\Racing\\src\\main\\java\\com\\example\\racing\\lena.png", "Lena", 250),
                new Player("C:\\Users\\user\\IdeaProjects\\Racing\\src\\main\\java\\com\\example\\racing\\max.png", "Maxik", 480),
        };
        for (Player player : players) {
           panel.add(player.jl);
        }
        JLabel s = new JLabel();
        s.setText("321");
        s.setBounds(Race.WIDTH / 2 - 250, Race.HEIGHT / 2 - 30, 500, 60);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dm.width / 2 - WIDTH / 2, dm.height / 2 - HEIGHT / 2, WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);

        for (Player player : players) {
            new PlayerStart(player).start();
        }
    }
}
