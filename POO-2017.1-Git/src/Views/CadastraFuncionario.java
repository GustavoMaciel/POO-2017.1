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
import Exceptions.FuncionarioJaExisteException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author junior
 */
public class CadastraFuncionario extends javax.swing.JInternalFrame {

    SistemaLojaMusical sys;

    public CadastraFuncionario(SistemaLojaMusical sys) {
        this.sys = sys;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nascimentoTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        generoCombo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        logradouroTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bairroTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        numeroEnderecoTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cepTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        estadoCombo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cidadeTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dddTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numeroTxt = new javax.swing.JTextField();
        nomeTxt = new javax.swing.JTextField();
        confirmarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rgTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        tipoTxt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        pagamentoTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastra Funcionario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailTxt.setForeground(java.awt.Color.black);
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 91, 369, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 68, -1, -1));

        nascimentoTxt.setForeground(java.awt.Color.black);
        nascimentoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nascimentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 159, 150, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Data de Nascimento");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 136, -1, -1));

        generoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "All" }));
        getContentPane().add(generoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 159, 151, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 238, 682, 11));

        logradouroTxt.setForeground(java.awt.Color.black);
        logradouroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logradouroTxtActionPerformed(evt);
            }
        });
        getContentPane().add(logradouroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 278, 354, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Logradouro");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 255, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Endereço");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 215, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Bairro");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 255, -1, -1));

        bairroTxt.setForeground(java.awt.Color.black);
        bairroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTxtActionPerformed(evt);
            }
        });
        getContentPane().add(bairroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 278, 136, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Numero");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        numeroEnderecoTxt.setForeground(java.awt.Color.black);
        numeroEnderecoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroEnderecoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(numeroEnderecoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 136, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Cep");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 337, -1, -1));

        cepTxt.setForeground(java.awt.Color.black);
        cepTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTxtActionPerformed(evt);
            }
        });
        getContentPane().add(cepTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 360, 136, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Estado");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        estadoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre \t ", "Alagoas \t ", "Amapá \t ", "Amazonas \t\t ", "Bahia \t ", "Ceará \t ", "Distrito Federal  ", "Espírito Santo  ", "Goiás  ", "Maranhão \t", "Mato Grosso \t ", "Mato Grosso do Sul  ", "Minas Gerais \t ", "Pará \t ", "Paraíba \t ", "Paraná \t ", "Pernambuco ", "Piauí \t ", "Rio de Janeiro \t", "Rio Grande do Norte \t ", "Rio Grande do Sul \t", "Rondônia \t ", "Roraima \t ", "Santa Catarina \t ", "São Paulo \t", "Sergipe \t ", "Tocantins" }));
        estadoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoComboActionPerformed(evt);
            }
        });
        getContentPane().add(estadoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 136, 26));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Cidade");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 405, -1, -1));

        cidadeTxt.setForeground(java.awt.Color.black);
        cidadeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(cidadeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 429, 136, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Telefone");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 136, -1, -1));

        dddTxt.setForeground(java.awt.Color.black);
        dddTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dddTxtActionPerformed(evt);
            }
        });
        getContentPane().add(dddTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 159, 30, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("DDD");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 136, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 9, -1, -1));

        numeroTxt.setForeground(java.awt.Color.black);
        numeroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTxtActionPerformed(evt);
            }
        });
        getContentPane().add(numeroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 159, 155, -1));

        nomeTxt.setForeground(java.awt.Color.black);
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 32, 369, -1));

        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("CPF");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 9, -1, -1));

        cpfTxt.setForeground(java.awt.Color.black);
        cpfTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTxtActionPerformed(evt);
            }
        });
        getContentPane().add(cpfTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 29, 221, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("RG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 68, -1, -1));

        rgTxt.setForeground(java.awt.Color.black);
        rgTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgTxtActionPerformed(evt);
            }
        });
        getContentPane().add(rgTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 91, 221, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Genero");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 136, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 682, 11));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Administrativo");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, -1));

        tipoTxt.setForeground(java.awt.Color.black);
        tipoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(tipoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 136, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Tipo");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Id");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, -1));

        idTxt.setForeground(java.awt.Color.black);
        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 136, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Pagamento");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 120, -1));

        pagamentoTxt.setForeground(java.awt.Color.black);
        pagamentoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(pagamentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 136, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-triangulos-livrit.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 600));

        setBounds(170, 10, 722, 634);
    }// </editor-fold>//GEN-END:initComponents

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void nascimentoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimentoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascimentoTxtActionPerformed

    private void logradouroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logradouroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logradouroTxtActionPerformed

    private void bairroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroTxtActionPerformed

    private void numeroEnderecoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroEnderecoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroEnderecoTxtActionPerformed

    private void cepTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepTxtActionPerformed

    private void estadoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoComboActionPerformed

    private void cidadeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeTxtActionPerformed

    private void dddTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dddTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dddTxtActionPerformed

    private void numeroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTxtActionPerformed

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        Funcionario x = new Funcionario();
        boolean podeCadastrar = true;
        ArrayList<String> campos = new ArrayList<String>();

        if (this.cpfTxt.getText().equals("")) {
            campos.add("CPF");
            podeCadastrar = false;
        } else {
            try {
                Long.parseLong(cpfTxt.getText());
                x.setCpf(this.cpfTxt.getText());
            } catch (NumberFormatException e) {
                podeCadastrar = false;
                JOptionPane.showMessageDialog(this, "Não pode haver letras no CPF");
            }
        }

        if (this.nascimentoTxt.getText().equals("")) {
            campos.add("Data de Nascimento");
            podeCadastrar = false;
        } else {
            x.setDataNascimento(this.nascimentoTxt.getText());
        }

        if (this.emailTxt.getText().equals("")) {
            campos.add("Email");
            podeCadastrar = false;
        } else {
            x.setEmail(this.emailTxt.getText());
        }

        x.setGenero(this.generoCombo.getItemAt(this.generoCombo.getSelectedIndex()).toUpperCase());

        if (this.nomeTxt.getText().equals("")) {
            campos.add("Nome");
            podeCadastrar = false;
        } else {
            x.setNome(this.nomeTxt.getText());
        }

        if (this.rgTxt.getText().equals("")) {
            campos.add("RG");
            podeCadastrar = false;
        } else {
            try {
                Long.parseLong(rgTxt.getText());
                x.setRg(this.rgTxt.getText());
            } catch (NumberFormatException e) {
                podeCadastrar = false;
                JOptionPane.showMessageDialog(this, "Não pode haver letras no RG");
        }    

    if (this.dddTxt.getText () 
        .equals("")) {
            campos.add("DDD");
        podeCadastrar = false;
    }

    if (this.numeroTxt.getText ().equals("")) {
            campos.add("Número de telefone");
        podeCadastrar = false;
    }
    Telefone tel = new Telefone(this.dddTxt.getText(), this.numeroTxt.getText());
    x.setTelefone (tel);

    if (this.logradouroTxt.getText ().equals("")) {
            campos.add("Logradouro");
        podeCadastrar = false;
    }

    if (this.bairroTxt.getText ().equals("")) {
            campos.add("Bairro");
        podeCadastrar = false;
    }

    if (this.numeroEnderecoTxt.getText ().equals("")) {
            campos.add("Número de Endereço");
        podeCadastrar = false;
    }

    if (this.cepTxt.getText ().equals("")) {
            campos.add("CEP");
        podeCadastrar = false;
    }

    if (this.cidadeTxt.getText ().equals("")) {
            campos.add("Cidade");
        podeCadastrar = false;
    }
    Endereco end = new Endereco(this.logradouroTxt.getText(), this.bairroTxt.getText(), this.numeroEnderecoTxt.getText(), this.cepTxt.getText(), this.estadoCombo.getItemAt(this.estadoCombo.getSelectedIndex()), this.cidadeTxt.getText());

    x.setEndereco(end);

    if (this.tipoTxt.getText ().equals("")) {
            campos.add("Tipo");
        podeCadastrar = false;
    }else {
            x.setTipo(tipoTxt.getText());
    }

    if (this.idTxt.getText ().equals("")) {
        campos.add("ID");
        podeCadastrar = false;
    }else {
            x.setId(idTxt.getText());
    }

    if (this.pagamentoTxt.getText () 
        .equals("")) {
            campos.add("Pagamento");
        podeCadastrar = false;
    }else {
            double pagamento;
        try {
            pagamento = Double.parseDouble(pagamentoTxt.getText());
            x.setPagamento(pagamento);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Só podem haver números no pagamento.");
            podeCadastrar = false;
        }
            
        }
    }    
        try {
            if (podeCadastrar) {
            sys.cadastrarFuncionario(x);
            JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!");
            this.dispose();
        } else {
            String con = "";
            for (String i : campos) {
                con += i + "\n";
            }
            if (campos.size() > 1) {
                JOptionPane.showMessageDialog(this, "Você deixou os seguintes campos vazios:  \n" + con);
            } else {
                JOptionPane.showMessageDialog(this, "Você deixou o seguinte campo vazio: \n" + con);
            }
        }
    }
    catch (FuncionarioJaExisteException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void cpfTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTxtActionPerformed

    }//GEN-LAST:event_cpfTxtActionPerformed

    private void rgTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgTxtActionPerformed

    private void tipoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTxtActionPerformed

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    private void pagamentoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagamentoTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroTxt;
    private javax.swing.JTextField cepTxt;
    private javax.swing.JTextField cidadeTxt;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JTextField dddTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox<String> estadoCombo;
    private javax.swing.JComboBox<String> generoCombo;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField logradouroTxt;
    private javax.swing.JTextField nascimentoTxt;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField numeroEnderecoTxt;
    private javax.swing.JTextField numeroTxt;
    private javax.swing.JTextField pagamentoTxt;
    private javax.swing.JTextField rgTxt;
    private javax.swing.JTextField tipoTxt;
    // End of variables declaration//GEN-END:variables
}
