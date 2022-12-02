package com.company.hidefile.panels;

import com.company.hidefile.WarningMessage;
import com.company.hidefile.service.ExtractService;
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

public class ExtractPanel extends javax.swing.JPanel {
    
    private File image = null;

    public ExtractPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlExtract = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        txtImage = new javax.swing.JTextField();
        rbOutFile = new javax.swing.JRadioButton();
        rbOutText = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaText = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        btnStart = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnChooseImage = new javax.swing.JButton();
        pnlProgress = new com.company.hidefile.panels.ProgressPanel();

        buttonGroup1.add(rbOutFile);
        buttonGroup1.add(rbOutText);

        lblImage.setText("Image:");

        rbOutFile.setSelected(true);
        txtAreaText.setEnabled(false);
        rbOutFile.setText("Output to File");
        rbOutFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOutFileActionPerformed(evt);
            }
        });

        rbOutText.setText("Output Text");
        rbOutText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOutTextActionPerformed(evt);
            }
        });

        txtAreaText.setColumns(20);
        txtAreaText.setRows(5);
        jScrollPane1.setViewportView(txtAreaText);

        btnStart.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnStart.setText("Start");
        btnStart.setPreferredSize(new java.awt.Dimension(84, 38));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnChooseImage.setText("Choose");
        btnChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlExtractLayout = new javax.swing.GroupLayout(pnlExtract);
        pnlExtract.setLayout(pnlExtractLayout);
        pnlExtractLayout.setHorizontalGroup(
            pnlExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExtractLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlExtractLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlExtractLayout.createSequentialGroup()
                        .addGroup(pnlExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbOutFile, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbOutText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlExtractLayout.createSequentialGroup()
                                .addComponent(txtImage, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnChooseImage)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlExtractLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        pnlExtractLayout.setVerticalGroup(
            pnlExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtractLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseImage))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(rbOutFile)
                .addGap(18, 18, 18)
                .addComponent(rbOutText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlExtract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(pnlProgress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(pnlExtract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void rbOutFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOutFileActionPerformed
        txtAreaText.setEnabled(false);
    }//GEN-LAST:event_rbOutFileActionPerformed

    private void rbOutTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOutTextActionPerformed
        txtAreaText.setEnabled(true);
    }//GEN-LAST:event_rbOutTextActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        boolean isSaved = false;
        ExtractService extractS = new ExtractService();
        try {
            if (!txtImage.getText().trim().equals("")) {
                byte[] secretArr = extractS.extract(txtImage.getText());
                if (rbOutFile.isSelected()) {
                    extractS.extractToFile(secretArr);
                    isSaved = true;
                    pnlProgress.fill();
                } else if (rbOutText.isSelected()) {
                    String s = new String(secretArr);
                    txtAreaText.setText(s);
                    isSaved = true;
                    pnlProgress.fill();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseImage;
    private javax.swing.JButton btnStart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JPanel pnlExtract;
    private com.company.hidefile.panels.ProgressPanel pnlProgress;
    private javax.swing.JRadioButton rbOutFile;
    private javax.swing.JRadioButton rbOutText;
    private javax.swing.JTextArea txtAreaText;
    private javax.swing.JTextField txtImage;
    // End of variables declaration//GEN-END:variables
}
