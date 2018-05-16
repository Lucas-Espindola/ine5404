package trabgui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class NewJPanel extends javax.swing.JPanel {

    public NewJPanel() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        aButton = new javax.swing.JButton();
        bButton = new javax.swing.JButton();
        dButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        fButton = new javax.swing.JButton();
        gButton = new javax.swing.JButton();
        hButton = new javax.swing.JButton();
        iButton = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        kButton = new javax.swing.JButton();
        lButton = new javax.swing.JButton();
        mButton = new javax.swing.JButton();
        nButton = new javax.swing.JButton();
        oButton = new javax.swing.JButton();
        pButton = new javax.swing.JButton();
        qButton = new javax.swing.JButton();
        rButton = new javax.swing.JButton();
        sButton = new javax.swing.JButton();
        tButton = new javax.swing.JButton();
        uButton = new javax.swing.JButton();
        vButton = new javax.swing.JButton();
        xButton = new javax.swing.JButton();
        yButton = new javax.swing.JButton();
        zButton = new javax.swing.JButton();
        wButton = new javax.swing.JButton();
        tabButton = new javax.swing.JButton();
        tildeButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        backspaceButton = new javax.swing.JButton();
        openBracketButton = new javax.swing.JButton();
        closeBracketButton = new javax.swing.JButton();
        slashButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        capsButton = new javax.swing.JButton();
        shiftButton = new javax.swing.JButton();
        spaceButton = new javax.swing.JButton();
        twoPointsButton = new javax.swing.JButton();
        quoteButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        commaButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        upwardsArrowButton = new javax.swing.JButton();
        rightArrowButton = new javax.swing.JButton();
        leftArrowButton = new javax.swing.JButton();
        downwardsArrowButton = new javax.swing.JButton();

        jTextField1.setToolTipText("Digite aqui");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        aButton.setText("A");

        bButton.setText("B");

        dButton.setText("D");

        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        eButton.setText("E");

        fButton.setText("F");

        gButton.setText("G");

        hButton.setText("H");

        iButton.setText("I");

        jButton.setText("J");

        kButton.setText("K");

        lButton.setText("L");

        mButton.setText("M");

        nButton.setText("N");

        oButton.setText("O");

        pButton.setText("P");

        qButton.setText("Q");

        rButton.setText("R");

        sButton.setText("S");

        tButton.setText("T");

        uButton.setText("U");

        vButton.setText("V");

        xButton.setText("X");

        yButton.setText("Y");

        zButton.setText("Z");

        wButton.setText("W");

        tabButton.setText("Tab");

        tildeButton.setText("~");

        oneButton.setText("1");

        twoButton.setText("2");

        threeButton.setText("3");

        fourButton.setText("4");

        fiveButton.setText("5");

        sixButton.setText("6");

        sevenButton.setText("7");

        eightButton.setText("8");

        nineButton.setText("9");

        minusButton.setText("-");

        plusButton.setText("+");

        backspaceButton.setText("Backspace");

        openBracketButton.setText("[");

        closeBracketButton.setText("]");

        slashButton.setText("\\");

            zeroButton.setText("0");

            capsButton.setText("Caps");

            shiftButton.setText("Shift");

            twoPointsButton.setText(":");

            quoteButton.setText("\"");

            enterButton.setText("Enter");

            commaButton.setText(",");

            dotButton.setText(".");

            upwardsArrowButton.setText("^");

            rightArrowButton.setText(">");

            leftArrowButton.setText("<");

            downwardsArrowButton.setText("v");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTextField1)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tabButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(qButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(wButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(eButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tButton)
                            .addGap(10, 10, 10)
                            .addComponent(yButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(uButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(iButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(oButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(openBracketButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(closeBracketButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(slashButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(capsButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(aButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dButton)
                                    .addGap(10, 10, 10)
                                    .addComponent(fButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(gButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(twoPointsButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(shiftButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(zButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(xButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(vButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(mButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(commaButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dotButton)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(quoteButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(leftArrowButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(upwardsArrowButton)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(downwardsArrowButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rightArrowButton))))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tildeButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(oneButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(twoButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(threeButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fourButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fiveButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sixButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sevenButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(eightButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nineButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(zeroButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(minusButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(plusButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(backspaceButton)))
                    .addGap(0, 83, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tildeButton)
                        .addComponent(oneButton)
                        .addComponent(twoButton)
                        .addComponent(threeButton)
                        .addComponent(fourButton)
                        .addComponent(fiveButton)
                        .addComponent(sixButton)
                        .addComponent(sevenButton)
                        .addComponent(eightButton)
                        .addComponent(nineButton)
                        .addComponent(minusButton)
                        .addComponent(plusButton)
                        .addComponent(zeroButton)
                        .addComponent(backspaceButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eButton)
                        .addComponent(qButton)
                        .addComponent(wButton)
                        .addComponent(rButton)
                        .addComponent(tButton)
                        .addComponent(yButton)
                        .addComponent(uButton)
                        .addComponent(iButton)
                        .addComponent(oButton)
                        .addComponent(pButton)
                        .addComponent(tabButton)
                        .addComponent(openBracketButton)
                        .addComponent(closeBracketButton)
                        .addComponent(slashButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(capsButton)
                        .addComponent(aButton)
                        .addComponent(sButton)
                        .addComponent(dButton)
                        .addComponent(fButton)
                        .addComponent(gButton)
                        .addComponent(hButton)
                        .addComponent(jButton)
                        .addComponent(kButton)
                        .addComponent(lButton)
                        .addComponent(twoPointsButton)
                        .addComponent(quoteButton)
                        .addComponent(enterButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(shiftButton)
                        .addComponent(zButton)
                        .addComponent(xButton)
                        .addComponent(cButton)
                        .addComponent(vButton)
                        .addComponent(bButton)
                        .addComponent(mButton)
                        .addComponent(commaButton)
                        .addComponent(dotButton)
                        .addComponent(upwardsArrowButton)
                        .addComponent(nButton))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rightArrowButton)
                            .addComponent(leftArrowButton)
                            .addComponent(downwardsArrowButton))
                        .addComponent(spaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jTextField1.getAccessibleContext().setAccessibleName("");
        }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

        switch (evt.getKeyCode()) {
        case KeyEvent.VK_A :
            aButton.setBackground(Color.YELLOW);
            break;              
        case KeyEvent.VK_B :
            bButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_C :
            cButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_D :
            dButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_E :
            eButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_F :
            fButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_G :
            gButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_H :
            hButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_I :
            iButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_J :
            jButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_K :
            kButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_L :
            lButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_M :
            mButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_N :
            nButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_O :
            oButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_P :
            pButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_Q :
            qButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_R :
            rButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_S :
            sButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_T :
            tButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_U :
            uButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_V :
            vButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_X :
            xButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_Y :
            yButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_Z :
            zButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_W :
            wButton.setBackground(Color.YELLOW);
            break;
            
        
        case KeyEvent.VK_MINUS :
            minusButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_EQUALS :
            plusButton.setBackground(Color.YELLOW);
            break;
            
        case KeyEvent.VK_0 :
            zeroButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_1 :
            oneButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_2 :
            twoButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_3 :
            threeButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_4 :
            fourButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_5 :
            fiveButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_6 :
            sixButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_7 :
            sevenButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_8 :
            eightButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_9 :
            nineButton.setBackground(Color.YELLOW);
            break;
            
        case KeyEvent.VK_UP :
            upwardsArrowButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_DOWN :
            downwardsArrowButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_LEFT :
            leftArrowButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_RIGHT :
            rightArrowButton.setBackground(Color.YELLOW);
            break;
            
        case KeyEvent.VK_SHIFT :
            shiftButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_CAPS_LOCK :
            capsButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_TAB :
            tabButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_DEAD_TILDE :
            tildeButton.setBackground(Color.YELLOW);
            break;  
        case KeyEvent.VK_ENTER :
            FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("file.ser");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fout);
        } catch (IOException ex) {
            Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        {
            try {
                oos.writeObject(jTextField1.getText());
            } catch (IOException ex) {
                Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            enterButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_BACK_SPACE :
            backspaceButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_SPACE :
            spaceButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_COMMA :
            commaButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_BACK_SLASH :
            slashButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_OPEN_BRACKET :
            openBracketButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_CLOSE_BRACKET :
            closeBracketButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_SEMICOLON :
            twoPointsButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_PERIOD :
            dotButton.setBackground(Color.YELLOW);
            break;
        case KeyEvent.VK_QUOTE :
            quoteButton.setBackground(Color.YELLOW);
            break;
            
        default:
        {
            try {
                throw new Exception("A tecla clicada não é válida");
            } catch (Exception ex) {
                Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        break;
      }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        switch (evt.getKeyCode()) {
        case KeyEvent.VK_A :
            aButton.setBackground(null);
            break; 
        case KeyEvent.VK_B :
            bButton.setBackground(null);
            break;
         case KeyEvent.VK_C :
            cButton.setBackground(null);
            break;
         case KeyEvent.VK_D :
            dButton.setBackground(null);
            break;
         case KeyEvent.VK_E :
            eButton.setBackground(null);
            break;
         case KeyEvent.VK_F :
            fButton.setBackground(null);
            break;
         case KeyEvent.VK_G :
            gButton.setBackground(null);
            break;
         case KeyEvent.VK_H :
            hButton.setBackground(null);
            break;
         case KeyEvent.VK_I :
            iButton.setBackground(null);
            break;
         case KeyEvent.VK_J :
            jButton.setBackground(null);
            break;
         case KeyEvent.VK_K :
            kButton.setBackground(null);
            break;
         case KeyEvent.VK_L :
            lButton.setBackground(null);
            break;
         case KeyEvent.VK_M :
            mButton.setBackground(null);
            break;
         case KeyEvent.VK_N :
            nButton.setBackground(null);
            break;
         case KeyEvent.VK_O :
            oButton.setBackground(null);
            break;
         case KeyEvent.VK_P :
            pButton.setBackground(null);
            break;
         case KeyEvent.VK_Q :
            qButton.setBackground(null);
            break;
         case KeyEvent.VK_R :
            rButton.setBackground(null);
            break;
         case KeyEvent.VK_S :
            sButton.setBackground(null);
            break;
         case KeyEvent.VK_T :
            tButton.setBackground(null);
            break;
         case KeyEvent.VK_U :
            uButton.setBackground(null);
            break;
         case KeyEvent.VK_V :
            vButton.setBackground(null);
            break;
         case KeyEvent.VK_X :
            xButton.setBackground(null);
            break;
         case KeyEvent.VK_Y :
            yButton.setBackground(null);
            break;
         case KeyEvent.VK_Z :
            zButton.setBackground(null);
            break;
         case KeyEvent.VK_W :
            wButton.setBackground(null);
            break;
            
        case KeyEvent.VK_MINUS :
            minusButton.setBackground(null);
            break;
        case KeyEvent.VK_EQUALS :
            plusButton.setBackground(null);
            break;
            
        case KeyEvent.VK_0 :
            zeroButton.setBackground(null);
            break;
        case KeyEvent.VK_1 :
            oneButton.setBackground(null);
            break;
        case KeyEvent.VK_2 :
            twoButton.setBackground(null);
            break;
        case KeyEvent.VK_3 :
            threeButton.setBackground(null);
            break;
        case KeyEvent.VK_4 :
            fourButton.setBackground(null);
            break;
        case KeyEvent.VK_5 :
            fiveButton.setBackground(null);
            break;
        case KeyEvent.VK_6 :
            sixButton.setBackground(null);
            break;
        case KeyEvent.VK_7 :
            sevenButton.setBackground(null);
            break;
        case KeyEvent.VK_8 :
            eightButton.setBackground(null);
            break;
        case KeyEvent.VK_9 :
            nineButton.setBackground(null);
            break;
            
        case KeyEvent.VK_UP :
            upwardsArrowButton.setBackground(null);
            break;
        case KeyEvent.VK_DOWN :
            downwardsArrowButton.setBackground(null);
            break;
        case KeyEvent.VK_LEFT :
            leftArrowButton.setBackground(null);
            break;
        case KeyEvent.VK_RIGHT :
            rightArrowButton.setBackground(null);
            break;
            
        case KeyEvent.VK_SHIFT :
            shiftButton.setBackground(null);
            break;
        case KeyEvent.VK_CAPS_LOCK :
            capsButton.setBackground(null);
            break;
        case KeyEvent.VK_TAB :
            tabButton.setBackground(null);
            break;
        case KeyEvent.VK_DEAD_TILDE :
            tildeButton.setBackground(null);
            break;  
        case KeyEvent.VK_ENTER :
            enterButton.setBackground(null);
            break;
        case KeyEvent.VK_BACK_SPACE :
            backspaceButton.setBackground(null);
            break;
        case KeyEvent.VK_SPACE :
            spaceButton.setBackground(null);
            break;
        case KeyEvent.VK_COMMA :
            commaButton.setBackground(null);
            break;
        case KeyEvent.VK_BACK_SLASH :
            slashButton.setBackground(null);
            break;
        case KeyEvent.VK_OPEN_BRACKET :
            openBracketButton.setBackground(null);
            break;
        case KeyEvent.VK_CLOSE_BRACKET :
            closeBracketButton.setBackground(null);
            break;
        case KeyEvent.VK_SEMICOLON :
            twoPointsButton.setBackground(null);
            break;
        case KeyEvent.VK_PERIOD :
            dotButton.setBackground(null);
            break;
        case KeyEvent.VK_QUOTE :
            quoteButton.setBackground(null);
            break;     
        default:
            break;
      }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aButton;
    private javax.swing.JButton bButton;
    private javax.swing.JButton backspaceButton;
    private javax.swing.JButton cButton;
    private javax.swing.JButton capsButton;
    private javax.swing.JButton closeBracketButton;
    private javax.swing.JButton commaButton;
    private javax.swing.JButton dButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton downwardsArrowButton;
    private javax.swing.JButton eButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton fButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton gButton;
    private javax.swing.JButton hButton;
    private javax.swing.JButton iButton;
    private javax.swing.JButton jButton;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton kButton;
    private javax.swing.JButton lButton;
    private javax.swing.JButton leftArrowButton;
    private javax.swing.JButton mButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton nButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton openBracketButton;
    private javax.swing.JButton pButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton qButton;
    private javax.swing.JButton quoteButton;
    private javax.swing.JButton rButton;
    private javax.swing.JButton rightArrowButton;
    private javax.swing.JButton sButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton shiftButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton slashButton;
    private javax.swing.JButton spaceButton;
    private javax.swing.JButton tButton;
    private javax.swing.JButton tabButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton tildeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton twoPointsButton;
    private javax.swing.JButton uButton;
    private javax.swing.JButton upwardsArrowButton;
    private javax.swing.JButton vButton;
    private javax.swing.JButton wButton;
    private javax.swing.JButton xButton;
    private javax.swing.JButton yButton;
    private javax.swing.JButton zButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
