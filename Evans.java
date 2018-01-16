 package evans;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Evans {
    
    
    private double tempFirst=0.0;
    private boolean[] operation=new boolean[4];
    public static void main(String[] args) {
        
       
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
            
          
        } catch (Exception ex) {
            System.out.println("Could not load System lookc");
        } 
        Evans evans = new Evans(); 
    }
    
    public Evans(){
        
        JTextArea tf=new JTextArea("0");
        tf.setBounds(10, 10, 375, 75);
        tf.setEditable(false);
        tf.setFont(new Font("Arial", Font.PLAIN, 39));
        
        
    JFrame outerframe= new JFrame();
    outerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //make sure the program exits when the frame closes
    outerframe.setTitle("My Calculator");
    outerframe.setSize(400,450);
    outerframe.setLocationRelativeTo(null);
    //This will center the JFrame in the middle of the screen
    
    //Layout managers
    FlowLayout gr=new FlowLayout(FlowLayout.LEFT, 15, 15);
    FlowLayout hr=new FlowLayout(FlowLayout.RIGHT,25,10);
    
    
    /*first panel*/
            //contains numbers 7 to "."
    JPanel first=new JPanel();
        first.setLayout(gr);
        Dimension dim=new Dimension(65, 50);
        Dimension dim2=new Dimension(45, 50);
    JButton btn=new JButton("7");
    JButton btn1= new JButton("8");
    JButton btn2=new JButton("9");
    JButton btn3=new JButton("4");
    JButton btn4=new JButton("5");
    JButton btn5=new JButton("6");
    JButton btn6=new JButton("1");
    JButton btn7=new JButton("2");
    JButton btn8=new JButton("3");
    JButton btn9=new JButton("0");
    JButton btn10=new JButton(".");
        btn1.setPreferredSize(dim);
        btn2.setPreferredSize(dim);
        btn3.setPreferredSize(dim);
        btn4.setPreferredSize(dim);
        btn5.setPreferredSize(dim);
        btn6.setPreferredSize(dim);
        btn7.setPreferredSize(dim);
        btn8.setPreferredSize(dim);
        btn9.setPreferredSize(dim);
        btn.setPreferredSize(dim);
        btn10.setPreferredSize(dim);
        
            //ActionListeners added to the buttons in first panel
        //This is button 7
        btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (tf.getText().length()>16) 
                return;
            if (tf.getText().equalsIgnoreCase("0")) {
                //if the display is nothing but a zero(only a zero)
                tf.setText("7");
                return;
               //returns back to the method that invoked it. 
            }
            tf.append("7");
        }
    });
       //This is button 8
          btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (tf.getText().length()>16) 
                return;
            if (tf.getText().equalsIgnoreCase("0")) {
                //if the display is nothing but a zero(only a zero)
                tf.setText("8");
                return;
               //returns back to the method that invoked it. 
            }
            tf.append("8");
        }
    });
          //This is button 9
            btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (tf.getText().length()>16) 
                return;
            if (tf.getText().equalsIgnoreCase("0")) {
                //if the display is nothing but a zero(only a zero)
                tf.setText("9");
                return;
               //returns back to the method that invoked it. 
            }
            tf.append("9");
        }
    });
            //This is button 4
              btn3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (tf.getText().length()>16) 
                return;
            if (tf.getText().equalsIgnoreCase("0")) {
                //if the display is nothing but a zero(only a zero)
                tf.setText("4");
                return;
               //returns back to the method that invoked it. 
            }
            tf.append("4");
            
        }
    });
              //This is button 5
                btn4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (tf.getText().length()>16) 
                return;
            if (tf.getText().equalsIgnoreCase("0")) {
                //if the display is nothing but a zero(only a zero)
                tf.setText("5");
                return;
               //returns back to the method that invoked it. 
            }
            tf.append("5");
        }
    });
                //This is button 6
                  btn5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (tf.getText().length()>16) 
                return;
            if (tf.getText().equalsIgnoreCase("0")) {
                //if the display is nothing but a zero(only a zero)
                tf.setText("6");
                return;
               //returns back to the method that invoked it. 
            }
            tf.append("6");
        }
    });
                  //This is button 1
                    btn6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (tf.getText().length()>16) 
                return;
            if (tf.getText().equalsIgnoreCase("0")) {
                //if the display is nothing but a zero(only a zero)
                tf.setText("1");
                return;
               //returns back to the method that invoked it. 
            }
            tf.append("1");
        }
    });
                    //This is button 2
                      btn7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (tf.getText().length()>16) 
                return;
            if (tf.getText().equalsIgnoreCase("0")) {
                //if the display is nothing but a zero(only a zero)
                tf.setText("2");
                return;
               //returns back to the method that invoked it. 
            }
            tf.append("2");
        }
    });
                      //This is button 3
                        btn8.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (tf.getText().length()>16) 
                return;
            if (tf.getText().equalsIgnoreCase("0")) {
                //if the display is nothing but a zero(only a zero)
                tf.setText("3");
                return;
               //returns back to the method that invoked it. 
            }
            tf.append("3");
        }
    });
                        //This is button 0
                          btn9.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (tf.getText().length()>16) 
                return;
            if (tf.getText().equalsIgnoreCase("0")) {
                //if the display is nothing but a zero(only a zero)
                
                return;
               //returns back to the method that invoked it. 
            }
            tf.append("0");
        }
    });
                          //This is button "."
                          
        btn10.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (tf.getText().contains(".")) 
                return;
                    //returns back to the method that invoked it. 
            
            tf.append(".");
        }
    });
        
            //adding the above buttons to the first panel
    first.add(btn);
    first.add(btn1);
    first.add(btn2);
    first.add(btn3);
    first.add(btn4);
    first.add(btn5);
    first.add(btn6);
    first.add(btn7);
    first.add(btn8);
    first.add(btn9);
    first.add(btn10);
        first.setBackground(Color.LIGHT_GRAY);
        first.setBounds(0, 146, 250, 325);
    
   
    /* second panel  */
    JPanel second=new JPanel();
    Button btn11=new Button("+");
    btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTempFirst(Double.parseDouble(tf.getText()));
                 tf.setText("0");
                 operation[3]=true;
            }
        });
    Button btn12=new Button("-");
    btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              setTempFirst(Double.parseDouble(tf.getText()));
                 tf.setText("0");
                 operation[2]=true;
            }
        });
    Button btn13=new Button("*");
    btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTempFirst(Double.parseDouble(tf.getText()));
                 tf.setText("0");
                 operation[1]=true;
            }
        });
    
    JButton btn14=new JButton("/");
    btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTempFirst(Double.parseDouble(tf.getText()));
                tf.setText("0");
                operation[0]=true;
            }
        });
    JButton btn15=new JButton("Del");
    JButton btn16=new JButton("=");
    btn16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if (operation[0])
                //setTempSecond(Double.parseDouble(tf.getText()));
                  //displays the logic in the afterwards statement
                tf.setText(Double .toString(getTempFirst()/Double.parseDouble(tf.getText())));
            else if(operation[1])
                    tf.setText(Double.toString(getTempFirst()*Double.parseDouble(tf.getText())));
                else if(operation[2])
                    tf.setText(Double.toString(getTempFirst()- Double.parseDouble(tf.getText())));
                else if(operation[3])
                    tf.setText(Double.toString(getTempFirst()+ Double.parseDouble(tf.getText())));
                if(operation[0])
                    tf.setText(tf.getText().replace(".0", ""));
                 setTempFirst(0.0);
                for(int i=0;i<3;i++)
                operation[i]=false;
            
            }
        });
    
    //adding buttons to second panel
    second.add(btn11);
    second.add(btn12);
    second.add(btn13);
    second.add(btn14);
    second.add(btn15);
    second.add(btn16);
        btn11.setPreferredSize(dim2);
        btn12.setPreferredSize(dim2);
        btn13.setPreferredSize(dim2);
        btn14.setPreferredSize(dim2);
        btn15.setPreferredSize(dim2);
        btn16.setPreferredSize(dim2);
        
    second.setBounds(244, 146, 150, 325);
    second.setLayout(gr);
    second.setBackground(Color.GRAY);
    
     /*Third panel*/
    JPanel third=new JPanel();
    JLabel label =new JLabel("made by Evans");
    
    Button Reset=new Button("Reset");
    Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("0");
                 setTempFirst(0.0);
                for(int i=0;i<4;i++)
                operation[i]=false;
            }
        });
    Button power=new Button("Off/On");
    power.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
             System.exit(0); 
             }
         });
        
        
    //adding buttons to third panel
    third.add(label);
    third.add(power);
    third.add(Reset);
        third.setLayout(hr);
        third.setBackground(Color.black);
        third.setBounds(0, 100, 400,50);
            //the main window frame
    outerframe.add(tf);
    outerframe.add(first);
    outerframe.add(second);
    outerframe.add(third);
    //outerframe.add(fourth);
    outerframe.setLayout(null);
    outerframe.setVisible(true);
    outerframe.setResizable(false);
 //end of gui design
    }
     public double getTempFirst(){
    return tempFirst;
    }
    public void setTempFirst(double tempFirst){
    this.tempFirst=tempFirst;
    }
    
    
}
