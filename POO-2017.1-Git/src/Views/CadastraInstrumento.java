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
import Exceptions.InstrumentoJaExisteException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author junior
 */
public class CadastraInstrumento extends javax.swing.JInternalFrame {
    SistemaLojaMusical sys;
    /**
     * Creates new form CadastraInstrumento
     */
    public CadastraInstrumento(SistemaLojaMusical sys) {
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
        nomeTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        marcaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valorTxt = new javax.swing.JTextField();
        identificadorTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cadastrarButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        identificadorTxt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastra Instrumento");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        nomeTxt.setForeground(new java.awt.Color(153, 153, 153));
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Marca");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        marcaTxt.setForeground(new java.awt.Color(153, 153, 153));
        marcaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaTxtActionPerformed(evt);
            }
        });
        getContentPane().add(marcaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 221, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Valor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        valorTxt.setForeground(new java.awt.Color(153, 153, 153));
        valorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTxtActionPerformed(evt);
            }
        });
        getContentPane().add(valorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 221, -1));

        identificadorTxt.setForeground(new java.awt.Color(153, 153, 153));
        identificadorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificadorTxtActionPerformed(evt);
            }
        });
        getContentPane().add(identificadorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 240, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Identificador");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        cadastrarButton.setText("CADASTRAR");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 440, 150, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Quantidade");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        identificadorTxt1.setForeground(new java.awt.Color(153, 153, 153));
        identificadorTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificadorTxt1ActionPerformed(evt);
            }
        });
        getContentPane().add(identificadorTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 240, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-triangulos-livrit.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 510));

        setBounds(170, 100, 717, 535);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void marcaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaTxtActionPerformed

    private void valorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTxtActionPerformed

    private void identificadorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificadorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificadorTxtActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        Instrumento ins = new Instrumento();
        boolean podeCadastrar = true;
        ArrayList<String> faltas = new ArrayList<>();
        
        if(nomeTxt.getText().equals("")){
            podeCadastrar = false;
            faltas.add("Nome");
        }else{
            ins.setNome(nomeTxt.getText());
        }
        
        if(marcaTxt.getText().equals("")){
            podeCadastrar = false;
            faltas.add("Marca");
        }else{
            ins.setMarca(marcaTxt.getText());
        }
        
        if(identificadorTxt.getText().equals("")){
            podeCadastrar = false;
            faltas.add("Identificador");
        }else{
            ins.setIdentificador(identificadorTxt.getText());
        }
        
        if(valorTxt.getText().equals("")){
            podeCadastrar = false;
            faltas.add("Valor");
        }else{
            try{
                Double valor = Double.parseDouble(valorTxt.getText());
                ins.setValor(valor);
            }catch (NumberFormatException e){
                podeCadastrar = false;
                JOptionPane.showMessageDialog(this, "Não podem haver números no campo valor.");
            }
        }
        
        try {
            if (podeCadastrar) {
                sys.cadastrarInstrumento(ins);
                JOptionPane.showMessageDialog(this, "Instrumento cadastrado com sucesso!");
                this.dispose();
            } else {
                String con = "";
                for (String i : faltas) {
                    con += i + "\n";
                }
                if (faltas.size() > 1) {
                    JOptionPane.showMessageDialog(this, "Você deixou os seguintes campos vazios:  \n" + con);
                } else {
                    JOptionPane.showMessageDialog(this, "Você deixou o seguinte campo vazio: \n" + con);
                }
            }
        } catch (InstrumentoJaExisteException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void identificadorTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificadorTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificadorTxt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JTextField identificadorTxt;
    private javax.swing.JTextField identificadorTxt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField marcaTxt;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField valorTxt;
    // End of variables declaration//GEN-END:variables
}
