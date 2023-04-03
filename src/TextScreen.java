
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E-Therng
 */
public class TextScreen extends javax.swing.JFrame {
String day = "";
    /**
     * Creates new form TextScreen
     */
    public TextScreen() {
        initComponents();
        Tesxt.setEditable(false);
        try{
            FileReader fr = new FileReader("Day.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    day = r;
                }
                br.close();
                
                if(day.equals("0"))
                {
                Title.setText("Prologue");
                Op1.setVisible(false);
                Op2.setVisible(false);
                fr = new FileReader("Prologue.txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                if(day.equals("2.1"))
                {
                Title.setText("Day 2 - Going Outside");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                fr = new FileReader("Day 2.1 (Death By Blown Up By Aliens).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                if(day.equals("Hunger"))
                {
                Title.setText("Death by Hunger");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                fr = new FileReader("Death By Hunger.txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                if(day.equals("Thirst"))
                {
                Title.setText("Death by Thirst");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                fr = new FileReader("Death By Thirst.txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                
                if(day.equals("3 outside"))
                {
                Title.setText("Day 3 - Outside");
                Op1.setVisible(true);
                Op1.setEnabled(true);
                Cont.setEnabled(false);
                Cont.setVisible(false);
                Op2.setVisible(true);
                Op2.setEnabled(true);
                Op1.setText("Supermarket");
                Op2.setText("Survivor");
                fr = new FileReader("Day 3.1 (Go Outside).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                
                if(day.equals("3 survivor"))
                {
                    Cont.setEnabled(false);
                Cont.setVisible(false);
                Title.setText("Day 3 - Approach Survivor");
                
                Op1.setText("Befriend");
                Op2.setText("Attack");
                fr = new FileReader("Day 3.1.2 (Survivor).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                if(day.equals("3 survivor befriend"))
                {
                Title.setText("Day 3 - Befriend Survivor");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                day = "3 survivor befriend";
                
                    
                fr = new FileReader("Day 3.1.2.1 (Killed by Awab).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                
                if(day.equals("3 supermarket"))
                {
                Title.setText("Day 3 - Supermarket");
                Op1.setText("Steal");
                Op2.setText("Kill");
                
                    
                fr = new FileReader("Day 3.1.1 (Supermarket).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                
                if(day.equals("3 supermarket kill alien"))
                {
                Title.setText("Day 3 - Kill Alien");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                
                    
                fr = new FileReader("Day 3.1.1.2 (Kill Alien).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                
                if(day.equals("3 supermarket steal"))
                {
                Title.setText("Day 3 - Steal");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                
                    
                fr = new FileReader("Day 3.1.1.1 (Killed By Getting Spotted By Alien).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                
                if(day.equals("6 shoot"))
                {
                Title.setText("Day 6 - Pull Trigger");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                
                    
                fr = new FileReader("Death By Blown Up From Hallucinations.txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                
                
                if(day.equals("7 outside"))
                {
                Title.setText("Day 7 - Outside");
                Op1.setVisible(true);
                Op1.setEnabled(true);
                Cont.setEnabled(false);
                Cont.setVisible(false);
                Op2.setVisible(true);
                Op2.setEnabled(true);
                Op1.setText("Supermarket");
                Op2.setText("Survivor");
                fr = new FileReader("Day 7.1 (Go Outside).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                
                if(day.equals("7 survivor"))
                {
                    Cont.setEnabled(false);
                Cont.setVisible(false);
                Title.setText("Day 7 - Approach Survivor");
                
                Op1.setText("Befriend");
                Op2.setText("Attack");
                fr = new FileReader("Day 3.1.2 (Survivor).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                if(day.equals("7 survivor befriend"))
                {
                Title.setText("Day 7 - Befriend Survivor");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                day = "7 survivor befriend";
                
                    
                fr = new FileReader("Day 3.1.2.1 (Killed by Awab).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                
                if(day.equals("7 supermarket"))
                {
                Title.setText("Day 7 - Supermarket");
                Op1.setText("Steal");
                Op2.setText("Kill");
                
                    
                fr = new FileReader("Day 7.1.1 (Supermarket).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                
                if(day.equals("7 supermarket kill alien"))
                {
                Title.setText("Day 7 - Kill Alien");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                
                    
                fr = new FileReader("Day 7.1.1.2 (Killed by Killing Alien).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
                
                if(day.equals("7 supermarket steal"))
                {
                Title.setText("Day 7 - Scavenge");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                
                    
                fr = new FileReader("Day 3.1.1.1 (Killed By Getting Spotted By Alien).txt");
                br = new BufferedReader(fr);
                r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
            }
            catch(Exception e)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Error in Deleting/Restoring Data!", "Message: ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tesxt = new javax.swing.JTextArea();
        Op2 = new javax.swing.JButton();
        Op1 = new javax.swing.JButton();
        Cont = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 53, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(204, 204, 204));
        Title.setText("Title");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 6, -1, -1));

        Tesxt.setColumns(20);
        Tesxt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Tesxt.setRows(5);
        jScrollPane1.setViewportView(Tesxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 70, 1050, 582));

        Op2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Op2.setText("Option 2");
        Op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op2ActionPerformed(evt);
            }
        });
        jPanel1.add(Op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 692, 234, 74));

        Op1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Op1.setText("Option 1");
        Op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op1ActionPerformed(evt);
            }
        });
        jPanel1.add(Op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 692, 234, 74));

        Cont.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Cont.setText("Continue");
        Cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContActionPerformed(evt);
            }
        });
        jPanel1.add(Cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 692, 234, 74));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContActionPerformed
        if(day.equals("0"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("1") ;
                    BookWriter.close();
        }
        catch(Exception e)
          {
              
          }
        Bunker f1 = new Bunker();

        f1.setVisible(true);
        this.setVisible(false);
        }
        if(day.equals("2.1") || day.equals("Hunger") || day.equals("Thirst") || day.equals("3 survivor befriend") || day.equals("3 survivor attack")
                 || day.equals("3 supermarket steal") || day.equals("6 shoot") || day.equals("7 survivor befriend") || day.equals("7 survivor attack")
                 || day.equals("7 supermarket steal") || day.equals("7 supermarket kill alien"))
        {
        GameOver f1 = new GameOver();

        f1.setVisible(true);
        this.setVisible(false);
        }
        if(day.equals("3 supermarket kill alien"))
        {
            try{
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("3 return home");
                    BookWriter.close();
            }
            catch(Exception e)
            {
                
            }
                 
            
            Bunker f1 = new Bunker();

        f1.setVisible(true);
        this.setVisible(false);
        }
        
    }//GEN-LAST:event_ContActionPerformed

    private void Op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op2ActionPerformed
        String days = "";
        try{
            if(day.equals("3 outside"))
                {
                Title.setText("Day 3 - Approach Survivor");
                days = "3 survivor";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("3 survivor") ;
                    BookWriter.close();
                    
                Op1.setText("Befriend");
                Op2.setText("Attack");
                FileReader fr = new FileReader("Day 3.1.2 (Survivor).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
            
        }
        catch(Exception e)
        {
            
        }
        try{
            if(day.equals("3 survivor"))
                {
                Title.setText("Day 3 - Backstab Survivor");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                days = "3 survivor attack";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("3 survivor attack") ;
                    BookWriter.close();
                    
                FileReader fr = new FileReader("Day 3.1.2.2 (Killed by Getting Spotted).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
            
        }
        catch(Exception e)
        {
            
        }
        try{
            if(day.equals("3 supermarket"))
                {
                Title.setText("Day 3 - Kill Alien");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                days = "3 supermarket kill alien";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("3 supermarket kill alien") ;
                    BookWriter.close();
                    
                FileReader fr = new FileReader("Day 3.1.1.2 (Kill Alien).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
            
        }
        catch(Exception e)
        {
            
        }
        
        
        try{
            if(day.equals("7 outside"))
                {
                Title.setText("Day 7 - Approach Survivor");
                days = "7 survivor";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("7 survivor") ;
                    BookWriter.close();
                    
                Op1.setText("Befriend");
                Op2.setText("Attack");
                FileReader fr = new FileReader("Day 3.1.2 (Survivor).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
            
        }
        catch(Exception e)
        {
            
        }
        try{
            if(day.equals("7 survivor"))
                {
                Title.setText("Day 7 - Backstab Survivor");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                days = "7 survivor attack";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("7 survivor attack") ;
                    BookWriter.close();
                    
                FileReader fr = new FileReader("Day 3.1.2.2 (Killed by Getting Spotted).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
            
        }
        catch(Exception e)
        {
            
        }
        try{
            if(day.equals("7 supermarket"))
                {
                Title.setText("Day 7 - Kill Alien");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                days = "7 supermarket kill alien";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("7 supermarket kill alien") ;
                    BookWriter.close();
                    
                FileReader fr = new FileReader("Day 7.1.1.2 (Killed by Killing Alien).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
            
        }
        catch(Exception e)
        {
            
        }
        day = days;
    }//GEN-LAST:event_Op2ActionPerformed

    private void Op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op1ActionPerformed
        String days = "";
        try{
            if(day.equals("3 outside"))
                {
                Title.setText("Day 3 - Supermarket");
                Op1.setText("Steal");
                Op2.setText("Kill");
                
                days = "3 supermarket";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("3 supermarket") ;
                    BookWriter.close();
                    
                FileReader fr = new FileReader("Day 3.1.1 (Supermarket).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
        }
        catch(Exception e)
        {
            
        }
        try{
            if(day.equals("3 supermarket"))
                {
                Title.setText("Day 3 - Steal");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                
                days = "3 supermarket steal";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("3 supermarket steal") ;
                    BookWriter.close();
                    
                FileReader fr = new FileReader("Day 3.1.1.1 (Killed By Getting Spotted By Alien).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
        }
        catch(Exception e)
        {
            
        }
        try{
            if(day.equals("3 survivor"))
                {
                Title.setText("Day 3 - Befriend Survivor");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                days = "3 survivor befriend";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("3 survivor befriend") ;
                    BookWriter.close();
                    
                FileReader fr = new FileReader("Day 3.1.2.1 (Killed by Awab).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
            
        }
        catch(Exception e)
        {
            
        }
        
        try{
            if(day.equals("7 outside"))
                {
                Title.setText("Day 7 - Supermarket");
                Op1.setText("Steal");
                Op2.setText("Kill");
                
                days = "7 supermarket";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("7 supermarket") ;
                    BookWriter.close();
                    
                FileReader fr = new FileReader("Day 7.1.1 (Supermarket).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
        }
        catch(Exception e)
        {
            
        }
        try{
            if(day.equals("7 supermarket"))
                {
                Title.setText("Day 7 - Scavenge");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                
                days = "7 supermarket steal";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("7 supermarket steal") ;
                    BookWriter.close();
                    
                FileReader fr = new FileReader("Day 3.1.1.1 (Killed By Getting Spotted By Alien).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
        }
        catch(Exception e)
        {
            
        }
        try{
            if(day.equals("7 survivor"))
                {
                Title.setText("Day 7 - Befriend Survivor");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setEnabled(true);
                Cont.setVisible(true);
                days = "7 survivor befriend";
                
                FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("7 survivor befriend") ;
                    BookWriter.close();
                    
                FileReader fr = new FileReader("Day 3.1.2.1 (Killed by Awab).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt= "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                Tesxt.setText(txt);
                }
            
        }
        catch(Exception e)
        {
            
        }
        day = days;
    }//GEN-LAST:event_Op1ActionPerformed

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
            java.util.logging.Logger.getLogger(TextScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cont;
    private javax.swing.JButton Op1;
    private javax.swing.JButton Op2;
    private javax.swing.JTextArea Tesxt;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
