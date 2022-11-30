package com.company.hidefile.panels;

import com.company.hidefile.WarningMessage;
import com.company.hidefile.service.HideService;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class HidePanel extends javax.swing.JPanel {

    private File image = null;
    private File file = null;

    public HidePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlHide = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        txtImage = new javax.swing.JTextField();
        lblInputData = new javax.swing.JLabel();
        btnChooseImage = new javax.swing.JButton();
        txtFile = new javax.swing.JTextField();
        btnChooseFile = new javax.swing.JButton();
        rbFile = new javax.swing.JRadioButton();
        rbText = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaText = new javax.swing.JTextArea();
        btnStart = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pnlProgress = new com.company.hidefile.panels.ProgressPanel();

        buttonGroup1.add(rbFile);
        buttonGroup1.add(rbText);

        lblImage.setText("Image:");

        txtImage.setDropTarget(new DropTarget() {
            public synchronized void drop(DropTargetDropEvent evt) {
                try {
                    evt.acceptDrop(DnDConstants.ACTION_COPY);
                    List<File> droppedFiles = (List<File>) evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
                    for (File file : droppedFiles) {
                        image = file;
                        txtImage.setText(image.getPath());
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        lblInputData.setText("Input Data:");

        btnChooseImage.setText("Choose");
        btnChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseImageActionPerformed(evt);
            }
        });

        txtFile.setDropTarget(new DropTarget() {
            public synchronized void drop(DropTargetDropEvent evt) {
                try {
                    evt.acceptDrop(DnDConstants.ACTION_COPY);
                    List<File> droppedFiles = (List<File>) evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
                    for (File f : droppedFiles) {
                        file = f;
                        txtFile.setText(file.getPath());
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        btnChooseFile.setText("Choose");
        btnChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileActionPerformed(evt);
            }
        });

        rbFile.setSelected(true);
        txtAreaText.setEnabled(false);
        rbFile.setText("File");
        rbFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFileActionPerformed(evt);
            }
        });

        rbText.setText("Text");
        rbText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTextActionPerformed(evt);
            }
        });

        txtAreaText.setColumns(20);
        txtAreaText.setRows(5);
        jScrollPane1.setViewportView(txtAreaText);

        btnStart.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHideLayout = new javax.swing.GroupLayout(pnlHide);
        pnlHide.setLayout(pnlHideLayout);
        pnlHideLayout.setHorizontalGroup(
            pnlHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHideLayout.createSequentialGroup()
                        .addGroup(pnlHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHideLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(pnlHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbText)
                                    .addGroup(pnlHideLayout.createSequentialGroup()
                                        .addComponent(rbFile)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFile))))
                            .addGroup(pnlHideLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtImage)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChooseImage)
                            .addComponent(btnChooseFile))
                        .addGap(9, 9, 9))
                    .addGroup(pnlHideLayout.createSequentialGroup()
                        .addGroup(pnlHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImage)
                            .addComponent(lblInputData)
                            .addGroup(pnlHideLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHideLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHideLayout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHideLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        pnlHideLayout.setVerticalGroup(
            pnlHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHideLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseImage))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblInputData)
                .addGap(18, 18, 18)
                .addGroup(pnlHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseFile)
                    .addComponent(rbFile))
                .addGap(18, 18, 18)
                .addComponent(rbText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(8, Short.MAX_VALUE)
                    .addComponent(pnlHide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(579, Short.MAX_VALUE)
                .addComponent(pnlProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addComponent(pnlHide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTextActionPerformed
        txtFile.setEnabled(false);
        txtAreaText.setEnabled(true);
        btnChooseFile.setEnabled(false);
    }//GEN-LAST:event_rbTextActionPerformed

    private void rbFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFileActionPerformed
        txtAreaText.setEnabled(false);
        txtFile.setEnabled(true);
        btnChooseFile.setEnabled(true);
    }//GEN-LAST:event_rbFileActionPerformed

    

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        boolean isSaved = false;
        try {
            if (!txtImage.getText().trim().equals("")) {
                if (rbFile.isSelected() && !txtFile.getText().trim().equals("")) {
                    HideService.hideFile(image.getPath(), txtFile.getText());
                    isSaved = true;
                    pnlProgress.fill();
                } else if (rbText.isSelected() && !txtAreaText.getText().equals("")) {
                    HideService.hideText(image.getPath(), txtAreaText.getText());
                    isSaved = true;
                    pnlProgress.fill();
                } else {
                    WarningMessage.setWarningMsg("Something went wrong. Blanks are not filled correctly", "Warning!", 
                            JOptionPane.WARNING_MESSAGE);
                }
            } else {
                WarningMessage.setWarningMsg("Select image", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            WarningMessage.setWarningMsg("Error!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (isSaved) {
            WarningMessage.setWarningMsg("Finished!", "Hide Text", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseImageActionPerformed
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileFilter filter = new FileNameExtensionFilter("(*.jpg;*.png;*.jpeg)", "jpg", "png", "jpeg");
        fileChooser.setFileFilter(filter);
        int r = fileChooser.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            image = fileChooser.getSelectedFile();
            txtImage.setText(image.getPath());
        }
    }//GEN-LAST:event_btnChooseImageActionPerformed

    private void btnChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileActionPerformed
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileFilter filter = new FileNameExtensionFilter("(*.docx;*.doc;*.txt;*.pdf)", "docx", "doc", "txt", "pdf");
        fileChooser.setFileFilter(filter);
        int r = fileChooser.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            txtFile.setText(file.getPath());
        }
    }//GEN-LAST:event_btnChooseFileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseFile;
    private javax.swing.JButton btnChooseImage;
    private javax.swing.JButton btnStart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblInputData;
    private javax.swing.JPanel pnlHide;
    private com.company.hidefile.panels.ProgressPanel pnlProgress;
    private javax.swing.JRadioButton rbFile;
    private javax.swing.JRadioButton rbText;
    private javax.swing.JTextArea txtAreaText;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtImage;
    // End of variables declaration//GEN-END:variables
}
