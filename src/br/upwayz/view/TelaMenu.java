package br.upwayz.view;

import javax.swing.*;

public class TelaMenu extends JFrame {

    public TelaMenu() {
        setTitle("UP WAYZ");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnProduto = new JButton("Cadastro Produto");
        btnProduto.setBounds(50, 40, 180, 30);
        add(btnProduto);

        JButton btnCliente = new JButton("Cadastro Cliente");
        btnCliente.setBounds(50, 90, 180, 30);
        add(btnCliente);

        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(50, 140, 180, 30);
        add(btnSair);

        btnProduto.addActionListener(e -> new TelaProduto().setVisible(true));
        btnCliente.addActionListener(e -> new TelaCliente().setVisible(true));
        btnSair.addActionListener(e -> System.exit(0));
    }
}
