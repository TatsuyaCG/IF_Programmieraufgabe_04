package programmieraufgabe;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{

    private JLabel lblVorname, lblNachname;
    private JLabel[] lblPasswort;
    private JTextField tfVorname, tfNachname;
    private JPasswordField[] pwfPasswort;
    private JButton btnErstellen;

    public Gui()  {

        setSize(400,400);
        setTitle("Deutsches Rotes Kreuz - Registieren");
        getContentPane().setLayout(null);

        lblVorname = new JLabel("Vorname:");
        lblVorname.setBounds(50, 50, 100, 25);
        getContentPane().add(lblVorname);

        lblNachname = new JLabel("Nachname:");
        lblNachname.setBounds(50, 100, 100, 25);
        getContentPane().add(lblNachname);
        
        tfVorname = new JTextField();
        tfVorname.setBounds(200, 50, 100, 25);
        getContentPane().add(tfVorname);

        tfNachname = new JTextField();
        tfNachname.setBounds(200, 100, 100, 25);
        getContentPane().add(tfNachname);

        pwfPasswort = new JPasswordField[2];
        pwfPasswort[0] = new JPasswordField();
        pwfPasswort[0].setBounds(200, 150, 100, 25);
        getContentPane().add(pwfPasswort[0]);
        
        pwfPasswort[1] = new JPasswordField();
        pwfPasswort[1].setBounds(200, 200, 100, 25);
        getContentPane().add(pwfPasswort[1]);

        lblPasswort = new JLabel[2];
        lblPasswort[0] = new JLabel("Passwort:");
        lblPasswort[0].setBounds(50, 150, 100, 25);
        getContentPane().add(lblPasswort[0]);
        
        lblPasswort[1] = new JLabel("Passwort wiederholen:");
        lblPasswort[1].setBounds(50, 200, 150, 25);
        getContentPane().add(lblPasswort[1]);

        btnErstellen = new JButton("Registieren");
        btnErstellen.setBounds(50,250,250,25);
        btnErstellen.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {

            
                if(!pwfPasswort[0].getText().equals(pwfPasswort[1].getText())) {

                    JOptionPane.showMessageDialog(null, "Die beiden Passwörter stimmen nicht überein!");

                }

            }

        });
        getContentPane().add(btnErstellen);


    }

}
