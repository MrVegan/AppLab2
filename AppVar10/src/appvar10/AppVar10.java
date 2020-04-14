package appvar10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;


public class AppVar10 extends javax.swing.JFrame {

    CheckingNumbers checkingNumbers = new CheckingNumbers();
    public AppVar10() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jTextEnterArray = new javax.swing.JTextField();
        jButtonLoadFromFile = new javax.swing.JButton();
        jButtonLoadRandomly = new javax.swing.JButton();
        jButtonСalculate = new javax.swing.JButton();
        jButtonSaveFile = new javax.swing.JButton();
        jLabelAnswer = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextEnterArray.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextEnterArrayInputMethodTextChanged(evt);
            }
        });
        jTextEnterArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEnterArrayActionPerformed(evt);
            }
        });
        jTextEnterArray.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextEnterArrayKeyTyped(evt);
            }
        });

        jButtonLoadFromFile.setText("Загрузить из файла");
        jButtonLoadFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadFromFileActionPerformed(evt);
            }
        });

        jButtonLoadRandomly.setText("Загрузить случайных массив");
        jButtonLoadRandomly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadRandomlyActionPerformed(evt);
            }
        });

        jButtonСalculate.setText("Вычислить ");
        jButtonСalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonСalculateActionPerformed(evt);
            }
        });

        jButtonSaveFile.setText("Сохранить в файл");
        jButtonSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveFileActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4", "5", "6", "7", "8", "9", "10", "11" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Выбраться размер случайного массива");

        jLabel4.setText("Ответ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextEnterArray, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButtonСalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonLoadFromFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLoadRandomly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(214, 214, 214)
                        .addComponent(jButtonSaveFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonLoadFromFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLoadRandomly)
                            .addComponent(jButtonСalculate)))
                    .addComponent(jTextEnterArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSaveFile)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextEnterArrayInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextEnterArrayInputMethodTextChanged
        int i=0;
        i++;        
    }//GEN-LAST:event_jTextEnterArrayInputMethodTextChanged

    private void jButtonLoadRandomlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadRandomlyActionPerformed
        int length = Integer.parseInt(jComboBox2.getSelectedItem().toString());
        ArrayList<Integer> listInt = new ArrayList<>();
        String string = "";
        for(int i =0; i<length; i++){
            int rand = (int) (Math.random() * 999) + 1;
            listInt.add(rand);
            string += i == length - 1 ? String.valueOf(rand) : String.valueOf(rand)+ " ";
        }
        jTextEnterArray.setText(string);  
        Transposition transposition = new Transposition();
        String startTransposition = transposition.startTransposition(string);
        jLabelAnswer.setText(startTransposition);
        
        
    }//GEN-LAST:event_jButtonLoadRandomlyActionPerformed

    private void jTextEnterArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEnterArrayActionPerformed
        if(checkingNumbers.CheckingFromTextBox(evt.getActionCommand())){
            Transposition transposition = new Transposition();
            String startTransposition = transposition.startTransposition(jTextEnterArray.getText());
            jLabelAnswer.setText(startTransposition);
        }
    }//GEN-LAST:event_jTextEnterArrayActionPerformed

    private void jTextEnterArrayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEnterArrayKeyTyped
        if(!checkingNumbers.CheckingKeyInTextBox(String.valueOf(evt.getKeyChar())))
              evt.consume();          
    }//GEN-LAST:event_jTextEnterArrayKeyTyped

    private void jButtonСalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonСalculateActionPerformed
        if(checkingNumbers.CheckingFromTextBox(jTextEnterArray.getText())){
            Transposition transposition = new Transposition();
            String startTransposition = transposition.startTransposition(jTextEnterArray.getText());
            jLabelAnswer.setText(startTransposition);
        }
    }//GEN-LAST:event_jButtonСalculateActionPerformed

    private void jButtonSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveFileActionPerformed
        JFileChooser fileopen = new JFileChooser();
        int ret = fileopen.showDialog(null, "Открыть файл");
        
        FileOutputStream fileOutputStream;
        String string = jLabelAnswer.getText();
        if (ret == JFileChooser.APPROVE_OPTION) {
            string = string.replaceAll(", ", ";");
            string = string.substring(1, string.length()-1);
            //string = string.replaceAll(String.valueOf((char)91), "");
            //string = string.replaceAll(String.valueOf((char)93), "");
            
            try {
                File file = fileopen.getSelectedFile();
                fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(string.getBytes());
            } catch (IOException ex) {
                Logger.getLogger(AppVar10.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
             
       
    }//GEN-LAST:event_jButtonSaveFileActionPerformed

    private void jButtonLoadFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadFromFileActionPerformed
    JFileChooser fileopen = new JFileChooser();
    int ret = fileopen.showDialog(null, "Открыть файл");
    FileInputStream input;
    String string = "";
    String string1 = "";
    if (ret == JFileChooser.APPROVE_OPTION) {
        File file = fileopen.getSelectedFile();
        try {
            input = new FileInputStream(file);            
            int i;
            while((i=input.read())!= -1){
                string += String.valueOf((char) i);
            }
            if (checkingNumbers.CheckingFromFile(string)){
                string1 = string.replace(';', ' ');
                jTextEnterArray.setText(string1);
                Transposition transposition = new Transposition();
                String startTransposition = transposition.startTransposition(string1);
                jLabelAnswer.setText(startTransposition);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppVar10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppVar10.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }
    }//GEN-LAST:event_jButtonLoadFromFileActionPerformed

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
            java.util.logging.Logger.getLogger(AppVar10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppVar10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppVar10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppVar10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppVar10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLoadFromFile;
    private javax.swing.JButton jButtonLoadRandomly;
    private javax.swing.JButton jButtonSaveFile;
    private javax.swing.JButton jButtonСalculate;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAnswer;
    private javax.swing.JTextField jTextEnterArray;
    // End of variables declaration//GEN-END:variables
}
