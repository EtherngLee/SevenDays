
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
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
public class Bunker extends javax.swing.JFrame {
String day = "";
boolean New = false;
    /**
     * Creates new form Bunker
     */
    public Bunker() {
        initComponents();
        News.setEnabled(true);
        Event.setEditable(false);
        try{
            String txt= "";
            FileReader fr = new FileReader("Day.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    day = r;
                }
                br.close();
                
        if(day.equals("1"))
                {
                Cont.setText("Sleep");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Title.setText("Day 1 - Event");
                fr = new FileReader("Day 1 Events.txt");
               br = new BufferedReader(fr);
                r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                
                }
        
        if(day.equals("2"))
        {
            Cont.setText("Sleep");
            Cont.setVisible(false);
            Cont.setEnabled(false);
            Cont.setEnabled(false);
                Op1.setVisible(true);
                Op1.setEnabled(true);
                Op2.setVisible(true);
                Op2.setEnabled(true);
                Op1.setText("Go Outside");
                Op2.setText("Stay Inside");
                Title.setText("Day 2 - Event");
                fr = new FileReader("Day 2 Events.txt");
               br = new BufferedReader(fr);
                r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
        }
        if(day.equals("3"))
                {
                Title.setText("Day 3");
                Cont.setEnabled(false);
                Cont.setVisible(false);
                Op1.setVisible(true);
                Op1.setEnabled(true);
                Op1.setText("Go Outside");
                Op2.setVisible(true);
                Op2.setEnabled(true);
                Op2.setText("Sleep");
                Title.setText("Day 3 - Event");
                fr = new FileReader("Day 3 Events.txt");
                br = new BufferedReader(fr);
                r ="";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                }
        if(day.equals("3 return home"))
                {
                Title.setText("Day 3 - Returning Home");
                Cont.setEnabled(true);
                Cont.setVisible(true);
                Cont.setText("Sleep");
                News.setEnabled(false);
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Title.setText("Day 3 - Event");
                fr = new FileReader("Day 3 Last.txt");
                br = new BufferedReader(fr);
                r ="";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                }
        
        if(day.equals("4"))
                {
                Title.setText("Day 4 - Strange Happenings");
                Cont.setEnabled(true);
                Cont.setVisible(true);
                Cont.setText("Sleep");
                News.setEnabled(false);
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                fr = new FileReader("Day 4.txt");
                br = new BufferedReader(fr);
                r ="";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                }
        
                if(day.equals("5"))
        {
                
                Op1.setEnabled(true);
                Op1.setVisible(true);
                Op2.setEnabled(true);
                Op2.setVisible(true);
                Cont.setEnabled(false);
                Cont.setVisible(false);
                Op1.setText("Take meds");
                Op2.setText("Save for Later");
                Title.setText("Day 5 - Events");
                fr = new FileReader("Day 5 Events.txt");
               br = new BufferedReader(fr);
                r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
        }
                
        
        if(day.equals("5 meds"))
        {
                    
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setVisible(true);
                Cont.setEnabled(true);
                News.setEnabled(false);
                Title.setText("Day 5 - Save Meds");
                
                
                fr = new FileReader("Day 5.1 (Take Meds).txt");
                br = new BufferedReader(fr);
                r ="";
                txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
        }
        
        if(day.equals("5 no meds"))
        {
                    
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setVisible(true);
                Cont.setEnabled(true);
                News.setEnabled(false);
                Title.setText("Day 5 - Save Meds");
                
                fr = new FileReader("Day 5.2 (Don't Take Meds).txt");
                br = new BufferedReader(fr);
                r ="";
                txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
        }
        
        if(day.equals("6 sleep"))
        {
            try{
                
                Op1.setEnabled(true);
                Op1.setVisible(true);
                Op2.setEnabled(true);
                Op2.setVisible(true);
                Cont.setVisible(false);
                Cont.setEnabled(false);
                News.setVisible(false);
                News.setEnabled(false);
                Op1.setText("Shoot");
                Op2.setText("Don't Shoot");
                Title.setText("Day 6 - Events");
                fr = new FileReader("Day 6.1 Events (With Sleep).txt");
                br = new BufferedReader(fr);
                r ="";
                txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                
                Event.setText(txt);
        }
        catch(Exception e)
          {
              
          }
        }
        
        if(day.equals("6 no sleep"))
        {
            try{
                
                Op1.setEnabled(true);
                Op1.setVisible(true);
                Op2.setEnabled(true);
                Op2.setVisible(true);
                Cont.setVisible(false);
                Cont.setEnabled(false);
                News.setVisible(false);
                News.setEnabled(false);
                Op1.setText("Shoot");
                Op2.setText("Don't Shoot");
                Title.setText("Day 6 - Events");
                fr = new FileReader("Day 6.2 Events (Without Sleep).txt");
                br = new BufferedReader(fr);
                r ="";
                txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                
                Event.setText(txt);
        }
        catch(Exception e)
          {
              
          }
        }
        
        if(day.equals("6 no shoot"))
        {
            try{
                Title.setText("Day 6 - Hesitate");
                Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setVisible(true);
                Cont.setEnabled(true);
                Cont.setText("Sleep");
                News.setEnabled(false);
                
                fr = new FileReader("Day 6 (Don't Shoot).txt");
                br = new BufferedReader(fr);
                r ="";
                txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                Event.setText(txt);
                
        }
        catch(Exception e)
          {
              
          }
        }
        
        if(day.equals("7"))
        {
            try{
                Op1.setEnabled(true);
                Op1.setVisible(true);
                Op2.setEnabled(true);
                Op2.setVisible(true);
                Cont.setVisible(false);
                Cont.setEnabled(false);
                News.setEnabled(false);
                News.setVisible(false);
                Op1.setText("Go Outside");
                Op2.setText("Stay Inside");
                Title.setText("Day 7 - Events");
                fr = new FileReader("Day 7 Events.txt");
                br = new BufferedReader(fr);
                r ="";
                txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                
                Event.setText(txt);
        }
        catch(Exception e)
          {
              
          }
        }
        
                Event.setText(txt);
        }
        
        
        
        catch(Exception e)
        {
            
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Event = new javax.swing.JTextArea();
        News = new javax.swing.JButton();
        Op1 = new javax.swing.JButton();
        Cont = new javax.swing.JButton();
        Op2 = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(147, 142, 141));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bunker");

        Event.setColumns(20);
        Event.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Event.setRows(5);
        jScrollPane1.setViewportView(Event);

        News.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        News.setText("News");
        News.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewsActionPerformed(evt);
            }
        });

        Op1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Op1.setText("Option 1");
        Op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op1ActionPerformed(evt);
            }
        });

        Cont.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Cont.setText("Sleep");
        Cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContActionPerformed(evt);
            }
        });

        Op2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Op2.setText("Option 2");
        Op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op2ActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Event");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton1.setText("Exit Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(222, 222, 222)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(462, 462, 462)
                                .addComponent(Title)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Op1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                    .addComponent(Cont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Op2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(News, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(News, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cont, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Op2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Op1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewsActionPerformed
        if(New==false)
        {
            New=true;
            Title.setText("News");
            News.setText("Event");
            try{
            String txt= "";
                
        if(day.equals("1"))
                {
                    Title.setText("Day 1 - News");
                FileReader fr = new FileReader("Day 1 News.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                }
        if(day.equals("2"))
                {
                    Title.setText("Day 2 - News");
                FileReader fr = new FileReader("Day 2 News.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                }
        if(day.equals("3"))
                {
                    Title.setText("Day 3 - News");
                FileReader fr = new FileReader("Day 3 News.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                }
        if(day.equals("5"))
                {
                    Title.setText("Day 5 - News");
                FileReader fr = new FileReader("Day 5 News.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                }
                Event.setText(txt);
        }
        catch(Exception e)
        {
            
        }
        }
        else
        {
              New=false;
            Title.setText("Event");
            News.setText("News");
            try{
            String txt= "";
                
        if(day.equals("1"))
                {
                    Title.setText("Day 1 - Event");
                FileReader fr = new FileReader("Day 1 Events.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                }
        if(day.equals("2"))
                {
                    Title.setText("Day 2 - Event");
                FileReader fr = new FileReader("Day 2 Events.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                }
        if(day.equals("3"))
                {
                    Title.setText("Day 3 - Event");
                FileReader fr = new FileReader("Day 3 Events.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                }
        if(day.equals("5"))
                {
                    Title.setText("Day 5 - Event");
                FileReader fr = new FileReader("Day 5 Events.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                }
        
                Event.setText(txt);
        }
            
        catch(Exception e)
        {
            
        }
            
        }
    }//GEN-LAST:event_NewsActionPerformed

    private void ContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContActionPerformed
        News.setEnabled(true);
        String days = "";
        News.setText("News");
        if(day.equals("1"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("2") ;
                    BookWriter.close();
                    
                    String txt= "";
                days = "2";
                Cont.setVisible(false);
                Op1.setVisible(true);
                Op2.setVisible(true);
                Op1.setEnabled(true);
                Op2.setEnabled(true);
                Op1.setText("Go Outside");
                Op2.setText("Stay Inside");
                Title.setText("Day 2 - Event");
                FileReader fr = new FileReader("Day 2 Events.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                
                Event.setText(txt);
        }
        catch(Exception e)
          {
              
          }
        }
        if(day.equals("2"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("3");
                    BookWriter.close();
                    days = "3";
                    String txt= "";
                
                Cont.setText("Sleep");
                Cont.setVisible(false);
                
                Op1.setVisible(true);
                Op2.setVisible(true);
                Op1.setEnabled(true);
                Op2.setEnabled(true);
                Op1.setText("Go Outside");
                Op2.setText("Sleep");
                Title.setText("Day 3 - Event");
                FileReader fr = new FileReader("Day 3 Events.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                
                Event.setText(txt);
        }
        catch(Exception e)
          {
              
          }
        }
        if(day.equals("3 return home"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("4") ;
                    BookWriter.close();
                    
                    String txt= "";
            FileReader fr = new FileReader("Day.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    days = r;
                }
                br.close();
                
                Cont.setText("Sleep");
                News.setEnabled(false);
                Title.setText("Day 4 - Strange Happenings");
                fr = new FileReader("Day 4.txt");
               br = new BufferedReader(fr);
                r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                
                Event.setText(txt);
        }
        catch(Exception e)
          {
              
          }
        }
        if(day.equals("4"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("5") ;
                    BookWriter.close();
                    
                    String txt= "";
            FileReader fr = new FileReader("Day.txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    days = r;
                }
                br.close();
                
                Op1.setEnabled(true);
                Op1.setVisible(true);
                Op2.setEnabled(true);
                Op2.setVisible(true);
                Cont.setVisible(false);
                Cont.setEnabled(false);
                Op1.setText("Take meds");
                Op2.setText("Save for Later");
                Title.setText("Day 5 - Events");
                fr = new FileReader("Day 5 Events.txt");
               br = new BufferedReader(fr);
                r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                
                Event.setText(txt);
        }
        catch(Exception e)
          {
              
          }
        }
        if(day.equals("5 meds"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("6 sleep") ;
                    BookWriter.close();
                
                Op1.setEnabled(true);
                Op1.setVisible(true);
                Op2.setEnabled(true);
                Op2.setVisible(true);
                Cont.setVisible(false);
                Cont.setEnabled(false);
                News.setVisible(false);
                News.setEnabled(false);
                Op1.setText("Shoot");
                Op2.setText("Don't Shoot");
                Title.setText("Day 6 - Events");
                FileReader fr = new FileReader("Day 6.1 Events (With Sleep).txt");
                days = "6 sleep";
               BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                
                Event.setText(txt);
        }
        catch(Exception e)
          {
              
          }
        }
        if(day.equals("5 no meds"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("6 no sleep") ;
                    BookWriter.close();
                
                Op1.setEnabled(true);
                Op1.setVisible(true);
                Op2.setEnabled(true);
                Op2.setVisible(true);
                Cont.setVisible(false);
                Cont.setEnabled(false);
                News.setVisible(false);
                News.setEnabled(false);
                Op1.setText("Shoot");
                days = "6 no sleep";
                Op2.setText("Don't Shoot");
                Title.setText("Day 6 - Events");
                FileReader fr = new FileReader("Day 6.2 Events (Without Sleep).txt");
               BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                
                Event.setText(txt);
        }
        catch(Exception e)
          {
              
          }
        }
        if(day.equals("6 no shoot"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("7") ;
                    BookWriter.close();
                
                Op1.setEnabled(true);
                Op1.setVisible(true);
                Op2.setEnabled(true);
                Op2.setVisible(true);
                Cont.setVisible(false);
                Cont.setEnabled(false);
                News.setEnabled(false);
                News.setVisible(false);
                Op1.setText("Go Outside");
                days = "7";
                Op2.setText("Stay Inside");
                Title.setText("Day 7 - Events");
                FileReader fr = new FileReader("Day 7 Events.txt");
               BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                br.close();
                
                Event.setText(txt);
        }
        catch(Exception e)
          {
              
          }
        }
        day = days;
    }//GEN-LAST:event_ContActionPerformed

    private void Op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op1ActionPerformed
        String days = "";
        if(day.equals("2"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("2.1") ;
                    BookWriter.close();
        }
        catch(Exception e)
          {
              
          }
        TextScreen f1 = new TextScreen();

        f1.setVisible(true);
        this.setVisible(false);
        }
        if(day.equals("3"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("3 outside") ;
                    BookWriter.close();
        }
        catch(Exception e)
          {
              
          }
        TextScreen f1 = new TextScreen();

        f1.setVisible(true);
        this.setVisible(false);
        }
        if(day.equals("7"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("7 outside") ;
                    BookWriter.close();
        }
        catch(Exception e)
          {
              
          }
        TextScreen f1 = new TextScreen();

        f1.setVisible(true);
        this.setVisible(false);
        }
        if(day.equals("5"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("5 meds") ;
                    BookWriter.close();
                    days = "5 meds";
                    
                    Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setVisible(true);
                Cont.setEnabled(true);
                News.setEnabled(false);
                Title.setText("Day 5 - Take Meds");
                
                FileReader fr = new FileReader("Day 5.1 (Take Meds).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                Event.setText(txt);
                
        }
        catch(Exception e)
          {
              
          }
        }
        if(day.equals("6 sleep") || day.equals("6 no sleep"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("6 shoot") ;
                    BookWriter.close();
                    days = "6 shoot";
        }
        catch(Exception e)
          {
              
          }
        TextScreen f1 = new TextScreen();

        f1.setVisible(true);
        this.setVisible(false);
        }
        day = days;
        System.out.println(day);
    }//GEN-LAST:event_Op1ActionPerformed

    private void Op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op2ActionPerformed
        String days = "";
        if(day.equals("2"))
        {
            Op1.setEnabled(false);
            Op2.setEnabled(false);
            News.setEnabled(false);
            Cont.setEnabled(true);
            Cont.setVisible(true);
            days = "2";
            String txt = "";
            try{
            FileReader fr = new FileReader("Day 2.2 (Stay Inside Nothing Happens).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                Event.setText(txt);
        }
        catch(Exception e)
          {
              
          }
        }
        
        if(day.equals("3") || day.equals("7"))
        {
            Random rand = new Random();
            int n = rand.nextInt(2);
            if(n==0)
            {
                try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("Hunger") ;
                    BookWriter.close();
        }
        catch(Exception e)
          {
              
          }
        TextScreen f1 = new TextScreen();

        f1.setVisible(true);
        this.setVisible(false);
            }
            
            else
            {
                try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("Thirst") ;
                    BookWriter.close();
        }
        catch(Exception e)
          {
              
          }
        TextScreen f1 = new TextScreen();

        f1.setVisible(true);
        this.setVisible(false);
        }
        }
    
        if(day.equals("5"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("5 no meds") ;
                    BookWriter.close();
                    days = "5 no meds";
                    Title.setText("Day 5 - Save Meds");
                    Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setVisible(true);
                Cont.setEnabled(true);
                Cont.setText("Continue");
                News.setEnabled(false);
                
                FileReader fr = new FileReader("Day 5.2 (Don't Take Meds).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                Event.setText(txt);
                
        }
        catch(Exception e)
          {
              
          }
        }
        
        if(day.equals("6 sleep") || day.equals("6 no sleep"))
        {
            try{
            FileWriter Day = new FileWriter("Day.txt");
                    PrintWriter BookWriter = new PrintWriter(Day);
                    
                    BookWriter.println("6 no shoot") ;
                    BookWriter.close();
                    days = "6 no shoot";
                    Title.setText("Day 6 - Hesitate");
                    Op1.setVisible(false);
                Op1.setEnabled(false);
                Op2.setVisible(false);
                Op2.setEnabled(false);
                Cont.setVisible(true);
                Cont.setEnabled(true);
                Cont.setText("Sleep");
                News.setEnabled(false);
                
                FileReader fr = new FileReader("Day 6 (Don't Shoot).txt");
                BufferedReader br = new BufferedReader(fr);
                String r ="";
                String txt = "";
                while((r=br.readLine())!=null)
                {
                    StringTokenizer tk = new StringTokenizer(r,"|");
                    txt = txt + r + "\n" + "\n";
                }
                Event.setText(txt);
                
        }
        catch(Exception e)
          {
              
          }
        }
        
            day = days;
    }//GEN-LAST:event_Op2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePage f1 = new HomePage();

        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Bunker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bunker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bunker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bunker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bunker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cont;
    private javax.swing.JTextArea Event;
    private javax.swing.JButton News;
    private javax.swing.JButton Op1;
    private javax.swing.JButton Op2;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
