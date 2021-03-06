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
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author junior
 */
public class RemoveInstrumento extends javax.swing.JInternalFrame {
    boolean podeIr = false;
    SistemaLojaMusical sys;
    /**
     * Creates new form ListaInstrumento
     */
    public RemoveInstrumento(SistemaLojaMusical sys) {
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
        idMonstrarTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        removerButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        qtdTxt = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Remover Instrumento");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        nomeTxt.setEditable(false);
        nomeTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(nomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 240, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Marca");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        marcaTxt.setEditable(false);
        marcaTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(marcaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 221, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Valor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        valorTxt.setEditable(false);
        valorTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(valorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 221, -1));

        idMonstrarTxt.setEditable(false);
        idMonstrarTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(idMonstrarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 240, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Identificador");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        removerButton.setBackground(new java.awt.Color(201, 61, 74));
        removerButton.setForeground(new java.awt.Color(1, 1, 1));
        removerButton.setText("REMOVER");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 435, 150, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Identificador");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 140, -1));

        idTxt.setForeground(new java.awt.Color(0, 0, 0));
        idTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idTxtKeyPressed(evt);
            }
        });
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 240, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Quantidade");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        qtdTxt.setEditable(false);
        qtdTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(qtdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 240, -1));

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(buscarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-triangulos-livrit.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        setBounds(170, 100, 704, 523);
    }// </editor-fold>//GEN-END:initComponents

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        if(podeIr){
            try{
                sys.removerInstrumento(idTxt.getText());
                idTxt.setText("");
                nomeTxt.setText("");
                marcaTxt.setText("");
                valorTxt.setText("");
                idMonstrarTxt.setText("");
                qtdTxt.setText("");
                podeIr = false;
                JOptionPane.showMessageDialog(this, "Instrumento removido com sucesso!");
            }catch(InstrumentoInexistenteException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(this, "Não foi possível remover.");
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void idTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.buscarButton.doClick();
        }
    }//GEN-LAST:event_idTxtKeyPressed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        try{
                Instrumento ins = sys.buscarInstrumento(idTxt.getText());
                nomeTxt.setText(ins.getNome());
                marcaTxt.setText(ins.getMarca());
                valorTxt.setText(String.valueOf(ins.getValor()));
                idMonstrarTxt.setText(ins.getIdentificador());
                qtdTxt.setText(String.valueOf(ins.getQuantidade()));
                podeIr = true;
            }catch (InstrumentoInexistenteException e){
                nomeTxt.setText("");
                marcaTxt.setText("");
                valorTxt.setText("");
                idMonstrarTxt.setText("");
                qtdTxt.setText("");
                JOptionPane.showMessageDialog(this, e.getMessage());
                podeIr = false;
            }
    }//GEN-LAST:event_buscarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextField idMonstrarTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField marcaTxt;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField qtdTxt;
    private javax.swing.JButton removerButton;
    private javax.swing.JTextField valorTxt;
    // End of variables declaration//GEN-END:variables
}
