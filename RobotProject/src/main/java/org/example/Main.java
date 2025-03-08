package org.example;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Robot robot2 = new Robot();
        robot2.setX(300);
        robot2.setY(300);
        Canvas canvas = new Canvas(robot, robot2);

        JFrame frame = new JFrame("Robot Movement");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char key = Character.toLowerCase(e.getKeyChar());
                if (key == 'w' || key == 'a' || key == 's' || key == 'd') {
                    robot.move(key);
                } else if (key == 'b') {
                    robot.setSize(robot.getSize() + 20);
                } else if (key == 'v') {
                    robot.setSize(robot.getSize() - 20);
                if (key == 'i' || key == 'j' || key == 'k' || key == 'l' {
                    robot2.move(key); 
                } else if (key == 'n') {
                    robot2.setSize(robot2.getSize() + 20);
                } else if (key == 'm') {
                    robot2.setSize(robot2.getSize() -20);
                canvas.repaint();

            }
        });
    }
}
