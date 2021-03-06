import java.awt.*;
import javax.swing.*;
public class MainFrame extends javax.swing.JFrame {

    private static int StartingMoney = 100;
    private static int NoOfDecks = 2;
    
    //@SuppressWarnings("OverridableMethodCallInConstructor")
    public MainFrame() 
    {
        initComponents();
        removeCards();
        theComponents(false);
        jButton_Logo.setEnabled(true);
    }
    
    public void theComponents(boolean x)
    {
        if(x==false){
            DealButton.setForeground(jPanel_GamePanel.getBackground());
            PassButton.setForeground(jPanel_GamePanel.getBackground());
            jLabel_MoneyLabel.setForeground(jPanel_GamePanel.getBackground());
            jLabel_CurrentMoney.setForeground(jPanel_GamePanel.getBackground());
            jLabel_Bet.setForeground(jPanel_GamePanel.getBackground());
            jButton_BetSub.setForeground(jPanel_GamePanel.getBackground());
            jButton_BetAdd.setForeground(jPanel_GamePanel.getBackground());
            jButton_BetAdd.setForeground(jPanel_GamePanel.getBackground());
            jButton_PlaceBet.setForeground(jPanel_GamePanel.getBackground());
        }
        else{
            DealButton.setForeground(Color.gray);
            PassButton.setForeground(Color.gray);
            jLabel_MoneyLabel.setForeground(jPanel_GamePanel.getForeground());
            jLabel_CurrentMoney.setForeground(jPanel_GamePanel.getForeground());
            jLabel_Bet.setForeground(jPanel_GamePanel.getForeground());
            jButton_BetSub.setForeground(jPanel_GamePanel.getForeground());
            jButton_BetAdd.setForeground(jPanel_GamePanel.getForeground());
            jButton_BetAdd.setForeground(jPanel_GamePanel.getForeground());
            jButton_PlaceBet.setForeground(Color.red);
        }
        jButton_BetAdd.setEnabled(x);
        jButton_BetSub.setEnabled(x);
        jButton_PlaceBet.setEnabled(x);
    }

    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_GamePanel = new javax.swing.JPanel();
        jButton_Logo = new javax.swing.JButton();
        PlayerCard1 = new javax.swing.JButton();
        PlayerCard2 = new javax.swing.JButton();
        PlayerCard3 = new javax.swing.JButton();
        DealerCard1 = new javax.swing.JButton();
        DealerCard2 = new javax.swing.JButton();
        DealerCard3 = new javax.swing.JButton();
        DealButton = new javax.swing.JButton();
        PassButton = new javax.swing.JButton();
        jLabel_MoneyLabel = new javax.swing.JLabel();
        jLabel_Bet = new javax.swing.JLabel();
        jLabel_CurrentMoney = new javax.swing.JLabel();
        jButton_BetSub = new javax.swing.JButton();
        jButton_BetAdd = new javax.swing.JButton();
        jButton_PlaceBet = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Game = new javax.swing.JMenu();
        jMenuItem_NewGame = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lucky 9 Alpha");
        setBackground(new java.awt.Color(90, 77, 29));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel_GamePanel.setBackground(new java.awt.Color(90, 77, 29));
        jPanel_GamePanel.setForeground(new java.awt.Color(255, 255, 0));

        jButton_Logo.setBackground(new java.awt.Color(90, 77, 29));
        jButton_Logo.setForeground(new java.awt.Color(90, 77, 29));
        jButton_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background.png"))); // NOI18N
        jButton_Logo.setContentAreaFilled(false);
        jButton_Logo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background.png"))); // NOI18N
        jButton_Logo.setFocusPainted(false);
        jButton_Logo.setFocusable(false);
        jButton_Logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogoActionPerformed(evt);
            }
        });

        PlayerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/spade9.png"))); // NOI18N
        PlayerCard1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(199, 28, 33), 5, true));
        PlayerCard1.setContentAreaFilled(false);
        PlayerCard1.setFocusPainted(false);

        PlayerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/club10.png"))); // NOI18N
        PlayerCard2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(199, 28, 33), 5, true));
        PlayerCard2.setContentAreaFilled(false);
        PlayerCard2.setFocusPainted(false);

        PlayerCard3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(199, 28, 33), 5, true));
        PlayerCard3.setContentAreaFilled(false);
        PlayerCard3.setFocusPainted(false);

        DealerCard1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(199, 28, 33), 5, true));
        DealerCard1.setContentAreaFilled(false);
        DealerCard1.setFocusPainted(false);

        DealerCard2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(199, 28, 33), 5, true));
        DealerCard2.setContentAreaFilled(false);
        DealerCard2.setFocusPainted(false);

        DealerCard3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(199, 28, 33), 5, true));
        DealerCard3.setContentAreaFilled(false);
        DealerCard3.setFocusPainted(false);

        DealButton.setBackground(new java.awt.Color(90, 77, 29));
        DealButton.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        DealButton.setForeground(new java.awt.Color(255, 255, 0));
        DealButton.setText("Povlacenje");
        DealButton.setContentAreaFilled(false);
        DealButton.setFocusPainted(false);
        DealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DealButtonActionPerformed(evt);
            }
        });

        PassButton.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        PassButton.setForeground(new java.awt.Color(255, 255, 0));
        PassButton.setText("Stati");
        PassButton.setContentAreaFilled(false);
        PassButton.setFocusPainted(false);
        PassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassButtonActionPerformed(evt);
            }
        });

        jLabel_MoneyLabel.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel_MoneyLabel.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_MoneyLabel.setText("Novac:");

        jLabel_Bet.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel_Bet.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_Bet.setText("Ulog: $10");

        jLabel_CurrentMoney.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel_CurrentMoney.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_CurrentMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_CurrentMoney.setText("$0");

        jButton_BetSub.setBackground(new java.awt.Color(153, 153, 0));
        jButton_BetSub.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jButton_BetSub.setForeground(new java.awt.Color(255, 255, 0));
        jButton_BetSub.setText("-10");
        jButton_BetSub.setContentAreaFilled(false);
        jButton_BetSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BetSubActionPerformed(evt);
            }
        });

        jButton_BetAdd.setBackground(new java.awt.Color(153, 153, 0));
        jButton_BetAdd.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jButton_BetAdd.setForeground(new java.awt.Color(255, 255, 0));
        jButton_BetAdd.setText("+10");
        jButton_BetAdd.setContentAreaFilled(false);
        jButton_BetAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BetAddActionPerformed(evt);
            }
        });

        jButton_PlaceBet.setBackground(new java.awt.Color(255, 255, 0));
        jButton_PlaceBet.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jButton_PlaceBet.setForeground(new java.awt.Color(255, 0, 0));
        jButton_PlaceBet.setText("Ulozi");
        jButton_PlaceBet.setContentAreaFilled(false);
        jButton_PlaceBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PlaceBetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_GamePanelLayout = new javax.swing.GroupLayout(jPanel_GamePanel);
        jPanel_GamePanel.setLayout(jPanel_GamePanelLayout);
        jPanel_GamePanelLayout.setHorizontalGroup(
            jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                        .addGroup(jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                                .addComponent(jButton_BetSub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_BetAdd))
                            .addComponent(jButton_PlaceBet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                                .addComponent(DealerCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DealerCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DealerCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                                .addComponent(PlayerCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PlayerCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PlayerCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DealButton)
                                    .addComponent(PassButton)
                                    .addComponent(jLabel_MoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(225, 225, 225))
                            .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_CurrentMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                        .addComponent(jLabel_Bet)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jButton_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_GamePanelLayout.setVerticalGroup(
            jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_GamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DealerCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel_MoneyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_CurrentMoney))
                    .addComponent(DealerCard2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(DealerCard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117)
                .addComponent(jButton_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlayerCard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerCard1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerCard3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Bet)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                                .addComponent(DealButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(PassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_GamePanelLayout.createSequentialGroup()
                                .addGroup(jPanel_GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_BetSub)
                                    .addComponent(jButton_BetAdd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_PlaceBet)))
                        .addGap(25, 25, 25))))
        );

        jMenu_Game.setText("Igra");

        jMenuItem_NewGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem_NewGame.setText("Nova Igra");
        jMenuItem_NewGame.setIconTextGap(5);
        jMenuItem_NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NewGameActionPerformed(evt);
            }
        });
        jMenu_Game.add(jMenuItem_NewGame);

        jMenuBar1.add(jMenu_Game);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_GamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_GamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_GamePanel.getAccessibleContext().setAccessibleName("");
        jPanel_GamePanel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassButtonActionPerformed
        dealerScore=getCardScore(dealerCard1)+getCardScore(dealerCard2);
        if(dealerScore>=10)dealerScore-=10;
        
        DealButton.setEnabled(false);
        PassButton.setEnabled(false);
        DealButton.setForeground(Color.gray);
        PassButton.setForeground(Color.gray);
        
        putToTable(dealerCard1,DealerCard1,false);
        if(dealerScore<=4){
            dealerCard3 = cardDeck.cardPick();
            putToTable(dealerCard3,DealerCard3,true);
            compareScores(false,true);
        }
        else
        compareScores(false,false);
    }//GEN-LAST:event_PassButtonActionPerformed

    private void jMenuItem_NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NewGameActionPerformed
        if(gameStarted==false){
            initNewGame();
        }
        else{
            if (JOptionPane.showConfirmDialog(null, "Da li ste sigurni da zelite da zapocnete novu igru?", "WARNING",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                initNewGame();
            }
        }
    }//GEN-LAST:event_jMenuItem_NewGameActionPerformed

    private void DealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DealButtonActionPerformed
        dealerScore=getCardScore(dealerCard1)+getCardScore(dealerCard2);
        if(dealerScore>=10)dealerScore-=10;

        DealButton.setEnabled(false);
        PassButton.setEnabled(false);
        DealButton.setForeground(Color.gray);
        PassButton.setForeground(Color.gray);
        
        //playerCard3 = "heart1";
        playerCard3 = cardDeck.cardPick();
        putToTable(playerCard3,PlayerCard3,true);
        putToTable(dealerCard1,DealerCard1,false);
        if(dealerScore<=4){
            //dealerCard3 = "diamond6";
            dealerCard3 = cardDeck.cardPick();
            putToTable(dealerCard3,DealerCard3,true);
            compareScores(true,true);
        }
        else{
            compareScores(false,false);
        }
    }//GEN-LAST:event_DealButtonActionPerformed

    private void jButton_BetSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BetSubActionPerformed
            playerBet-=10;
            jLabel_Bet.setText("Ulog: $" + playerBet);
            currentMoney+=10;
            jLabel_CurrentMoney.setText("$ "+currentMoney);
        
    }//GEN-LAST:event_jButton_BetSubActionPerformed

    private void jButton_BetAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BetAddActionPerformed
        if(currentMoney<10){
            JOptionPane.showMessageDialog(null,"Nemate vise novca!");
        }
        else{
            playerBet+=10;
            currentMoney-=10;
            jLabel_CurrentMoney.setText("$ "+currentMoney);
            jLabel_Bet.setText("Ulog: $" + playerBet);
        }
    }//GEN-LAST:event_jButton_BetAddActionPerformed

    private void jButton_LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogoActionPerformed
        initNewGame();     
    }//GEN-LAST:event_jButton_LogoActionPerformed

    private void jButton_PlaceBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PlaceBetActionPerformed
        if(playerBet<10){
            JOptionPane.showMessageDialog(null,"Ulog ne moze biti manji od 10.");
        }
        else{
            jButton_BetAdd.setEnabled(false);
            jButton_BetAdd.setForeground(Color.gray);
            jButton_BetSub.setEnabled(false);
            jButton_BetSub.setForeground(Color.gray);
            jButton_PlaceBet.setEnabled(false);
            jButton_PlaceBet.setForeground(Color.gray);
            DealButton.setEnabled(true);
            PassButton.setEnabled(true);
            game();
        }
    }//GEN-LAST:event_jButton_PlaceBetActionPerformed

    public void setStartingMoney(int startingMoney){
        StartingMoney = startingMoney;
    }
    
    public void setNoOfDecks(int noOfDecks){
        NoOfDecks = noOfDecks;
    }
    
    public void initNewGame()
    {
        gameStarted=true;
        theComponents(true);
        removeCards();
        jButton_Logo.setEnabled(false);
        DealButton.setEnabled(false);
        PassButton.setEnabled(false);
        playerBet=0;
        playerScore=0;
        dealerScore=0;
        jLabel_Bet.setText("Ulog: $"+playerBet);
        cardDeck = new Deck(NoOfDecks);
        currentMoney = StartingMoney;
        jLabel_CurrentMoney.setText("$ "+currentMoney);
        jButton_BetAdd.setEnabled(true);    
        jButton_BetSub.setEnabled(true);
        jButton_PlaceBet.setEnabled(true);   
    }
    
    /**
     * @param args the command line arguments
     */
    
    static boolean debugMode = false;
    static String className = new MakeStatic.ClassGetter().getClassName(MakeStatic.SIMPLE);
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
        //</editor-fold>
        int arguments = args.length;
        if(arguments>1){
            System.out.println("");
        }
        try{
            if(args[0].equals("-debug"))
                    debugMode = true;

            else{
                    System.out.println("Invalid argument!\n\nUsage: \t\tjava "+className+" [arguments]\n\n"
                            +"Arguments: \t-debug \tEnable debug mode");
                    System.exit(1);
            }
        }catch(Exception e){System.out.println(e);}
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setVisible(true);
            }
        });
        
    }
    
    public void removeCards()
    {
        DealerCard1.setIcon(null);
        DealerCard2.setIcon(null);
        DealerCard3.setIcon(null);
        
        PlayerCard2.setIcon(null);
        PlayerCard1.setIcon(null);
        PlayerCard3.setIcon(null);
        playerScore=0;
        dealerScore=0;
        
    }
    int currentMoney,playerScore=0,dealerScore=0,playerBet=10;
    String playerCard1,playerCard2,playerCard3;
    String dealerCard1,dealerCard2,dealerCard3;
    boolean gameStarted = false;
    Deck cardDeck;
    public void game(){
        removeCards();
        
        
        
        playerCard1 = cardDeck.cardPick();
        putToTable(playerCard1,PlayerCard1,false);
        
        
        dealerCard1 = cardDeck.cardPick();
        putToTable(dealerCard1,DealerCard1,false,true);
        
        
        playerCard2 = cardDeck.cardPick();
        putToTable(playerCard2,PlayerCard2,false);
        
        
        dealerCard2 = cardDeck.cardPick();
        putToTable(dealerCard2,DealerCard2,false);
        
        System.out.println("Igrac: "+playerScore);
        playerScore=getCardScore(playerCard1)+getCardScore(playerCard2);
        if(playerScore>=10)playerScore-=10;
        
        DealButton.setForeground(Color.yellow);
        PassButton.setForeground(Color.yellow);
        DealButton.setEnabled(true);
        PassButton.setEnabled(true);
    }
    
    //@SuppressWarnings("UseSpecificCatch")
    public void shortPause(int x){
        try{Thread.sleep(x);}catch(Exception e){}
    }
    
    
    private void putToTable(String card,JButton button,boolean rotated){
        
        if(!rotated)
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/"+card+".png")));
        else
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/"+card+"s.png")));
        
    }
    
    private void putToTable(String card,JButton button,boolean rotated,boolean downcard){
        
        if(downcard)
        {
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/downcard.png")));
        }
        else{
            if(!rotated)
                button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/"+card+".png")));
            else
                button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/"+card+"s.png")));
        }
        
    }
    
    private int getCardScore(String card)
    {
        int score;
        String temp="",temp2="";
        for (int i = card.length()-1; i >= 0; i--) {
            if(Character.isDigit(card.charAt(i))){
                temp+=card.charAt(i);
            }
        }
        for (int i = temp.length()-1; i >= 0; i--) {
            temp2+=temp.charAt(i);
        }
        score = Integer.parseInt(temp2);
        if(score>=10)score=0;
        System.out.println("Card " + card + " score is " +score);
        if(score>=10)score=0;
        return score;
    }
    
    private void compareScores(boolean pcard3,boolean dcard3){
        boolean playerLucky9 = false, playerNatural9 = false, playerAny9=false;
        boolean dealerLucky9 = false, dealerNatural9 = false, dealerAny9=false;
        if(playerScore==9){
            if(getCardScore(playerCard1)!=0&&getCardScore(playerCard2)!=0){
                playerLucky9 = true;
            }
            else{
                playerNatural9=true;
            }
        }
        
        if(pcard3){
            playerScore+=getCardScore(playerCard3);
            playerLucky9 = false;
            playerNatural9 = false;
        }
        if(playerScore>=10)playerScore-=10;
        
        if(playerScore==9&&pcard3)playerAny9=true;
        
        dealerScore=getCardScore(dealerCard1)+getCardScore(dealerCard2);
        if(dealerScore>=10)dealerScore-=10;
        if(dealerScore==9){
            if(getCardScore(dealerCard1)!=0&&getCardScore(dealerCard2)!=0){
                dealerLucky9 = true;
            }
            else{
                dealerNatural9=true;
            }
        }
        
        if(pcard3){
            dealerScore+=getCardScore(dealerCard3);
            dealerLucky9 = false;
            dealerNatural9 = false;
        }
        if(dealerScore>=10)dealerScore-=10;
        
        if(dealerScore==9&&dcard3)dealerAny9=true;
        
        
        if((playerScore==9&&dealerScore==9)){
            if(playerLucky9){
                if(!dealerLucky9&&!dealerNatural9){
                    payout(3,2);
                    JOptionPane.showMessageDialog(null,"Dobio si srecnu 9. Pobjedio si sa 3 do 2.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Svi dobijaju!");
                }
            }
            if(playerNatural9){
                if(!dealerLucky9&&!dealerNatural9){
                    payout(3,2);
                    JOptionPane.showMessageDialog(null,"Dobio si srecnu 9. Pobjedio si sa 3 do 2.");
                }
                else if(dealerLucky9||dealerNatural9){
                    JOptionPane.showMessageDialog(null,"Svi dobijaju!");
                }
                else if(dealerAny9){
                    payout(2,1);
                    JOptionPane.showMessageDialog(null,"Dobio si srecnu 9. Pobjedio si sa 2 do 1.");
                }
            }
            
        }
        else{
            if(playerScore<3||playerScore<dealerScore){
                payout(0,1);
                JOptionPane.showMessageDialog(null,"Izgubio si!");
            }
            else{
                if(playerScore==dealerScore){
                    JOptionPane.showMessageDialog(null,"Nerijeseno!");
                }
                else if(playerScore>dealerScore){
                    payout(2,1);
                    JOptionPane.showMessageDialog(null,"Vas rezultat je veci od dilera. Pobjedio si 2 u 1.");
                }
            }
        }
        if(currentMoney==0){
            JOptionPane.showMessageDialog(null,"Nemas vise novca. Kraj igre!");
            jButton_BetAdd.setEnabled(false);
            jButton_BetAdd.setForeground(Color.gray);
            jButton_BetSub.setEnabled(false);
            jButton_BetSub.setForeground(Color.gray);
            jButton_PlaceBet.setEnabled(false);
            jButton_PlaceBet.setForeground(Color.gray);
            return;
        }
        
        jButton_BetAdd.setEnabled(true);
        jButton_BetSub.setEnabled(true);
        jButton_PlaceBet.setEnabled(true);
        jButton_BetAdd.setForeground(Color.yellow);
        jButton_BetSub.setForeground(Color.yellow);
        jButton_PlaceBet.setForeground(Color.red);
    }
    
    public void payout(int x,int y){
        int payoutRate = x/y;
        int totalPayout = payoutRate*playerBet;
        currentMoney+= totalPayout;
        jLabel_CurrentMoney.setText("$ "+ currentMoney);
        jLabel_Bet.setText("Ulog: $0");
        playerBet=0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DealButton;
    private javax.swing.JButton DealerCard1;
    private javax.swing.JButton DealerCard2;
    private javax.swing.JButton DealerCard3;
    private javax.swing.JButton PassButton;
    private javax.swing.JButton PlayerCard1;
    private javax.swing.JButton PlayerCard2;
    private javax.swing.JButton PlayerCard3;
    private javax.swing.JButton jButton_BetAdd;
    private javax.swing.JButton jButton_BetSub;
    private javax.swing.JButton jButton_Logo;
    private javax.swing.JButton jButton_PlaceBet;
    private javax.swing.JLabel jLabel_Bet;
    private javax.swing.JLabel jLabel_CurrentMoney;
    private javax.swing.JLabel jLabel_MoneyLabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_NewGame;
    private javax.swing.JMenu jMenu_Game;
    private javax.swing.JPanel jPanel_GamePanel;
    // End of variables declaration//GEN-END:variables
}
