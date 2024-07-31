/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaca1.FRONTEND;

/**
 *
 * @author Darren
 */
public class StudentAdminView extends javax.swing.JFrame {

    /**
     * Creates new form StudentUserView
     */
    public StudentAdminView() {
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

        jPanel2 = new javax.swing.JPanel();
        panelForStudentInfo = new javax.swing.JPanel();
        lblForName = new javax.swing.JLabel();
        lblForAdminNo = new javax.swing.JLabel();
        lblForClass = new javax.swing.JLabel();
        lblForGPA = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        AdminNo = new javax.swing.JTextField();
        Class = new javax.swing.JTextField();
        GPA = new javax.swing.JTextField();
        buttonForNextStudent = new javax.swing.JButton();
        buttonForPrevStudent = new javax.swing.JButton();
        panelForSearchStudentName = new javax.swing.JPanel();
        radioButtonForClass = new javax.swing.JRadioButton();
        radioButtonForName = new javax.swing.JRadioButton();
        TextFieldForInput = new javax.swing.JTextField();
        buttonForSearch = new javax.swing.JButton();
        panelForModuleInfo = new javax.swing.JPanel();
        lblForModCode = new javax.swing.JLabel();
        lblForModName = new javax.swing.JLabel();
        lblForMarks = new javax.swing.JLabel();
        lblForCredit = new javax.swing.JLabel();
        lblForGrade = new javax.swing.JLabel();
        ModCode = new javax.swing.JTextField();
        ModName = new javax.swing.JTextField();
        ModMarks = new javax.swing.JTextField();
        ModCredits = new javax.swing.JTextField();
        ModGrade = new javax.swing.JTextField();
        buttonForNextMod = new javax.swing.JButton();
        buttonForPrevMod = new javax.swing.JButton();
        panelForResults = new javax.swing.JPanel();
        panelForTextArea = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaForResults = new javax.swing.JTextArea();
        buttonForExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        panelForStudentInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Student 1 of 3"));
        panelForStudentInfo.setLayout(new java.awt.GridBagLayout());

        lblForName.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForStudentInfo.add(lblForName, gridBagConstraints);

        lblForAdminNo.setText("Admin No:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForStudentInfo.add(lblForAdminNo, gridBagConstraints);

        lblForClass.setText("Class:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForStudentInfo.add(lblForClass, gridBagConstraints);

        lblForGPA.setText("GPA: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForStudentInfo.add(lblForGPA, gridBagConstraints);

        Name.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForStudentInfo.add(Name, gridBagConstraints);

        AdminNo.setText("Admin No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForStudentInfo.add(AdminNo, gridBagConstraints);

        Class.setText("Class");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForStudentInfo.add(Class, gridBagConstraints);

        GPA.setText("GPA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForStudentInfo.add(GPA, gridBagConstraints);

        buttonForNextStudent.setText("Next");
        buttonForNextStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForNextStudentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 0, 0);
        panelForStudentInfo.add(buttonForNextStudent, gridBagConstraints);

        buttonForPrevStudent.setText("Prev");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 0, 0);
        panelForStudentInfo.add(buttonForPrevStudent, gridBagConstraints);

        jPanel2.add(panelForStudentInfo);

        panelForSearchStudentName.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        panelForSearchStudentName.setLayout(new java.awt.GridBagLayout());

        radioButtonForClass.setText("By Class");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        panelForSearchStudentName.add(radioButtonForClass, gridBagConstraints);

        radioButtonForName.setText("By Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForSearchStudentName.add(radioButtonForName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForSearchStudentName.add(TextFieldForInput, gridBagConstraints);

        buttonForSearch.setBackground(new java.awt.Color(153, 153, 0));
        buttonForSearch.setForeground(new java.awt.Color(0, 0, 0));
        buttonForSearch.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForSearchStudentName.add(buttonForSearch, gridBagConstraints);

        jPanel2.add(panelForSearchStudentName);

        panelForModuleInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Module 1 of 3"));
        panelForModuleInfo.setLayout(new java.awt.GridBagLayout());

        lblForModCode.setText("Mod Code:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForModuleInfo.add(lblForModCode, gridBagConstraints);

        lblForModName.setText("Mod Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForModuleInfo.add(lblForModName, gridBagConstraints);

        lblForMarks.setText("Marks");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForModuleInfo.add(lblForMarks, gridBagConstraints);

        lblForCredit.setText("Credits");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForModuleInfo.add(lblForCredit, gridBagConstraints);

        lblForGrade.setText("Grade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForModuleInfo.add(lblForGrade, gridBagConstraints);

        ModCode.setText("Mod Code");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForModuleInfo.add(ModCode, gridBagConstraints);

        ModName.setText("Mod Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForModuleInfo.add(ModName, gridBagConstraints);

        ModMarks.setText("Marks");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForModuleInfo.add(ModMarks, gridBagConstraints);

        ModCredits.setText("Credits");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForModuleInfo.add(ModCredits, gridBagConstraints);

        ModGrade.setText("Grade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForModuleInfo.add(ModGrade, gridBagConstraints);

        buttonForNextMod.setText("Next");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 0, 0);
        panelForModuleInfo.add(buttonForNextMod, gridBagConstraints);

        buttonForPrevMod.setText("Prev");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 0, 0);
        panelForModuleInfo.add(buttonForPrevMod, gridBagConstraints);

        jPanel2.add(panelForModuleInfo);

        panelForResults.setBorder(javax.swing.BorderFactory.createTitledBorder("Result"));
        panelForResults.setLayout(new java.awt.GridBagLayout());

        panelForTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setEnabled(false);

        TextAreaForResults.setEditable(false);
        TextAreaForResults.setColumns(20);
        TextAreaForResults.setRows(5);
        jScrollPane1.setViewportView(TextAreaForResults);

        javax.swing.GroupLayout panelForTextAreaLayout = new javax.swing.GroupLayout(panelForTextArea);
        panelForTextArea.setLayout(panelForTextAreaLayout);
        panelForTextAreaLayout.setHorizontalGroup(
            panelForTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
            .addGroup(panelForTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
        );
        panelForTextAreaLayout.setVerticalGroup(
            panelForTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
            .addGroup(panelForTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        panelForResults.add(panelForTextArea, gridBagConstraints);

        buttonForExit.setBackground(new java.awt.Color(153, 153, 0));
        buttonForExit.setForeground(new java.awt.Color(0, 0, 0));
        buttonForExit.setText("Exit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForResults.add(buttonForExit, gridBagConstraints);

        jPanel2.add(panelForResults);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonForNextStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForNextStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonForNextStudentActionPerformed

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
            java.util.logging.Logger.getLogger(StudentAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminNo;
    private javax.swing.JTextField Class;
    private javax.swing.JTextField GPA;
    private javax.swing.JTextField ModCode;
    private javax.swing.JTextField ModCredits;
    private javax.swing.JTextField ModGrade;
    private javax.swing.JTextField ModMarks;
    private javax.swing.JTextField ModName;
    private javax.swing.JTextField Name;
    private javax.swing.JTextArea TextAreaForResults;
    private javax.swing.JTextField TextFieldForInput;
    private javax.swing.JButton buttonForExit;
    private javax.swing.JButton buttonForNextMod;
    private javax.swing.JButton buttonForNextStudent;
    private javax.swing.JButton buttonForPrevMod;
    private javax.swing.JButton buttonForPrevStudent;
    private javax.swing.JButton buttonForSearch;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblForAdminNo;
    private javax.swing.JLabel lblForClass;
    private javax.swing.JLabel lblForCredit;
    private javax.swing.JLabel lblForGPA;
    private javax.swing.JLabel lblForGrade;
    private javax.swing.JLabel lblForMarks;
    private javax.swing.JLabel lblForModCode;
    private javax.swing.JLabel lblForModName;
    private javax.swing.JLabel lblForName;
    private javax.swing.JPanel panelForModuleInfo;
    private javax.swing.JPanel panelForResults;
    private javax.swing.JPanel panelForSearchStudentName;
    private javax.swing.JPanel panelForStudentInfo;
    private javax.swing.JPanel panelForTextArea;
    private javax.swing.JRadioButton radioButtonForClass;
    private javax.swing.JRadioButton radioButtonForName;
    // End of variables declaration//GEN-END:variables
}
