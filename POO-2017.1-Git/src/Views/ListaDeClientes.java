package Views;

import Classes.Cliente;
import Classes.SistemaLojaMusical;
import Exceptions.ClienteInexistenteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo
 */
public class ListaDeClientes extends javax.swing.JInternalFrame {
    SistemaLojaMusical sys;

    /**
     * Creates new form ListaDeClientes
     */
    public ListaDeClientes(SistemaLojaMusical sys) {
        this.sys = sys;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        cpfTxt = new javax.swing.JTextField();
        rgTxt = new javax.swing.JTextField();
        telefoneTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Lista De Clientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailCombo.addItem("Selecionar");
        for(String i: sys.emailClientesToStringArray()){
            emailCombo.addItem(i);
        }
        emailCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailComboActionPerformed(evt);
            }
        });
        getContentPane().add(emailCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 440, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("E-Mail:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 121, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 172, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("CPF:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("RG:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        nomeTxt.setEditable(false);
        getContentPane().add(nomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 440, -1));

        cpfTxt.setEditable(false);
        getContentPane().add(cpfTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 440, -1));

        rgTxt.setEditable(false);
        getContentPane().add(rgTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 440, -1));

        telefoneTxt.setEditable(false);
        getContentPane().add(telefoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 440, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-triangulos-livrit.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 760, 500));

        setBounds(150, 50, 746, 522);
    }// </editor-fold>//GEN-END:initComponents

    private void emailComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailComboActionPerformed
        if(emailCombo.getItemAt(emailCombo.getSelectedIndex()).equals("Selecionar")){
            nomeTxt.setText("");
            rgTxt.setText("");
            cpfTxt.setText("");
            telefoneTxt.setText("");
        }else{
            try {
                Cliente cli = sys.buscarCliente(emailCombo.getItemAt(emailCombo.getSelectedIndex()));
                nomeTxt.setText(cli.getNome());
                rgTxt.setText(cli.getRg());
                cpfTxt.setText(cli.getCpf());
                telefoneTxt.setText(cli.getTelefone().toString());
            } catch (ClienteInexistenteException ex) {
            }
        }
    
    }//GEN-LAST:event_emailComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JComboBox<String> emailCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField rgTxt;
    private javax.swing.JTextField telefoneTxt;
    // End of variables declaration//GEN-END:variables
}