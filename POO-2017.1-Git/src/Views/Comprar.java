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
import Exceptions.InstrumentoInexistenteException;
import Exceptions.QuantiaInvalidaException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author junior
 */
public class Comprar extends javax.swing.JInternalFrame {
    boolean liberado = false;
    SistemaLojaMusical sys;

    /**
     * Creates new form Comprar
     */
    public Comprar(SistemaLojaMusical sys) {
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

        identificadorTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeInsTxt = new javax.swing.JTextField();
        marcaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valorTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        qtdTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        comprarButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Comprar Instrumento");
        getContentPane().setLayout(null);

        identificadorTxt.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        identificadorTxt.setForeground(new java.awt.Color(153, 153, 153));
        identificadorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificadorTxtActionPerformed(evt);
            }
        });
        identificadorTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                identificadorTxtKeyPressed(evt);
            }
        });
        getContentPane().add(identificadorTxt);
        identificadorTxt.setBounds(22, 44, 130, 33);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cod.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(22, 18, 31, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(177, 18, 42, 20);

        nomeInsTxt.setEditable(false);
        nomeInsTxt.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        nomeInsTxt.setForeground(new java.awt.Color(153, 153, 153));
        nomeInsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeInsTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomeInsTxt);
        nomeInsTxt.setBounds(177, 44, 231, 33);

        marcaTxt.setEditable(false);
        marcaTxt.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        marcaTxt.setForeground(new java.awt.Color(153, 153, 153));
        marcaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaTxtActionPerformed(evt);
            }
        });
        getContentPane().add(marcaTxt);
        marcaTxt.setBounds(443, 44, 219, 33);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Marca");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(443, 18, 42, 20);

        valorTxt.setEditable(false);
        valorTxt.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        valorTxt.setForeground(new java.awt.Color(153, 153, 153));
        valorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTxtActionPerformed(evt);
            }
        });
        getContentPane().add(valorTxt);
        valorTxt.setBounds(177, 115, 231, 33);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Valor");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(177, 89, 36, 20);

        qtdTxt.setEditable(false);
        qtdTxt.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        qtdTxt.setForeground(new java.awt.Color(153, 153, 153));
        qtdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdTxtActionPerformed(evt);
            }
        });
        getContentPane().add(qtdTxt);
        qtdTxt.setBounds(445, 115, 217, 33);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Quantidade em Estoque");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 90, 180, 20);
        getContentPane().add(iconLabel);
        iconLabel.setBounds(177, 175, 485, 219);

        comprarButton.setText("COMPRAR");
        comprarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(comprarButton);
        comprarButton.setBounds(519, 412, 143, 27);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-triangulos-livrit.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 690, 480);

        setBounds(170, 100, 698, 504);
    }// </editor-fold>//GEN-END:initComponents

    private void identificadorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificadorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificadorTxtActionPerformed

    private void nomeInsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeInsTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInsTxtActionPerformed

    private void marcaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaTxtActionPerformed

    private void valorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTxtActionPerformed

    private void qtdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdTxtActionPerformed

    private void identificadorTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identificadorTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                Instrumento atual = sys.buscarInstrumento(this.identificadorTxt.getText());
                this.nomeInsTxt.setText(atual.getNome());
                this.marcaTxt.setText(atual.getMarca());
                this.valorTxt.setText(String.valueOf(atual.getValor()));
                this.qtdTxt.setText(String.valueOf(atual.getQuantidade()));
                liberado = true;
            }
            catch(InstrumentoInexistenteException e){
                this.nomeInsTxt.setText("");
                this.marcaTxt.setText("");
                this.valorTxt.setText("");
                this.qtdTxt.setText("");
                JOptionPane.showMessageDialog(this, e.getMessage());
                liberado = false;
            }
        }
    }//GEN-LAST:event_identificadorTxtKeyPressed

    private void comprarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarButtonActionPerformed
        if(liberado){
            try {
                Instrumento ins = sys.buscarInstrumento(this.identificadorTxt.getText());
                sys.realizarVenda(ins.getIdentificador());
                JOptionPane.showMessageDialog(this, "Instrumento vendido com sucesso!");
                this.qtdTxt.setText(String.valueOf(ins.getQuantidade()));
            } catch (InstrumentoInexistenteException | QuantiaInvalidaException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(this, "Insira o código e aperte enter.");
        }
    }//GEN-LAST:event_comprarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprarButton;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JTextField identificadorTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField marcaTxt;
    private javax.swing.JTextField nomeInsTxt;
    private javax.swing.JTextField qtdTxt;
    private javax.swing.JTextField valorTxt;
    // End of variables declaration//GEN-END:variables
}
