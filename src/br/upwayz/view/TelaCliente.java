package br.upwayz.view;

import br.upwayz.model.Cliente;
import java.util.ArrayList;
import javax.swing.*;

public class TelaCliente extends JFrame {

    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public TelaCliente() {
        setTitle("Cadastro de Cliente");
        setSize(350, 220);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 30, 80, 25);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(100, 30, 200, 25);
        add(txtNome);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(20, 70, 80, 25);
        add(lblTelefone);

        JTextField txtTelefone = new JTextField();
        txtTelefone.setBounds(100, 70, 200, 25);
        add(txtTelefone);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(110, 120, 120, 30);
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            Cliente c = new Cliente(
                txtNome.getText(),
                txtTelefone.getText()
            );
            listaClientes.add(c);
            JOptionPane.showMessageDialog(this, "Cliente cadastrado!");
        });
    }
}
