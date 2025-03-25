package game;

import game.GameHandler;

import javax.swing.*;
import java.awt.*;

public class GameWithMenu {
    private static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame("Baba is You Game");
        showMenu();
    }

    private static void showMenu() {
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JButton startButton = new JButton("Start");
        JButton exitButton = new JButton("Exit");

        startButton.addActionListener(e -> startGame());
        exitButton.addActionListener(e -> System.exit(0));

        gbc.gridy = 0;
        menuPanel.add(startButton, gbc);

        gbc.gridy = 1;
        menuPanel.add(exitButton, gbc);

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(menuPanel);
        frame.setVisible(true);
    }

    private static void startGame() {
        GameHandler game = new GameHandler();
        frame.setContentPane(game);
        frame.revalidate();
        game.requestFocusInWindow();
    }
}
