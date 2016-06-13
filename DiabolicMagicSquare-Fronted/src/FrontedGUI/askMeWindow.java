package FrontedGUI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import org.jpl7.Query;
import org.jpl7.Term;

import Constants.ImageName;

public class askMeWindow extends JFrame {
	
	private JLabel askMeWindow;
	private JButton tryMeButton;
	private JButton homeButton;
	private JTextField entry;
	
	private ImageName imagesName = new ImageName();
	
	public askMeWindow(){
		initGuiComponents();
		this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
	}
	
	
	private void initGuiComponents(){
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ask For Diabolics");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(273, 220));
        setPreferredSize(new java.awt.Dimension(273, 220));
        setResizable(false);
        getContentPane().setLayout(null);
		
		askMeWindow = new JLabel();
		tryMeButton = new JButton();
		homeButton = new JButton();
		entry = new JTextField();
		
		askMeWindow.setText("Ask for Diabolics, from 1 to 10");
		askMeWindow.setFont(new java.awt.Font("OpenDyslexic", 1, 8));
		askMeWindow.setBackground(Color.GRAY);
		askMeWindow.setForeground(Color.white);
		getContentPane().add(askMeWindow);
		askMeWindow.setBounds(0,5,272,15);
		
		
		entry.setFont(new java.awt.Font("OpenDyslexic", 1, 20)); 
		entry.setBackground(Color.GRAY);
		entry.setForeground(Color.white);
		entry.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		Border border = BorderFactory.createLineBorder(Color.black, 3);
        entry.setBorder(border);
        getContentPane().add(entry);
        entry.setBounds(106, 30, 60, 50);
        
        
        tryMeButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.focusCellForeground"));
        tryMeButton.setIcon(imagesName.Try());
        tryMeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	tryMeButtonMouseClicked(evt);
            }
        });
        
        getContentPane().add(tryMeButton);
        tryMeButton.setBounds(66, 90, 140, 40);
        
        homeButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.focusCellForeground"));
        homeButton.setIcon(imagesName.home());
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(homeButton);
        homeButton.setBounds(66, 135, 140, 40);
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
	}
	
	private String getEntry(){
		return entry.getText();
	}
	
	private boolean eval(){
		String num = getEntry();
		try{
			int n = java.lang.Integer.parseInt(num);
	        if(n>10 || n<1){	        	
	            return false;
	        }
		}catch(Exception e){
			return false;
		}			
        return true;
    }
	
	private int getNumbersOfDiabolic(){
		String num = getEntry();
		int n = java.lang.Integer.parseInt(num);
		return n;
	}
	
	private String[] generateDiabolic(String myDiabolic){		
		String[] myDiabolicList = myDiabolic.split("");
		String[] resultList;
		String resultString = "";
		int i = 0;
		while(i < myDiabolicList.length){
			if (i == 150){
				if ((myDiabolicList[i].equals("1") && (myDiabolicList[i+1].equals("0") || myDiabolicList[i+1].equals("1") || myDiabolicList[i+1].equals("2") || myDiabolicList[i+1].equals("3") || myDiabolicList[i+1].equals("4") || myDiabolicList[i+1].equals("5") ||
						myDiabolicList[i+1].equals("6")))){
						resultString = resultString + "," + myDiabolicList[i] +myDiabolicList[i+1];
						i++;}
				else if((myDiabolicList[i].equals("1") || myDiabolicList[i].equals("2") || myDiabolicList[i].equals("3") || myDiabolicList[i].equals("4") || myDiabolicList[i].equals("5") || myDiabolicList[i].equals("6") ||
						myDiabolicList[i].equals("7") || myDiabolicList[i].equals("8") || myDiabolicList[i].equals("9")))
					resultString = resultString + "," + myDiabolicList[i];
				break;
			}
			else if (i == 7){ 
				if ((myDiabolicList[i].equals("1") && (myDiabolicList[i+1].equals("0") || myDiabolicList[i+1].equals("1") || myDiabolicList[i+1].equals("2") || myDiabolicList[i+1].equals("3") || myDiabolicList[i+1].equals("4") || myDiabolicList[i+1].equals("5") ||
						myDiabolicList[i+1].equals("6")))){
						resultString = myDiabolicList[i] +myDiabolicList[i+1];
						i++;}
				else if((myDiabolicList[i].equals("1") || myDiabolicList[i].equals("2") || myDiabolicList[i].equals("3") || myDiabolicList[i].equals("4") || myDiabolicList[i].equals("5") || myDiabolicList[i].equals("6") ||
						myDiabolicList[i].equals("7") || myDiabolicList[i].equals("8") || myDiabolicList[i].equals("9")))
					resultString = myDiabolicList[i];
			}
			else{
				if ((myDiabolicList[i].equals("1") && (myDiabolicList[i+1].equals("0") || myDiabolicList[i+1].equals("1") || myDiabolicList[i+1].equals("2") || myDiabolicList[i+1].equals("3") || myDiabolicList[i+1].equals("4") || myDiabolicList[i+1].equals("5") ||
						myDiabolicList[i+1].equals("6")))){
						resultString = resultString + "," + myDiabolicList[i] +myDiabolicList[i+1];
						i++;}
				else if((myDiabolicList[i].equals("1") || myDiabolicList[i].equals("2") || myDiabolicList[i].equals("3") || myDiabolicList[i].equals("4") || myDiabolicList[i].equals("5") || myDiabolicList[i].equals("6") ||
						myDiabolicList[i].equals("7") || myDiabolicList[i].equals("8") || myDiabolicList[i].equals("9")))
					resultString = resultString + "," + myDiabolicList[i];
				}
			i++;		
		}
		resultList = resultString.split(",");
		return resultList;
	}
	
	private void tryMeButtonMouseClicked(java.awt.event.MouseEvent evt) {
		if (eval()){
			int numbersOfDiabolcs = getNumbersOfDiabolic();
			ArrayList<String[]> resultsList = new ArrayList<>();
			ShowDiabolics createD = null;
			try{
				switch (numbersOfDiabolcs){
					case 1:
						Query qs = new Query("diabolic(A)");
						qs.open();
						Map<String, Term> mySolution =   qs.getSolution();
						qs.close();
						String[] resultA = generateDiabolic(mySolution.get("A").toString());
						resultsList.add(resultA);
						this.dispose();
						createD = new ShowDiabolics(resultsList,0);
						break;
					case 2:	
						Query qs2 = new Query("diabolic(A,B)");
						qs2.open();
						Map<String, Term> mySolution2 =   qs2.getSolution();						
						qs2.close();
						String[] resultA2 = generateDiabolic(mySolution2.get("A").toString());
						String[] resultB2 = generateDiabolic(mySolution2.get("B").toString());
						resultsList.add(resultA2);
						resultsList.add(resultB2);
						this.dispose();
						createD = new ShowDiabolics(resultsList,0);
						break;
					case 3:
						Query qs3 = new Query("diabolic(A,B,C)");
						qs3.open();
						Map<String, Term> mySolution3 =   qs3.getSolution();
						qs3.close();
						String[] resultA3 = generateDiabolic(mySolution3.get("A").toString());
						String[] resultB3 = generateDiabolic(mySolution3.get("B").toString());
						String[] resultC3 = generateDiabolic(mySolution3.get("C").toString());
						resultsList.add(resultA3);
						resultsList.add(resultB3);
						resultsList.add(resultC3);
						this.dispose();
						createD = new ShowDiabolics(resultsList,0);
						break;
					case 4:
						Query qs4 = new Query("diabolic(A,B,C,D)");
						qs4.open();
						Map<String, Term> mySolution4 =   qs4.getSolution();
						qs4.close();
						String[] resultA4 = generateDiabolic(mySolution4.get("A").toString());
						String[] resultB4 = generateDiabolic(mySolution4.get("B").toString());
						String[] resultC4 = generateDiabolic(mySolution4.get("C").toString());
						String[] resultD4 = generateDiabolic(mySolution4.get("D").toString());
						resultsList.add(resultA4);
						resultsList.add(resultB4);
						resultsList.add(resultC4);
						resultsList.add(resultD4);
						this.dispose();
						createD = new ShowDiabolics(resultsList,0);
						break;
					case 5:
						Query qs5 = new Query("diabolic(A,B,C,D,E)");
						qs5.open();
						Map<String, Term> mySolution5 =   qs5.getSolution();
						qs5.close();
						String[] resultA5 = generateDiabolic(mySolution5.get("A").toString());
						String[] resultB5 = generateDiabolic(mySolution5.get("B").toString());
						String[] resultC5 = generateDiabolic(mySolution5.get("C").toString());
						String[] resultD5 = generateDiabolic(mySolution5.get("D").toString());
						String[] resultE5 = generateDiabolic(mySolution5.get("E").toString());
						resultsList.add(resultA5);
						resultsList.add(resultB5);
						resultsList.add(resultC5);
						resultsList.add(resultD5);
						resultsList.add(resultE5);
						this.dispose();
						createD = new ShowDiabolics(resultsList,0);
						break;
					case 6:
						Query qs6 = new Query("diabolic(A,B,C,D,E,F)");
						qs6.open();
						Map<String, Term> mySolution6 =   qs6.getSolution();
						qs6.close();
						String[] resultA6 = generateDiabolic(mySolution6.get("A").toString());
						String[] resultB6 = generateDiabolic(mySolution6.get("B").toString());
						String[] resultC6 = generateDiabolic(mySolution6.get("C").toString());
						String[] resultD6 = generateDiabolic(mySolution6.get("D").toString());
						String[] resultE6 = generateDiabolic(mySolution6.get("E").toString());
						String[] resultF6 = generateDiabolic(mySolution6.get("F").toString());
						resultsList.add(resultA6);
						resultsList.add(resultB6);
						resultsList.add(resultC6);
						resultsList.add(resultD6);
						resultsList.add(resultE6);
						resultsList.add(resultF6);
						this.dispose();
						createD = new ShowDiabolics(resultsList,0);
						break;
					case 7:
						Query qs7 = new Query("diabolic(A,B,C,D,E,F,G)");
						qs7.open();
						Map<String, Term> mySolution7 =   qs7.getSolution();
						qs7.close();
						String[] resultA7 = generateDiabolic(mySolution7.get("A").toString());
						String[] resultB7 = generateDiabolic(mySolution7.get("B").toString());
						String[] resultC7 = generateDiabolic(mySolution7.get("C").toString());
						String[] resultD7 = generateDiabolic(mySolution7.get("D").toString());
						String[] resultE7 = generateDiabolic(mySolution7.get("E").toString());
						String[] resultF7 = generateDiabolic(mySolution7.get("F").toString());
						String[] resultG7 = generateDiabolic(mySolution7.get("G").toString());
						resultsList.add(resultA7);
						resultsList.add(resultB7);
						resultsList.add(resultC7);
						resultsList.add(resultD7);
						resultsList.add(resultE7);
						resultsList.add(resultF7);
						resultsList.add(resultG7);	
						this.dispose();
						createD = new ShowDiabolics(resultsList,0);
						break;
					case 8:
						Query qs8 = new Query("diabolic(A,B,C,D,E,F,G,H)");
						qs8.open();
						Map<String, Term> mySolution8 =   qs8.getSolution();
						qs8.close();
						String[] resultA8 = generateDiabolic(mySolution8.get("A").toString());
						String[] resultB8 = generateDiabolic(mySolution8.get("B").toString());
						String[] resultC8 = generateDiabolic(mySolution8.get("C").toString());
						String[] resultD8 = generateDiabolic(mySolution8.get("D").toString());
						String[] resultE8 = generateDiabolic(mySolution8.get("E").toString());
						String[] resultF8 = generateDiabolic(mySolution8.get("F").toString());
						String[] resultG8 = generateDiabolic(mySolution8.get("G").toString());
						String[] resultH8 = generateDiabolic(mySolution8.get("H").toString());
						resultsList.add(resultA8);
						resultsList.add(resultB8);
						resultsList.add(resultC8);
						resultsList.add(resultD8);
						resultsList.add(resultE8);
						resultsList.add(resultF8);
						resultsList.add(resultG8);
						resultsList.add(resultH8);
						this.dispose();
						createD = new ShowDiabolics(resultsList,0);
						break;
					case 9:
						Query qs9 = new Query("diabolic(A,B,C,D,E,F,G,H,I)");
						qs9.open();
						Map<String, Term> mySolution9 =   qs9.getSolution();
						qs9.close();
						String[] resultA9 = generateDiabolic(mySolution9.get("A").toString());
						String[] resultB9 = generateDiabolic(mySolution9.get("B").toString());
						String[] resultC9 = generateDiabolic(mySolution9.get("C").toString());
						String[] resultD9 = generateDiabolic(mySolution9.get("D").toString());
						String[] resultE9 = generateDiabolic(mySolution9.get("E").toString());
						String[] resultF9 = generateDiabolic(mySolution9.get("F").toString());
						String[] resultG9 = generateDiabolic(mySolution9.get("G").toString());
						String[] resultH9 = generateDiabolic(mySolution9.get("H").toString());
						String[] resultI9 = generateDiabolic(mySolution9.get("I").toString());
						resultsList.add(resultA9);
						resultsList.add(resultB9);
						resultsList.add(resultC9);
						resultsList.add(resultD9);
						resultsList.add(resultE9);
						resultsList.add(resultF9);
						resultsList.add(resultG9);
						resultsList.add(resultH9);
						resultsList.add(resultI9);
						this.dispose();
						createD = new ShowDiabolics(resultsList,0);
						break;
					default:
						Query qs10 = new Query("diabolic(A,B,C,D,E,F,G,H,I,J)");
						qs10.open();
						Map<String, Term> mySolution10 =   qs10.getSolution();
						qs10.close();
						String[] resultA10 = generateDiabolic(mySolution10.get("A").toString());
						String[] resultB10 = generateDiabolic(mySolution10.get("B").toString());
						String[] resultC10 = generateDiabolic(mySolution10.get("C").toString());
						String[] resultD10 = generateDiabolic(mySolution10.get("D").toString());
						String[] resultE10 = generateDiabolic(mySolution10.get("E").toString());
						String[] resultF10 = generateDiabolic(mySolution10.get("F").toString());
						String[] resultG10 = generateDiabolic(mySolution10.get("G").toString());
						String[] resultH10 = generateDiabolic(mySolution10.get("H").toString());
						String[] resultI10 = generateDiabolic(mySolution10.get("I").toString());
						String[] resultJ10 = generateDiabolic(mySolution10.get("J").toString());
						resultsList.add(resultA10);
						resultsList.add(resultB10);
						resultsList.add(resultC10);
						resultsList.add(resultD10);
						resultsList.add(resultE10);
						resultsList.add(resultF10);
						resultsList.add(resultG10);
						resultsList.add(resultH10);
						resultsList.add(resultI10);
						resultsList.add(resultJ10);
						this.dispose();
						createD = new ShowDiabolics(resultsList,0);
						break;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Cant Happen  " + e);
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Expecting numbers from 1 to 10");
		}
	}
	
	
	private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {
		this.dispose();
		principalWindow pw = new principalWindow();
	}

}
