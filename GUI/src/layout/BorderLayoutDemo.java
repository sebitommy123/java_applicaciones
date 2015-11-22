package layout;
/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
 
 
/*
 * BorderLayoutDemo.java
 *
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class BorderLayoutDemo {
       
        public static void deleteIfView(String mode, final JLabel display) {
                if (mode.equals("View")){
                        display.setText("0");
                        mode = "None";
                }
               
        }
       
        public static void Update(String me) {
 
 
               
        }
       
       
        public static double LastValue = 0;
       
        public static double LastOperator = 0;
 
        public static String mode = "None";
 
        public static boolean RIGHT_TO_LEFT = false;
 
        public static void addComponentsToPane(Container pane) {
 
                if (!(pane.getLayout() instanceof BorderLayout)) {
                        pane.add(new JLabel("Container doesn't use BorderLayout!"));
                        return;
                }
 
                if (RIGHT_TO_LEFT) {
                        pane.setComponentOrientation(
                                        java.awt.ComponentOrientation.RIGHT_TO_LEFT);
                }
 
                ///////////////////////////////
 
 
                JLabel display = new JLabel("0");
                display.setPreferredSize(new Dimension(600,100));
                pane.add(display, BorderLayout.PAGE_START);
 
                JPanel centro = new JPanel();
                centro.setLayout(new GridLayout(5,4));
                centro.setPreferredSize(new Dimension(600,800));
                añadirCosas(centro, display);
                pane.add(centro,BorderLayout.CENTER);
 
 
 
 
                /////////////////////////////////////
 
        }
 
        private static void añadirCosas(JPanel centro, final JLabel display) {
 
 
 
                ///////////////////RESTARTALLVALUES
                JButton Restart = new JButton("AC");
                Restart.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("AC");
                                display.setText("0");
                                LastValue = 0;
 
                        }
                });
 
                ///////////////////RESTART
                JButton RestartCurrentValue = new JButton("C");
                RestartCurrentValue.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("C");
                                display.setText("0");
 
                        }
                });
 
                ///////////////////DeleteLastValue
                JButton Delete = new JButton("<-");
                Delete.addActionListener(new ActionListener() {
                       
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("Delete");
                                display.setText(display.getText().substring(0, display.getText().length()-1));
                               
                        }
                });
                ///////////////////DivideMode
                JButton Divide = new JButton("/");
                Divide.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("/");
                               
                                mode = "Division";
                                LastValue = Double.parseDouble(display.getText());
                                display.setText("0");
 
                        }
                });
 
                ///////////////////Seven
                JButton Seven = new JButton("7");
                Seven.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("7");
                                deleteIfView(mode,display);
                                if(display.getText().equals("0")){
                                        display.setText("7");
                                }else{
                                        display.setText(display.getText()+"7");
                                }
 
                        }
                });
 
                //////////////////Eight
                JButton eight = new JButton("8");
                eight.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("8");
                                deleteIfView(mode,display);
                                if(display.getText().equals("0")){
                                        display.setText("8");
                                }else{
                                        display.setText(display.getText()+"8");
 
                                }
                        }
                });
 
//////////////Nine
                JButton Nine = new JButton("9");
                Nine.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("9");
                                deleteIfView(mode,display);
                                if(display.getText().equals("0")){
                                        display.setText("9");
                                }else{
                                        display.setText(display.getText()+"9");
 
                                }
                        }
                });
               
//////////////////////Multiply
                JButton Multiply = new JButton("*");
                Multiply.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("*");
                                mode = "Multiply";
                                LastValue = Double.parseDouble(display.getText());
                                display.setText("0");
 
                        }
                });
 
 
///////////Four
                JButton Four = new JButton("4");
                Four.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("4");
                                deleteIfView(mode,display);
                                if(display.getText().equals("0")){
                                        display.setText("4");
                                }else{
                                        display.setText(display.getText()+"4");
 
                                }
                        }
                });
 
///////////////Five
                JButton Five = new JButton("5");
                Five.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("5");
                                deleteIfView(mode,display);
                                if(display.getText().equals("0")){
                                        display.setText("5");
                                }else{
                                        display.setText(display.getText()+"5");
 
                                }
                        }
                });
               
////////////////Six
                JButton Six = new JButton("6");
                Six.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("6");
                                deleteIfView(mode,display);
                                if(display.getText().equals("0")){
                                        display.setText("6");
                                }else{
                                        display.setText(display.getText()+"6");
 
                                }
                        }
                });
 
//////////////-
                JButton Subtract = new JButton("-");
                Subtract.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("-");
                                mode = "Subtract";
                                LastValue = Double.parseDouble(display.getText());
                                display.setText("0");
 
                        }
                });
 
 
////////////One
                JButton One = new JButton("1");
                One.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("1");
                                deleteIfView(mode,display);
                                if(display.getText().equals("0")){
                                        display.setText("1");
                                }else{
                                        display.setText(display.getText()+"1");
 
                                }
                        }
                });
 
               
/////////////////Two
                JButton Two = new JButton("2");
                Two.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("2");
                                deleteIfView(mode,display);
                                if(display.getText().equals("0")){
                                        display.setText("2");
                                }else{
                                        display.setText(display.getText()+"2");
 
                                }
                        }
                });
               
//////////////Three
                JButton Three = new JButton("3");
                Three.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("3");
                                deleteIfView(mode,display);
                                if(display.getText().equals("0")){
                                        display.setText("3");
                                }else{
                                        display.setText(display.getText()+"3");
 
                                }
                        }
                });
               
/////////////Addition
                JButton Add = new JButton("+");
                Add.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("+");
                                mode = "Addition";
                                LastValue = Double.parseDouble(display.getText());
                                display.setText("0");
 
                        }
                });
 
 
 
                JButton Unknown = new JButton("?");
 
///////////////Zero
                JButton Zero = new JButton("0");
                Zero.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("0");
                                deleteIfView(mode,display);
                                if(display.getText().equals("0")){
                                        display.setText("0");
                                }else{
                                        display.setText(display.getText()+"0");
 
                                }
                        }
 
 
                });
               
                JButton Dot = new JButton(".");
                Dot.addActionListener(new ActionListener() {
                       
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update(".");
                                if(display.getText().contains(".")){
                                        JOptionPane.showMessageDialog(null, "¿De que vas?");
                                }else{
                                        display.setText(display.getText() + ".");
                                }
                               
                        }
                });
 
                JButton Equals = new JButton("=");
                Equals.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Update("Equals");
                                if(mode.equals("Division")){
                                        display.setText("" + (LastValue/Double.parseDouble(display.getText())));
                                        mode = "View";
                                }
                                if(mode.equals("Multiply")){
                                        display.setText("" + (LastValue*Double.parseDouble(display.getText())));
                                        mode = "View";
                                }
                                if(mode.equals("Subtract")){
                                        LastOperator = Double.parseDouble(display.getText());
                                        display.setText("" + (LastValue-LastOperator));
                                        mode = "View";
                                }
                                if(mode.equals("Addition")){
                                        display.setText("" + (LastValue+Double.parseDouble(display.getText())));
                                        mode = "View";
                                }
                        }
                });
               
 
 
                centro.add(Restart);
                centro.add(RestartCurrentValue);
                centro.add(Delete);
                centro.add(Divide);
 
                centro.add(Seven);
                centro.add(eight);
                centro.add(Nine);
                centro.add(Multiply);
 
                centro.add(Four);
                centro.add(Five);
                centro.add(Six);
                centro.add(Subtract);
 
                centro.add(One);
                centro.add(Two);
                centro.add(Three);
                centro.add(Add);
 
                centro.add(Unknown);
                centro.add(Zero);
                centro.add(Dot);
                centro.add(Equals);
 
        }
 
        /**
         * Create the GUI and show it.  For thread safety,
         * this method should be invoked from the
         * event dispatch thread.
         */
        private static void createAndShowGUI() {
 
                //Create and set up the window.
                JFrame frame = new JFrame("BorderLayoutDemo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //Set up the content pane.
                addComponentsToPane(frame.getContentPane());
                //Use the content pane's default BorderLayout. No need for
                //setLayout(new BorderLayout());
                //Display the window.
                frame.pack();
                frame.setVisible(true);
        }
 
        public static void main(String[] args) {
                /* Use an appropriate Look and Feel */
                try {
                        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (UnsupportedLookAndFeelException ex) {
                        ex.printStackTrace();
                } catch (IllegalAccessException ex) {
                        ex.printStackTrace();
                } catch (InstantiationException ex) {
                        ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                }
                /* Turn off metal's use bold fonts */
                UIManager.put("swing.boldMetal", Boolean.FALSE);
 
                //Schedule a job for the event dispatch thread:
                //creating and showing this application's GUI.
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                                createAndShowGUI();
                        }
                });
        }
}