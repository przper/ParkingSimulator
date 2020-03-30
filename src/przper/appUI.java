package przper;

import java.time.LocalTime;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class appUI extends javax.swing.JFrame {

    public appUI() {
        initComponents();

        pSpace ps1 = new pSpace(A1);
        pSpace ps2 = new pSpace(A2);
        pSpace ps3 = new pSpace(A3);
        pSpace ps4 = new pSpace(A4);
        pSpace ps5 = new pSpace(A5);
        pSpace ps6 = new pSpace(A6);
        pSpace ps7 = new pSpace(A7);
        pSpace ps8 = new pSpace(A8);

        pSpace ps9 = new pSpace(B1);
        pSpace ps10 = new pSpace(B2);
        pSpace ps11 = new pSpace(B3);
        pSpace ps12 = new pSpace(B4);
        pSpace ps13 = new pSpace(B5);
        pSpace ps14 = new pSpace(B6);
        pSpace ps15 = new pSpace(B7);
        pSpace ps16 = new pSpace(B8);

        pSpace ps17 = new pSpace(C1);
        pSpace ps18 = new pSpace(C2);
        pSpace ps19 = new pSpace(C3);
        pSpace ps20 = new pSpace(C4);
        pSpace ps21 = new pSpace(C5);
        pSpace ps22 = new pSpace(C6);
        pSpace ps23 = new pSpace(C7);
        pSpace ps24 = new pSpace(C8);

        pSpace ps25 = new pSpace(D1);
        pSpace ps26 = new pSpace(D2);
        pSpace ps27 = new pSpace(D3);
        pSpace ps28 = new pSpace(D4);
        pSpace ps29 = new pSpace(D5);
        pSpace ps30 = new pSpace(D6);
        pSpace ps31 = new pSpace(D7);
        pSpace ps32 = new pSpace(D8);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        A5 = new javax.swing.JLabel();
        A6 = new javax.swing.JLabel();
        A7 = new javax.swing.JLabel();
        A8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        D7 = new javax.swing.JLabel();
        D8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        plateInText = new javax.swing.JTextField();
        hourInText = new javax.swing.JTextField();
        inBtn = new javax.swing.JButton();
        rndInBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        plateOutText = new javax.swing.JTextField();
        hourOutText = new javax.swing.JTextField();
        outBtn = new javax.swing.JButton();
        rndOutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parking preview"));

        jLabel1.setText("A");

        A1.setBackground(java.awt.Color.green);
        A1.setText("Free");
        A1.setMaximumSize(new java.awt.Dimension(60, 20));
        A1.setMinimumSize(new java.awt.Dimension(60, 20));
        A1.setOpaque(true);
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        A2.setBackground(java.awt.Color.green);
        A2.setText("Free");
        A2.setToolTipText("");
        A2.setMaximumSize(new java.awt.Dimension(60, 20));
        A2.setMinimumSize(new java.awt.Dimension(60, 20));
        A2.setOpaque(true);
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        A3.setBackground(java.awt.Color.green);
        A3.setText("Free");
        A3.setToolTipText("");
        A3.setMaximumSize(new java.awt.Dimension(60, 20));
        A3.setMinimumSize(new java.awt.Dimension(60, 20));
        A3.setOpaque(true);
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        A4.setBackground(java.awt.Color.green);
        A4.setText("Free");
        A4.setToolTipText("");
        A4.setMaximumSize(new java.awt.Dimension(60, 20));
        A4.setMinimumSize(new java.awt.Dimension(60, 20));
        A4.setOpaque(true);
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        A5.setBackground(java.awt.Color.green);
        A5.setText("Free");
        A5.setToolTipText("");
        A5.setMaximumSize(new java.awt.Dimension(60, 20));
        A5.setMinimumSize(new java.awt.Dimension(60, 20));
        A5.setOpaque(true);
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        A6.setBackground(java.awt.Color.green);
        A6.setText("Free");
        A6.setToolTipText("");
        A6.setMaximumSize(new java.awt.Dimension(60, 20));
        A6.setMinimumSize(new java.awt.Dimension(60, 20));
        A6.setOpaque(true);
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        A7.setBackground(java.awt.Color.green);
        A7.setText("Free");
        A7.setToolTipText("");
        A7.setMaximumSize(new java.awt.Dimension(60, 20));
        A7.setMinimumSize(new java.awt.Dimension(60, 20));
        A7.setOpaque(true);
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        A8.setBackground(java.awt.Color.green);
        A8.setText("Free");
        A8.setToolTipText("");
        A8.setMaximumSize(new java.awt.Dimension(60, 20));
        A8.setMinimumSize(new java.awt.Dimension(60, 20));
        A8.setOpaque(true);
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        jLabel10.setText("B");

        B1.setBackground(java.awt.Color.green);
        B1.setText("Free");
        B1.setToolTipText("");
        B1.setMaximumSize(new java.awt.Dimension(60, 14));
        B1.setMinimumSize(new java.awt.Dimension(60, 14));
        B1.setOpaque(true);
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        B2.setBackground(java.awt.Color.green);
        B2.setText("Free");
        B2.setToolTipText("");
        B2.setMaximumSize(new java.awt.Dimension(60, 14));
        B2.setMinimumSize(new java.awt.Dimension(60, 14));
        B2.setOpaque(true);
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        B3.setBackground(java.awt.Color.green);
        B3.setText("Free");
        B3.setToolTipText("");
        B3.setMaximumSize(new java.awt.Dimension(60, 14));
        B3.setMinimumSize(new java.awt.Dimension(60, 14));
        B3.setOpaque(true);
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        B4.setBackground(java.awt.Color.green);
        B4.setText("Free");
        B4.setToolTipText("");
        B4.setMaximumSize(new java.awt.Dimension(60, 14));
        B4.setMinimumSize(new java.awt.Dimension(60, 14));
        B4.setOpaque(true);
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        B5.setBackground(java.awt.Color.green);
        B5.setText("Free");
        B5.setToolTipText("");
        B5.setMaximumSize(new java.awt.Dimension(60, 14));
        B5.setMinimumSize(new java.awt.Dimension(60, 14));
        B5.setOpaque(true);
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        B6.setBackground(java.awt.Color.green);
        B6.setText("Free");
        B6.setToolTipText("");
        B6.setMaximumSize(new java.awt.Dimension(60, 14));
        B6.setMinimumSize(new java.awt.Dimension(60, 14));
        B6.setOpaque(true);
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        B7.setBackground(java.awt.Color.green);
        B7.setText("Free");
        B7.setToolTipText("");
        B7.setMaximumSize(new java.awt.Dimension(60, 14));
        B7.setMinimumSize(new java.awt.Dimension(60, 14));
        B7.setOpaque(true);
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        B8.setBackground(java.awt.Color.green);
        B8.setText("Free");
        B8.setToolTipText("");
        B8.setMaximumSize(new java.awt.Dimension(60, 14));
        B8.setMinimumSize(new java.awt.Dimension(60, 14));
        B8.setOpaque(true);
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        C1.setBackground(java.awt.Color.green);
        C1.setText("Free");
        C1.setToolTipText("");
        C1.setMaximumSize(new java.awt.Dimension(60, 14));
        C1.setMinimumSize(new java.awt.Dimension(60, 14));
        C1.setOpaque(true);
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        jLabel20.setText("C");

        jLabel28.setText("1");

        jLabel29.setText("2");

        jLabel30.setText("3");

        jLabel31.setText("4");

        jLabel32.setText("5");

        jLabel33.setText("6");

        jLabel34.setText("7");

        jLabel35.setText("8");

        C3.setBackground(java.awt.Color.green);
        C3.setText("Free");
        C3.setToolTipText("");
        C3.setMaximumSize(new java.awt.Dimension(60, 14));
        C3.setMinimumSize(new java.awt.Dimension(60, 14));
        C3.setOpaque(true);
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        C8.setBackground(java.awt.Color.green);
        C8.setText("Free");
        C8.setToolTipText("");
        C8.setMaximumSize(new java.awt.Dimension(60, 14));
        C8.setMinimumSize(new java.awt.Dimension(60, 14));
        C8.setOpaque(true);
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        C7.setBackground(java.awt.Color.green);
        C7.setText("Free");
        C7.setToolTipText("");
        C7.setMaximumSize(new java.awt.Dimension(60, 14));
        C7.setMinimumSize(new java.awt.Dimension(60, 14));
        C7.setOpaque(true);
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        C4.setBackground(java.awt.Color.green);
        C4.setText("Free");
        C4.setToolTipText("");
        C4.setMaximumSize(new java.awt.Dimension(60, 14));
        C4.setMinimumSize(new java.awt.Dimension(60, 14));
        C4.setOpaque(true);
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        C6.setBackground(java.awt.Color.green);
        C6.setText("Free");
        C6.setToolTipText("");
        C6.setMaximumSize(new java.awt.Dimension(60, 14));
        C6.setMinimumSize(new java.awt.Dimension(60, 14));
        C6.setOpaque(true);
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        C2.setBackground(java.awt.Color.green);
        C2.setText("Free");
        C2.setToolTipText("");
        C2.setMaximumSize(new java.awt.Dimension(60, 14));
        C2.setMinimumSize(new java.awt.Dimension(60, 14));
        C2.setOpaque(true);
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        C5.setBackground(java.awt.Color.green);
        C5.setText("Free");
        C5.setToolTipText("");
        C5.setMaximumSize(new java.awt.Dimension(60, 14));
        C5.setMinimumSize(new java.awt.Dimension(60, 14));
        C5.setOpaque(true);
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        D1.setBackground(java.awt.Color.green);
        D1.setText("Free");
        D1.setToolTipText("");
        D1.setMaximumSize(new java.awt.Dimension(60, 14));
        D1.setMinimumSize(new java.awt.Dimension(60, 14));
        D1.setOpaque(true);
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        jLabel40.setText("D");

        D2.setBackground(java.awt.Color.green);
        D2.setText("Free");
        D2.setToolTipText("");
        D2.setMaximumSize(new java.awt.Dimension(60, 14));
        D2.setMinimumSize(new java.awt.Dimension(60, 14));
        D2.setOpaque(true);
        D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        D3.setBackground(java.awt.Color.green);
        D3.setText("Free");
        D3.setToolTipText("");
        D3.setMaximumSize(new java.awt.Dimension(60, 14));
        D3.setMinimumSize(new java.awt.Dimension(60, 14));
        D3.setOpaque(true);
        D3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        D4.setBackground(java.awt.Color.green);
        D4.setText("Free");
        D4.setToolTipText("");
        D4.setMaximumSize(new java.awt.Dimension(60, 14));
        D4.setMinimumSize(new java.awt.Dimension(60, 14));
        D4.setOpaque(true);
        D4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        D5.setBackground(java.awt.Color.green);
        D5.setText("Free");
        D5.setToolTipText("");
        D5.setMaximumSize(new java.awt.Dimension(60, 14));
        D5.setMinimumSize(new java.awt.Dimension(60, 14));
        D5.setOpaque(true);
        D5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        D6.setBackground(java.awt.Color.green);
        D6.setText("Free");
        D6.setToolTipText("");
        D6.setMaximumSize(new java.awt.Dimension(60, 14));
        D6.setMinimumSize(new java.awt.Dimension(60, 14));
        D6.setOpaque(true);
        D6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        D7.setBackground(java.awt.Color.green);
        D7.setText("Free");
        D7.setToolTipText("");
        D7.setMaximumSize(new java.awt.Dimension(60, 14));
        D7.setMinimumSize(new java.awt.Dimension(60, 14));
        D7.setOpaque(true);
        D7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        D8.setBackground(java.awt.Color.green);
        D8.setText("Free");
        D8.setToolTipText("");
        D8.setMaximumSize(new java.awt.Dimension(60, 14));
        D8.setMinimumSize(new java.awt.Dimension(60, 14));
        D8.setOpaque(true);
        D8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {A1, A2, A3, A4, A5, A6, A7, A8});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28)
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel40))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Entry gate"));
        jPanel2.setToolTipText("");

        jLabel38.setText("License plate:");

        jLabel39.setText("Entry time:");

        inBtn.setText("Let it");
        inBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inBtnActionPerformed(evt);
            }
        });

        rndInBtn.setText("Random");
        rndInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rndInBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(inBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rndInBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(plateInText)
                    .addComponent(hourInText))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {inBtn, rndInBtn});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(plateInText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(hourInText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inBtn)
                    .addComponent(rndInBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Exit gate"));
        jPanel3.setToolTipText("");

        jLabel67.setText("License plate:");

        jLabel68.setText("Entry time:");

        outBtn.setText("Let out");
        outBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outBtnActionPerformed(evt);
            }
        });

        rndOutBtn.setText("Random");
        rndOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rndOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel68)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(outBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rndOutBtn)
                        .addGap(0, 82, Short.MAX_VALUE))
                    .addComponent(plateOutText)
                    .addComponent(hourOutText))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {outBtn, rndOutBtn});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(plateOutText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(hourOutText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outBtn)
                    .addComponent(rndOutBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inBtnActionPerformed
        try {
            if (plateIsUsed(plateInText.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "The license plate is already in use!", "Error message", JOptionPane.ERROR_MESSAGE);

            } else if (!pSpace.isPlateCorrect(plateInText.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "The license plate cannot be: \"" + plateInText.getText()
                        + "\"!", "Warning message", JOptionPane.WARNING_MESSAGE);

            } else {
                if (!pSpace.isTimeCorrect(hourInText.getText())) {
                    JOptionPane.showMessageDialog(new JFrame(), "The entry time cannot be: \"" + hourInText.getText()
                            + "\"!" + "\nPlease enter time in HH:MM:SS format.", "Warning message", JOptionPane.WARNING_MESSAGE);

                } else {
                    Random r = new Random();
                    pSpace choice = (pSpace) pSpace.getFreeList().toArray()[r.nextInt(pSpace.getFreeList().size())];
                    choice.makeOccupied(plateInText.getText(), hourInText.getText());
                    choice.label.setText(plateInText.getText());
                }
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(new JFrame(), "The parking is full", "Error message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inBtnActionPerformed

    private void rndInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rndInBtnActionPerformed
        StringBuilder plate = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < 3; i++) {
            char ch = (char) (r.nextInt(26) + 'A');
            plate.append(ch);
        }
        plate.append(" ");
        for (int i = 0; i < 4; i++) {
            char ch = (char) (r.nextInt(10) + '0');
            plate.append(ch);
        }

        LocalTime time = LocalTime.MIN.plusSeconds(r.nextLong());

        plateInText.setText(plate.toString());
        hourInText.setText(time.toString());
    }//GEN-LAST:event_rndInBtnActionPerformed

    private void rndOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rndOutBtnActionPerformed
        try {
            Random r = new Random();
            pSpace choice = (pSpace) pSpace.getOccupiedList().toArray()[r.nextInt(pSpace.getOccupiedList().size())];

            plateOutText.setText(choice.licensePlate);
            hourOutText.setText(choice.entryTime);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(new JFrame(), "The parking is empty!", "Error message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rndOutBtnActionPerformed

    private void outBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outBtnActionPerformed

        if (!pSpace.isPlateCorrect(plateOutText.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "The license plate cannot be: \"" + plateOutText.getText()
                    + "\"!", "Warning message", JOptionPane.WARNING_MESSAGE);

        } else if (!pSpace.isTimeCorrect(hourOutText.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "The entry time cannot be: \"" + hourOutText.getText()
                    + "\"!" + "\nPlease enter time in HH:MM:SS format.", "Warning message", JOptionPane.WARNING_MESSAGE);

        } else {
            if (plateIsUsed(plateOutText.getText())) {
                for (pSpace ps : pSpace.getOccupiedList()) {
                    if (plateOutText.getText().equals(ps.licensePlate)) {
                        ps.makeFree();
                        ps.label.setText("Free");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "There is no car with \""+plateOutText.getText()+"\" license plate!", "Error message", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_outBtnActionPerformed

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        JLabel label = (JLabel) evt.getSource();

        if (!label.getText().equals("Free")) {
            plateOutText.setText(label.getText());
            for (pSpace ps : pSpace.getOccupiedList()) {
                if (plateOutText.getText().equals(ps.licensePlate)) {
                    hourOutText.setText(ps.entryTime);
                }
            }
        }

    }//GEN-LAST:event_A1MouseClicked

    public static boolean plateIsUsed(String p) {
        for (pSpace ps : pSpace.getOccupiedList()) {
            if (ps.licensePlate.equals(p)) {
                return true;
            }
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(appUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel A5;
    private javax.swing.JLabel A6;
    private javax.swing.JLabel A7;
    private javax.swing.JLabel A8;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JLabel C8;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel D7;
    private javax.swing.JLabel D8;
    private javax.swing.JTextField hourInText;
    private javax.swing.JTextField hourOutText;
    private javax.swing.JButton inBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton outBtn;
    private javax.swing.JTextField plateInText;
    private javax.swing.JTextField plateOutText;
    private javax.swing.JButton rndInBtn;
    private javax.swing.JButton rndOutBtn;
    // End of variables declaration//GEN-END:variables
}
