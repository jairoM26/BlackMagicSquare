/**
 * 
 */
package FrontedGUI;

import java.awt.Color;
import java.awt.Font;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.jpl7.Query;
import org.jpl7.Term;

import Constants.ImageName;;


/**
 * @author jairo-m
 * 
 */
@SuppressWarnings("serial")
public class principalWindow extends JFrame {

	private JButton playButton;
	private JButton showAllButton;
	private JButton askMeButton;
    private JLabel pWindows;
    
    //Constents all the image names
    private ImageName imagesName = new ImageName();
	
	public principalWindow() {
		// TODO Auto-generated constructor stub
		initWindowComponents();
		this.setSize(300, 200);
		this.setBackground(Color.BLACK);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	private void initWindowComponents(){
		pWindows = new JLabel();
		playButton = new JButton();
		askMeButton = new JButton();
		showAllButton = new JButton();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(400, 400));
		getContentPane().setLayout(null);
		
		//setting the startbutton
		//setting a button an image
		playButton.setIcon(imagesName.playImage());		
		playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playBMouseClicked(evt);
            }
        });
		getContentPane().add(playButton);
		playButton.setBounds(85, 20, 140, 40);
		
		//setting the startbutton
		showAllButton.setIcon(imagesName.showAllImage());
		showAllButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showAllBMouseClicked(evt);
            }
        });
		getContentPane().add(showAllButton);
		showAllButton.setBounds(85, 65, 140, 40);
		
		//setting a button an image
		askMeButton.setIcon(imagesName.askMe());		
		askMeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	askeMeBMouseClicked(evt);
            }
        });
		getContentPane().add(askMeButton);
		askMeButton.setBounds(85, 110, 140, 40);
	
		//Principal settings of the windows
		pWindows.setIcon(imagesName.pringicalBG());
		getContentPane().add(pWindows);
		pWindows.setBounds(0, 0, 300, 200);
	}
	
	 private void playBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBMouseClicked
	        this.dispose();
	        validDiabolicWindow vWindow = new validDiabolicWindow(); 
	 }
	 
	 private void askeMeBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBMouseClicked
	        this.dispose();
	        askMeWindow vWindow = new askMeWindow(); 
	 }
	 
	 private void showAllBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBMouseClicked	 
		 JOptionPane.showMessageDialog(null, "You can see the 384 Diabolic Magic Square that are possible in console");
		 Query qs = new Query("showall");    
		 qs.allSolutions(); 		      
	 }
	
	
}
