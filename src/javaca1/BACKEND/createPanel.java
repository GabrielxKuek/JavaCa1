/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaca1.BACKEND;

/**
 *
 * @author Gabriel Kuek
 */
public class createPanel extends javax.swing.JFrame {

    /**
     * Creates new form createPanel
     */
    public createPanel() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        background = new javax.swing.JPanel();
        topNav = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        createHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        createContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(49, 54, 63));

        topNav.setBackground(new java.awt.Color(34, 40, 49));
        topNav.setPreferredSize(new java.awt.Dimension(785, 50));

        javax.swing.GroupLayout topNavLayout = new javax.swing.GroupLayout(topNav);
        topNav.setLayout(topNavLayout);
        topNavLayout.setHorizontalGroup(
            topNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        topNavLayout.setVerticalGroup(
            topNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        content.setOpaque(false);

        form.setBackground(new java.awt.Color(217, 217, 217));
        form.setMinimumSize(new java.awt.Dimension(263, 100));
        form.setLayout(new javax.swing.BoxLayout(form, javax.swing.BoxLayout.Y_AXIS));

        createHeader.setBackground(new java.awt.Color(34, 40, 49));
        createHeader.setMinimumSize(new java.awt.Dimension(263, 0));
        createHeader.setPreferredSize(new java.awt.Dimension(263, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Create Student");

        javax.swing.GroupLayout createHeaderLayout = new javax.swing.GroupLayout(createHeader);
        createHeader.setLayout(createHeaderLayout);
        createHeaderLayout.setHorizontalGroup(
            createHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
            .addGroup(createHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(createHeaderLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        createHeaderLayout.setVerticalGroup(
            createHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(createHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(createHeaderLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        form.add(createHeader);

        createContent.setOpaque(false);
        createContent.setPreferredSize(new java.awt.Dimension(263, 300));

        javax.swing.GroupLayout createContentLayout = new javax.swing.GroupLayout(createContent);
        createContent.setLayout(createContentLayout);
        createContentLayout.setHorizontalGroup(
            createContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        createContentLayout.setVerticalGroup(
            createContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        form.add(createContent);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(topNav, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(createPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel content;
    private javax.swing.JPanel createContent;
    private javax.swing.JPanel createHeader;
    private javax.swing.JPanel form;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel topNav;
    // End of variables declaration//GEN-END:variables
}