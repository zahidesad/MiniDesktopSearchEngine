package Core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author zahid
 */
public class MainFrame extends javax.swing.JFrame {

    MyLinkedList< File> files;
    MyLinkedList<String> ignoredWords;
    JFileChooser fileChooser;
    BinarySearchTree<BSTData> bst;
    ImageIcon imageSearch = new ImageIcon("search.png");

    public MainFrame() {
        initComponents();
        files = new MyLinkedList();
        bst = new BinarySearchTree<>();
        searchButton.setIcon(imageSearch);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        selectFileButton = new CustomSwingComponents.CustomJButton();
        selectIgnoredButton = new CustomSwingComponents.CustomJButton();
        tabbedPane = new CustomSwingComponents.TabbedPaneCustom();
        InOrderPanel = new javax.swing.JPanel();
        InOrderScrollPane = new CustomSwingComponents.ScrollPaneWin11();
        InOrderTextArea = new javax.swing.JTextArea();
        PostOrderPanel = new javax.swing.JPanel();
        PostOrderScrollPane = new CustomSwingComponents.ScrollPaneWin11();
        PostOrderTextArea = new javax.swing.JTextArea();
        PreOrderPanel = new javax.swing.JPanel();
        PreOrderScrollPane = new CustomSwingComponents.ScrollPaneWin11();
        PreOrderTextArea = new javax.swing.JTextArea();
        SearchPanel = new javax.swing.JPanel();
        searchScrollPane = new CustomSwingComponents.ScrollPaneWin11();
        searchWordTextArea = new javax.swing.JTextArea();
        searchButton = new CustomSwingComponents.CustomJButton();
        searchTextField = new javax.swing.JTextField();
        AddedFilesScrollPane = new CustomSwingComponents.ScrollPaneWin11();
        addedFilesTextArea = new javax.swing.JTextArea();
        addedFilesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(51, 51, 51));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectFileButton.setForeground(new java.awt.Color(0, 0, 0));
        selectFileButton.setText("Select File");
        selectFileButton.setBorderColor(new java.awt.Color(255, 255, 255));
        selectFileButton.setColorClick(new java.awt.Color(153, 153, 153));
        selectFileButton.setColorOver(new java.awt.Color(204, 204, 204));
        selectFileButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        selectFileButton.setRadius(30);
        selectFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileButtonActionPerformed(evt);
            }
        });
        MainPanel.add(selectFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 150, 30));

        selectIgnoredButton.setForeground(new java.awt.Color(0, 0, 0));
        selectIgnoredButton.setText("Select Ignored Words File");
        selectIgnoredButton.setBorderColor(new java.awt.Color(255, 255, 255));
        selectIgnoredButton.setColorClick(new java.awt.Color(153, 153, 153));
        selectIgnoredButton.setColorOver(new java.awt.Color(204, 204, 204));
        selectIgnoredButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        selectIgnoredButton.setRadius(30);
        selectIgnoredButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectIgnoredButtonActionPerformed(evt);
            }
        });
        MainPanel.add(selectIgnoredButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 220, 30));

        tabbedPane.setBackground(new java.awt.Color(51, 51, 51));
        tabbedPane.setForeground(new java.awt.Color(0, 0, 0));
        tabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabbedPane.setSelectedColor(new java.awt.Color(204, 204, 204));

        InOrderPanel.setBackground(new java.awt.Color(102, 102, 102));
        InOrderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InOrderTextArea.setEditable(false);
        InOrderTextArea.setBackground(new java.awt.Color(204, 204, 204));
        InOrderTextArea.setColumns(20);
        InOrderTextArea.setForeground(new java.awt.Color(0, 0, 0));
        InOrderTextArea.setRows(5);
        InOrderTextArea.setText("experimental , a.html -> 1 , b.html->2  , a.html -> 1  , a.html -> 1  , a.html -> 1  , a.html -> 1  , a.html -> 1  , a.html -> 1  , a.html -> 1  , a.html -> 1");
        InOrderScrollPane.setViewportView(InOrderTextArea);

        InOrderPanel.add(InOrderScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 620, 310));

        tabbedPane.addTab("In Order", InOrderPanel);

        PostOrderPanel.setBackground(new java.awt.Color(102, 102, 102));
        PostOrderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PostOrderTextArea.setEditable(false);
        PostOrderTextArea.setBackground(new java.awt.Color(204, 204, 204));
        PostOrderTextArea.setColumns(20);
        PostOrderTextArea.setForeground(new java.awt.Color(0, 0, 0));
        PostOrderTextArea.setRows(5);
        PostOrderScrollPane.setViewportView(PostOrderTextArea);

        PostOrderPanel.add(PostOrderScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 620, 310));

        tabbedPane.addTab("Post Order", PostOrderPanel);

        PreOrderPanel.setBackground(new java.awt.Color(102, 102, 102));
        PreOrderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PreOrderTextArea.setEditable(false);
        PreOrderTextArea.setBackground(new java.awt.Color(204, 204, 204));
        PreOrderTextArea.setColumns(20);
        PreOrderTextArea.setForeground(new java.awt.Color(0, 0, 0));
        PreOrderTextArea.setRows(5);
        PreOrderScrollPane.setViewportView(PreOrderTextArea);

        PreOrderPanel.add(PreOrderScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 620, 310));

        tabbedPane.addTab("Pre Order", PreOrderPanel);

        SearchPanel.setBackground(new java.awt.Color(102, 102, 102));
        SearchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchWordTextArea.setEditable(false);
        searchWordTextArea.setBackground(new java.awt.Color(204, 204, 204));
        searchWordTextArea.setColumns(20);
        searchWordTextArea.setForeground(new java.awt.Color(0, 0, 0));
        searchWordTextArea.setRows(5);
        searchScrollPane.setViewportView(searchWordTextArea);

        SearchPanel.add(searchScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 380, 210));

        searchButton.setBackground(new java.awt.Color(102, 102, 102));
        searchButton.setBorder(null);
        searchButton.setForeground(new java.awt.Color(102, 102, 102));
        searchButton.setBorderColor(new java.awt.Color(102, 102, 102));
        searchButton.setColor(new java.awt.Color(102, 102, 102));
        searchButton.setColorClick(new java.awt.Color(102, 102, 102));
        searchButton.setColorOver(new java.awt.Color(187, 187, 187));
        searchButton.setRadius(70);
        SearchPanel.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 40, 40));

        searchTextField.setBackground(new java.awt.Color(204, 204, 204));
        searchTextField.setForeground(new java.awt.Color(0, 0, 0));
        SearchPanel.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 45, 130, 30));

        tabbedPane.addTab("Search Word", SearchPanel);

        MainPanel.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 670, 380));

        addedFilesTextArea.setEditable(false);
        addedFilesTextArea.setBackground(new java.awt.Color(204, 204, 204));
        addedFilesTextArea.setColumns(10);
        addedFilesTextArea.setForeground(new java.awt.Color(0, 0, 0));
        addedFilesTextArea.setRows(5);
        AddedFilesScrollPane.setViewportView(addedFilesTextArea);

        MainPanel.add(AddedFilesScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 78, 190, 320));

        addedFilesLabel.setBackground(new java.awt.Color(204, 204, 204));
        addedFilesLabel.setForeground(new java.awt.Color(204, 204, 204));
        addedFilesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addedFilesLabel.setText("ADDED FILES");
        MainPanel.add(addedFilesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected File filePicker() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.put("FileChooserUI", "com.sun.java.swing.plaf.windows.WindowsFileChooserUI");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        fileChooser = new JFileChooser();
        int action = fileChooser.showOpenDialog(null);
        if (action == JFileChooser.APPROVE_OPTION) {
            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println("Selected File : " + file);
            return file;
        }
        return null;
    }

    protected MyLinkedList readIgnoredWords(File filePath) {
        ignoredWords = new MyLinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                ignoredWords.addLast(line.trim());
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ignoredWords;
    }

    private void addFileToBST(DocumentCleaner documentCleaner) {
        System.out.println("File Name: " + documentCleaner.getName());
        for (int i = 0; i < documentCleaner.getContentWordsList().getSize(); i++) {
            bst.add(new BSTData((String) documentCleaner.getContentWordsList().get(i), documentCleaner.getName()));
        }
        bst.inOrder(bst.root, InOrderTextArea);
        bst.postOrder(bst.root, PostOrderTextArea);
        bst.preOrder(bst.root, PreOrderTextArea);

        if (bst.root == null) {
            System.out.println("Root null");
        }
    }

    private void cleanJTextAreas() {
        InOrderTextArea.setText("");
        PostOrderTextArea.setText("");
        PreOrderTextArea.setText("");
    }


    private void selectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileButtonActionPerformed
        File file = filePicker();
        if (file == null) {
            return;
        }
        if (files.contains(file)) {
            JOptionPane.showMessageDialog(null, "You already selected this file please select another file",
                    "Same File Selected", JOptionPane.WARNING_MESSAGE);
        } else if (ignoredWords == null) {
            JOptionPane.showMessageDialog(null, "Please select the file containing ignored words first.",
                    "Ignored Words Weren't Select", JOptionPane.WARNING_MESSAGE);
        } else {
            files.addLast(file);
            addedFilesTextArea.append(file.getName() + "\n");
            DocumentCleaner documentCleaner = new DocumentCleaner(file, ignoredWords);
            cleanJTextAreas();
            addFileToBST(documentCleaner);
        }
    }//GEN-LAST:event_selectFileButtonActionPerformed

    private void selectIgnoredButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectIgnoredButtonActionPerformed
        File filePath = filePicker();
        if (filePath != null) {
            ignoredWords = readIgnoredWords(filePath);
            ignoredWords.display();
        }
    }//GEN-LAST:event_selectIgnoredButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomSwingComponents.ScrollPaneWin11 AddedFilesScrollPane;
    private javax.swing.JPanel InOrderPanel;
    private CustomSwingComponents.ScrollPaneWin11 InOrderScrollPane;
    private javax.swing.JTextArea InOrderTextArea;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PostOrderPanel;
    private CustomSwingComponents.ScrollPaneWin11 PostOrderScrollPane;
    private javax.swing.JTextArea PostOrderTextArea;
    private javax.swing.JPanel PreOrderPanel;
    private CustomSwingComponents.ScrollPaneWin11 PreOrderScrollPane;
    private javax.swing.JTextArea PreOrderTextArea;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JLabel addedFilesLabel;
    private javax.swing.JTextArea addedFilesTextArea;
    private CustomSwingComponents.CustomJButton searchButton;
    private CustomSwingComponents.ScrollPaneWin11 searchScrollPane;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextArea searchWordTextArea;
    private CustomSwingComponents.CustomJButton selectFileButton;
    private CustomSwingComponents.CustomJButton selectIgnoredButton;
    private CustomSwingComponents.TabbedPaneCustom tabbedPane;
    // End of variables declaration//GEN-END:variables
}
