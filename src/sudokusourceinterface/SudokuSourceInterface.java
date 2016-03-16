/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusourceinterface;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author David
 */
public class SudokuSourceInterface extends JFrame implements ActionListener {

    //Declara las variables que seran los componentes 
    JLabel labelTitle;
    JButton buttonNew, buttonSave, buttonOut, buttonCredits, buttonHowToPlay;
    JLabel labelCreditTitle;

    /////////////menubar/////////////
    JMenuBar menubar;
    JMenu game, more;
    JMenuItem newInBar, saveInBar, oldInBar, howToBar, creditsBar;

    ////////////credits//////////////
    JButton btnBackHome;
    SudokuCredits creditsWindow;

    public SudokuSourceInterface() {

        //crea un contenedor donde se encuentran los componentes
        super("SUDOKU");
        Container container = getContentPane();
        container.setBackground(Color.black);
        container.setLayout(null);

        JMenuBar menubar = new JMenuBar();
        menubar.setBackground(Color.black);
        JMenu game = new JMenu("Juego");
        game.setForeground(Color.white);

        JMenu more = new JMenu("Más");
        more.setForeground(Color.white);

        menubar.add(game);
        menubar.add(more);
        newInBar = new JMenuItem("Nuevo");
        newInBar.setBackground(Color.black);
        newInBar.setForeground(Color.white);
        newInBar.addActionListener(this);

        saveInBar = new JMenuItem("Guardar");
        saveInBar.setBackground(Color.black);
        saveInBar.setForeground(Color.white);
        saveInBar.addActionListener(this);

        oldInBar = new JMenuItem("Cargar");
        oldInBar.setBackground(Color.black);
        oldInBar.setForeground(Color.white);
        oldInBar.addActionListener(this);

        howToBar = new JMenuItem("Ayuda");
        howToBar.setBackground(Color.black);
        howToBar.setForeground(Color.white);
        howToBar.addActionListener(this);

        creditsBar = new JMenuItem("Creditos");
        creditsBar.setBackground(Color.black);
        creditsBar.setForeground(Color.white);
        creditsBar.addActionListener(this);

        game.add(newInBar);
        game.add(saveInBar);
        game.add(oldInBar);
        more.add(howToBar);
        more.add(creditsBar);
        this.setJMenuBar(menubar);

        //Coloca el label de dice SUDOKU
        labelTitle = new JLabel("SUDOKU");
        labelTitle.setFont(new Font("HACKED", Font.BOLD, 55));//Delcara la fuente y el tamaño  
        labelTitle.setForeground(Color.white);
        labelTitle.setBounds(200, 110, 200, 60);//Declara la ubicacion del label
        container.add(labelTitle);

        //Coloca los botones y les da su ubicacion, ademas les asigna una accion
        buttonNew = new JButton("Nuevo juego");
        buttonNew.addActionListener(this);
        buttonNew.setBounds(225, 220, 150, 25);//Ubicacion y tamaño del boton
        buttonNew.setBackground(Color.black);//color del fondo del boton
        buttonNew.setForeground(Color.white);//color de la fuente del boton
        buttonNew.setFont(new Font("Helvetica", Font.PLAIN, 15));//feunte y tamaño
        container.add(buttonNew);

        buttonHowToPlay = new JButton("Como Jugar");
        buttonHowToPlay.addActionListener(this);
        buttonHowToPlay.setBounds(225, 350, 150, 25);
        buttonHowToPlay.setBackground(Color.black);
        buttonHowToPlay.setForeground(Color.white);
        buttonHowToPlay.setFont(new Font("Helvetica", Font.PLAIN, 15));
        container.add(buttonHowToPlay);

        buttonSave = new JButton("Cargar Juego");
        buttonSave.addActionListener(this);
        buttonSave.setBounds(225, 280, 150, 25);
        buttonSave.setBackground(Color.black);
        buttonSave.setForeground(Color.white);
        buttonSave.setFont(new Font("Helvetica", Font.PLAIN, 15));
        container.add(buttonSave);

        buttonOut = new JButton("Salir");
        buttonOut.addActionListener(this);
        buttonOut.setBounds(360, 420, 100, 25);
        buttonOut.setBackground(Color.black);
        buttonOut.setForeground(Color.white);
        buttonOut.setFont(new Font("Helvetica", Font.PLAIN, 15));
        container.add(buttonOut);

        buttonCredits = new JButton("Creditos");
        buttonCredits.addActionListener(this);
        buttonCredits.setBounds(450, 420, 120, 25);
        buttonCredits.setBackground(Color.black);
        buttonCredits.setForeground(Color.white);
        buttonCredits.setFont(new Font("Helvetica", Font.PLAIN, 15));
        container.add(buttonCredits);

    }

    public class SudokuCredits extends JFrame implements ActionListener {

        JTextArea txtAreaCredits;
        JButton btnBackHome;

        public SudokuCredits() {

            super("Créditos");
            Container container = getContentPane();
            container.setVisible(true);
            container.setBackground(Color.black);
            container.setLayout(null);

            labelCreditTitle = new JLabel("Creditos");
            labelCreditTitle.setFont(new Font("HACKED", Font.BOLD, 20));
            labelCreditTitle.setForeground(Color.white);
            labelCreditTitle.setBounds(20, 10, 100, 25);
            container.add(labelCreditTitle);

            txtAreaCredits = new JTextArea("Creadores del Sudoku: \n"
                    + "\n"
                    + "Daniel Alvarado G \n"
                    + "\n"
                    + "Alejandro Morera G \n"
                    + "\n"
                    + "David López V \n"
                    + "\n"
                    + "Jonathan DeFreitas");
            txtAreaCredits.setFont(new Font("Helvetica", Font.PLAIN, 14));
            txtAreaCredits.setForeground(Color.black);
            txtAreaCredits.setBounds(20, 50, 360, 380);
            txtAreaCredits.enable(false);
            container.add(txtAreaCredits);

            btnBackHome = new JButton("Regresar");
            btnBackHome.addActionListener(this);
            btnBackHome.setBounds(270, 440, 120, 25);
            btnBackHome.setBackground(Color.black);
            btnBackHome.setForeground(Color.white);
            btnBackHome.setFont(new Font("Helvetica", Font.PLAIN, 15));
            container.add(btnBackHome);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == btnBackHome) {

                this.setVisible(false);
                SudokuSourceInterface SudokuHome;
                SudokuHome = new SudokuSourceInterface();
                //Declara el tamaño de la pantalla
                SudokuHome.setSize(600, 500);
                //Declara donde aparecera la ventana
                SudokuHome.setLocation(420, 150);

                //Permite quela ventana sea visible y que no se le pueda cambiar el tamaño 
                SudokuHome.setVisible(true);
                SudokuHome.setResizable(false);
            }
        }

    }

    public class GameWindow extends JFrame implements ActionListener {

        JLabel labelGame;
        JButton buttonNew, buttonPrevGame, buttonSave, buttonOut, buttonBack;
        JPanel whitePanel;

        private static final long serialVersionUID = 1L;

        final int rows = 9;
        final int columns = 9;

        public GameWindow() {

            super("Sudoku");
            final Container container = getContentPane();
            container.setVisible(true);
            container.setBackground(Color.black);
            container.setLayout(null);

            final JPanel guiPanel = new JPanel(new GridLayout(rows, columns));
            guiPanel.setBackground(Color.white);
            final JTextField[][] subPanels = new JTextField[rows][columns];
            guiPanel.setBounds(200, 0, 500, 500);
            container.add(guiPanel);

            Border outerBorder = BorderFactory.createLineBorder(Color.black, 2);
            Border innerBorder = BorderFactory.createLineBorder(Color.black, 1);
            guiPanel.setBorder(outerBorder);

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < columns; c++) {

                    subPanels[r][c] = new JTextField("");
                    subPanels[r][c].setForeground(Color.black);
                    subPanels[r][c].addActionListener(this);
                    subPanels[r][c].setFont(new Font("Helvetica", Font.BOLD, 30));

                    if ((r / 3 + c / 3) % 2 == 0) {

                        subPanels[r][c].setBackground(Color.lightGray);

                    } else {

                        subPanels[r][c].setBackground(Color.WHITE);

                    }

                    subPanels[r][c].setHorizontalAlignment(JTextField.CENTER);
                    subPanels[r][c].setBorder(innerBorder);
                    subPanels[r][c].setBorder(innerBorder);
                    guiPanel.add(subPanels[r][c]);

                }
            }

            final JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(null);
            buttonPanel.setBackground(Color.black);
            buttonPanel.setBounds(0, 0, 200, 500);

            buttonNew = new JButton("Nuevo juego");
            buttonNew.addActionListener(this);
            buttonNew.setBounds(15, 280, 150, 25);//Ubicacion y tamaño del boton
            buttonNew.setBackground(Color.black);//color del fondo del boton
            buttonNew.setForeground(Color.white);//color de la fuente del boton
            buttonNew.setFont(new Font("Helvetica", Font.PLAIN, 15));//fuente y tamaño
            buttonPanel.add(buttonNew);

            labelGame = new JLabel("Juego");
            labelGame.setFont(new Font("HACKED", Font.BOLD, 25));
            labelGame.setForeground(Color.white);
            labelGame.setBounds(25, 50, 100, 25);//Declara la ubicacion del label
            buttonPanel.add(labelGame);

            buttonSave = new JButton("Cargar Juego");
            buttonSave.addActionListener(this);
            buttonSave.setBounds(15, 210, 150, 25);
            buttonSave.setBackground(Color.black);
            buttonSave.setForeground(Color.white);
            buttonSave.setFont(new Font("Helvetica", Font.PLAIN, 15));
            buttonPanel.add(buttonSave);

            buttonPrevGame = new JButton("Guardar juego");
            buttonPrevGame.addActionListener(this);
            buttonPrevGame.setBounds(15, 135, 150, 25);
            buttonPrevGame.setBackground(Color.black);
            buttonPrevGame.setForeground(Color.white);
            buttonPrevGame.setFont(new Font("Helvetica", Font.PLAIN, 15));
            buttonPanel.add(buttonPrevGame);

            buttonOut = new JButton("Salir");
            buttonOut.addActionListener(this);
            buttonOut.setBounds(15, 420, 150, 25);
            buttonOut.setBackground(Color.black);
            buttonOut.setForeground(Color.white);
            buttonOut.setFont(new Font("Helvetica", Font.PLAIN, 15));
            buttonPanel.add(buttonOut);

            buttonBack = new JButton("Atras");
            buttonBack.addActionListener(this);
            buttonBack.setBounds(15, 350, 150, 25);
            buttonBack.setBackground(Color.black);
            buttonBack.setForeground(Color.white);
            buttonBack.setFont(new Font("Helvetica", Font.PLAIN, 15));
            buttonPanel.add(buttonBack);

            Border LineBorder = new LineBorder(Color.lightGray);
            buttonPanel.setBorder(LineBorder);
            BoxLayout horizontal = new BoxLayout(buttonPanel, BoxLayout.X_AXIS);
            buttonPanel.setLayout(horizontal);
            FlowLayout flow = new FlowLayout();
            buttonPanel.setLayout(null);
            container.add(buttonPanel);

            ///////////////////Logic starts here///////////////////////////////////
            int sudokuGame = (int) (Math.random() * (15 - 11) + 1);

            switch (sudokuGame) {

                case 1:

                    //sudoku 1
                    int[][] sudokuOne = {{6, 9, 3, 8, 7, 4, 2, 5, 1},
                    {5, 8, 4, 1, 6, 2, 7, 9, 3},
                    {7, 1, 2, 9, 5, 3, 8, 6, 4},
                    {1, 4, 5, 3, 8, 7, 6, 2, 9},
                    {8, 2, 6, 5, 4, 9, 3, 1, 7},
                    {9, 3, 7, 6, 2, 1, 5, 4, 8},
                    {4, 6, 1, 2, 3, 8, 9, 7, 5},
                    {3, 5, 9, 7, 1, 6, 4, 8, 2},
                    {2, 7, 8, 4, 9, 5, 1, 3, 6}};

                    /*show this {6,9,2,1}
                       {4,2,7}
                       {1,9,6}
                       {1,7,3,8,7,6}
                       {8,4,7}
                       {7,6,2,1,5,8}
                       {6,8,7}
                       {9,7,4}
                       {2,8,3,6}
                     */
                    break;
                case 2:

                    //sudoku 2
                    int[][] sudokuTwo = {{2, 8, 4, 5, 1, 7, 9, 6, 3},
                    {6, 1, 9, 2, 8, 3, 4, 5, 7},
                    {5, 3, 7, 4, 6, 9, 2, 8, 1},
                    {3, 6, 2, 9, 7, 8, 5, 1, 4},
                    {7, 9, 5, 3, 4, 1, 8, 2, 6},
                    {1, 4, 8, 6, 5, 2, 3, 7, 9},
                    {9, 5, 3, 7, 2, 6, 1, 4, 8},
                    {8, 2, 6, 1, 3, 4, 7, 9, 5},
                    {4, 7, 1, 8, 9, 5, 6, 3, 2}};

                    /* show this {2,5,7,9,3}
                        {8,5}
                        {7,4,9,2,8}
                        {2,5,1}
                        {7,3,1,6}
                        {4,8,3}
                        {5,3,7,6,1}
                        {2,3}
                        {4,1,8,5,2} 
                     */
                    break;
                case 3:

                    //sudoku 3
                    int[][] sudokuThree = {{2, 1, 5, 4, 7, 8, 3, 6, 9},
                    {9, 3, 4, 2, 6, 1, 5, 7, 8},
                    {6, 7, 8, 9, 3, 5, 2, 1, 4},
                    {4, 6, 2, 5, 1, 3, 8, 9, 7},
                    {3, 8, 1, 7, 9, 6, 4, 5, 2},
                    {7, 5, 9, 8, 2, 4, 1, 3, 6},
                    {1, 9, 3, 6, 8, 2, 7, 4, 5},
                    {8, 4, 7, 3, 5, 9, 6, 2, 1},
                    {5, 2, 6, 1, 4, 7, 9, 8, 3}};

                    /*show this {2,1,4,8,6}
                       {9,6,8}
                       {7,8,9}
                       {4,6,1,9,7}
                       {1,4}
                       {7,5,2,3,6}
                       {2,7,4}
                       {8,5,1}
                       {2,1,7,8,3}
                     */
                    break;

                case 4:
                    //Me cago en el scrum master
                    int[][] sudokuFour = {{8, 7, 4, 3, 2, 9, 6, 1, 5},
                    {1, 6, 3, 5, 7, 8, 2, 9, 4},
                    {9, 5, 2, 1, 4, 6, 7, 3, 8},
                    {5, 9, 1, 8, 6, 4, 3, 7, 2},
                    {3, 4, 6, 2, 1, 7, 5, 8, 9},
                    {7, 2, 8, 9, 5, 3, 1, 4, 6},
                    {6, 3, 7, 4, 9, 5, 8, 2, 1},
                    {2, 8, 9, 6, 3, 1, 4, 5, 7},
                    {4, 1, 5, 7, 8, 2, 9, 6, 3}};

                    /*show this {}
                        {3,6}
                        {8,2}
                        {9,4,7,3} 
                        {6,7}
                        {3,4,8,9}
                        {2,5}
                        {3,7,9,1}
                        {9,6}
                        {5,2}
                     */
                    break;
            }

            ///////////////////Logic Ends here///////////////////////////////////////
        }

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == buttonBack) {

                this.setVisible(false);
                SudokuSourceInterface SudokuHome;
                SudokuHome = new SudokuSourceInterface();
                //Declara el tamaño de la pantalla
                SudokuHome.setSize(600, 500);
                //Declara donde aparecera la ventana
                SudokuHome.setLocation(420, 150);

                //Permite quela ventana sea visible y que no se le pueda cambiar el tamaño 
                SudokuHome.setVisible(true);
                SudokuHome.setResizable(false);

            }

            if (ae.getSource() == buttonOut) {

                System.exit(0);

            }
        }
    }

    public class SudokuHowToPlay extends JFrame implements ActionListener {

        JButton btnGoBack, sudokuBtn;
        JLabel guideLabel;
        JTextArea txtAHowTo;
        JFrame frame;

        public SudokuHowToPlay() {

            super("Cómo jugar");
            Container container = getContentPane();
            container.setBackground(Color.black);
            container.setLayout(null);

            guideLabel = new JLabel("¿Como jugar?");
            guideLabel.setFont(new Font("HACKED", Font.BOLD, 25));
            guideLabel.setForeground(Color.white);
            guideLabel.setBounds(20, 10, 200, 25);
            container.add(guideLabel);

            txtAHowTo = new JTextArea("Reglas del Sudoku: \n"
                    + "\n"
                    + "     No se trata de sumar nada con los números, ni que \n éstos tengan un orden lógico sino que jugamos con los \n números como si fueran  piezas de un puzzle, sin \n repetir ninguna ni en horizontal ni vertical, ni en las \n cajas de 3x3. \n");

            txtAHowTo.setFont(new Font("Helvetica", Font.PLAIN, 14));
            txtAHowTo.setForeground(Color.black);
            txtAHowTo.setBounds(20, 50, 360, 330);
            txtAHowTo.enable(false);
            container.add(txtAHowTo);

            btnGoBack = new JButton("Regresar");
            btnGoBack.addActionListener(this);
            btnGoBack.setBounds(270, 390, 120, 25);
            btnGoBack.setBackground(Color.black);
            btnGoBack.setForeground(Color.white);
            btnGoBack.setFont(new Font("Crimes Times Six", Font.PLAIN, 15));
            container.add(btnGoBack);

        }

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == btnGoBack) {
                this.setVisible(false);
                SudokuSourceInterface SudokuHome;
                SudokuHome = new SudokuSourceInterface();
                //Declara el tamaño de la pantalla
                SudokuHome.setSize(600, 500);
                //Declara donde aparecera la ventana
                SudokuHome.setLocation(420, 150);

                //Permite quela ventana sea visible y que no se le pueda cambiar el tamaño 
                SudokuHome.setVisible(true);
                SudokuHome.setResizable(false);

            }

        }

    }

    public static void main(String[] args) {

        //muestra la ventana y sus componentes
        SudokuSourceInterface application = new SudokuSourceInterface();
        application.addWindowListener(new WindowAdapter() {

            //esto es para que la ventana se cierre
            @Override
            public void windowClosing(WindowEvent e) {

                System.exit(0);
            }
        });

        //Declara el tamaño de la pantalla
        application.setSize(600, 500);
        //Declara donde aparecera la ventana
        application.setLocation(420, 150);

        //Permite quela ventana sea visible y que no se le pueda cambiar el tamaño 
        application.setVisible(true);
        application.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonOut) {

            System.exit(0);

        }

        if ((e.getSource() == buttonCredits) || (e.getSource() == creditsBar)) {
            this.setVisible(false);
            SudokuCredits creditsWindow;
            creditsWindow = new SudokuCredits();
            //Declara el tamaño de la pantalla
            creditsWindow.setSize(400, 500);
            //Declara donde aparecera la ventana
            creditsWindow.setLocation(420, 150);

            //Permite quela ventana sea visible y que no se le pueda cambiar el tamaño 
            creditsWindow.setVisible(true);
            creditsWindow.setResizable(false);

            if (e.getSource() == btnBackHome) {

                this.creditsWindow.hide();

            }

        }

        if ((e.getSource() == buttonNew) || (e.getSource() == newInBar)) {

            this.setVisible(false);
            GameWindow SudokuGame;
            SudokuGame = new GameWindow();
            //Declara el tamaño de la pantalla
            SudokuGame.setSize(706, 529);
            //Declara donde aparecera la ventana
            SudokuGame.setLocation(420, 150);
            //Permite quela ventana sea visible y que no se le pueda cambiar el tamaño 
            SudokuGame.setVisible(true);
            SudokuGame.setResizable(false);

        }

        if ((e.getSource() == buttonHowToPlay) || (e.getSource() == howToBar)) {
            this.setVisible(false);
            SudokuHowToPlay howTopPlay;
            howTopPlay = new SudokuHowToPlay();

            //Declara el tamaño de la pantalla
            howTopPlay.setSize(400, 450);
            //Declara donde aparecera la ventana
            howTopPlay.setLocation(420, 150);

            //Permite quela ventana sea visible y que no se le pueda cambiar el tamaño 
            howTopPlay.setVisible(true);
            howTopPlay.setResizable(false);



        }
    }

}
