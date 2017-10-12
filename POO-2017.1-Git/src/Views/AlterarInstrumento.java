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

import Classes.Instrumento;
import Classes.SistemaLojaMusical;
import Exceptions.InstrumentoInexistenteException;
import javax.swing.JOptionPane;

/**
 *
 * @author junior
 */
public class AlterarInstrumento extends javax.swing.JInternalFrame {
    private SistemaLojaMusical sys;
    boolean liberado = false;
    /**
     * Creates new form BuscarInstrumento
     */
    public AlterarInstrumento(SistemaLojaMusical sys) {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigoTxt = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        qtdTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        marcaTxt = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        alterarButton = new javax.swing.JToggleButton();
        nomeTxt = new javax.swing.JTextField();
        nomeTxt3 = new javax.swing.JTextField();
        valorTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Buscar Instrumentos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Código:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        codigoTxt.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(codigoTxt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 82, 152, -1));

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        qtdTxt.setForeground(new java.awt.Color(0, 0, 0));
        qtdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdTxtActionPerformed(evt);
            }
        });
        getContentPane().add(qtdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 354, -1));

        jLabel3.setText("Marca:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel5.setText("Valor:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 44, -1));

        marcaTxt.setForeground(new java.awt.Color(0, 0, 0));
        marcaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaTxtActionPerformed(evt);
            }
        });
        getContentPane().add(marcaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 354, -1));

        buscarButton.setText("BUSCAR");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(buscarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 120, 30));

        jLabel6.setText("Quantidade:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 90, -1));

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alterarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 380, 90, -1));

        nomeTxt.setForeground(new java.awt.Color(0, 0, 0));
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 354, -1));

        nomeTxt3.setForeground(new java.awt.Color(0, 0, 0));
        nomeTxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxt3ActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 354, -1));

        valorTxt.setForeground(new java.awt.Color(0, 0, 0));
        valorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTxtActionPerformed(evt);
            }
        });
        getContentPane().add(valorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 354, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-triangulos-livrit.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 440));

        setBounds(170, 100, 675, 469);
    }// </editor-fold>//GEN-END:initComponents

    private void qtdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdTxtActionPerformed

    private void marcaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaTxtActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        try {
            Instrumento atual = sys.buscarInstrumento(this.codigoTxt.getText());
            this.qtdTxt.setText(atual.getNome());
            this.marcaTxt.setText(atual.getMarca());
            qtdTxt.setText(String.valueOf(atual.getValor()));
            qtdTxt.setText(String.valueOf(atual.getQuantidade()));
            liberado = true;
        } catch (InstrumentoInexistenteException ex) {
            this.qtdTxt.setText("");
            this.marcaTxt.setText("");
            qtdTxt.setText("");
            qtdTxt.setText("");
            liberado = false;
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed
        if(liberado){
            try{
                Instrumento atual = sys.buscarInstrumento(codigoTxt.getText());
                atual.setMarca(marcaTxt.getText());
                atual.setNome(qtdTxt.getText());
                try{
                    atual.setQuantidade(Integer.parseInt(qtdTxt.getText()));
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Não foi possível alterar a quantidade, não podem haver letras.");
                }
                try{
                    atual.setValor(Integer.parseInt(qtdTxt.getText()));
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Não foi possível alterar o valor, não podem haver letras.");
                }
            }catch (InstrumentoInexistenteException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(this, "Não foi possível alterar.");
        }
    }//GEN-LAST:event_alterarButtonActionPerformed

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void nomeTxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTxt3ActionPerformed

    private void valorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton alterarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextPane codigoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marcaTxt;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField nomeTxt3;
    private javax.swing.JTextField qtdTxt;
    private javax.swing.JTextField valorTxt;
    // End of variables declaration//GEN-END:variables
}
