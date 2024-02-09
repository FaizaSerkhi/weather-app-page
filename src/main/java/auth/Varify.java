/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package auth;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author haris
 */
public class Varify extends javax.swing.JPanel {

    /**
     * Creates new form Varify
     */
 
    public Varify() {
        initComponents();
        pop_panel = new PanelRound();
        setOpaque(false);
        setFocusCycleRoot(true);
        super.setVisible(false);
        addMouseListener(new MouseAdapter() {
        });
    }

    @Override
    public void setVisible(boolean bln) {
        super.setVisible(bln);
        if (bln) {
            txtField.grabFocus();
            txtField.setText("");
        }
    }
     @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setColor(new Color(50, 50, 50));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.setComposite(AlphaComposite.SrcOver);
        super.paintComponent(grphcs);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop_panel = new PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmdOK = new javax.swing.JButton();
        cmdCancle = new javax.swing.JButton();
        txtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 102));
        setPreferredSize(new java.awt.Dimension(550, 294));

        pop_panel.setPreferredSize(new java.awt.Dimension(450, 194));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 63, 63));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Verify Code");

        jLabel2.setForeground(new java.awt.Color(63, 63, 63));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Check your mail to get verify code");

        cmdOK.setText("ok");

        cmdCancle.setText("Cancle");
        cmdCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancleActionPerformed(evt);
            }
        });

        txtField.setText("jTextField1");

        javax.swing.GroupLayout pop_panelLayout = new javax.swing.GroupLayout(pop_panel);
        pop_panel.setLayout(pop_panelLayout);
        pop_panelLayout.setHorizontalGroup(
            pop_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pop_panelLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(pop_panelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(cmdOK)
                .addGap(42, 42, 42)
                .addComponent(cmdCancle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pop_panelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(pop_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtField)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89))
        );
        pop_panelLayout.setVerticalGroup(
            pop_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pop_panelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(pop_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdOK)
                    .addComponent(cmdCancle))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(pop_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(pop_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancleActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cmdCancleActionPerformed
     public String getInputCode() {
        return txtField.getText().trim();
    }

    public void addEventButtonOK(ActionListener event) {
        cmdOK.addActionListener(event);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCancle;
    private javax.swing.JButton cmdOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pop_panel;
    private javax.swing.JTextField txtField;
    // End of variables declaration//GEN-END:variables
}
