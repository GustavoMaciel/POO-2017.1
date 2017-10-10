/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 */
package Views;

import Classes.*;
import Exceptions.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author junior
 */
public class ListaClientes extends javax.swing.JInternalFrame {
    public SistemaLojaMusical sys;

    /**
     * Creates new form ListaClientes
     */
    public ListaClientes(SistemaLojaMusical sys) {
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

        emailBuscaTxt = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rgTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dddTxt = new javax.swing.JTextField();
        telefoneTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nascimentoTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        generoCombo = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Listar Clientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailBuscaTxt.setForeground(new java.awt.Color(0, 0, 0));
        emailBuscaTxt.setToolTipText("Insira o e-mail");
        emailBuscaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailBuscaTxtActionPerformed(evt);
            }
        });
        emailBuscaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailBuscaTxtKeyPressed(evt);
            }
        });
        getContentPane().add(emailBuscaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 331, -1));

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(buscarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        nomeTxt.setForeground(new java.awt.Color(0, 0, 0));
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 345, -1));

        jLabel3.setText("Cpf");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        cpfTxt.setForeground(new java.awt.Color(0, 0, 0));
        cpfTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTxtActionPerformed(evt);
            }
        });
        getContentPane().add(cpfTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 170, -1));

        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        emailTxt.setForeground(new java.awt.Color(0, 0, 0));
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 345, -1));

        jLabel5.setText("RG");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        rgTxt.setForeground(new java.awt.Color(0, 0, 0));
        rgTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgTxtActionPerformed(evt);
            }
        });
        getContentPane().add(rgTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 170, -1));

        jLabel6.setText("DDD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        dddTxt.setForeground(new java.awt.Color(0, 0, 0));
        dddTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dddTxtActionPerformed(evt);
            }
        });
        getContentPane().add(dddTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 27, -1));

        telefoneTxt.setForeground(new java.awt.Color(0, 0, 0));
        telefoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneTxtActionPerformed(evt);
            }
        });
        getContentPane().add(telefoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 125, -1));

        jLabel7.setText("Telefone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel8.setText("Data de nascimento");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        nascimentoTxt.setForeground(new java.awt.Color(0, 0, 0));
        nascimentoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nascimentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 150, -1));

        jLabel9.setText("Genero");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        generoCombo.setEditable(true);
        generoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino\t", "Feminino" }));
        generoCombo.setEnabled(false);
        getContentPane().add(generoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 162, 30));

        jToggleButton1.setBackground(new java.awt.Color(255, 51, 51));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Alterar");
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-triangulos-livrit.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 470));

        setBounds(170, 100, 701, 492);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        try{
            Cliente i = sys.buscarCliente(emailBuscaTxt.getText());
            this.nomeTxt.setText(i.getNome());
            this.cpfTxt.setText(i.getCpf());
            this.emailTxt.setText(i.getEmail());
            this.rgTxt.setText(i.getRg());
            this.dddTxt.setText(i.getTelefone().getDdd());
            this.telefoneTxt.setText(i.getTelefone().getNumero());
            if(i.getGenero().startsWith("M")){
                this.generoCombo.setSelectedIndex(0);
            }else{
                this.generoCombo.setSelectedIndex(1);
            }
            this.nascimentoTxt.setText(i.getDataNascimento());
        }catch(ClienteInexistenteException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void emailBuscaTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailBuscaTxtKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        this.buscarButton.doClick();}
    }//GEN-LAST:event_emailBuscaTxtKeyPressed

    private void emailBuscaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailBuscaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailBuscaTxtActionPerformed

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void cpfTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTxtActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void rgTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgTxtActionPerformed

    private void dddTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dddTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dddTxtActionPerformed

    private void telefoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneTxtActionPerformed

    private void nascimentoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimentoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascimentoTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JTextField dddTxt;
    private javax.swing.JTextField emailBuscaTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox<String> generoCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nascimentoTxt;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField rgTxt;
    private javax.swing.JTextField telefoneTxt;
    // End of variables declaration//GEN-END:variables
}
