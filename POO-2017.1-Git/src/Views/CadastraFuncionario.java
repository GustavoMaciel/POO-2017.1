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
        getContentPane().setLayout(null);

        emailTxt.setForeground(new java.awt.Color(153, 153, 153));
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        getContentPane().add(emailTxt);
        emailTxt.setBounds(25, 91, 369, 21);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(25, 68, 38, 20);

        nascimentoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nascimentoTxt);
        nascimentoTxt.setBounds(237, 159, 142, 21);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Data de Nascimento");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(237, 136, 140, 20);

        generoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "All" }));
        getContentPane().add(generoCombo);
        generoCombo.setBounds(421, 159, 151, 26);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(25, 238, 682, 11);

        logradouroTxt.setForeground(new java.awt.Color(153, 153, 153));
        logradouroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logradouroTxtActionPerformed(evt);
            }
        });
        getContentPane().add(logradouroTxt);
        logradouroTxt.setBounds(25, 278, 354, 21);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Logradouro");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(25, 255, 82, 20);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Endereço");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(25, 215, 64, 20);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Bairro");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(425, 255, 42, 20);

        bairroTxt.setForeground(new java.awt.Color(153, 153, 153));
        bairroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTxtActionPerformed(evt);
            }
        });
        getContentPane().add(bairroTxt);
        bairroTxt.setBounds(425, 278, 136, 21);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Numero");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(425, 329, 57, 20);

        numeroEnderecoTxt.setForeground(new java.awt.Color(153, 153, 153));
        numeroEnderecoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroEnderecoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(numeroEnderecoTxt);
        numeroEnderecoTxt.setBounds(425, 352, 136, 21);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Cep");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(25, 337, 26, 20);

        cepTxt.setForeground(new java.awt.Color(153, 153, 153));
        cepTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTxtActionPerformed(evt);
            }
        });
        getContentPane().add(cepTxt);
        cepTxt.setBounds(25, 360, 136, 21);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Estado");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(243, 337, 47, 20);

        estadoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre \t ", "Alagoas \t ", "Amapá \t ", "Amazonas \t\t ", "Bahia \t ", "Ceará \t ", "Distrito Federal  ", "Espírito Santo  ", "Goiás  ", "Maranhão \t", "Mato Grosso \t ", "Mato Grosso do Sul  ", "Minas Gerais \t ", "Pará \t ", "Paraíba \t ", "Paraná \t ", "Pernambuco ", "Piauí \t ", "Rio de Janeiro \t", "Rio Grande do Norte \t ", "Rio Grande do Sul \t", "Rondônia \t ", "Roraima \t ", "Santa Catarina \t ", "São Paulo \t", "Sergipe \t ", "Tocantins" }));
        estadoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoComboActionPerformed(evt);
            }
        });
        getContentPane().add(estadoCombo);
        estadoCombo.setBounds(243, 363, 136, 26);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Cidade");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(25, 405, 47, 20);

        cidadeTxt.setForeground(new java.awt.Color(153, 153, 153));
        cidadeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(cidadeTxt);
        cidadeTxt.setBounds(25, 429, 136, 21);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Telefone");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 136, 59, 20);

        dddTxt.setForeground(new java.awt.Color(153, 153, 153));
        dddTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dddTxtActionPerformed(evt);
            }
        });
        getContentPane().add(dddTxt);
        dddTxt.setBounds(28, 159, 30, 21);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("DDD");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(25, 136, 30, 20);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(25, 9, 42, 20);

        numeroTxt.setForeground(new java.awt.Color(153, 153, 153));
        numeroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTxtActionPerformed(evt);
            }
        });
        getContentPane().add(numeroTxt);
        numeroTxt.setBounds(70, 159, 155, 21);

        nomeTxt.setForeground(new java.awt.Color(153, 153, 153));
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTxt);
        nomeTxt.setBounds(25, 32, 369, 21);

        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarButton);
        confirmarButton.setBounds(570, 520, 109, 27);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("CPF");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(421, 9, 26, 20);

        cpfTxt.setForeground(new java.awt.Color(153, 153, 153));
        cpfTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTxtActionPerformed(evt);
            }
        });
        getContentPane().add(cpfTxt);
        cpfTxt.setBounds(421, 29, 221, 21);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("RG");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(421, 68, 19, 20);

        rgTxt.setForeground(new java.awt.Color(153, 153, 153));
        rgTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgTxtActionPerformed(evt);
            }
        });
        getContentPane().add(rgTxt);
        rgTxt.setBounds(421, 91, 221, 21);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Genero");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(421, 136, 50, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 490, 682, 11);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Administrativo");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 470, 150, 20);

        tipoTxt.setForeground(new java.awt.Color(153, 153, 153));
        tipoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(tipoTxt);
        tipoTxt.setBounds(20, 520, 136, 21);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Tipo");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 500, 30, 20);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Id");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(180, 500, 14, 20);

        idTxt.setForeground(new java.awt.Color(153, 153, 153));
        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        getContentPane().add(idTxt);
        idTxt.setBounds(180, 520, 136, 21);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Pagamento");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(340, 500, 120, 20);

        pagamentoTxt.setForeground(new java.awt.Color(153, 153, 153));
        pagamentoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(pagamentoTxt);
        pagamentoTxt.setBounds(340, 520, 136, 21);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-triangulos-livrit.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 710, 600);

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
                x.setCpf(this.rgTxt.getText());
            } catch (NumberFormatException e) {
                podeCadastrar = false;
                JOptionPane.showMessageDialog(this, "Não pode haver letras no RG");
        }    

    if (this.dddTxt.getText () 
        .equals("")) {
            campos.add("DDD");
        podeCadastrar = false;
    }

    if (this.numeroTxt.getText () 
        .equals("")) {
            campos.add("Número de telefone");
        podeCadastrar = false;
    }
    Telefone tel = new Telefone(this.dddTxt.getText(), this.numeroTxt.getText());

    x.setTelefone (tel);

    if (this.logradouroTxt.getText () 
        .equals("")) {
            campos.add("Logradouro");
        podeCadastrar = false;
    }

    if (this.bairroTxt.getText () 
        .equals("")) {
            campos.add("Bairro");
        podeCadastrar = false;
    }

    if (this.numeroEnderecoTxt.getText () 
        .equals("")) {
            campos.add("Número de Endereço");
        podeCadastrar = false;
    }

    if (this.cepTxt.getText () 
        .equals("")) {
            campos.add("CEP");
        podeCadastrar = false;
    }

    if (this.cidadeTxt.getText () 
        .equals("")) {
            campos.add("Cidade");
        podeCadastrar = false;
    }
    Endereco end = new Endereco(this.logradouroTxt.getText(), this.bairroTxt.getText(), this.numeroEnderecoTxt.getText(), this.cepTxt.getText(), this.estadoCombo.getItemAt(this.estadoCombo.getSelectedIndex()), this.cidadeTxt.getText());

    x.setEndereco (end);

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
            podeCadastrar = false;
        }
            JOptionPane.showMessageDialog(this, "Só podem haver números no pagamento.");
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