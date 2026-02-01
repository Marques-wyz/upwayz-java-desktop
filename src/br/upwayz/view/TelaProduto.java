package br.upwayz.view;

import br.upwayz.dao.ProdutoDAO;
import br.upwayz.model.Produto;
import javax.swing.*;

public class TelaProduto extends JFrame {

    public TelaProduto() {
        setTitle("Cadastro de Produto");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 80, 25);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(100, 20, 200, 25);
        add(txtNome);

        JLabel lblDescricao = new JLabel("Descrição:");
        lblDescricao.setBounds(20, 60, 80, 25);
        add(lblDescricao);

        JTextField txtDescricao = new JTextField();
        txtDescricao.setBounds(100, 60, 200, 25);
        add(txtDescricao);

        JLabel lblPreco = new JLabel("Preço:");
        lblPreco.setBounds(20, 100, 80, 25);
        add(lblPreco);

        JTextField txtPreco = new JTextField();
        txtPreco.setBounds(100, 100, 200, 25);
        add(txtPreco);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(110, 150, 120, 30);
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            try {
                Produto p = new Produto();
                p.setNome(txtNome.getText());
                p.setDescricao(txtDescricao.getText());
                p.setValor(Double.parseDouble(txtPreco.getText()));

                ProdutoDAO dao = new ProdutoDAO();
                dao.salvar(p);

                JOptionPane.showMessageDialog(this, "Produto salvo no MySQL!");

                txtNome.setText("");
                txtDescricao.setText("");
                txtPreco.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Preço inválido!");
            } catch (Exception ex) {
    ex.printStackTrace(); // MOSTRA O ERRO REAL NO CONSOLE
    JOptionPane.showMessageDialog(this, ex.getMessage());
}

        });
    }
}
