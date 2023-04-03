
import java.awt.Window;
import java.io.BufferedReader;
import java.io.FileReader;
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
public class ExtraContent extends javax.swing.JPanel {
int page = 0;
    /**
     * Creates new form ExtraContent
     */
    public ExtraContent() {
        initComponents();
        Event.setEditable(false);
        Title.setText("Alien Diary - Before the War");
        Back.setEnabled((false));
        try{
            FileReader fr = new FileReader("Alien Part 1 Pre-War.txt");
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
        Event = new javax.swing.JTextArea();
        Next = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Cont = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(49, 53, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(204, 204, 204));
        Title.setText("Title");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 6, -1, -1));

        Event.setColumns(20);
        Event.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Event.setRows(5);
        jScrollPane1.setViewportView(Event);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1050, 582));

        Next.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        jPanel1.add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 692, 234, 74));

        Back.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 692, 234, 74));

        Cont.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Cont.setText("Exit");
        Cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContActionPerformed(evt);
            }
        });
        jPanel1.add(Cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 692, 234, 74));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        Back.setEnabled(true);
        page = page + 1;
        if(page==2)
        {
            Next.setEnabled(false);
            Title.setText("Alien Diary - After the War");
            try{
            FileReader fr = new FileReader("Alien Part 3 Post-War.txt");
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
        if(page==1)
        {
            Title.setText("Alien Diary - During the War");
            try{
            FileReader fr = new FileReader("Alien Part 2 During War.txt");
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
        
    }//GEN-LAST:event_NextActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Next.setEnabled(true);
        page = page - 1;
        if(page==0)
        {
            Back.setEnabled(false);
            Title.setText("Alien Diary - Before the War");
        Back.setEnabled((false));
        try{
            FileReader fr = new FileReader("Alien Part 1 Pre-War.txt");
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
        if(page==1)
        {
            Title.setText("Alien Diary - During the War");
            try{
            FileReader fr = new FileReader("Alien Part 2 During War.txt");
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
        
    }//GEN-LAST:event_BackActionPerformed

    private void ContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContActionPerformed
       HomePage f1 = new HomePage();

        f1.show();

        ((Window)getRootPane().getParent()).dispose();
    }//GEN-LAST:event_ContActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Cont;
    private javax.swing.JTextArea Event;
    private javax.swing.JButton Next;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}