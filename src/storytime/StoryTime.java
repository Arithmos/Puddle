package storytime;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StoryTime extends JPanel
{
//    static ArrayList<StoryForm> sf = new ArrayList<StoryForm>();
    
    public StoryTime(int w, int h, JFrame f) throws IOException
    {
        super.setOpaque(true);
        super.setPreferredSize(new Dimension(w, h));
        super.setBackground(new Color(225, 225, 225));
      
//        String a = getNewStory("a","b");
//        System.out.println(a);
        StoryForm d = new StoryForm();
        super.add(d);
        
//        addForms();
    }

//    public void addForms(){
//        for (StoryForm f : sf){
//            super.add(f);
//        }
//    }
    
    public static void main(String[] args) throws IOException
    {    
        //Print
//        char[] c = getNewStory(null, null).toCharArray();
//        for(int i = 50; i < c.length; i += 50)
//        {
//            while(c[i] != ' ')i--;
//            c[i] = '\n';
//        }
//        
//        System.out.print(new String(c));
//       
        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame fr = new JFrame("Application: Puddle");
        fr.setBackground(Color.decode("#E0E0E0"));
        fr.setContentPane(new StoryTime(800, 650, fr));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocation(10, 10);
        fr.setResizable(false);
        fr.pack();
        fr.setVisible(true);  
    }
}
