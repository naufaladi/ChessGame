package com.naufaladi.game;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessBoard {

    JPanel gui = new JPanel(new BorderLayout(3, 3));
    JButton[][] boardSquares = new JButton[8][8];
    JPanel chessBoard;
    JLabel message = new JLabel("Get Set, Ready!");

    JButton newGame = new JButton("New Game");
    JButton resign = new JButton("Resign");
    JButton quit = new JButton("Quit");


    JFrame frame;
    JLabel label;

    public void makeGui(){
        frame = new JFrame("Chess Mania");

        gui.setBorder(new EmptyBorder(5,5,5,5));

        // creates the toolbar on top
        JToolBar tools = new JToolBar();
        tools.setFloatable(false);
        tools.add(newGame);
        tools.add(resign);
        tools.add(quit); quit.addActionListener(e -> System.exit(0));

        tools.addSeparator();
        tools.add(message);
        gui.add(tools, BorderLayout.PAGE_START);



        chessBoard = new JPanel(new GridLayout(0,9));
        chessBoard.setBorder(new LineBorder(Color.BLACK));
        gui.add(chessBoard);

        // create the chess board squares
        Insets squareMargin = new Insets(0,0,0,0);
        for (int i = 0; i < boardSquares.length; i++) {

        }



        gui.add(new JLabel("Others"), BorderLayout.LINE_START);


        // adds everything above to the window frame
        frame.add(gui);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setVisible(true);
        chessBoard.setVisible(true);
    }

}
