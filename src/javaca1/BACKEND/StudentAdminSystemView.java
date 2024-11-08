/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaca1.BACKEND;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Kuek, DITFT2A01, p2323220
 */
public class StudentAdminSystemView extends javax.swing.JFrame {
    
    private studentGUIController controller;
    private static final int PAGE_SIZE = 2; // Number of items per page
    private int currentPage = 1; // Current page
    private String[] studentData; // Array to hold student data for pagination
    
    public void setController(studentGUIController controller) {
        this.controller = controller;
    }
    
    private void initialize() {
        studentGUIController studentController = new studentGUIController();
        setController(studentController);
        displayStudentData();
    }

    /**
     * Creates new form StudentAdminSystemView
     */
    public StudentAdminSystemView() {
        initComponents();
        initialize();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelForTitle = new javax.swing.JPanel();
        lblForTitle = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        panelForSearch = new javax.swing.JPanel();
        radioButtonForName = new javax.swing.JRadioButton();
        radioButtonForClass = new javax.swing.JRadioButton();
        radioButtonForAdminNo = new javax.swing.JRadioButton();
        buttonForSearch = new javax.swing.JButton();
        buttonForNext = new javax.swing.JButton();
        buttonForPrevious = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        buttonForRefresh = new javax.swing.JButton();
        textFieldForSearch = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        panelForResults = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaForResults = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 54, 63));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        panelForTitle.setBackground(new java.awt.Color(34, 40, 49));
        panelForTitle.setPreferredSize(new java.awt.Dimension(791, 80));

        lblForTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblForTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblForTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForTitle.setText("Student Admin System");

        logoutButton.setText("logout");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelForTitleLayout = new javax.swing.GroupLayout(panelForTitle);
        panelForTitle.setLayout(panelForTitleLayout);
        panelForTitleLayout.setHorizontalGroup(
            panelForTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblForTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton)
                .addGap(28, 28, 28))
        );
        panelForTitleLayout.setVerticalGroup(
            panelForTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelForTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblForTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(logoutButton))
                .addContainerGap())
        );

        jPanel1.add(panelForTitle);

        panelForSearch.setBackground(new java.awt.Color(49, 54, 63));
        panelForSearch.setMinimumSize(new java.awt.Dimension(791, 100));
        panelForSearch.setPreferredSize(new java.awt.Dimension(791, 110));
        panelForSearch.setLayout(new java.awt.GridBagLayout());

        radioButtonForName.setBackground(new java.awt.Color(49, 54, 63));
        buttonGroup1.add(radioButtonForName);
        radioButtonForName.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonForName.setText("Name");
        radioButtonForName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonForNameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 40);
        panelForSearch.add(radioButtonForName, gridBagConstraints);

        radioButtonForClass.setBackground(new java.awt.Color(49, 54, 63));
        buttonGroup1.add(radioButtonForClass);
        radioButtonForClass.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonForClass.setText("Class");
        radioButtonForClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonForClassActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 40);
        panelForSearch.add(radioButtonForClass, gridBagConstraints);

        radioButtonForAdminNo.setBackground(new java.awt.Color(49, 54, 63));
        buttonGroup1.add(radioButtonForAdminNo);
        radioButtonForAdminNo.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonForAdminNo.setText("Admin No");
        radioButtonForAdminNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonForAdminNoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 40);
        panelForSearch.add(radioButtonForAdminNo, gridBagConstraints);

        buttonForSearch.setBackground(new java.awt.Color(34, 40, 49));
        buttonForSearch.setForeground(new java.awt.Color(255, 255, 255));
        buttonForSearch.setText("Search");
        buttonForSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForSearchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 20);
        panelForSearch.add(buttonForSearch, gridBagConstraints);

        buttonForNext.setBackground(new java.awt.Color(34, 40, 49));
        buttonForNext.setForeground(new java.awt.Color(255, 255, 255));
        buttonForNext.setText("Next");
        buttonForNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForNextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForSearch.add(buttonForNext, gridBagConstraints);

        buttonForPrevious.setBackground(new java.awt.Color(34, 40, 49));
        buttonForPrevious.setForeground(new java.awt.Color(255, 255, 255));
        buttonForPrevious.setText("Prev");
        buttonForPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForPreviousActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForSearch.add(buttonForPrevious, gridBagConstraints);

        adminButton.setText("Functions");
        adminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        panelForSearch.add(adminButton, gridBagConstraints);

        buttonForRefresh.setBackground(new java.awt.Color(34, 40, 49));
        buttonForRefresh.setForeground(new java.awt.Color(255, 255, 255));
        buttonForRefresh.setText("Refresh");
        buttonForRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForRefreshActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelForSearch.add(buttonForRefresh, gridBagConstraints);

        textFieldForSearch.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelForSearch.add(textFieldForSearch, gridBagConstraints);

        jPanel1.add(panelForSearch);

        jPanel4.setBackground(new java.awt.Color(49, 54, 63));
        jPanel4.setPreferredSize(new java.awt.Dimension(1582, 350));

        panelForResults.setBackground(new java.awt.Color(49, 54, 63));
        panelForResults.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        panelForResults.setForeground(new java.awt.Color(204, 204, 204));

        textAreaForResults.setEditable(false);
        textAreaForResults.setColumns(20);
        textAreaForResults.setRows(5);
        jScrollPane1.setViewportView(textAreaForResults);

        javax.swing.GroupLayout panelForResultsLayout = new javax.swing.GroupLayout(panelForResults);
        panelForResults.setLayout(panelForResultsLayout);
        panelForResultsLayout.setHorizontalGroup(
            panelForResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForResultsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelForResultsLayout.setVerticalGroup(
            panelForResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelForResultsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelForResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelForResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void displayStudentData() {
    String studentData = TxtFileReader.loadStudentData();
    // Split data into pages
    this.studentData = studentData.split("---------------\n"); // Assuming each student data ends with "---------------"
    updatePage();
}
    
private void updatePage() {
    if (studentData == null || studentData.length == 0) {
        textAreaForResults.setText("No data available.");
        return;
    }
    
    int start = (currentPage - 1) * PAGE_SIZE;
    int end = Math.min(start + PAGE_SIZE, studentData.length);

    if (start >= studentData.length) {
        textAreaForResults.setText("No more pages.");
        return;
    }

    StringBuilder pageData = new StringBuilder();
    for (int i = start; i < end; i++) {
        pageData.append(studentData[i]);
    }
    
    textAreaForResults.setText(pageData.toString());
}
    
    private void radioButtonForNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonForNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_radioButtonForNameActionPerformed

    private void radioButtonForClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonForClassActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_radioButtonForClassActionPerformed

    private void radioButtonForAdminNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonForAdminNoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_radioButtonForAdminNoActionPerformed

    private void buttonForSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForSearchActionPerformed
        // TODO add your handling code here:
        if (controller == null) {
            textAreaForResults.setText("Controller is not set.");
            return;
        }

        // Get the search text
        String searchText = textFieldForSearch.getText().trim();

        // Determine the selected search mode
        String searchMode = getSelectedSearchMode();

        // Perform the search based on the search mode
        String results = "";
        switch (searchMode) {
            case "Name":
                results = controller.searchStudentName(searchText);
                break;
            case "Class":
                results = controller.searchStudentClass(searchText);
                break;
            case "Admin No":
                results = controller.searchStudentAdminNo(searchText);
                break;
        }

        // Display the results
        textAreaForResults.setText(results);
    }//GEN-LAST:event_buttonForSearchActionPerformed

    private String getSelectedSearchMode() {
        if (radioButtonForName.isSelected()) {
            return "Name";
        } else if (radioButtonForClass.isSelected()) {
            return "Class";
        } else if (radioButtonForAdminNo.isSelected()) {
            return "Admin No";
        }
        return "Name"; // Default mode
    }
    
    private void buttonForNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForNextActionPerformed
    if (studentData != null && (currentPage * PAGE_SIZE) < studentData.length) {
        currentPage++;
        updatePage();
    } else {
        textAreaForResults.setText("No more pages.");
    }   
    }//GEN-LAST:event_buttonForNextActionPerformed

    private void buttonForPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForPreviousActionPerformed
    if (currentPage > 1) {
        currentPage--;
        updatePage();
    } else {
        textAreaForResults.setText("You are already on the first page.");
    }
    }//GEN-LAST:event_buttonForPreviousActionPerformed

    private void buttonForRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForRefreshActionPerformed
    // Load student data from the file
    String studentData = TxtFileReader.loadStudentData();
    
    // Split the data into pages
    this.studentData = studentData.split("---------------\n");
    
    // Reset to the first page
    this.currentPage = 1;
    
    // Update the displayed page
    updatePage();
    }//GEN-LAST:event_buttonForRefreshActionPerformed

    private void adminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseClicked
        // TODO add your handling code here:
        createPanel poop = new createPanel(1);
        poop.show();
        
        dispose();
    }//GEN-LAST:event_adminButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        LoginView asd = new LoginView();
        
        asd.show();
        
        dispose();
    }//GEN-LAST:event_logoutButtonMouseClicked

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
            java.util.logging.Logger.getLogger(StudentAdminSystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAdminSystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAdminSystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAdminSystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAdminSystemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JButton buttonForNext;
    private javax.swing.JButton buttonForPrevious;
    private javax.swing.JButton buttonForRefresh;
    private javax.swing.JButton buttonForSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblForTitle;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel panelForResults;
    private javax.swing.JPanel panelForSearch;
    private javax.swing.JPanel panelForTitle;
    private javax.swing.JRadioButton radioButtonForAdminNo;
    private javax.swing.JRadioButton radioButtonForClass;
    private javax.swing.JRadioButton radioButtonForName;
    private javax.swing.JTextArea textAreaForResults;
    private javax.swing.JTextField textFieldForSearch;
    // End of variables declaration//GEN-END:variables
}
