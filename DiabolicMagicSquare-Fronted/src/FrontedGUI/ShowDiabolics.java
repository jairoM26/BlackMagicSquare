/*
 * 
 */
package FrontedGUI;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.prefs.BackingStoreException;

import javax.print.attribute.standard.NumberOfDocuments;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import Constants.ImageName;

/**
 * @author jairo-m
 *
 */
public class ShowDiabolics extends JFrame {
	
	private ArrayList<String[]> resultsList;
	private int numOfDiabolics;
	private ImageName imagesName = new ImageName();
	
	private JLabel label1 = new JLabel();
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();
	private JLabel label4 = new JLabel();
	private JLabel label5 = new JLabel();
	private JLabel label6 = new JLabel();
	private JLabel label7 = new JLabel();
	private JLabel label8 = new JLabel();
	private JLabel label9 = new JLabel();
	private JLabel label10 = new JLabel();
	private JLabel label11 = new JLabel();
	private JLabel label12 = new JLabel();
	private JLabel label13 = new JLabel();
	private JLabel label14 = new JLabel();
	private JLabel label15 = new JLabel();
	private JLabel label16 = new JLabel();
	
	
	public ShowDiabolics(ArrayList<String[]> presultsList, int n){
		resultsList = presultsList;
		numOfDiabolics = n;
		init(numOfDiabolics);
	}
	
	private void init(int num){
		numOfDiabolics = num;
		if(numOfDiabolics + 1 == resultsList.size()){			
			initGuiComponents(numOfDiabolics);
			this.setVisible(true);
	        this.setLocationRelativeTo(null);
	        this.setResizable(false);
		}
		else{
			initGuiComponentsNext(numOfDiabolics);
			this.setVisible(true);
	        this.setLocationRelativeTo(null);
	        this.setResizable(false);
		}
	}
	
	private void initGuiComponentsNext(int num) {	
		JButton nextButton = new JButton();
		int n = (num +1);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diabolic Magic " + n);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(450, 400));
        setPreferredSize(new java.awt.Dimension(450, 400));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.gray);
        
        generateMatrix(num);
        
        nextButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.focusCellForeground"));
        nextButton.setIcon(imagesName.next());
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });
        getContentPane().add(nextButton);
        nextButton.setBounds(320, 155, 100, 60);
	}

	private void initGuiComponents(int num){
		JButton homeButton = new JButton();
		int n = (numOfDiabolics +1);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diabolic Magic " + n);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(350, 420));
        setPreferredSize(new java.awt.Dimension(350, 420));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.gray);
        
        generateMatrix(num);
        
        homeButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.focusCellForeground"));
        homeButton.setIcon(imagesName.home());
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(homeButton);
        homeButton.setBounds(105, 330, 140, 40);
	}
	
	private void generateMatrix(int num){
		String[] matrix = resultsList.get(num);
		Border border = BorderFactory.createLineBorder(Color.black, 5);	
		Font font = new Font("OpenDyslexic", 1, 20);
		Color lightGray = Color.lightGray;
		Color white = Color.white;
		//----------------------------------------------------------------//
		label1.setBackground(lightGray);	label2.setBackground(lightGray);
		label1.setForeground(white);		label2.setForeground(white);
		label1.setBorder(border);			label2.setBorder(border);
		label1.setFont(font);				label2.setFont(font);
		label1.setText(matrix[0]);          label2.setText(matrix[1]);	
		//----------------------------------------------------------------//
		label3.setBackground(lightGray);	label4.setBackground(lightGray);
		label3.setForeground(white);		label4.setForeground(white);
		label3.setBorder(border);			label4.setBorder(border);	
		label3.setFont(font);				label4.setFont(font);
		label3.setText(matrix[2]);          label4.setText(matrix[3]);
		//----------------------------------------------------------------//
		label5.setBackground(lightGray);	label6.setBackground(lightGray);
		label5.setForeground(white);		label6.setForeground(white);
		label5.setBorder(border);			label6.setBorder(border);
		label5.setFont(font);				label6.setFont(font);
		label5.setText(matrix[4]);     		label6.setText(matrix[5]);
		//----------------------------------------------------------------//
		label7.setBackground(lightGray);	label8.setBackground(lightGray);
		label7.setForeground(white);		label8.setForeground(white);
		label7.setBorder(border);			label8.setBorder(border);
		label7.setFont(font);				label8.setFont(font);
		label7.setText(matrix[6]);     		label8.setText(matrix[7]);
		//-----------------------------------------------------------------//
		label9.setBackground(lightGray);	label10.setBackground(lightGray);
		label9.setForeground(white);		label10.setForeground(white);
		label9.setBorder(border);			label10.setBorder(border);	
		label9.setFont(font);				label10.setFont(font);
		label9.setText(matrix[8]);     		label10.setText(matrix[9]);
		//----------------------------------------------------------------//
		label11.setBackground(lightGray);	label12.setBackground(lightGray);
		label11.setForeground(white);		label12.setForeground(white);
		label11.setBorder(border);			label12.setBorder(border);	
		label11.setFont(font);				label12.setFont(font);
		label11.setText(matrix[10]);   		label12.setText(matrix[11]);
		//------------------------------------------------------------------//
		label13.setBackground(lightGray);	label14.setBackground(lightGray);
		label13.setForeground(white);		label14.setForeground(white);
		label13.setBorder(border);			label14.setBorder(border);	
		label13.setFont(font);				label14.setFont(font);
		label13.setText(matrix[12]);    	label14.setText(matrix[13]);
		//----------------------------------------------------------------//
		label15.setBackground(lightGray);	label16.setBackground(lightGray);
		label15.setForeground(white);		label16.setForeground(white);
		label15.setBorder(border);			label16.setBorder(border);	
		label15.setFont(font);				label16.setFont(font);
		label15.setText(matrix[14]);    	label16.setText(matrix[15]);
		
		label1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		label16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		
		
		getContentPane().add(label1);       getContentPane().add(label2);
		getContentPane().add(label3);       getContentPane().add(label4);
		getContentPane().add(label5);		getContentPane().add(label6);
		getContentPane().add(label7);		getContentPane().add(label8);
		getContentPane().add(label9);		getContentPane().add(label10);
		getContentPane().add(label11);		getContentPane().add(label12);
		getContentPane().add(label13);		getContentPane().add(label14);
		getContentPane().add(label15);		getContentPane().add(label16);
		
		label1.setBounds(30, 40, 70, 70); 		label2.setBounds(100, 40, 70, 70);
		label3.setBounds(170, 40, 70, 70);		label4.setBounds(240, 40, 70, 70);
		label5.setBounds(30, 110, 70, 70);		label6.setBounds(100, 110, 70, 70);
		label7.setBounds(170, 110, 70, 70);		label8.setBounds(240, 110, 70, 70);
		label9.setBounds(30, 180, 70, 70);		label10.setBounds(100, 180, 70, 70);
		label11.setBounds(170, 180, 70, 70);	label12.setBounds(240, 180, 70, 70);
		label13.setBounds(30, 250, 70, 70);		label14.setBounds(100, 250, 70, 70);
		label15.setBounds(170, 250, 70, 70);	label16.setBounds(240, 250, 70, 70);
	}
	
	private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {
		if(numOfDiabolics + 2 == resultsList.size()) {
			this.dispose();
			ShowDiabolics sh = new ShowDiabolics(resultsList, numOfDiabolics + 1);
		}
		else{
			init(numOfDiabolics+1);
		}
	}

	private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {
		this.dispose();
		principalWindow pw = new principalWindow();
	}
	
}
