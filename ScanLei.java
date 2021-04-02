import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JTextArea;


public class ScanLei extends JFrame  implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private Container contentPane;
	private JButton btn;
	private JButton[] btns;
	private JLabel b1;
	private JLabel b2;
	private JLabel b3;
	private JTextArea b5;
	private Timer timer;
	private int row=9;
	private int col=9;
	private int bon=10;
	private int maxtime = 15;
	private int[][] a;
	private int b;
	private int[] a1;
	private JPanel p,p1,p2,p3;
	
	
	public ScanLei(String title){
		super(title);
		contentPane=getContentPane();
		setSize(297,377);
		this.setBounds(400, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		timer =new Timer(1000,(ActionListener) this);
		a = new int[row+2][col+2];

		initGUI();	
	}
	
	public void initGUI(){
	     p3=new JPanel();
		 b=bon;
		JMenuBar menuBar=new JMenuBar();
		JMenu menu1=new JMenu("Game");
		JMenu menu2=new JMenu("Help");
		JMenuItem mi1=new JMenuItem("primary");
		JMenuItem mi2 = new JMenuItem("Intermediate");
		JMenuItem mi3 =new JMenuItem("Advance");
		JMenuItem hi1 =new JMenuItem("Rule");
		hi1.addActionListener(this);
		menu2.add(hi1);
		mi1.addActionListener(this);
		menu1.add(mi1);
		mi2.addActionListener(this);
		menu1.add(mi2);
		mi3.addActionListener(this);
		menu1.add(mi3);
		menuBar.add(menu1);
		menuBar.add(menu2);
		p3.add(menuBar);
		b1=new JLabel(bon+"");
		a1=new int[bon];
		btn =new JButton("Begin");
		btn.addActionListener(this);
		b2=new JLabel(String.valueOf(maxtime));
		b3=new JLabel("");
		btns=new JButton[row*col];
		 p=new JPanel();
		p.setLayout(new BorderLayout());
		contentPane.add(p);
		p.add(p3,BorderLayout.NORTH);
		//combo=new JComboBox(new Object[]{"primary","Intermediate","Advance"} );
		//Add Monitor
		/*combo.addItemListener(new ItemListener(){				
			}});*/
		 p1=new JPanel();
		//Set Layout
		//(( FlowLayout)p1.getLayout()).setAlignment( FlowLayout.RIGHT);
		p1.add(b1);
		p1.add(btn);
		p1.add(b2);
		p1.add(b3);
		p.add(p3,BorderLayout.WEST);
		p.add(p1,BorderLayout.CENTER);
		 p2=new JPanel();
		p2.setLayout(new GridLayout(row,col,0,0));
		for(int i=0;i<row*col;i++){
			btns[i]=new JButton("");
			btns[i].setMargin(new Insets(0,0,0,0));
			btns[i].setFont(new Font(null,Font.BOLD,25));
			btns[i].addActionListener(this);
			btns[i].addMouseListener(new NormoreMouseEvent());
			p2.add(btns[i]);
		}
		contentPane.add(p,BorderLayout.NORTH);
		contentPane.add(p2,BorderLayout.CENTER);
		
	}
	public void go(){		
		setVisible(true);
	}
	public static void main(String[] args){
		new ScanLei1("Mine").go();	
	}
	public void out(int[][] a,JButton[] btns,ActionEvent e,int i,int x,int y){
	       int p=1;
		   if(a[x][y]==0){
			     a[x][y]=10;
	        	 btns[i].setEnabled(false);	//33 
	        	for(int l=y-1;l<=y+1;l++){
	        		 int m=x-1-1;
					 int n=l-1;
					 p=1;
					 System.out.println(a[1][2]);
					 if(n>-1&&n<col&&m>-1&&m<row)
					 {
					      for(int q=0;q<row&&p==1;q++){//col-->row;
						       if(((n+col*q)>=(m*col))&&((n+col*q)<(m+1)*col)){
							        if(a[x-1][l]!=0&&a[x-1][l]!=10){
							             btns[n+col*q].setText(a[x-1][l]+"");
							             a[x-1][l]=10;
							             btns[n+col*q].setEnabled(false);
							        }
							        else if(a[x-1][l]==0){
							        	 //a[x-1][l]=10;
										 btns[n+col*q].setEnabled(false);
										 out(a,btns,e,n+col*q,x-1,l); ////55////
									     a[x-1][l]=10;
										 btns[n+col*q].setEnabled(false);
							        }
						            p=0;	
						      }
					     }
					 }
					 p=1;
					 m=x;
					 if(n>-1&&n<col&&m>-1&&m<col)
					 {
	        		 for(int q=0;q<row&&p==1;q++){
						 if(((n+col*q)>=(m*col))&&((n+col*q)<(m+1)*col)){
							 if(a[x+1][l]!=0&&a[x+1][l]!=10){
					             btns[n+col*q].setText(a[x+1][l]+"");
					             a[x+1][l]=10;
					             btns[n+col*q].setEnabled(false);
					        }
					        else if(a[x+1][l]==0){

								 out(a,btns,e,n+col*q,x+1,l);///55////						
							    a[x+1][l]=10;
							    btns[n+col*q].setEnabled(false);
					        }
							 p=0;
						 }
					 }
				   }
	        	 }
	      	   int m=x-1;
	        	   int n=y-1-1;
	        	   p=1;
	        	if(n>-1&&n<col&&m>-1&&m<col)
				{
	        	   for(int q=0;q<row&&p==1;q++){
						 if(((n+col*q)>=(m*col))&&((n+col*q)<(m+1)*col)){
							 if(a[x][y-1]!=0&&a[x][y-1]!=10){
					             btns[n+col*q].setText(a[x][y-1]+"");
					             a[x][y-1]=10;
					             btns[n+col*q].setEnabled(false);
					        }
					        else if(a[x][y-1]==0){

						
								 out(a,btns,e,n+col*q,x,y-1);
								 
							 a[x][y-1]=10;
							    btns[n+col*q].setEnabled(false);
					        }
							 p=0;
						 }
				   }
				}
	        	   p=1;
	        	   m=x-1;
	        	   n=y+1-1;
	        	if(n>-1&&n<col&&m>-1&&m<col)
			   {
	        	   for(int q=0;q<row&&p==1;q++){
						 if(((n+col*q)>=(m*col))&&((n+col*q)<(m+1)*col)){
							 if(a[x][y+1]!=0&&a[x][y+1]!=10){
					             btns[n+col*q].setText(a[x][y+1]+"");
					             a[x][y+1]=10;
					             btns[n+col*q].setEnabled(false);
					        }
					        else if(a[x][y+1]==0){
								 out(a,btns,e,n+col*q,x,y+1);													 
							      a[x][y+1]=10;
								 btns[n+col*q].setEnabled(false);
					        }
							 p=0;
						 }
				  }
	        }
		}
	}
	
	//show Game Rules
	
	public void showRule(){
			System.out.println(p2.getSize().height);
			timer.stop();
			b5=new JTextArea("     "+"\r\n");
			b5.setLayout(new  BorderLayout());
			b5.append("   "+"                        Game Rule    "+"\r\n"+"\r\n");
			b5.append("   "+"  Randomly arrange a certain amount of mines in a 10*10,"+"\r\n");
			b5.append("   "+"(primary),40*40(intermediate),99*99 (Advanced) or custom "+"\r\n");
			b5.append("    "+"matrix (10 for primary, 40 for intermediate, 99 for advanced).,"+"\r\n");
			b5.append("    "+"size squarematrix (10 for primary, 40 for intermediate, "+"\r\n");
			b5.append("    "+"99 for advanced).Players turn over the box one by one to "+"\r\n");
			b5.append("    "+"find out all the mines as the final goal of the game. If "+"\r\n");
			b5.append("    "+"the player turns over a square with mines, the game ends. "+"\r\n");
			b5.setOpaque(true);
			b5.setEditable(false);
			b5.setPreferredSize(p2.getSize()); 
			//b5.setSize(p2.getSize().width,p2.getSize().height);
			this.remove(p2);
			p2=new JPanel();
 			p2.setLayout(new BorderLayout(row,col));
 			p2.add(b5,BorderLayout.CENTER); 
			contentPane.add(p2,BorderLayout.CENTER);
			this.pack();
	}

	public void initGame(){
			a1=new int[bon];
			b=bon;
			//setSize(297,377);
			a = new int[row+2][col+2];
			this.remove(p2);
			timer.stop();
			b1.setText(bon+""); //debug 1
			b2.setText(String.valueOf(maxtime*bon/10));
			b3.setText("");
			btns=new JButton[row*col];
			 p2=new JPanel();
			p2.setLayout(new GridLayout(row,col,0,0));
			for(int i=0;i<row*col;i++){
				btns[i]=new JButton("     ");
				btns[i].setMargin(new Insets(0,0,0,0));
				btns[i].setFont(new Font(null,Font.BOLD,25));
				btns[i].addActionListener(this);
				btns[i].addMouseListener(new NormoreMouseEvent());
				p2.add(btns[i]);
			}
			contentPane.add(p2,BorderLayout.CENTER);
			//setSize(297,377);
			this.pack();
			for(int i=0;i<row*col;i++){
				btns[i].setText(" ");
				btns[i].setEnabled(true);
			}
			for(int i=0;i<row+2;i++){
				for(int j=0;j<col+2;j++){
					a[i][j]=0;
				}
			}
	}
	
	public void actionPerformed(ActionEvent e) {
	
		if(e.getActionCommand()=="primary"){
			row=9;
			col=9;
			bon=10;
			initGame();
	
		}else if(e.getActionCommand()=="Intermediate"){
			row=16;
			col=16;
			bon=40;
			initGame();
			
		}else if(e.getActionCommand()=="Advance"){
			row=16;
			col=32;
			bon=99;
			initGame();
		}else if(e.getActionCommand()=="Rule"){
				showRule();
			
		}
		if(e.getSource()==btn){
			timer.start();
			b=bon;
			b3.setText("");
			//System.out.println(bon);
			//Emplty
			for(int i=0;i<row*col;i++){
				btns[i].setText("");
				btns[i].setEnabled(true);
			}
			for(int i=0;i<row+2;i++){
				for(int j=0;j<col+2;j++){
					a[i][j]=0;
				}
			}
			//Gen random number
			for(int i=0;i<bon;i++)
			{   int p=1;
				int m=(int)(Math.random()*row*col);
				while(p==1){
				    int l=1;
				    int j;
					for( j=0;j<i&&l==1;j++){
					
					     if(a1[j]==m){
					    	  m=(int)(Math.random()*row*col); 
					    	  l=0;
					      }
					}
					if(j==i){
						a1[i]=m;
						p=0;
					}
				}				
			}
			b1.setText(bon+"");
			b2.setText(String.valueOf(maxtime*bon/10));		
		//Init Mine
		    for(int i=0;i<bon;i++){	
			    int x=(a1[i]/col+1);
			    int y=(a1[i]%col+1);
				a[x][y]=100;
		   }
		   for(int i=0;i<row+2;i++){
			   for(int j=0;j<col+2;j++){
				   if(i==0||j==0||i==row+1||j==col+1){
				      a[i][j]=0; 	
				   }
			   }
		   }
		   for(int i=1;i<=row;i++){
			   for(int j=1;j<=col;j++){
				   if(a[i][j]!=100){
					   for(int l=j-1;l<=j+1;l++){
							  if(a[i-1][l]==100){
								   a[i][j]++;
							    }
							  if(a[i+1][l]==100){
								   a[i][j]++;
							  }
						   }
					   if(a[i][j-1]==100){
						   a[i][j]++;
					   }
					   if(a[i][j+1]==100){
						   a[i][j]++;
					   }	   
				      } 
			      }
		      } 	   
	     }
		if(e.getSource()==timer)
		{
            String time=b2.getText().trim();
			
			int t=Integer.parseInt(time);
			//System.out.println(t);
			if(t<=0){
				timer.stop();
				
			}else{
				
				t--;
				b2.setText(t+"");
			}
		}
		for(int i=0;i<col*row;i++){
			 if(btns[i].getText()!="★")
			 {
		       int x=i/col+1;
		       int y=i%col+1;
		       if(e.getSource()==btns[i]&&a[x][y]==100){
			      btns[i].setText("★");
			      btns[i].setEnabled(false);
			      a[x][y]=10;
			      for(int k=0;k<col*row;k++){
		    	    	 int m1=k/col+1;
					       int n1=k%col+1;
		    	    	 if(a[m1][n1]!=10&&btns[k].getText()=="★"){
		    	    		 btns[k].setText("*o*");
		    	    	 }
		    	     }
			      for(int j=0;j<col*row;j++){
				       int m=j/col+1;
				       int n=j%col+1;
			    	   if(a[m][n]==100){
			    		 btns[j].setText("★");
			    	     btns[j].setEnabled(false);			    	   
			    	     b3.setText("You Lose！"); // debug 2
			    	 }
			    	 btns[j].setEnabled(false);
			    	 a[m][n]=10;
			      }
			      timer.stop();			    
		      }
		   else if(e.getSource()==btns[i]){
			       if(a[x][y]==0){
			        	out(a,btns,e,i,x,y);
			        	a[x][y]=10;
			        	btns[i].setEnabled(false); 
			       }
			        if(a[x][y]!=0&&a[x][y]!=10){
			             btns[i].setText(a[x][y]+"");
			             btns[i].setEnabled(false);
			             a[x][y]=10;
			        }
		    }
	    }else if(btns[i].getText()=="★"){
	    }
	  }
	}
	class NormoreMouseEvent extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			System.out.println(b);
			for(int i=0;i<col*row;i++){
				   int x1=i/col+1;
			       int y1=i%col+1;
				if(e.getSource()==btns[i]&&btns[i].getText()!="★"&&a[x1][y1]!=10)
				{
			       if(e.getButton()==MouseEvent.BUTTON3){
				      btns[i].setText("★");
				      b--;
				      if(b==0){
				    	  int flag=0;
				    	  for(int j=0;j<col*row;j++){
				    		   int x=j/col+1;
						       int y=j%col+1;
				    		  if(a[x][y]==100&&btns[j].getText()=="★"){
				    			  flag++;
				    		  }
				    	  }
				    	  if(flag==bon){
				    		  timer.stop();
				    		  b3.setText("You Win!");
				    	  }
				      }
				      b1.setText(b+"");
			       }
				}else if(e.getSource()==btns[i]&&btns[i].getText()=="★"&&a[x1][y1]!=-1){
					if(e.getButton()==MouseEvent.BUTTON3){
					   btns[i].setText("");
					   b++;
					   if(b>bon){
						  b1.setText(bon+""); 
					   }
					   else{
						   b1.setText(b+"");
					   }					   
			    	   btns[i].setEnabled(true);
					}
				}
			}
		}
	}
}
