/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author senpai
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        btn_piedra = new javax.swing.JButton();
        btn_papel = new javax.swing.JButton();
        btn_tijera = new javax.swing.JButton();
        lbl_resultado = new javax.swing.JLabel();
        lbl_resultado2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_piedra.setText("Piedra");
        btn_piedra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_piedraMousePressed(evt);
            }
        });

        btn_papel.setText("Papel");
        btn_papel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_papelMousePressed(evt);
            }
        });

        btn_tijera.setText("Tijera");
        btn_tijera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tijeraMousePressed(evt);
            }
        });

        lbl_resultado.setText("jLabel1");

        lbl_resultado2.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btn_piedra)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_resultado2)
                    .addComponent(lbl_resultado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_papel)
                        .addGap(42, 42, 42)
                        .addComponent(btn_tijera)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_resultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_resultado2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_piedra)
                    .addComponent(btn_papel)
                    .addComponent(btn_tijera))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_piedraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_piedraMousePressed
        Random random = new Random();
Scanner scanner = new Scanner(System.in);

int userChoice, computerChoice;
System.out.println("Enter move (0 = Rock; 1 = Paper; 2 = Scissors):");
userChoice = 0;
if(userChoice < 0 || userChoice > 2)
{
System.out.println("Invalid choice. Ending program.");
System.exit(0);
}

computerChoice = random.nextInt(3);

if(userChoice == computerChoice)
{
if(userChoice == 0)
{
lbl_resultado.setText("Both players chose rock!");
}
else if (userChoice == 1)
{
lbl_resultado.setText("Both players chose paper!");
}
else
{
lbl_resultado.setText("Both players chose scissors!");
}

}
if(userChoice == 0) 
{
if(computerChoice == 1)
{
lbl_resultado.setText("You chose rock; Computer chose paper");
lbl_resultado2.setText("Computer wins!");
}
else
{
lbl_resultado.setText("You chose rock; Computer chose scissors");
lbl_resultado2.setText("You win!");
}
}
else if(userChoice == 1) 
{
if(computerChoice == 0)
{
lbl_resultado.setText("You chose paper; Computer chose rock");
lbl_resultado2.setText("You win!");
}
else
{
lbl_resultado.setText("You chose paper; Computer chose scissors");
lbl_resultado2.setText("Computer wins!");
}
}
else	
{
if(computerChoice == 0)
{
lbl_resultado.setText("You chose scissors; Computer chose rock");
lbl_resultado2.setText("Computer wins!");
}
else
{
lbl_resultado.setText("You chose scissors; Computer chose paper");
lbl_resultado2.setText("You win!");
}
}
scanner.close();
    }//GEN-LAST:event_btn_piedraMousePressed

    private void btn_papelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_papelMousePressed
        Random random = new Random();
Scanner scanner = new Scanner(System.in);

int userChoice, computerChoice;
System.out.println("Enter move (0 = Rock; 1 = Paper; 2 = Scissors):");
userChoice = 1;
if(userChoice < 0 || userChoice > 2)
{
System.out.println("Invalid choice. Ending program.");
System.exit(0);
}

computerChoice = random.nextInt(3);

if(userChoice == computerChoice)
{
if(userChoice == 0)
{
lbl_resultado.setText("Both players chose rock!");
}
else if (userChoice == 1)
{
lbl_resultado.setText("Both players chose paper!");
}
else
{
lbl_resultado.setText("Both players chose scissors!");
}

}
if(userChoice == 0) 
{
if(computerChoice == 1)
{
lbl_resultado.setText("You chose rock; Computer chose paper");
lbl_resultado2.setText("Computer wins!");
}
else
{
lbl_resultado.setText("You chose rock; Computer chose scissors");
lbl_resultado2.setText("You win!");
}
}
else if(userChoice == 1) 
{
if(computerChoice == 0)
{
lbl_resultado.setText("You chose paper; Computer chose rock");
lbl_resultado2.setText("You win!");
}
else
{
lbl_resultado.setText("You chose paper; Computer chose scissors");
lbl_resultado2.setText("Computer wins!");
}
}
else	
{
if(computerChoice == 0)
{
lbl_resultado.setText("You chose scissors; Computer chose rock");
lbl_resultado2.setText("Computer wins!");
}
else
{
lbl_resultado.setText("You chose scissors; Computer chose paper");
lbl_resultado2.setText("You win!");
}
}
scanner.close();
    }//GEN-LAST:event_btn_papelMousePressed

    private void btn_tijeraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tijeraMousePressed
        Random random = new Random();
Scanner scanner = new Scanner(System.in);

int userChoice, computerChoice;
System.out.println("Enter move (0 = Rock; 1 = Paper; 2 = Scissors):");
userChoice = 2;
if(userChoice < 0 || userChoice > 2)
{
System.out.println("Invalid choice. Ending program.");
System.exit(0);
}

computerChoice = random.nextInt(3);

if(userChoice == computerChoice)
{
if(userChoice == 0)
{
lbl_resultado.setText("Both players chose rock!");
}
else if (userChoice == 1)
{
lbl_resultado.setText("Both players chose paper!");
}
else
{
lbl_resultado.setText("Both players chose scissors!");
}

}
if(userChoice == 0) 
{
if(computerChoice == 1)
{
lbl_resultado.setText("You chose rock; Computer chose paper");
lbl_resultado2.setText("Computer wins!");
}
else
{
lbl_resultado.setText("You chose rock; Computer chose scissors");
lbl_resultado2.setText("You win!");
}
}
else if(userChoice == 1) 
{
if(computerChoice == 0)
{
lbl_resultado.setText("You chose paper; Computer chose rock");
lbl_resultado2.setText("You win!");
}
else
{
lbl_resultado.setText("You chose paper; Computer chose scissors");
lbl_resultado2.setText("Computer wins!");
}
}
else	
{
if(computerChoice == 0)
{
lbl_resultado.setText("You chose scissors; Computer chose rock");
lbl_resultado2.setText("Computer wins!");
}
else
{
lbl_resultado.setText("You chose scissors; Computer chose paper");
lbl_resultado2.setText("You win!");
}
}
scanner.close();
    }//GEN-LAST:event_btn_tijeraMousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_papel;
    private javax.swing.JButton btn_piedra;
    private javax.swing.JButton btn_tijera;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JLabel lbl_resultado2;
    // End of variables declaration//GEN-END:variables
}
