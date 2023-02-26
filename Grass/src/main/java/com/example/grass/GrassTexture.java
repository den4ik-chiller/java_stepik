package java_stepik.Grass.src.main.java.com.example.grass;

import javax.swing.*;
import java.awt.*;

public class GrassTexture {

    public GrassTexture(Image image, int size, int i, int j) {
        JLabel jLabel = new JLabel(new ImageIcon(image));
        jLabel.setBounds(size*i, size*j, size, size);
        Grass.panel.add(jLabel);
        jLabel.repaint();
    }
}
