/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ncirl.softeng.investments;

import ie.ncirl.softeng.clients.Client;
import ie.ncirl.softeng.security.SubsystemsGui;
import java.util.Random;

/**
 *
 * @author x12112348
 */
public class InvestmentGui extends javax.swing.JFrame {

    String Company1 = "MICKROSOFT";
    String Company2 = "MICKDONALDS";
    String Company3 = "EXRON";
    int One = 52;
    int Two = 54;
    int Three = 12;
    String POne = Integer.toString(One);
    String PTwo = Integer.toString(Two);
    String PThree = Integer.toString(Three);
    String TThree, TTwo, TOne;
    int randomInt;
    int randomInt2;
    int randomInt3;
    Client c;

    /**
     * Creates new form InvestmentGui
     * @param c
     */
    public InvestmentGui(Client c) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("JBank Inc.");
        off();
        display();
        price();
        gen();
        gen2();
        gen3();
        this.c = c;
    }

    public void gen() {
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 1; ++idx) {
            randomInt = randomGenerator.nextInt(100);
            System.out.println(randomInt);
            TOne = Integer.toString(randomInt);
        }
    }

    public void gen2() {
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 1; ++idx) {
            randomInt2 = randomGenerator.nextInt(60);
            System.out.println(randomInt2);
            TTwo = Integer.toString(randomInt2);

        }
    }

    public void gen3() {
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 1; ++idx) {
            randomInt3 = randomGenerator.nextInt(60);
            System.out.println(randomInt3);
            TThree = Integer.toString(randomInt3);

        }
    }

    public String display() {
        CompanyOne.setText(Company1);
        CompanyTwo.setText(Company2);
        CompanyThree.setText(Company3);
        return null;

    }

    public String price() {
        Over3.setText("€" + POne);
        Over2.setText("€" + PTwo);
        Over1.setText("€" + PThree);
        return null;

    }

    public void off() {
        Arrow2.setVisible(false);
        Arrow3.setVisible(false);
        Arrow5.setVisible(false);
        Arrow6.setVisible(false);
        ArrowOne.setVisible(false);
        Arrow4.setVisible(false);
        Over1.setVisible(false);
        Over2.setVisible(false);
        Over3.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        CompanyOne = new javax.swing.JLabel();
        CompanyTwo = new javax.swing.JLabel();
        CompanyThree = new javax.swing.JLabel();
        Pricetwo = new javax.swing.JLabel();
        Price3 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        Compare = new javax.swing.JButton();
        ArrowOne = new javax.swing.JLabel();
        Arrow2 = new javax.swing.JLabel();
        Arrow3 = new javax.swing.JLabel();
        Arrow4 = new javax.swing.JLabel();
        Arrow5 = new javax.swing.JLabel();
        Arrow6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Over1 = new javax.swing.JLabel();
        Over3 = new javax.swing.JLabel();
        Over2 = new javax.swing.JLabel();
        Backround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Utsaah", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html>All shares prices are not static and fluxuate please update your shares by pressing</br> the compare button below. </html> ");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(20, 100, 340, 50);

        CompanyOne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CompanyOne.setForeground(new java.awt.Color(255, 255, 255));
        CompanyOne.setText("y");
        jLayeredPane1.add(CompanyOne);
        CompanyOne.setBounds(30, 200, 100, 40);

        CompanyTwo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CompanyTwo.setForeground(new java.awt.Color(255, 255, 255));
        CompanyTwo.setText("Y");
        jLayeredPane1.add(CompanyTwo);
        CompanyTwo.setBounds(150, 200, 110, 40);

        CompanyThree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CompanyThree.setForeground(new java.awt.Color(255, 255, 255));
        CompanyThree.setText("Y");
        jLayeredPane1.add(CompanyThree);
        CompanyThree.setBounds(270, 200, 80, 40);
        jLayeredPane1.add(Pricetwo);
        Pricetwo.setBounds(140, 360, 60, 40);
        jLayeredPane1.add(Price3);
        Price3.setBounds(260, 360, 60, 40);
        jLayeredPane1.add(Price);
        Price.setBounds(40, 360, 60, 30);

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jLayeredPane1.add(backBtn);
        backBtn.setBounds(190, 483, 180, 30);

        Compare.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Compare.setText("Check");
        Compare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompareActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Compare);
        Compare.setBounds(0, 483, 170, 30);

        ArrowOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/investmentb/Darrow.png"))); // NOI18N
        jLayeredPane1.add(ArrowOne);
        ArrowOne.setBounds(50, 270, 40, 40);

        Arrow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/investmentb/Darrow.png"))); // NOI18N
        jLayeredPane1.add(Arrow2);
        Arrow2.setBounds(160, 270, 40, 40);

        Arrow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/investmentb/Darrow.png"))); // NOI18N
        jLayeredPane1.add(Arrow3);
        Arrow3.setBounds(270, 270, 40, 40);

        Arrow4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/investmentb/Garrow.png"))); // NOI18N
        jLayeredPane1.add(Arrow4);
        Arrow4.setBounds(40, 270, 0, 40);

        Arrow5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/investmentb/Garrow.png"))); // NOI18N
        jLayeredPane1.add(Arrow5);
        Arrow5.setBounds(154, 270, 60, 40);

        Arrow6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/investmentb/Garrow.png"))); // NOI18N
        jLayeredPane1.add(Arrow6);
        Arrow6.setBounds(260, 270, 60, 40);

        jLabel2.setFont(new java.awt.Font("Utsaah", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Investment BankingApp");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(20, 10, 340, 50);

        jLabel3.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("your investments are below:");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(20, 60, 340, 50);

        Over1.setText("Y");
        jLayeredPane1.add(Over1);
        Over1.setBounds(270, 420, 50, 30);

        Over3.setText("Y");
        jLayeredPane1.add(Over3);
        Over3.setBounds(50, 420, 50, 30);

        Over2.setText("Y");
        jLayeredPane1.add(Over2);
        Over2.setBounds(150, 420, 50, 30);

        Backround.setBackground(new java.awt.Color(102, 204, 255));
        Backround.setOpaque(true);
        jLayeredPane1.add(Backround);
        Backround.setBounds(0, 0, 370, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        SubsystemsGui sg = new SubsystemsGui(c);
    }//GEN-LAST:event_backBtnActionPerformed

    private void CompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompareActionPerformed
        //CompanyOne
        if (One < randomInt) {

            int A = One + randomInt;
            String B = Integer.toString(A);

            //Setting labels
            Price.setText("+" + TOne + " Points");
            Over3.setText("€" + B);

            //Arrows
            Arrow4.setVisible(true);
            ArrowOne.setVisible(false);
            Over3.setVisible(true);

            //System print out
            System.out.println("Green");
        } else {
            int A = One - randomInt;
            String B = Integer.toString(A);

            Price.setText("-" + TOne + " Points");
            Over3.setText("€" + B);

            //Arrows
            ArrowOne.setVisible(true);
            Arrow4.setVisible(false);
            Over3.setVisible(true);

            System.out.println("Red");

        }
        //Company two
        if (Two < randomInt2) {

            int A = Two + randomInt2;
            String B = Integer.toString(A);

            //Setting set
            Pricetwo.setText("+" + TTwo + " Points");
            Over2.setText("€" + B);

            //Arrows
            Arrow5.setVisible(true);
            Arrow2.setVisible(false);
            Over2.setVisible(true);

            System.out.println("Green");
        } else {

            int A = Two - randomInt2;
            String B = Integer.toString(A);

            //Setting Text
            Pricetwo.setText("-" + TTwo + " Points");
            Over2.setText("€" + B);

            //Arrows
            Arrow2.setVisible(true);
            Arrow5.setVisible(false);
            Over2.setVisible(true);

            System.out.println("Red");

        }

        //Company Three
        if (Three < randomInt3) {

            int A = Three + randomInt3;
            String B = Integer.toString(A);

            //Setting Text 
            Price3.setText("+" + TThree + " Points");
            Over1.setText("€" + B);

            //Arrows
            Arrow6.setVisible(true);
            Arrow3.setVisible(false);
            Over1.setVisible(true);

            System.out.println("Green");
        } else {
            int A = Three - randomInt3;
            String B = Integer.toString(A);

            //setting Text
            Price3.setText("-" + TThree + " Points");
            Over1.setText("€" + B);

            //Arrows
            Arrow3.setVisible(true);
            Arrow6.setVisible(false);
            Over1.setVisible(true);

            System.out.println("Red");

        }
        gen();
        gen2();
        gen3();
    }//GEN-LAST:event_CompareActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arrow2;
    private javax.swing.JLabel Arrow3;
    private javax.swing.JLabel Arrow4;
    private javax.swing.JLabel Arrow5;
    private javax.swing.JLabel Arrow6;
    private javax.swing.JLabel ArrowOne;
    private javax.swing.JLabel Backround;
    private javax.swing.JLabel CompanyOne;
    private javax.swing.JLabel CompanyThree;
    private javax.swing.JLabel CompanyTwo;
    private javax.swing.JButton Compare;
    private javax.swing.JLabel Over1;
    private javax.swing.JLabel Over2;
    private javax.swing.JLabel Over3;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel Price3;
    private javax.swing.JLabel Pricetwo;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
