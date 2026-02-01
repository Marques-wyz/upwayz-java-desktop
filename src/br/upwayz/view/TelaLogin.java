package br.upwayz.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaLogin extends JFrame {

    private JButton btnEntrar;

    public TelaLogin() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        JLabel label = new JLabel("Login");
        btnEntrar = new JButton("Entrar");

        btnEntrar.addActionListener(e -> {
            System.out.println("Login clicado");
            new TelaMenu().setVisible(true);
            this.dispose();
        });

        painel.add(label);
        painel.add(btnEntrar);
        add(painel);
    }
}
