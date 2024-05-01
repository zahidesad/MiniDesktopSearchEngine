package Core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author zahid
 */
public class MainFrame extends javax.swing.JFrame {

    Document document;
    MyLinkedList<String> ignoredWords;
    JFileChooser fileChooser;

    public MainFrame() {
        initComponents();
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
        MainPanel.add(selectFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 150, 30));

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
        MainPanel.add(selectIgnoredButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 30));

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
        InOrderTextArea.setText("<DOC>\n<DOCNO>\n1\n</DOCNO>\n<TITLE>\nexperimental investigation of the aerodynamics of a\nwing in a slipstream .\n</TITLE>\n<AUTHOR>\nbrenckman ,\n</AUTHOR>\n<BIBLIO>\nae . scs .\n</BIBLIO>\n<TEXT>\n  an experimental study of a wing in a propeller slipstream was\nmade in order to determine the spanwise distribution of the lift\nincrease due to slipstream at different angles of attack of the wing\nand at different free stream to slipstream velocity ratios .  the\nresults were intended in part as an evaluation basis for different\ntheoretical treatments of this problem .\n  the comparative span loading curves , together with supporting\nevidence , showed that a substantial part of the lift increment\nproduced by the slipstream was due to a destalling or boundary layer control\neffect .  the integrated remaining lift increment ,\nafter subtracting this destalling lift , was found to agree\nwell with a potential flow theory .\n  an empirical evaluation of the destalling effects was made for\nthe specific configuration of the experiment .\n</TEXT>\n</DOC>\n");
        InOrderScrollPane.setViewportView(InOrderTextArea);

        InOrderPanel.add(InOrderScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 500, 270));

        tabbedPane.addTab("In Order", InOrderPanel);

        PostOrderPanel.setBackground(new java.awt.Color(102, 102, 102));
        PostOrderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PostOrderTextArea.setEditable(false);
        PostOrderTextArea.setBackground(new java.awt.Color(204, 204, 204));
        PostOrderTextArea.setColumns(20);
        PostOrderTextArea.setForeground(new java.awt.Color(0, 0, 0));
        PostOrderTextArea.setRows(5);
        PostOrderScrollPane.setViewportView(PostOrderTextArea);

        PostOrderPanel.add(PostOrderScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 500, 270));

        tabbedPane.addTab("Post Order", PostOrderPanel);

        PreOrderPanel.setBackground(new java.awt.Color(102, 102, 102));
        PreOrderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PreOrderTextArea.setEditable(false);
        PreOrderTextArea.setBackground(new java.awt.Color(204, 204, 204));
        PreOrderTextArea.setColumns(20);
        PreOrderTextArea.setForeground(new java.awt.Color(0, 0, 0));
        PreOrderTextArea.setRows(5);
        PreOrderScrollPane.setViewportView(PreOrderTextArea);

        PreOrderPanel.add(PreOrderScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 500, 270));

        tabbedPane.addTab("Pre Order", PreOrderPanel);

        MainPanel.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 650, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1249, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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


    private void selectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileButtonActionPerformed
        File filePath = filePicker();
        document = new Document(filePath, ignoredWords);
        System.out.println(document.getName());;
        System.out.println(document.getContent());
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
    private CustomSwingComponents.CustomJButton selectFileButton;
    private CustomSwingComponents.CustomJButton selectIgnoredButton;
    private CustomSwingComponents.TabbedPaneCustom tabbedPane;
    // End of variables declaration//GEN-END:variables
}
