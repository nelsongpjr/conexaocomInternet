package Exercicio_3;

import javax.swing.JOptionPane;

/*
 * @author Nelson
    OS AJUSTES FORAM FEITOS PELA INTERFACE
   
 */
public class InterfaceInicial extends javax.swing.JFrame {

    private int indicePerg;
    private int[] indicePergAnt;
    private int i;

    public InterfaceInicial() {

        initComponents();//inicia os componentes da interface

        indicePerg = 0;// índice que controla a interface
        indicePergAnt = new int[20];
        i = 0;

        txt_Pergunta1.setText("");//Inicia os txtBox 
        txt_Pergunta2.setText("");
        txt_Pergunta3.setText("");

        cb_Resposta1.setVisible(false);//Esconde as CB
        cb_Resposta2.setVisible(false);
        cb_Resposta3.setVisible(false);

        bt_Bt2.setVisible(false);
        bt_Exit.setVisible(false);
        bt_Cont.setVisible(false);
        indInterfacePergunta(indicePerg);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_Bt1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Pergunta1 = new javax.swing.JLabel();
        txt_Pergunta2 = new javax.swing.JLabel();
        txt_Pergunta3 = new javax.swing.JLabel();
        cb_Resposta3 = new javax.swing.JComboBox<>();
        bt_Bt2 = new javax.swing.JButton();
        cb_Resposta2 = new javax.swing.JComboBox<>();
        cb_Resposta1 = new javax.swing.JComboBox<>();
        bt_Exit = new javax.swing.JButton();
        bt_Cont = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_Bt1.setText("BT1");
        bt_Bt1.setMaximumSize(new java.awt.Dimension(51, 23));
        bt_Bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Bt1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Responda as seguintes perguntas");

        txt_Pergunta1.setText("Pergunta_1");

        txt_Pergunta2.setText("Pergunta_2");

        txt_Pergunta3.setText("Pergunta_3");

        cb_Resposta3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Outro", "Google Chrome", "Firefox" }));

        bt_Bt2.setText("BT2");
        bt_Bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Bt2ActionPerformed(evt);
            }
        });

        cb_Resposta2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        cb_Resposta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        bt_Exit.setText("Sim");
        bt_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ExitActionPerformed(evt);
            }
        });

        bt_Cont.setText("Não");
        bt_Cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ContActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Pergunta3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_Resposta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Pergunta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_Resposta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Pergunta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_Resposta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(bt_Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(bt_Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bt_Cont)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Exit)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Pergunta1)
                    .addComponent(cb_Resposta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Pergunta2)
                    .addComponent(cb_Resposta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Pergunta3)
                    .addComponent(cb_Resposta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Exit)
                    .addComponent(bt_Cont))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Bt1ActionPerformed
        verificaInd();
        indInterfaceResposta(indicePerg);
        verificaInd();
    }//GEN-LAST:event_bt_Bt1ActionPerformed

    private void bt_Bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Bt2ActionPerformed
        verificaInd();
        
        indicePerg = indicePergAnt[i];
        indInterfacePergunta(indicePerg);
        verificaInd();
    }//GEN-LAST:event_bt_Bt2ActionPerformed

    private void bt_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_ExitActionPerformed

    private void bt_ContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ContActionPerformed

        indInterfacePergunta(++indicePerg);
        verificaInd();
    }//GEN-LAST:event_bt_ContActionPerformed

    private void verificaInd() {
        if (indicePerg > 10 || indicePerg < 0) {
            indicePerg = 1;
        }
    }

    private void indInterfacePergunta(int i) {

        switch (i) {
            case 0:
                Interface(1);
                txt_Pergunta1.setText(Perguntas(0));
                break;
            case 1:
                Interface(1);
                txt_Pergunta1.setText(Perguntas(1));
                break;
            case 2:
                Interface(1);
                txt_Pergunta1.setText(Perguntas(2));
                break;
            case 3:
                Interface(1);
                txt_Pergunta1.setText(Perguntas(3));
                break;
            case 4:
                Interface(2);
                txt_Pergunta1.setText(Perguntas(4));
                txt_Pergunta2.setText(Perguntas(5));
                break;
            case 5:
                Interface(3);
                txt_Pergunta3.setText(Perguntas(6));
                break;
            case 6:
                Interface(1);
                txt_Pergunta1.setText(Perguntas(7));
                break;
            case 7:
                Interface(2);
                txt_Pergunta1.setText(Perguntas(8));
                txt_Pergunta2.setText(Perguntas(9));
                break;
            case 8:
                Interface(1);
                txt_Pergunta1.setText(Perguntas(10));
                break;
            case 9:
                Interface(2);
                txt_Pergunta1.setText(Perguntas(11));
                txt_Pergunta2.setText(Perguntas(12));
                break;
            case 10:
                Interface(1);
                txt_Pergunta1.setText(Perguntas(13));
                break;
        }
    }

    private void indInterfaceResposta(int i) {
        MaquinaInferencia maquina = new MaquinaInferencia();

        switch (i) {
            case 0://internet
                indicePergAnt[++i] = indicePerg;//guarda o indice anterior
                if (maquina.consulta(0, cb_Resposta1.getSelectedIndex(), 0, 0) == 0) {
                    indicePerg = 1;
                    indInterfacePergunta(indicePerg);   //se há internet envia direto para 
                } else {                                  // a perg 9 que é lentidão e download
                    indicePerg = 9;                     //se não anvia para a perg do cabo
                    indInterfacePergunta(indicePerg);
                }
                break;
            case 1://cabo
                indicePergAnt[++i] = indicePerg;//guarda o indice anterior
                if (maquina.consulta(1, cb_Resposta1.getSelectedIndex(), 0, 0) == 0) {
                    Interface(0);                       //se o cabo não estiver conectado
                    txt_Pergunta1.setText(Respostas(1));//responde para conectar
                } else {                                  //se já estiver, pula para a proxima
                    indicePerg = 2;
                    indInterfacePergunta(indicePerg);
                }
                break;
            case 2://conectividade "triângulo"
                indicePergAnt[++i] = indicePerg;//guarda o indice anterior
                if (maquina.consulta(2, cb_Resposta1.getSelectedIndex(), 0, 0) == 1) {
                    Interface(0);                   //o triângulo aparece ele responde
                    txt_Pergunta1.setText(Respostas(2));
                } else {
                    indicePerg = 3; //se não pula para a proxima pergunta
                    indInterfacePergunta(indicePerg);
                }
                break;
            case 3://Erro
                indicePergAnt[++i] = indicePerg;//guarda o indice anterior
                if (maquina.consulta(3, cb_Resposta1.getSelectedIndex(), 0, 0) == 1) {
                    Interface(0);   //se erro 
                    txt_Pergunta1.setText(Respostas(2));
                } else {
                    indicePerg = 4; //senão perg 4
                    indInterfacePergunta(indicePerg);
                }
                break;
            case 4://proxy acesso
                indicePergAnt[++i] = indicePerg;//guarda o indice anterior

                if (maquina.consulta(4, cb_Resposta1.getSelectedIndex(), cb_Resposta2.getSelectedIndex(), 0) == 1) {
                    Interface(0);
                    txt_Pergunta1.setText(Respostas(3));
                } else if (maquina.consulta(4, cb_Resposta1.getSelectedIndex(), cb_Resposta2.getSelectedIndex(), 0) == 2) {
                    indicePerg = 5;
                    indInterfacePergunta(indicePerg);
                } else if (maquina.consulta(4, cb_Resposta1.getSelectedIndex(), cb_Resposta2.getSelectedIndex(), 0) == 0) {
                    indicePerg = 6;
                    indInterfacePergunta(indicePerg);
                }
                break;
            case 5://Navegador
                indicePergAnt[++i] = indicePerg;//guarda o indice anterior
                if (maquina.consulta(5, 1, 0, cb_Resposta3.getSelectedIndex()) == 1) {
                    Interface(0);
                    txt_Pergunta1.setText(Respostas(4));
                } else if (maquina.consulta(5, 1, 0, cb_Resposta3.getSelectedIndex()) == 2) {
                    Interface(0);
                    txt_Pergunta1.setText(Respostas(5));
                } else if (maquina.consulta(5, 1, 0, cb_Resposta3.getSelectedIndex()) == 3) {
                    Interface(0);
                    txt_Pergunta1.setText(Respostas(9));
                }
                break;
            case 6://Site
                indicePergAnt[++i] = indicePerg;//guarda o indice anterior
                if (maquina.consulta(6, cb_Resposta1.getSelectedIndex(), 0, 0) == 1) {
                    Interface(0);
                    txt_Pergunta1.setText(Respostas(6));
                }
                break;
            case 7://IP
                indicePergAnt[++i] = indicePerg;//guarda o indice anterior
                if (maquina.consulta(7, cb_Resposta1.getSelectedIndex(), cb_Resposta2.getSelectedIndex(), 0) == 1) {
                    Interface(0);
                    txt_Pergunta1.setText(Respostas(7));
                } else if (maquina.consulta(7, cb_Resposta1.getSelectedIndex(), cb_Resposta2.getSelectedIndex(), 0) == 2) {
                    Interface(0);
                    txt_Pergunta1.setText(Respostas(9));
                }
                break;
            case 8://DNS
                indicePergAnt[++i] = indicePerg;//guarda o indice anterior
                if (maquina.consulta(8, cb_Resposta1.getSelectedIndex(), 0, 0) == 1) {
                    Interface(0);
                    txt_Pergunta1.setText(Respostas(2));
                }
                break;
            case 9://DOWNLOAD
                indicePergAnt[++i] = indicePerg;//guarda o indice anterior
                if (maquina.consulta(9, cb_Resposta1.getSelectedIndex(), cb_Resposta2.getSelectedIndex(), 0) == 1) {
                    Interface(0);
                    txt_Pergunta1.setText(Respostas(8));
                } else if (maquina.consulta(9, cb_Resposta1.getSelectedIndex(), cb_Resposta2.getSelectedIndex(), 0) == 2) {
                    Interface(0);
                    txt_Pergunta1.setText(Respostas(2));
                } else {
                    indicePerg = 7;
                    indInterfacePergunta(indicePerg);
                }
                break;
            case 10://PROBLEMA
                indicePergAnt[++i] = indicePerg;//guarda o indice anterior
                if (maquina.consulta(10, cb_Resposta1.getSelectedIndex(), 0, 0) == 1) {
                    Interface(0);
                    txt_Pergunta1.setText(Respostas(9));
                    bt_Cont.setVisible(false);
                }
                break;
        }
    }

    private String Perguntas(int i) {
        String[] txt = new String[14];
        txt[0] = "Você está com internet?";
        txt[1] = "O cabo está conectado?";
        txt[2] = "Tem um triângulo amarelo no ícone da internet próximo a hora?";
        txt[3] = "Aparece a menssagem: 'não foi possível conectar'?";
        txt[4] = "Aparece a mensagem: 'Acesso negado ao cache ou url inválida'?";
        txt[5] = "Você sabe o que é proxy?";
        txt[6] = "Qual navegador você usa?";
        txt[7] = "É só um site específico que você não consegue acesar?";
        txt[8] = "Execute a solução de problemas do Windows. Deu problema no IP?";
        txt[9] = "Você sabe o que é IP?";
        txt[10] = "Apareceu problemas no DNS?";
        txt[11] = "A internet está lenta?";
        txt[12] = "Você está fazendo download?";
        txt[13] = "O seu problema foi solucionado?";
        return txt[i];
    }

    private String Respostas(int i) {
        String[] txt = new String[13];

        txt[1] = "Conecte o cabo";
        txt[2] = "Ligue Para o responsável pela sua internet";
        txt[3] = "Altere o Proxy";
        txt[4] = "Abra o chrome, vá em configurações->avançadas->rede->Alterar proxy";
        txt[5] = "Abra o Firefox, vá em editar->preferências->avançadas->rede->Alterar proxy";
        txt[6] = "Tente outro navegador";
        txt[7] = "Verifique se o IP está fixo";
        txt[8] = "Está lenta por causa do download";
        txt[9] = "Chame um tecnico!?";
        return txt[i];
    }

    public void Interface(int i) {
        if (i == 1) {
            //Uma pergunta
            cb_Resposta1.setVisible(true);
            cb_Resposta2.setVisible(false);
            cb_Resposta3.setVisible(false);

            bt_Bt1.setVisible(true);
            bt_Bt2.setVisible(true);
            bt_Exit.setVisible(false);
            bt_Cont.setVisible(false);

            txt_Pergunta1.setVisible(true);
            txt_Pergunta2.setVisible(false);
            txt_Pergunta3.setVisible(false);
            bt_Bt2.setText("Anterior");
            bt_Bt1.setText("Prox");

        } else if (i == 2) {
            //2 Perguntas
            cb_Resposta1.setVisible(true);
            cb_Resposta2.setVisible(true);
            cb_Resposta3.setVisible(false);

            bt_Bt1.setVisible(true);
            bt_Bt2.setVisible(true);
            bt_Exit.setVisible(false);
            bt_Cont.setVisible(false);

            txt_Pergunta1.setVisible(true);
            txt_Pergunta2.setVisible(true);
            txt_Pergunta3.setVisible(false);
            bt_Bt2.setText("Anterior");
            bt_Bt1.setText("Prox");

        } else if (i == 3) {
            //3 perguntas
            cb_Resposta1.setVisible(false);
            cb_Resposta2.setVisible(false);
            cb_Resposta3.setVisible(true);

            bt_Bt1.setVisible(true);
            bt_Bt2.setVisible(true);
            bt_Exit.setVisible(false);
            bt_Cont.setVisible(false);

            txt_Pergunta1.setVisible(false);
            txt_Pergunta2.setVisible(false);
            txt_Pergunta3.setVisible(true);
            bt_Bt2.setText("Anterior");
            bt_Bt1.setText("Prox");

        } else if (i == 0) {
            //resposta
            cb_Resposta1.setVisible(false);
            cb_Resposta2.setVisible(false);
            cb_Resposta3.setVisible(false);

            bt_Bt1.setVisible(false);
            bt_Bt2.setVisible(false);
            bt_Exit.setVisible(true);
            bt_Cont.setVisible(true);

            txt_Pergunta1.setVisible(true);
            txt_Pergunta2.setVisible(false);
            txt_Pergunta3.setVisible(true);
            txt_Pergunta3.setText(Perguntas(13));

        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceInicial().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Bt1;
    private javax.swing.JButton bt_Bt2;
    private javax.swing.JButton bt_Cont;
    private javax.swing.JButton bt_Exit;
    private javax.swing.JComboBox<String> cb_Resposta1;
    private javax.swing.JComboBox<String> cb_Resposta2;
    private javax.swing.JComboBox<String> cb_Resposta3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txt_Pergunta1;
    private javax.swing.JLabel txt_Pergunta2;
    private javax.swing.JLabel txt_Pergunta3;
    // End of variables declaration//GEN-END:variables
}
