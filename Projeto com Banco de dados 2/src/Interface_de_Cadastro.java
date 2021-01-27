
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class Interface_de_Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Interface_de_Cadastro
     */
    public Interface_de_Cadastro() {
        initComponents();
        formatarCPF();
        formatarTelefone();
        formatarData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtRa = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtData = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();

        jScrollPane1.setViewportView(jEditorPane1);

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Tela de Cadastro");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 30, 450, 57);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 170, 70, 29);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 220, 48, 29);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 270, 33, 29);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 320, 60, 29);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefone");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 370, 98, 29);

        jLabel8.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cidade");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 420, 80, 29);

        jLabel9.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Endereço");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 470, 108, 29);

        jLabel10.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Senha");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 520, 72, 29);

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(470, 590, 100, 40);

        jButton5.setText("Cadastrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(690, 590, 100, 40);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(480, 160, 300, 40);
        getContentPane().add(txtRa);
        txtRa.setBounds(480, 260, 300, 40);
        getContentPane().add(txtCidade);
        txtCidade.setBounds(480, 410, 300, 40);

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(480, 460, 300, 40);
        getContentPane().add(txtCpf);
        txtCpf.setBounds(480, 210, 300, 40);

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(480, 360, 300, 40);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(480, 510, 300, 40);
        getContentPane().add(txtData);
        txtData.setBounds(480, 310, 300, 40);

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 590, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/leather_wood_background_texture_50420_1024x768.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 730);

        jFormattedTextField1.setText("jFormattedTextField1");
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(570, 220, 109, 20);
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(960, 250, 6, 20);

        setSize(new java.awt.Dimension(996, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limparCampos() {

   txtNome.setText("");
   txtCpf.setText("");
   txtRa.setText("");
   txtData.setText("");
   txtTelefone.setText("");
   txtCidade.setText("");
   txtEndereco.setText("");
   txtSenha.setText("");
}
    
    private void formatarCPF(){
        try {
            MaskFormatter mask = new MaskFormatter ("###.###.###-##");
            mask.install (txtCpf);
        
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no campo de CPF", "ERRO", JOptionPane.ERROR);
        }
    }
    
    private void formatarTelefone(){
        try {
            MaskFormatter mask2 = new MaskFormatter ("(##)#####-####");
            mask2.install (txtTelefone);
        
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no campo de Telefone", "ERRO", JOptionPane.ERROR);
        }
    }
    
    private void formatarData(){
        try {
            MaskFormatter mask3 = new MaskFormatter ("##/##/####");
            mask3.install (txtData);
        
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no campo de Data", "ERRO", JOptionPane.ERROR);
        }
    }
    
    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            
            Connection conexao = new Conexao ().conectar();
            
            if (conexao != null) {
                PreparedStatement ps;
                String sql = "insert into tabela_cadastro(nome,cpf,ra,data,telefone,cidade,endereco,senha)values(?,?,?,?,?,?,?,?)";     
                ps = conexao.prepareStatement(sql);
                
                ps.setString (1, txtNome.getText() );
                ps.setString (2, txtCpf.getText() );
                ps.setString (3, txtRa.getText() );
                ps.setString (4, txtData.getText() );
                ps.setString (5, txtTelefone.getText() );
                ps.setString (6, txtCidade.getText() );
                ps.setString (7, txtEndereco.getText() );
                ps.setString (8, txtSenha.getPassword().toString() );
                
                ps.executeUpdate();
                conexao.close();
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso " );
            }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro nas parada: " + e.getMessage() );
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Interface_Inicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface_de_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_de_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_de_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_de_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_de_Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRa;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}