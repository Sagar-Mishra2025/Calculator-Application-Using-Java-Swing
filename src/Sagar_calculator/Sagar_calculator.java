/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sagar_calculator;
import javax.swing.JOptionPane;
/**
 *
 * @author Sagar Mishra
 */
public class Sagar_calculator extends javax.swing.JFrame 
{
    private int result = 0;
    private String inStr = "0";
    private char lastOperator = ' ';
    private Object Interger;
    /**
     * Creates new form NewJFrame
     */
    public Sagar_calculator() 
    {
        initComponents();
        TF.setText("0");
        TF.setEditable(false);
        setSize(500,500);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TF = new javax.swing.JTextField();
        B8 = new javax.swing.JButton();
        Bclear = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        Bsq = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        Equal = new javax.swing.JButton();
        Broot = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        Bpow = new javax.swing.JButton();
        Bmulti = new javax.swing.JButton();
        Bsub = new javax.swing.JButton();
        BAdd = new javax.swing.JButton();
        Bdiv = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        TF.setBackground(new java.awt.Color(0, 102, 153));
        TF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFActionPerformed(evt);
            }
        });
        getContentPane().add(TF);
        TF.setBounds(30, 50, 410, 73);

        B8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        getContentPane().add(B8);
        B8.setBounds(140, 150, 83, 43);

        Bclear.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        Bclear.setForeground(new java.awt.Color(255, 0, 0));
        Bclear.setText("AC");
        Bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BclearActionPerformed(evt);
            }
        });
        getContentPane().add(Bclear);
        Bclear.setBounds(140, 330, 83, 50);

        B2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2);
        B2.setBounds(140, 270, 83, 43);

        Bsq.setBackground(new java.awt.Color(102, 102, 102));
        Bsq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bsq.setText("Sqrt(x)");
        Bsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsqActionPerformed(evt);
            }
        });
        getContentPane().add(Bsq);
        Bsq.setBounds(130, 410, 100, 60);

        B9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        getContentPane().add(B9);
        B9.setBounds(250, 150, 83, 43);

        B6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        getContentPane().add(B6);
        B6.setBounds(250, 210, 83, 43);

        B3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3);
        B3.setBounds(250, 270, 83, 43);

        Equal.setBackground(new java.awt.Color(255, 176, 55));
        Equal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Equal.setText("=");
        Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualActionPerformed(evt);
            }
        });
        getContentPane().add(Equal);
        Equal.setBounds(250, 330, 90, 60);

        Broot.setBackground(new java.awt.Color(102, 102, 102));
        Broot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Broot.setText("Cube ");
        Broot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrootActionPerformed(evt);
            }
        });
        getContentPane().add(Broot);
        Broot.setBounds(250, 410, 90, 60);

        B7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        getContentPane().add(B7);
        B7.setBounds(30, 150, 83, 43);

        B4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4);
        B4.setBounds(30, 210, 83, 43);

        B1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1);
        B1.setBounds(30, 270, 83, 43);

        B0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });
        getContentPane().add(B0);
        B0.setBounds(30, 330, 83, 50);

        Bpow.setBackground(new java.awt.Color(102, 102, 102));
        Bpow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bpow.setText("X^Y");
        Bpow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpowActionPerformed(evt);
            }
        });
        getContentPane().add(Bpow);
        Bpow.setBounds(30, 410, 83, 60);

        Bmulti.setBackground(new java.awt.Color(255, 176, 55));
        Bmulti.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bmulti.setText("*");
        Bmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmultiActionPerformed(evt);
            }
        });
        getContentPane().add(Bmulti);
        Bmulti.setBounds(360, 210, 83, 43);

        Bsub.setBackground(new java.awt.Color(255, 176, 55));
        Bsub.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bsub.setText("-");
        Bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsubActionPerformed(evt);
            }
        });
        getContentPane().add(Bsub);
        Bsub.setBounds(360, 270, 83, 43);

        BAdd.setBackground(new java.awt.Color(255, 176, 55));
        BAdd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BAdd.setText("+");
        BAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAddActionPerformed(evt);
            }
        });
        getContentPane().add(BAdd);
        BAdd.setBounds(360, 320, 80, 150);

        Bdiv.setBackground(new java.awt.Color(255, 176, 55));
        Bdiv.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bdiv.setText("/");
        Bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdivActionPerformed(evt);
            }
        });
        getContentPane().add(Bdiv);
        Bdiv.setBounds(360, 150, 83, 43);

        B5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5);
        B5.setBounds(140, 210, 83, 43);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("Design By Sagar Mishra");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 10, 290, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
    String inDigit=B2.getText();
    Sagar(inDigit);
        // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
    String inDigit=B7.getText();
    Sagar(inDigit);
        // TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
    String inDigit=B8.getText();
    Sagar(inDigit);
        // TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
    String inDigit=B9.getText();
    Sagar(inDigit);
        // TODO add your handling code here:
    }//GEN-LAST:event_B9ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
    String inDigit=B4.getText();
    Sagar(inDigit);
        // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
    String inDigit=B5.getText();
    Sagar(inDigit);
        // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
    String inDigit=B6.getText();
    Sagar(inDigit);
        // TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
    String inDigit=B1.getText();
    Sagar(inDigit);
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
    String inDigit=B3.getText();
    Sagar(inDigit);
        // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
    String inDigit=B0.getText();
    Sagar(inDigit);
        // TODO add your handling code here:
    }//GEN-LAST:event_B0ActionPerformed

    private void BclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclearActionPerformed
        result = 0;
        inStr = "0";
        lastOperator = ' ';
        TF.setText("0");
        // TODO add your handling code here:
    }//GEN-LAST:event_BclearActionPerformed

    private void EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualActionPerformed
        compute(); lastOperator = '=';
        // TODO add your handling code here:
    }//GEN-LAST:event_EqualActionPerformed

    private void BdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdivActionPerformed
        compute(); lastOperator = '/';
        // TODO add your handling code here:
    }//GEN-LAST:event_BdivActionPerformed

    private void BmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmultiActionPerformed
        compute(); lastOperator = '*';
        // TODO add your handling code here:
    }//GEN-LAST:event_BmultiActionPerformed

    private void BsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsubActionPerformed
        compute(); lastOperator = '-';
        // TODO add your handling code here:
    }//GEN-LAST:event_BsubActionPerformed

    private void BAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAddActionPerformed
           compute(); lastOperator = '+';
        // TODO add your handling code here:
    }//GEN-LAST:event_BAddActionPerformed

    private void BpowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpowActionPerformed
        compute(); lastOperator = '^';
// TODO add your handling code here:
    }//GEN-LAST:event_BpowActionPerformed

    private void BsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsqActionPerformed
        compute(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_BsqActionPerformed

    private void BrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrootActionPerformed
        compute2(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_BrootActionPerformed
     
    private void Sagar(String inDigit)
    {
        if (inStr.equals("0"))
        {
            inStr = inDigit;          //No Leading Zero
        }
        else
        {
            inStr += inDigit;        //Append Input Digit
        }
        TF.setText(inStr);
        //Clear Buffer If Last Operator Is '='
        if (lastOperator == '=')
        {
            result = 0;
            lastOperator = ' ';
        }
    }
    
    private void compute1()
    {
        int inNum = Integer.parseInt(inStr);
        inStr = "0";
        result=(int)Math.sqrt(inNum);
        TF.setText(String.valueOf(result));
    }
    private void compute2()
    {
        int inNum = Integer.parseInt(inStr);
        inStr = "0";
        result=(int)Math.sqrt(inNum);
        TF.setText(String.valueOf(result));
    }
    
    private void compute()
    {
        int inNum = Integer.parseInt(inStr);
        inStr="0";
        if (lastOperator == ' ')
        {
            result = inNum;
        }
        else if (lastOperator == '+')
        {
            result += inNum;
        }
        else if (lastOperator == '-')
        {
            result -= inNum;
        }
        else if (lastOperator == '*')
        {
            result *= inNum;
        }
        else if (lastOperator == '/')
        {
            result /= inNum;
        }
        else if (lastOperator == '^')
        {
            int pow = 1;
            for(int i=1;i<=inNum;i++)
            {
                pow = pow * result;
            }
            result = pow;
        }
        else if(lastOperator == '=')
        {
           //Kepp The Result For The Next Operation
        }
       TF.setText(String.valueOf(result));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Sagar_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sagar_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sagar_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sagar_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new Sagar_calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BAdd;
    private javax.swing.JButton Bclear;
    private javax.swing.JButton Bdiv;
    private javax.swing.JButton Bmulti;
    private javax.swing.JButton Bpow;
    private javax.swing.JButton Broot;
    private javax.swing.JButton Bsq;
    private javax.swing.JButton Bsub;
    private javax.swing.JButton Equal;
    private javax.swing.JTextField TF;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
