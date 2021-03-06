/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storytime;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
//import javax.speech.*;    
//import java.util.*;    
//import javax.speech.synthesis.*; 

/**
 *
 * @author HenskePauker
 */
public class StoryForm extends javax.swing.JPanel {
    private String story;
    private String ant;
    private String pro;
    ArrayList<String[]> replacements;
    Random r = new Random();
    ArrayList<ArrayList<String>> dynamicWords;
    private static final String VOICENAME = "kevin16";
    /**
     * Creates new form StoryForm
     */
    public StoryForm(String m) {
        story = m;
        initComponents();
    }
    
    public StoryForm(){
        story="";
        initComponents();
//        File image2 = new File("C:/Users/HenskePauker/Desktop/Puddlename.png");
//        try {
//            BufferedImage bi = ImageIO.read(image2);
//            super.add(bi);
//        } catch (IOException ex) {
//            Logger.getLogger(StoryForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton1.setText("New Story");
        jButton1.setMaximumSize(new java.awt.Dimension(90, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(90, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextPane1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Protaganist:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Antagonist:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/storytime/Puddlename.png"))); // NOI18N

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.setMaximumSize(new java.awt.Dimension(90, 23));
        jButton3.setMinimumSize(new java.awt.Dimension(90, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel3)))))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @SuppressWarnings("unchecked")
    public String getNewStory(String pro, String ant) throws IOException
    {
        replacements = new ArrayList<String[]>();
        dynamicWords = new ArrayList<ArrayList<String>>();
        //Load dynamic words postenter
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/HenskePauker/Desktop/StoryTime_Words/DynamicWords.txt.txt"));
        String line = null;
        ArrayList<String> curVals = new ArrayList<String>();
        while(null != (line = br.readLine()))
        {
            if(line.equals(""))
            {
                dynamicWords.add((ArrayList<String>) curVals.clone());
                curVals.clear();
            }
            else if(line.charAt(0) != '/' || line.charAt(1) != '/')
                curVals.add(line);
        }
        
        //Load static words postenter
        
        br.close();
        br = new BufferedReader(new FileReader("C:/Users/HenskePauker/Desktop/StoryTime_Words/StaticWords.txt.txt"));
        String curKey = br.readLine();
        curVals = new ArrayList<String>();
        while(null != (line = br.readLine()))//Never quits        {

        {
            if(line.equals(""))
            {
                replacements.add(new String[]{curKey, curVals.get(r.nextInt(curVals.size()))});
                if(null == (curKey = br.readLine()))
                    break;
                curVals.clear();
            }
            else if(line.charAt(0) != '/' || line.charAt(1) != '/')
                curVals.add(line);
        }

        if(pro != null)
            for(String[] i:replacements)
                if(i[0].equals("JOHN"))
                    i[1] = pro;
        if(ant != null)
            for(String[] i:replacements)
                if(i[0].equals("DEMITRI"))
                    i[1] = ant;
        
        //Load and process sentences
        ArrayList<ArrayList<String>> sentances = new ArrayList<ArrayList<String>>();
        
        br.close();
        br = new BufferedReader(new FileReader("C:/Users/HenskePauker/Desktop/StoryTime_Words/Sentances.txt.txt"));
        
        sentances.add(new ArrayList<String>());
        while(null != (line = br.readLine()))
        {
            if(line.equals(""))
                sentances.add(new ArrayList<String>());
            else if(line.charAt(0) != '/' || line.charAt(1) != '/')
                sentances.get(sentances.size()-1).add(makeSentence(line));
        }

        br.close();
        
        //Choose sentences and construct
        String s = "";
        for(ArrayList<String> i:sentances)
        {
            try{
            for(int j = 0; j < Integer.parseInt(i.get(0).split(" ")[0]); j++)
                if(r.nextDouble() < Double.parseDouble(i.get(0).split(" ")[1]))
                    s += i.remove(r.nextInt(i.size()-1)+1);
            }catch(java.lang.NumberFormatException e)
            {
                System.out.println(i);
            }
        }
        
        s+="\n\nThanks for reading! Produced by a team of really cool nerds.";
        
        return s.substring(1);
    }
    
    public String makeSentence(String in)
    {    
        for(String[] i:replacements)
            in = in.replaceAll(i[0], i[1]);
        
        for(ArrayList<String> i:dynamicWords)
            while(in.indexOf(i.get(0)) != -1)
                in = in.replaceFirst(i.get(0), i.remove(r.nextInt(i.size()-1)+1));
        
        return (in.length() > 8?" ":"") + in;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                  
//void mySpeak()
//{
//Voice voice;
//VoiceManager vm = VoiceManager.getInstance();
//voice = vm.getVoice(VOICENAME);
//voice.allocate();
//try{
//voice.speak("Hi Mr Gaur Welcome to VITS. Thanks To choose Us");
//}catch(Exception e){}
//} 
        
        ant=jTextField1.getText();
        if (ant.length()==0) ant=null;
        pro=jTextField2.getText();
        if (pro.length()==0) pro=null;
        try {
            story=getNewStory(ant,pro);
        } catch (IOException ex) {
            Logger.getLogger(StoryForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextPane1.setText(story);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        this.jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        this.jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextPane1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
