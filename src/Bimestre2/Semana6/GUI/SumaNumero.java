package Semana6.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumero {
    private JPanel PanelPrincipal;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JButton btn_sumar;
    private JLabel lbl_resultado;
    private JButton btn_dividir;
    private JButton btn_multiplicar;
    private JButton btn_restar;

    public SumaNumero() {
    btn_sumar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int suma = Integer.parseInt(txt_n1.getText())+ Integer.parseInt(txt_n2.getText());
        lbl_resultado.setText(String.valueOf(suma));
        }
    });
        btn_restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int restar = Integer.parseInt(txt_n1.getText())- Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(restar));
            }
        });
        btn_multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int multiplicar = Integer.parseInt(txt_n1.getText())* Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(multiplicar));
            }
        });
        btn_dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(txt_n1.getText());
                double n2 = Double.parseDouble(txt_n2.getText());
                if (n1 > n2) {
                    double dividir = n1 / n1;
                    lbl_resultado.setText(String.valueOf(dividir));
                }else {
                    String mensaje = "Incorrecto";
                    lbl_resultado.setText(String.valueOf(mensaje));
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio = new JFrame("Suma numero");
        inicio.setContentPane(new SumaNumero().PanelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
