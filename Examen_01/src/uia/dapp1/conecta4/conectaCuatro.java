package uia.dapp1.conecta4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class conectaCuatro extends JFrame {
    private JButton columna1Button;
    private JButton columna2Button;
    private JButton columna3Button;
    private JButton columna4Button;
    private JButton columna5Button;
    private JButton columna6Button;
    private JButton columna7Button;
    private JButton buttonposicion60;
    private JButton buttonposicion61;
    private JButton buttonposicion62;
    private JButton buttonposicion63;
    private JButton buttonposicion64;
    private JButton buttonposicion65;
    private JButton buttonposicion66;
    private JButton buttonposicion50;
    private JButton buttonposicion40;
    private JButton buttonposicion30;
    private JButton buttonposicion20;
    private JButton buttonposicion10;
    private JButton buttonposicion00;
    private JButton buttonposicion51;
    private JButton buttonposicion52;
    private JButton buttonposicion53;
    private JButton buttonposicion54;
    private JButton buttonposicion55;
    private JButton buttonposicion56;
    private JButton buttonposicion46;
    private JButton buttonposicion36;
    private JButton buttonposicion26;
    private JButton buttonposicion16;
    private JButton buttonposicion06;
    private JButton buttonposicion05;
    private JButton buttonposicion04;
    private JButton buttonposicion03;
    private JButton buttonposicion02;
    private JButton buttonposicion01;
    private JButton buttonposicion11;
    private JButton buttonposicion12;
    private JButton buttonposicion13;
    private JButton buttonposicion14;
    private JButton buttonposicion15;
    private JButton buttonposicion25;
    private JButton buttonposicion35;
    private JButton buttonposicion45;
    private JButton buttonposicion34;
    private JButton buttonposicion24;
    private JButton buttonposicion44;
    private JButton buttonposicion33;
    private JButton buttonposicion23;
    private JButton buttonposicion43;
    private JButton buttonposicion22;
    private JButton buttonposicion32;
    private JButton buttonposicion42;
    private JButton buttonposicion31;
    private JButton buttonposicion21;
    private JButton buttonposicion41;
    private JPanel panelprincipal;
    private JTextField textVictoriasRojo;
    private JTextField textVictoriasazul;
    private JTextField textEmpates;
    private JButton reiniciarButton;
    private int victoriasRojo =0;
    private int victoriasazul =0;
    private int empatess =0;
    private String turno = "usuario1";
    private boolean casilla[][] = new boolean[7][7];
    private int matriz[][] = new int[7][7];

    public conectaCuatro() {
        dibujarcolumnas(turno);
        llenarcasillas();
        inicializarmatriz();
        acciones();

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("conectaCuatro");
        frame.setContentPane(new conectaCuatro().panelprincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private void comprobarganador(){
        boolean ganador1 = false;// se inicializan en false
        boolean ganador2 = false;
        int empate = 0;
        for (int i = 0; i < 7 ; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        ganador1 = comprobar(1);//se manda un 1 en las casillas del jugador 1
        ganador2 = comprobar(2);//se manda un 2 en las casillas del jugador 2
        if (ganador1 == true){//despues de comprobar si regresa un true el jugador 1 gana
            JOptionPane.showMessageDialog(null, "¡¡¡¡¡¡¡¡ GANO FICHA ROJA !!!!!!!!");
            reiniciar();
            victoriasRojo++;
            textVictoriasRojo.setText(String.valueOf(victoriasRojo));
        }else if(ganador2 == true){// si no el jugador 2 gana
            JOptionPane.showMessageDialog(null, "¡¡¡¡¡¡¡¡ GANO FICHA AZUL !!!!!!!!");
            reiniciar();
            victoriasazul++;
            textVictoriasazul.setText(String.valueOf(victoriasazul));

        }
        else{//si no gano ninguno de los jugadores hay empate
            for (int i = 0; i < 7 ; i++) {
                for (int j = 0; j < 7; j++) {
                    if (matriz[i][j]!= 0){//si cada posicion es diferente de 0 y aun no hay un ganador
                        empate++;
                    }
                }
            }
            if (empate == 49){//49 igual al total de casillas
                JOptionPane.showMessageDialog(null, "¡¡¡¡¡¡¡¡ EMPATE !!!!!!!!");
                reiniciar();
                empatess++;
                textEmpates.setText(String.valueOf(empatess));
            }else{
                empate = 0;
            }
        }

    }
    private void llenarcasillas(){
        for (int i = 0; i < 7 ; i++) {
            for (int j = 0; j < 7; j++) {
                casilla[i][j] = true;// se llenan todas las casillas en true que significa que aun no esta ocupada
            }
        }
    }
    private void inicializarmatriz(){
        for (int i = 0; i < 7 ; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = 0;// se inicializa la matriz en 0 y se iran llenando con 1 o 2 durante el juego
            }
        }
    }
    private void reiniciar(){
        llenarcasillas();
        inicializarmatriz();
        limpiarbotones();
    }
    private void limpiarbotones() {

        buttonposicion60.setBackground(Color.white);
        buttonposicion61.setBackground(Color.white);
        buttonposicion62.setBackground(Color.white);
        buttonposicion63.setBackground(Color.white);
        buttonposicion64.setBackground(Color.white);
        buttonposicion65.setBackground(Color.white);
        buttonposicion66.setBackground(Color.white);
        buttonposicion50.setBackground(Color.white);
        buttonposicion40.setBackground(Color.white);
        buttonposicion30.setBackground(Color.white);
        buttonposicion20.setBackground(Color.white);
        buttonposicion10.setBackground(Color.white);
        buttonposicion00.setBackground(Color.white);
        buttonposicion51.setBackground(Color.white);
        buttonposicion52.setBackground(Color.white);
        buttonposicion53.setBackground(Color.white);
        buttonposicion54.setBackground(Color.white);
        buttonposicion55.setBackground(Color.white);
        buttonposicion56.setBackground(Color.white);
        buttonposicion46.setBackground(Color.white);
        buttonposicion36.setBackground(Color.white);
        buttonposicion26.setBackground(Color.white);
        buttonposicion16.setBackground(Color.white);
        buttonposicion06.setBackground(Color.white);
        buttonposicion05.setBackground(Color.white);
        buttonposicion04.setBackground(Color.white);
        buttonposicion03.setBackground(Color.white);
        buttonposicion02.setBackground(Color.white);
        buttonposicion01.setBackground(Color.white);
        buttonposicion11.setBackground(Color.white);
        buttonposicion12.setBackground(Color.white);
        buttonposicion13.setBackground(Color.white);
        buttonposicion14.setBackground(Color.white);
        buttonposicion15.setBackground(Color.white);
        buttonposicion25.setBackground(Color.white);
        buttonposicion35.setBackground(Color.white);
        buttonposicion45.setBackground(Color.white);
        buttonposicion34.setBackground(Color.white);
        buttonposicion24.setBackground(Color.white);
        buttonposicion44.setBackground(Color.white);
        buttonposicion33.setBackground(Color.white);
        buttonposicion23.setBackground(Color.white);
        buttonposicion43.setBackground(Color.white);
        buttonposicion22.setBackground(Color.white);
        buttonposicion32.setBackground(Color.white);
        buttonposicion42.setBackground(Color.white);
        buttonposicion31.setBackground(Color.white);
        buttonposicion21.setBackground(Color.white);
        buttonposicion41.setBackground(Color.white);
    }
    private void dibujarcolumnas(String turno1){//cada turno del jugador  pinta los botones inferiores de color correspiente
        if (turno1.equals("usuario1")){ //se comprueba el turno del jugador
            columna1Button.setBackground(Color.red);
            columna2Button.setBackground(Color.red);
            columna3Button.setBackground(Color.red);
            columna4Button.setBackground(Color.red);
            columna5Button.setBackground(Color.red);
            columna6Button.setBackground(Color.red);
            columna7Button.setBackground(Color.red);
        }else if (turno1.equals("usuario2")){
            columna1Button.setBackground(Color.blue);//cada turno del jugador 2 pinta el boton de azul
            columna2Button.setBackground(Color.blue);
            columna3Button.setBackground(Color.blue);
            columna4Button.setBackground(Color.blue);
            columna5Button.setBackground(Color.blue);
            columna6Button.setBackground(Color.blue);
            columna7Button.setBackground(Color.blue);
        }
    }
    private void dibujarrojo(JButton botn){
        botn.setBackground(Color.red);
        //botn.setIcon(new ImageIcon(getClass().getResource("/imagenes/OIP.jpg")));
    }
    private void dibujarazul(JButton botn){
        botn.setBackground(Color.blue);
    }
    private boolean comprobar(int num){
        boolean ganador = false;
        //comprobamos si hay ganador en la columna1
        if (matriz[6][0] == num && matriz[5][0] == num &&matriz[4][0] == num && matriz[3][0] == num ){
            ganador = true;
        } else if (matriz[5][0] == num && matriz[4][0] == num &&matriz[3][0] == num && matriz[2][0] == num ){
            ganador = true;
        }
        else if (matriz[4][0] == num && matriz[3][0] == num &&matriz[2][0] == num && matriz[1][0] == num ){
            ganador = true;
        }
        else if (matriz[3][0] == num && matriz[2][0] == num &&matriz[1][0] == num && matriz[0][0] == num ){
            ganador = true;
        }
        //////////////////////////////////////////////////////////////////////
        //COMPROBAMOS EN LA COLUMNA 2
        else if (matriz[6][1] == num && matriz[5][1] == num &&matriz[4][1] == num && matriz[3][1] == num ){
            ganador = true;
        } else if (matriz[5][1] == num && matriz[4][1] == num &&matriz[3][1] == num && matriz[2][1] == num ){
            ganador = true;
        }
        else if (matriz[4][1] == num && matriz[3][1] == num &&matriz[2][1] == num && matriz[1][1] == num ){
            ganador = true;
        }
        else if (matriz[3][1] == num && matriz[2][1] == num &&matriz[1][1] == num && matriz[0][1] == num ){
            ganador = true;
        }
        ///////////////////////////////////////////////////////////////////////
        //COMPROBAMOS EN LA COLUMNA 3
        else if (matriz[6][2] == num && matriz[5][2] == num &&matriz[4][2] == num && matriz[3][2] == num ){
            ganador = true;
        } else if (matriz[5][2] == num && matriz[4][2] == num &&matriz[3][2] == num && matriz[2][2] == num ){
            ganador = true;
        }
        else if (matriz[4][2] == num && matriz[3][2] == num &&matriz[2][2] == num && matriz[1][2] == num ){
            ganador = true;
        }
        else if (matriz[3][2] == num && matriz[2][2] == num &&matriz[1][2] == num && matriz[0][2] == num ){
            ganador = true;
        }
        ///////////////////////////////////////////////////////////////////////
        //COMPROBAMOS EN LA COLUMNA 4
        else if (matriz[6][3] == num && matriz[5][3] == num &&matriz[4][3] == num && matriz[3][3] == num ){
            ganador = true;
        } else if (matriz[5][3] == num && matriz[4][3] == num &&matriz[3][3] == num && matriz[2][3] == num ){
            ganador = true;
        }
        else if (matriz[4][3] == num && matriz[3][3] == num &&matriz[2][3] == num && matriz[1][3] == num ){
            ganador = true;
        }
        else if (matriz[3][3] == num && matriz[2][3] == num &&matriz[1][3] == num && matriz[0][3] == num ){
            ganador = true;
        }
        ///////////////////////////////////////////////////////////////////////
        //COMPROBAMOS EN LA COLUMNA 5
        else if (matriz[6][4] == num && matriz[5][4] == num &&matriz[4][4] == num && matriz[3][4] == num ){
            ganador = true;
        } else if (matriz[5][4] == num && matriz[4][4] == num &&matriz[3][4] == num && matriz[2][4] == num ){
            ganador = true;
        }
        else if (matriz[4][4] == num && matriz[3][4] == num &&matriz[2][4] == num && matriz[1][4] == num ){
            ganador = true;
        }
        else if (matriz[3][4] == num && matriz[2][4] == num &&matriz[1][4] == num && matriz[0][4] == num ){
            ganador = true;
        }
        ///////////////////////////////////////////////////////////////////////
        //COMPROBAMOS EN LA COLUMNA 6
        else if (matriz[6][5] == num && matriz[5][5] == num &&matriz[4][5] == num && matriz[3][5] == num ){
            ganador = true;
        } else if (matriz[5][5] == num && matriz[4][5] == num &&matriz[3][5] == num && matriz[2][5] == num ){
            ganador = true;
        }
        else if (matriz[4][5] == num && matriz[3][5] == num &&matriz[2][5] == num && matriz[1][5] == num ){
            ganador = true;
        }
        else if (matriz[3][5] == num && matriz[2][5] == num &&matriz[1][5] == num && matriz[0][5] == num ){
            ganador = true;
        }
        ///////////////////////////////////////////////////////////////////////
        //COMPROBAMOS EN LA COLUMNA 7
        else if (matriz[6][6] == num && matriz[5][6] == num &&matriz[4][6] == num && matriz[3][6] == num ){
            ganador = true;
        } else if (matriz[5][6] == num && matriz[4][6] == num &&matriz[3][6] == num && matriz[2][6] == num ){
            ganador = true;
        }
        else if (matriz[4][6] == num && matriz[3][6] == num &&matriz[2][6] == num && matriz[1][6] == num ){
            ganador = true;
        }
        else if (matriz[3][6] == num && matriz[2][6] == num &&matriz[1][6] == num && matriz[0][6] == num ){
            ganador = true;
        }
        ////////////////////////////////////////////////////////////////////////
        //AHORA SE EVALUARAN FILAS
        ////////////////////////////////////////////////////////////////////////
        //COMPROBAMOS FILA 1
        else if (matriz[6][0] == num && matriz[6][1] == num &&matriz[6][2] == num && matriz[6][3] == num ){
            ganador = true;
        } else if (matriz[6][1] == num && matriz[6][2] == num &&matriz[6][3] == num && matriz[6][4] == num ){
            ganador = true;
        }
        else if (matriz[6][2] == num && matriz[6][3] == num &&matriz[6][4] == num && matriz[6][5] == num ){
            ganador = true;
        }
        else if (matriz[6][3] == num && matriz[6][4] == num &&matriz[6][5] == num && matriz[6][6] == num ){
            ganador = true;
        }
        ////////////////////////////////////////////////////////////////////////
        //COMPROBAMOS FILA 2
        else if (matriz[5][0] == num && matriz[5][1] == num &&matriz[5][2] == num && matriz[5][3] == num ){
            ganador = true;
        } else if (matriz[5][1] == num && matriz[5][2] == num &&matriz[5][3] == num && matriz[5][4] == num ){
            ganador = true;
        }
        else if (matriz[5][2] == num && matriz[5][3] == num &&matriz[5][4] == num && matriz[5][5] == num ){
            ganador = true;
        }
        else if (matriz[5][3] == num && matriz[5][4] == num &&matriz[5][5] == num && matriz[5][6] == num ){
            ganador = true;
        }
        ////////////////////////////////////////////////////////////////////////
        //COMPROBAMOS FILA 3
        else if (matriz[4][0] == num && matriz[4][1] == num &&matriz[4][2] == num && matriz[4][3] == num ){
            ganador = true;
        } else if (matriz[4][1] == num && matriz[4][2] == num &&matriz[4][3] == num && matriz[4][4] == num ){
            ganador = true;
        }
        else if (matriz[4][2] == num && matriz[4][3] == num &&matriz[4][4] == num && matriz[4][5] == num ){
            ganador = true;
        }
        else if (matriz[4][3] == num && matriz[4][4] == num &&matriz[4][5] == num && matriz[4][6] == num ){
            ganador = true;
        }
        ////////////////////////////////////////////////////////////////////////
        //COMPROBAMOS FILA 4
        else if (matriz[3][0] == num && matriz[3][1] == num &&matriz[3][2] == num && matriz[3][3] == num ){
            ganador = true;
        } else if (matriz[3][1] == num && matriz[3][2] == num &&matriz[3][3] == num && matriz[3][4] == num ){
            ganador = true;
        }
        else if (matriz[3][2] == num && matriz[3][3] == num &&matriz[3][4] == num && matriz[3][5] == num ){
            ganador = true;
        }
        else if (matriz[3][3] == num && matriz[3][4] == num &&matriz[3][5] == num && matriz[3][6] == num ){
            ganador = true;
        }
        ////////////////////////////////////////////////////////////////////////
        //COMPROBAMOS FILA 5
        else if (matriz[2][0] == num && matriz[2][1] == num &&matriz[2][2] == num && matriz[2][3] == num ){
            ganador = true;
        } else if (matriz[2][1] == num && matriz[2][2] == num &&matriz[2][3] == num && matriz[2][4] == num ){
            ganador = true;
        }
        else if (matriz[2][2] == num && matriz[2][3] == num &&matriz[2][4] == num && matriz[2][5] == num ){
            ganador = true;
        }
        else if (matriz[2][3] == num && matriz[2][4] == num &&matriz[2][5] == num && matriz[2][6] == num ){
            ganador = true;
        }
        ////////////////////////////////////////////////////////////////////////
        //COMPROBAMOS FILA 6
        else if (matriz[1][0] == num && matriz[1][1] == num &&matriz[1][2] == num && matriz[1][3] == num ){
            ganador = true;
        } else if (matriz[1][1] == num && matriz[1][2] == num &&matriz[1][3] == num && matriz[1][4] == num ){
            ganador = true;
        }
        else if (matriz[1][2] == num && matriz[1][3] == num &&matriz[1][4] == num && matriz[1][5] == num ){
            ganador = true;
        }
        else if (matriz[1][3] == num && matriz[1][4] == num &&matriz[1][5] == num && matriz[1][6] == num ){
            ganador = true;
        }//COMPROBAMOS FILA 7
        else if (matriz[0][0] == num && matriz[0][1] == num &&matriz[0][2] == num && matriz[0][3] == num ){
            ganador = true;
        } else if (matriz[0][1] == num && matriz[0][2] == num &&matriz[0][3] == num && matriz[0][4] == num ){
            ganador = true;
        }
        else if (matriz[0][2] == num && matriz[0][3] == num &&matriz[0][4] == num && matriz[0][5] == num ){
            ganador = true;
        }
        else if (matriz[0][3] == num && matriz[0][4] == num &&matriz[0][5] == num && matriz[0][6] == num ){
            ganador = true;
        }
        ////////////////////////////////////////////////////////////////////////
        //AHORA SE EVALUARAN DIAGONALES
        ////////////////////////////////////////////////////////////////////////
        else if (matriz[3][0] == num && matriz[2][1] == num &&matriz[1][2] == num && matriz[0][3] == num ){
            ganador = true;
        } else if (matriz[4][0] == num && matriz[3][1] == num &&matriz[2][2] == num && matriz[1][3] == num ){
            ganador = true;
        }
        else if (matriz[3][1] == num && matriz[2][2] == num &&matriz[1][3] == num && matriz[0][4] == num ){
            ganador = true;
        }
        else if (matriz[5][0] == num && matriz[4][1] == num &&matriz[3][2] == num && matriz[2][3] == num ){
            ganador = true;
        }
        else if (matriz[4][1] == num && matriz[3][2] == num &&matriz[2][3] == num && matriz[1][4] == num ){
            ganador = true;
        } else if (matriz[3][2] == num && matriz[2][3] == num &&matriz[1][4] == num && matriz[0][5] == num ){
            ganador = true;
        }
        else if (matriz[6][0] == num && matriz[5][1] == num &&matriz[4][2] == num && matriz[3][3] == num ){
            ganador = true;
        }
        else if (matriz[5][1] == num && matriz[4][2] == num &&matriz[3][3] == num && matriz[2][4] == num ){
            ganador = true;
        }
        else if (matriz[4][2] == num && matriz[3][3] == num &&matriz[2][4] == num && matriz[1][5] == num ){
            ganador = true;
        }
        else if (matriz[3][3] == num && matriz[2][4] == num &&matriz[1][5] == num && matriz[0][6] == num ){
            ganador = true;
        }
        else if (matriz[6][1] == num && matriz[5][2] == num &&matriz[4][3] == num && matriz[3][4] == num ){
            ganador = true;
        } else if (matriz[5][2] == num && matriz[4][3] == num &&matriz[3][4] == num && matriz[2][5] == num ){
            ganador = true;
        }
        else if (matriz[4][3] == num && matriz[3][4] == num &&matriz[2][5] == num && matriz[1][6] == num ){
            ganador = true;
        }
        else if (matriz[6][2] == num && matriz[5][3] == num &&matriz[4][4] == num && matriz[3][5] == num ){
            ganador = true;
        }
        else if (matriz[5][3] == num && matriz[4][4] == num &&matriz[3][5] == num && matriz[2][6] == num ){
            ganador = true;
        }
        else if (matriz[6][3] == num && matriz[5][4] == num &&matriz[4][5] == num && matriz[3][6] == num ){
            ganador = true;
        }
        ////////////////////////////////////////////////////////////////////////
        //AHORA SE EVALUARAN LAS OTRAS DIAGONALES
        ////////////////////////////////////////////////////////////////////////
        else if (matriz[3][6] == num && matriz[2][5] == num &&matriz[1][4] == num && matriz[0][3] == num ){
            ganador = true;
        } else if (matriz[4][6] == num && matriz[3][5] == num &&matriz[2][4] == num && matriz[1][3] == num ){
            ganador = true;
        }
        else if (matriz[3][5] == num && matriz[2][4] == num &&matriz[1][3] == num && matriz[0][2] == num ){
            ganador = true;
        }
        else if (matriz[5][6] == num && matriz[4][5] == num &&matriz[3][4] == num && matriz[2][3] == num ){
            ganador = true;
        }
        else if (matriz[4][5] == num && matriz[3][4] == num &&matriz[2][3] == num && matriz[1][2] == num ){
            ganador = true;
        } else if (matriz[3][4] == num && matriz[2][3] == num &&matriz[1][2] == num && matriz[0][1] == num ){
            ganador = true;
        }
        else if (matriz[6][6] == num && matriz[5][5] == num &&matriz[4][4] == num && matriz[3][3] == num ){
            ganador = true;
        }
        else if (matriz[5][5] == num && matriz[4][4] == num &&matriz[3][3] == num && matriz[2][2] == num ){
            ganador = true;
        }
        else if (matriz[4][4] == num && matriz[3][3] == num &&matriz[2][2] == num && matriz[1][1] == num ){
            ganador = true;
        }
        else if (matriz[3][3] == num && matriz[2][2] == num &&matriz[1][1] == num && matriz[0][0] == num ){
            ganador = true;
        }
        else if (matriz[6][5] == num && matriz[5][4] == num &&matriz[4][3] == num && matriz[3][2] == num ){
            ganador = true;
        } else if (matriz[5][4] == num && matriz[4][3] == num &&matriz[3][2] == num && matriz[2][1] == num ){
            ganador = true;
        }
        else if (matriz[4][3] == num && matriz[3][2] == num &&matriz[2][1] == num && matriz[1][0] == num ){
            ganador = true;
        }
        else if (matriz[6][4] == num && matriz[5][3] == num &&matriz[4][2] == num && matriz[3][1] == num ){
            ganador = true;
        }
        else if (matriz[5][3] == num && matriz[4][2] == num &&matriz[3][1] == num && matriz[2][0] == num ){
            ganador = true;
        }
        else if (matriz[6][3] == num && matriz[5][2] == num &&matriz[4][1] == num && matriz[3][0] == num ){
            ganador = true;
        }
        return ganador;
    }

    private void acciones(){
        columna1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (casilla[6][0] == true) {// si esta en true, aun no se utiliza
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario

                        dibujarrojo(buttonposicion60);
                        matriz[6][0] = 1;
                        turno = "usuario2";
                    } else {//turno del usuario 2
                        if (turno.equals("usuario2")) {

                            dibujarazul(buttonposicion60);
                            turno = "usuario1";
                            matriz[6][0] = 2;
                        }
                    }
                    casilla[6][0] = false;

                }else if(casilla[5][0] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion50);
                        turno = "usuario2";
                        matriz[5][0] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion50);
                        turno = "usuario1";
                        matriz[5][0] = 2;
                    }
                    casilla[5][0] = false;

                }else if(casilla[4][0] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion40);
                        turno = "usuario2";
                        matriz[4][0] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion40);
                        turno = "usuario1";
                        matriz[4][0] = 2;
                    }
                    casilla[4][0] = false;

                }else if(casilla[3][0] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion30);
                        turno = "usuario2";
                        matriz[3][0] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion30);
                        turno = "usuario1";
                        matriz[3][0] = 2;
                    }
                    casilla[3][0] = false;

                }else if(casilla[2][0] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion20);
                        turno = "usuario2";
                        matriz[2][0] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion20);
                        turno = "usuario1";
                        matriz[2][0] = 2;
                    }
                    casilla[2][0] = false;

                }else if(casilla[1][0]==true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion10);
                        turno = "usuario2";
                        matriz[1][0] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion10);
                        turno = "usuario1";
                        matriz[1][0] = 2;
                    }
                    casilla[1][0] = false;

                }else if(casilla[0][0] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion00);
                        turno = "usuario2";
                        matriz[0][0] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion00);
                        turno = "usuario1";
                        matriz[0][0] = 2;
                    }
                    casilla[0][0] = false;
                }else {
                    System.out.println("cilumna llena");
                }
                comprobarganador();
                dibujarcolumnas(turno);
            }

        });
        columna2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (casilla[6][1] == true) {
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion61);
                        turno = "usuario2";
                        matriz[6][1] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion61);
                        turno = "usuario1";
                        matriz[6][1] = 2;
                    }
                    casilla[6][1] = false;
                }else if(casilla[5][1] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion51);
                        turno = "usuario2";
                        matriz[5][1] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion51);
                        turno = "usuario1";
                        matriz[5][1] = 2;
                    }
                    casilla[5][1] = false;

                }else if(casilla[4][1] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion41);
                        turno = "usuario2";
                        matriz[4][1] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion41);
                        turno = "usuario1";
                        matriz[4][1] = 2;
                    }
                    casilla[4][1] = false;

                }else if(casilla[3][1] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion31);
                        turno = "usuario2";
                        matriz[3][1] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion31);
                        turno = "usuario1";
                        matriz[3][1] = 2;
                    }
                    casilla[3][1] = false;

                }else if(casilla[2][1] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion21);
                        turno = "usuario2";
                        matriz[2][1] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion21);
                        turno = "usuario1";
                        matriz[2][1] = 2;
                    }
                    casilla[2][1] = false;

                }else if(casilla[1][1]==true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion11);
                        turno = "usuario2";
                        matriz[1][1] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion11);
                        turno = "usuario1";
                        matriz[1][1] = 2;
                    }
                    casilla[1][1] = false;

                }else if(casilla[0][1] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion01);
                        turno = "usuario2";
                        matriz[0][1] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion01);
                        turno = "usuario1";
                        matriz[0][1] = 2;
                    }
                    casilla[0][1] = false;
                }else {
                    System.out.println("cilumna llena");
                }
                comprobarganador();
                dibujarcolumnas(turno);
            }
        });
        columna3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (casilla[6][2] == true) {
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion62);
                        turno = "usuario2";
                        matriz[6][2] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion62);
                        turno = "usuario1";
                        matriz[6][2] = 2;
                    }
                    casilla[6][2] = false;
                }else if(casilla[5][2] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion52);
                        turno = "usuario2";
                        matriz[5][2] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion52);
                        turno = "usuario1";
                        matriz[5][2] = 2;
                    }
                    casilla[5][2] = false;

                }else if(casilla[4][2] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion42);
                        turno = "usuario2";
                        matriz[4][2] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion42);
                        turno = "usuario1";
                        matriz[4][2] = 2;
                    }
                    casilla[4][2] = false;

                }else if(casilla[3][2] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion32);
                        turno = "usuario2";
                        matriz[3][2] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion32);
                        turno = "usuario1";
                        matriz[3][2] = 2;
                    }
                    casilla[3][2] = false;

                }else if(casilla[2][2] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion22);
                        turno = "usuario2";
                        matriz[2][2] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion22);
                        turno = "usuario1";
                        matriz[2][2] = 2;
                    }
                    casilla[2][2] = false;

                }else if(casilla[1][2]==true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion12);
                        turno = "usuario2";
                        matriz[1][2] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion12);
                        turno = "usuario1";
                        matriz[1][2] = 2;
                    }
                    casilla[1][2] = false;

                }else if(casilla[0][2] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion02);
                        turno = "usuario2";
                        matriz[0][2] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion02);
                        turno = "usuario1";
                        matriz[0][2] = 2;
                    }
                    casilla[0][2] = false;
                }else {
                    System.out.println("cilumna llena");
                }
                comprobarganador();
                dibujarcolumnas(turno);
            }
        });
        columna4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (casilla[6][3] == true) {
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion63);
                        turno = "usuario2";
                        matriz[6][3] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion63);
                        turno = "usuario1";
                        matriz[6][3] = 2;
                    }
                    casilla[6][3] = false;
                }else if(casilla[5][3] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion53);
                        turno = "usuario2";
                        matriz[5][3] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion53);
                        turno = "usuario1";
                        matriz[5][3] = 2;
                    }
                    casilla[5][3] = false;

                }else if(casilla[4][3] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion43);
                        turno = "usuario2";
                        matriz[4][3] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion43);
                        turno = "usuario1";
                        matriz[4][3] = 2;
                    }
                    casilla[4][3] = false;

                }else if(casilla[3][3] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion33);
                        turno = "usuario2";
                        matriz[3][3] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion33);
                        turno = "usuario1";
                        matriz[3][3] = 2;
                    }
                    casilla[3][3] = false;

                }else if(casilla[2][3] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion23);
                        turno = "usuario2";
                        matriz[2][3] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion23);
                        turno = "usuario1";
                        matriz[2][3] = 2;
                    }
                    casilla[2][3] = false;

                }else if(casilla[1][3]==true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion13);
                        turno = "usuario2";
                        matriz[1][3] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion13);
                        turno = "usuario1";
                        matriz[1][3] = 2;
                    }
                    casilla[1][3] = false;

                }else if(casilla[0][3] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion03);
                        turno = "usuario2";
                        matriz[0][3] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion03);
                        turno = "usuario1";
                        matriz[0][3] = 2;
                    }
                    casilla[0][3] = false;
                }else {
                    System.out.println("cilumna llena");
                }
                comprobarganador();
                dibujarcolumnas(turno);
            }
        });
        columna5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (casilla[6][4] == true) {
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion64);
                        matriz[6][4] = 1;
                        turno = "usuario2";
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion64);
                        turno = "usuario1";
                        matriz[6][4] = 2;
                    }
                    casilla[6][4] = false;
                }else if(casilla[5][4] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion54);
                        turno = "usuario2";
                        matriz[5][4] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion54);
                        turno = "usuario1";
                        matriz[5][4] = 2;
                    }
                    casilla[5][4] = false;

                }else if(casilla[4][4] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion44);
                        turno = "usuario2";
                        matriz[4][4] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion44);
                        turno = "usuario1";
                        matriz[4][4] = 2;
                    }
                    casilla[4][4] = false;

                }else if(casilla[3][4] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion34);
                        turno = "usuario2";
                        matriz[3][4] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion34);
                        turno = "usuario1";
                        matriz[3][4] = 2;
                    }
                    casilla[3][4] = false;

                }else if(casilla[2][4] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion24);
                        turno = "usuario2";
                        matriz[2][4] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion24);
                        turno = "usuario1";
                        matriz[2][4] = 2;
                    }
                    casilla[2][4] = false;

                }else if(casilla[1][4]==true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion14);
                        turno = "usuario2";
                        matriz[1][4] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion14);
                        turno = "usuario1";
                        matriz[1][4] = 2;
                    }
                    casilla[1][4] = false;

                }else if(casilla[0][4] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion04);
                        turno = "usuario2";
                        matriz[0][4] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion04);
                        turno = "usuario1";
                        matriz[0][4] = 2;
                    }
                    casilla[0][4] = false;
                }else {
                    System.out.println("cilumna llena");
                }
                comprobarganador();
                dibujarcolumnas(turno);
            }
        });
        columna6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (casilla[6][5] == true) {
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion65);
                        turno = "usuario2";
                        matriz[6][5] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion65);
                        turno = "usuario1";
                        matriz[6][5] = 2;
                    }
                    casilla[6][5] = false;
                }else if(casilla[5][5] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion55);
                        turno = "usuario2";
                        matriz[5][5] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion55);
                        turno = "usuario1";
                        matriz[5][5] = 2;
                    }
                    casilla[5][5] = false;

                }else if(casilla[4][5] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion45);
                        turno = "usuario2";
                        matriz[4][5] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion45);
                        turno = "usuario1";
                        matriz[4][5] =2;
                    }
                    casilla[4][5] = false;

                }else if(casilla[3][5] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion35);
                        turno = "usuario2";
                        matriz[3][5] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion35);
                        turno = "usuario1";
                        matriz[3][5] = 2;
                    }
                    casilla[3][5] = false;

                }else if(casilla[2][5] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion25);
                        turno = "usuario2";
                        matriz[2][5] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion25);
                        turno = "usuario1";
                        matriz[2][5] = 2;
                    }
                    casilla[2][5] = false;

                }else if(casilla[1][5]==true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion15);
                        turno = "usuario2";
                        matriz[1][5] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion15);
                        turno = "usuario1";
                        matriz[1][5] = 2;
                    }
                    casilla[1][5] = false;

                }else if(casilla[0][5] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion05);
                        turno = "usuario2";
                        matriz[0][5] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion05);
                        turno = "usuario1";
                        matriz[0][5] = 2;
                    }
                    casilla[0][5] = false;
                }else {
                    System.out.println("cilumna llena");
                }
                comprobarganador();
                dibujarcolumnas(turno);
            }
        });
        columna7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (casilla[6][6] == true) {
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion66);
                        turno = "usuario2";
                        matriz[6][6] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion66);
                        turno = "usuario1";
                        matriz[6][6] = 2;
                    }
                    casilla[6][6] = false;
                }else if(casilla[5][6] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion56);
                        turno = "usuario2";
                        matriz[5][6] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion56);
                        turno = "usuario1";
                        matriz[5][6] = 2;
                    }
                    casilla[5][6] = false;

                }else if(casilla[4][6] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion46);
                        turno = "usuario2";
                        matriz[4][6] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion46);
                        turno = "usuario1";
                        matriz[4][6] = 2;
                    }
                    casilla[4][6] = false;

                }else if(casilla[3][6] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion36);
                        turno = "usuario2";
                        matriz[3][6] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion36);
                        turno = "usuario1";
                        matriz[3][6] = 2;
                    }
                    casilla[3][6] = false;

                }else if(casilla[2][6] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion26);
                        turno = "usuario2";
                        matriz[2][6] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion26);
                        turno = "usuario1";
                        matriz[2][6] = 2;
                    }
                    casilla[2][6] = false;

                }else if(casilla[1][6]==true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion16);
                        turno = "usuario2";
                        matriz[1][6] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion16);
                        turno = "usuario1";
                        matriz[1][6] = 2;
                    }
                    casilla[1][6] = false;

                }else if(casilla[0][6] == true){
                    if (turno.equals("usuario1")) {//verificamos el turno del usuario 2
                        dibujarrojo(buttonposicion06);
                        turno = "usuario2";
                        matriz[0][6] = 1;
                    } else {//turno del usuario 2
                        dibujarazul(buttonposicion06);
                        turno = "usuario1";
                        matriz[0][6] = 2;
                    }
                    casilla[0][6] = false;
                }else {
                    System.out.println("cclumna llena");
                }
                comprobarganador();
                dibujarcolumnas(turno);
            }
        });
        reiniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciar();
                victoriasRojo =0;
                victoriasazul =0;
                empatess =0;
                textVictoriasRojo.setText(String.valueOf(victoriasRojo));
                textVictoriasazul.setText(String.valueOf(victoriasazul));
                textEmpates.setText(String.valueOf(empatess));
            }
        });
    }
}
