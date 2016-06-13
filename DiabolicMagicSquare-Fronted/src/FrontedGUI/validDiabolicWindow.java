package FrontedGUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import org.jpl7.Query;

import Constants.ImageName;

public class validDiabolicWindow extends JFrame {
	
	private JLabel isDiabolic; 
	private JButton homeButton;
	private JButton verificationButton;
	private ImageName imagesName = new ImageName();
	private JLabel check;
	
	private JTextField entry1;
	private JTextField entry2;
	private JTextField entry3;
	private JTextField entry4;
	private JTextField entry5;
	private JTextField entry6;
	private JTextField entry7;
	private JTextField entry8;
	private JTextField entry9;
	private JTextField entry10;
	private JTextField entry11;
	private JTextField entry12;
	private JTextField entry13;
	private JTextField entry14;
	private JTextField entry15;
	private JTextField entry16;
	
	public validDiabolicWindow() {
		// TODO Auto-generated method stub
		initGUIComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
	}
	
	private boolean validator(int n){
		if(n>16 & n<1){
			System.out.println("false");
	        return false;
        }else
            System.out.println("true");
            return true;
    }
	

	private void initGUIComponents() {
		isDiabolic = new JLabel();
		check = new JLabel();
		verificationButton = new JButton();
		homeButton = new JButton();
		 
		entry1 = new JTextField();
		entry2 = new JTextField();
		entry3 = new JTextField();
		entry4 = new JTextField();
		entry5 = new JTextField();
		entry6 = new JTextField();
		entry7 = new JTextField();
		entry8 = new JTextField();
		entry9 = new JTextField();
		entry10 = new JTextField();
		entry11 = new JTextField();
		entry12 = new JTextField();
		entry13 = new JTextField();
		entry14 = new JTextField();
		entry15 = new JTextField();
		entry16 = new JTextField();
		
		Border border = BorderFactory.createLineBorder(Color.black, 5);		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Valid Diabolic Magic Square Window");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        getContentPane().setLayout(null);
        
        entry1.setFont(new java.awt.Font("OpenDyslexic", 1, 20)); 
        entry1.setBackground(Color.GRAY);
        entry1.setForeground(Color.white);
        entry1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entry1.setBorder(border);
        getContentPane().add(entry1);
        entry1.setBounds(30, 40, 70, 70);
        
        entry2.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry2.setBackground(Color.gray);
        entry2.setBorder(border);
        entry2.setForeground(Color.white);
        entry2.setHorizontalAlignment(javax.swing.JTextField.CENTER);       
        getContentPane().add(entry2);
        entry2.setBounds(100, 40, 70, 70);
        
        entry3.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry3.setBackground(Color.gray);
        entry3.setBorder(border);
        entry3.setForeground(Color.white);
        entry3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry3);
        entry3.setBounds(170, 40, 70, 70);
        
        entry4.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry4.setBackground(Color.gray);
        entry4.setBorder(border);
        entry4.setForeground(Color.white);
        entry4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry4);
        entry4.setBounds(240, 40, 70, 70);
        
        entry5.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry5.setBackground(Color.gray);
        entry5.setBorder(border);
        entry5.setForeground(Color.white);
        entry5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry5);
        entry5.setBounds(30, 110, 70, 70);
        
        entry6.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry6.setBackground(Color.gray);
        entry6.setBorder(border);
        entry6.setForeground(Color.white);
        entry6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry6);
        entry6.setBounds(100, 110, 70, 70);
        
        entry7.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry7.setBackground(Color.gray);
        entry7.setBorder(border);
        entry7.setForeground(Color.white);
        entry7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry7);
        entry7.setBounds(170, 110, 70, 70);
        
        entry8.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry8.setBackground(Color.gray);
        entry8.setBorder(border);
        entry8.setForeground(Color.white);
        entry8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry8);
        entry8.setBounds(240, 110, 70, 70);
        
        entry9.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry9.setBackground(Color.gray);
        entry9.setBorder(border);
        entry9.setForeground(Color.white);
        entry9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry9);
        entry9.setBounds(30, 180, 70, 70);
        
        entry10.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry10.setBackground(Color.gray);
        entry10.setBorder(border);
        entry10.setForeground(Color.white);
        entry10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry10);
        entry10.setBounds(100, 180, 70, 70);
        
        entry11.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry11.setBackground(Color.gray);
        entry11.setBorder(border);
        entry11.setForeground(Color.white);
        entry11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry11);
        entry11.setBounds(170, 180, 70, 70);
        
        entry12.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry12.setBackground(Color.gray);
        entry12.setBorder(border);
        entry12.setForeground(Color.white);
        entry12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry12);
        entry12.setBounds(240, 180, 70, 70);
        
        entry13.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry13.setBackground(Color.gray);
        entry13.setBorder(border);
        entry13.setForeground(Color.white);
        entry13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry13);
        entry13.setBounds(30, 250, 70, 70);
        
        entry14.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry14.setBackground(Color.gray);
        entry14.setBorder(border);
        entry14.setForeground(Color.white);
        entry14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry14);
        entry14.setBounds(100, 250, 70, 70);
        
        entry15.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry15.setBackground(Color.gray);
        entry15.setBorder(border);
        entry15.setForeground(Color.white);
        entry15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry15);
        entry15.setBounds(170, 250, 70, 70);
        
        entry16.setFont(new java.awt.Font("OpenDyslexic", 1, 20));
        entry16.setBackground(Color.gray);
        entry16.setBorder(border);
        entry16.setForeground(Color.white);
        entry16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(entry16);
        entry16.setBounds(240, 250, 70, 70);
        
        
        verificationButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.focusCellForeground"));
        verificationButton.setIcon(imagesName.Try());
        verificationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verificationMouseClicked(evt);
            }
        });
        
        getContentPane().add(verificationButton);
        verificationButton.setBounds(340, 40, 140, 40);
        
        homeButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.focusCellForeground"));
        homeButton.setIcon(imagesName.home());
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(homeButton);
        homeButton.setBounds(340, 260, 140, 40);  
        
      isDiabolic.setText("Is diabolic?");
      isDiabolic.setBackground(Color.GRAY);
      isDiabolic.setFont(new java.awt.Font("OpenDyslexic", 1, 10));
      isDiabolic.setForeground(Color.BLACK);
      getContentPane().add(isDiabolic);
      isDiabolic.setBounds(340, 100, 140, 20);

      check.setBackground(Color.LIGHT_GRAY);
      check.setIcon(imagesName.emptyCheck());
      getContentPane().add(check);
      check.setBounds(360, 125, 140, 120);
            
     getContentPane().setBackground(Color.LIGHT_GRAY);        
        
	}
	
	
	private String[] getEntrys(){
		String[] MagicSquare = new String[16];
		MagicSquare[0]=entry1.getText();  MagicSquare[1]=entry2.getText();
	    MagicSquare[2]=entry3.getText();  MagicSquare[3]=entry4.getText();
	    MagicSquare[4]=entry5.getText();  MagicSquare[5]=entry6.getText();
	    MagicSquare[6]=entry7.getText();  MagicSquare[7]=entry8.getText(); 
	    MagicSquare[8]=entry9.getText();  MagicSquare[9]=entry10.getText();
	    MagicSquare[10]=entry11.getText(); MagicSquare[11]=entry12.getText();
	    MagicSquare[12]=entry13.getText(); MagicSquare[13]=entry14.getText();
	    MagicSquare[14]=entry15.getText(); MagicSquare[15]=entry16.getText();	   
	    return MagicSquare;
	}
	
	private String generateString(String[] entrys){
		String entryMessage = "[";
		for(int i=0; i < entrys.length;i++){
			if (i == 16){
				entryMessage = entryMessage + entrys[i];
				break;
			}
			else if (i == 0) entryMessage = entryMessage + entrys[i];
			else entryMessage = entryMessage + "," + entrys[i];
		}
		entryMessage = entryMessage + "]";
		return entryMessage;
	}
	
	private boolean verifyEntrysComplete(String[] entrys){		
		for(int i=0; i < entrys.length;i++){
	    	 if(entrys[i].equals("")){
	            return false;
	        }
		}
		return true;
	}
		
		
	private boolean eval(String[] nums){
		for(int i=0; i < nums.length;i++){
			try{
				int n = java.lang.Integer.parseInt(nums[i]);
		        if(n>16 || n<1){
		            return false;
		        }
			}catch(Exception e){
				return false;
			}
		}		
        return true;
   }

	private void verificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
		boolean status=false;
		String[] MagicSquare = getEntrys();		
		if (verifyEntrysComplete(MagicSquare)){
			if(eval(MagicSquare)){
				//System.out.println("this is the message to send  " + "diabolic("+generateString(MagicSquare)+")");
			    Query q2 = new Query("diabolic("+generateString(MagicSquare)+")");
			    System.out.println(q2.hasSolution());
			    status = q2.hasSolution();
			    setCheckLabel(status);
			}
			else{
				JOptionPane.showMessageDialog(null, "Expecting numbers from 1 to 16 in the matrix");
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Expecting numbers from 1 to 16 in the matrix");
		}		 
	}
	
	private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {
		this.dispose();
		principalWindow pw = new principalWindow();
	}
	
	
	private void setCheckLabel(boolean isDiabolic){		
		if (isDiabolic){
			check.setIcon(imagesName.checkImage());
			getContentPane().add(check);
		}
		else{
			check.setIcon(imagesName.errorImage());
			getContentPane().add(check);
		}	
	}
}























