package views;

import services.ServiceArticle;
import services.ServiceConference;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import models.Conference;
import models.Article;
import utilities.Utilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Isabela Mosquera Fernanandez <isabelamosquera@unicauca.edu.co>
 */
public class VPapers extends javax.swing.JFrame {
    private int idConference;
    private int idAuthor;
    private ServiceConference serviceConferences;
    private ServiceArticle serviceArticle;
    /**
     * Creates new form VLogin
     */
    public VPapers(ServiceConference service, ServiceArticle serviceArticle, int idConference, int idAuthor) {
        initComponents();
        this.serviceConferences=service;
        this.serviceArticle=serviceArticle;
        this.idAuthor=idAuthor;
        this.idConference=idConference;
        this.serviceArticle = serviceArticle;
        Conference conference=service.getConference(idConference);
        jLabelShownName.setText(conference.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jBackground = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelShownName = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutors = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelNameArt1 = new javax.swing.JLabel();
        jTextFieldResumen = new javax.swing.JTextField();
        jLabelKeyWords = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jTextFieldKeyWords = new javax.swing.JTextField();
        jLabelResumen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldAutors = new javax.swing.JTextField();
        jTextFieldUpArchive = new javax.swing.JTextField();
        jPanelHeader = new javax.swing.JPanel();
        jPanelExit = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jPanelMinimize = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(155, 179, 232));

        jBackground.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(94, 23, 235));

        jLabelName.setBackground(new java.awt.Color(255, 255, 255));
        jLabelName.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelName.setText("Conferencia:");

        jLabelShownName.setFont(new java.awt.Font("Montserrat", 1, 22)); // NOI18N
        jLabelShownName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelShownName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelShownName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(1, 143, 166));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Formulario");

        jLabelAutors.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabelAutors.setForeground(new java.awt.Color(1, 143, 166));
        jLabelAutors.setText("AUTORES");

        jTextFieldName.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldName.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldName.setText("Ingrese el nombre del articulo");
        jTextFieldName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldName.setMaximumSize(new java.awt.Dimension(270, 30));
        jTextFieldName.setMinimumSize(new java.awt.Dimension(270, 30));
        jTextFieldName.setPreferredSize(new java.awt.Dimension(270, 30));

        jLabelNameArt1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabelNameArt1.setForeground(new java.awt.Color(1, 143, 166));
        jLabelNameArt1.setText("NOMBRE DEL ARTICULO");

        jTextFieldResumen.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldResumen.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextFieldResumen.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldResumen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldResumen.setText("Ingrese el resumen del articulo");
        jTextFieldResumen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldResumen.setMaximumSize(new java.awt.Dimension(270, 30));
        jTextFieldResumen.setMinimumSize(new java.awt.Dimension(270, 30));
        jTextFieldResumen.setPreferredSize(new java.awt.Dimension(270, 30));

        jLabelKeyWords.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabelKeyWords.setForeground(new java.awt.Color(1, 143, 166));
        jLabelKeyWords.setText("PALABRAS CLAVE");

        jTextFieldDate.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDate.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextFieldDate.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldDate.setText("00/00/00");
        jTextFieldDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldDate.setMaximumSize(new java.awt.Dimension(270, 30));
        jTextFieldDate.setMinimumSize(new java.awt.Dimension(270, 30));
        jTextFieldDate.setPreferredSize(new java.awt.Dimension(270, 30));

        jLabelDate.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(1, 143, 166));
        jLabelDate.setText("FECHA DE PUBLICACION");

        jTextFieldKeyWords.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldKeyWords.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextFieldKeyWords.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldKeyWords.setText("Ingrese las palabras claves");
        jTextFieldKeyWords.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldKeyWords.setMaximumSize(new java.awt.Dimension(270, 30));
        jTextFieldKeyWords.setMinimumSize(new java.awt.Dimension(270, 30));
        jTextFieldKeyWords.setPreferredSize(new java.awt.Dimension(270, 30));
        jTextFieldKeyWords.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldKeyWordsFocusLost(evt);
            }
        });

        jLabelResumen.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabelResumen.setForeground(new java.awt.Color(1, 143, 166));
        jLabelResumen.setText("RESUMEN");

        jButton1.setBackground(new java.awt.Color(193, 255, 114));
        jButton1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("ENVIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldAutors.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAutors.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextFieldAutors.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldAutors.setText("Ingrese el nombre de los autores");
        jTextFieldAutors.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldAutors.setMaximumSize(new java.awt.Dimension(270, 30));
        jTextFieldAutors.setMinimumSize(new java.awt.Dimension(270, 30));
        jTextFieldAutors.setPreferredSize(new java.awt.Dimension(270, 30));

        jTextFieldUpArchive.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUpArchive.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextFieldUpArchive.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUpArchive.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUpArchive.setText("SUBIR ARCHIVO");
        jTextFieldUpArchive.setToolTipText("");

        javax.swing.GroupLayout jBackgroundLayout = new javax.swing.GroupLayout(jBackground);
        jBackground.setLayout(jBackgroundLayout);
        jBackgroundLayout.setHorizontalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jBackgroundLayout.createSequentialGroup()
                                    .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNameArt1)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelAutors)
                                        .addComponent(jLabelKeyWords)
                                        .addComponent(jTextFieldKeyWords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldAutors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(131, 131, 131)
                                    .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldUpArchive)
                                        .addComponent(jLabelResumen, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDate, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jBackgroundLayout.setVerticalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNameArt1)
                    .addComponent(jLabelDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAutors)
                    .addComponent(jLabelResumen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAutors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabelKeyWords)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldKeyWords, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldUpArchive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanelHeader.setBackground(new java.awt.Color(1, 143, 166));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelHeaderMouseDragged(evt);
            }
        });
        jPanelHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHeaderMousePressed(evt);
            }
        });

        jPanelExit.setBackground(new java.awt.Color(1, 143, 166));

        jLabelExit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(0, 0, 0));
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelExitLayout = new javax.swing.GroupLayout(jPanelExit);
        jPanelExit.setLayout(jPanelExitLayout);
        jPanelExitLayout.setHorizontalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelExitLayout.setVerticalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExitLayout.createSequentialGroup()
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelMinimize.setBackground(new java.awt.Color(1, 143, 166));

        jLabelMinimize.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setText("-");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelMinimizeLayout = new javax.swing.GroupLayout(jPanelMinimize);
        jPanelMinimize.setLayout(jPanelMinimizeLayout);
        jPanelMinimizeLayout.setHorizontalGroup(
            jPanelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelMinimizeLayout.setVerticalGroup(
            jPanelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMinimizeLayout.createSequentialGroup()
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelLogo.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabelLogo.setForeground(new java.awt.Color(193, 255, 116));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triangle32.png"))); // NOI18N
        jLabelLogo.setText("meeting");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addComponent(jPanelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo)
                .addGap(55, 55, 55)
                .addComponent(jPanelExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMinimize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMousePressed
        Utilities.headerMousePressed(evt);
    }//GEN-LAST:event_jPanelHeaderMousePressed

    private void jPanelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMouseDragged
        Utilities.headerMouseDragged(evt, this);
    }//GEN-LAST:event_jPanelHeaderMouseDragged

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        Utilities.changeColorOnMouseEnter(jPanelExit, jLabelExit, Color.red, Color.white);
    }//GEN-LAST:event_jLabelExitMouseEntered

    private void jLabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseExited
        Utilities.changeColorOnMouseExit(jPanelExit, jLabelExit, Utilities.AZUL_ACENTOS, Color.black);
    }//GEN-LAST:event_jLabelExitMouseExited

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        Utilities.changeColorOnMouseExit(jPanelMinimize, jLabelMinimize, Utilities.AZUL_ACENTOS, Color.black);
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        Utilities.changeColorOnMouseEnter(jPanelMinimize, jLabelMinimize, Color.red, Color.white);
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        Utilities.minimizeWindow(this);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jTextFieldKeyWordsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldKeyWordsFocusLost
        Utilities.resetFieldFocusLost(jTextFieldResumen, "Lugar de la conferencia", Color.gray, Color.black);
    }//GEN-LAST:event_jTextFieldKeyWordsFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // Obtener datos de los campos de texto
            String name = jTextFieldName.getText();
            String Autors = jTextFieldAutors.getText();
            String KeyWords = jTextFieldKeyWords.getText();
            String DateWrite = jTextFieldDate.getText();
            String Resumen = jTextFieldResumen.getText();
            String Archive = jTextFieldUpArchive.getText();

            // Validar los datos
            if (name.isEmpty() || Autors.isEmpty() || KeyWords.isEmpty()  || Resumen.isEmpty() || Archive.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date Date;

            try {
                // Formatear la fecha de publicacion
                Date = formatter.parse(DateWrite);
                // Crear un nuevo objeto Article con las fechas formateada
                  Article newArticle= new Article(name,idAuthor,idConference,KeyWords,Date);
                   // Registrar la conferencia
                    serviceArticle.addArticleToConference(idConference, newArticle);
                    // Mostrar mensaje de éxito
                    JOptionPane.showMessageDialog(this, "Articulo enviado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "La fecha de publicacion no sigue el formato dd/MM/yyyy", "Fecha incorrecta", JOptionPane.WARNING_MESSAGE);
                e.printStackTrace();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al registrar el articulo", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBackground;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelAutors;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelKeyWords;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNameArt1;
    private javax.swing.JLabel jLabelResumen;
    private javax.swing.JLabel jLabelShownName;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMinimize;
    private javax.swing.JTextField jTextFieldAutors;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldKeyWords;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldResumen;
    private javax.swing.JTextField jTextFieldUpArchive;
    // End of variables declaration//GEN-END:variables
}
