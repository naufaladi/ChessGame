package com.naufaladi.gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class ChessBoard {

    private final JPanel gui = new JPanel(new BorderLayout(3, 3));
    private JButton chessBoardSquares = new JButton();

    ChessBoard() {
        initialiseGui();
    }

    public final void initialiseGui() {
        gui.setBorder(new EmptyBorder(5, 5, 5, 5));


    }


}
