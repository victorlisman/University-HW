//piramida din kufu

import javax.swing.*;

public class TemaSmechera
{
    public static void main(String[] args)
    {
        int levels = 10;
        int width = 1024;
        int height = 768;
        JFrame frame = new JFrame();
        Canvas canvas = new Canvas(width, height, levels, 700, 100, 20);

        frame.setSize(width, height);
        frame.setTitle("Tema Smechera");
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}