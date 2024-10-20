import java.awt.*;
import java.awt.event.*;

class chk_Main1 extends Frame implements ActionListener
{
    Label l1,l2;
    Button b1,b2,b3,b4,b5;
    chk_Main1()
    {
        
        setLayout(null);
        setTitle("Converter");
        setResizable(false);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                    dispose();
            }
            
        });
        setSize(600,600);
        setVisible(true);
        setBackground(Color.black);
        //l2=new Label("");
        //l2.setBounds(0,0,600,100);
        //l2.setBackground(Color.blue);
        //add(l2);
        l1=new Label("Utility Converter");
        l1.setBounds(100,25,400,100);
        l1.setForeground(Color.red);
        add(l1);
        l1.setFont(new Font("Monospaced",Font.PLAIN,45));


        b1=new Button("Currrency Converter");
        b1.setBounds(100,150,400,60);
        add(b1);
        b1.addActionListener(this);

        b2=new Button("Temperature Converter");
        b2.setBounds(100,235,400,60);
        add(b2);
        b2.addActionListener(this);

        b3=new Button("Age Converter");
        b3.setBounds(100,320,400,60);
        add(b3);
        b3.addActionListener(this);

        b4=new Button("Time Converter");
        b4.setBounds(100,405,400,60);
        add(b4);
        b4.addActionListener(this);

        b5=new Button("Close");
        b5.setBounds(350,490,150,40);
        add(b5);
        b5.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        if(str.equals("Currrency Converter"))
        {
            b1.setBackground(Color.green);
            convertor c=new convertor();
            b1.setBackground(Color.white);
            //System.exit(0);
        }
        if(str.equals("Temperature Converter"))
        {
            b2.setBackground(Color.green);
            tempra temo=new tempra();
           // System.exit(0);
        }
        if(str.equals("Age Converter"))
        {
            b3.setBackground(Color.green);
            age abc=new age();
            //System.exit(0);
        }
        if(str.equals("Time Converter"))
        {
            b4.setBackground(Color.green);
            tim time=new tim();
            //System.exit(0);
        }
        if(str.equals("Close"))
        {
            b5.setBackground(Color.red);
            System.exit(0);
        }
    }
}



class convertor extends Frame implements ActionListener,TextListener
{
    Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,m1,m2,m3;
    TextField f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13;
    convertor()
    {
        setLayout(null);
        setResizable(false);
        setBackground(Color.black);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                    dispose();
            }
        });
        setTitle("Converter");
        l=new Label("Currency Converter");
        l.setFont(new Font("Monospaced",Font.PLAIN,45));
        l.setBounds(50,50,500,40);
        l.setForeground(Color.red);
        add(l);
        l1=new Label("Indian Rupees");
        l1.setFont(new Font("Arial",Font.PLAIN,15));
        l1.setBounds(100,110,200,30);
        l1.setForeground(Color.white);
        f1=new TextField();
        f1.setBounds(300,110,250,30);
        /*b1=new Button("CONVERT");
        b1.setBounds(460,160,70,20);
        b1.setBackground(Color.white);
        add(b1);*/
        add(l1);
        add(f1);
        l2=new Label("Srilanka Rupees");
        l2.setForeground(Color.white);
        l2.setFont(new Font("Arial",Font.PLAIN,15));
        l2.setBounds(50,210,100,30);
        f2=new TextField();
        f2.setBounds(175,210,100,30);
        l3=new Label("Pakistan rupee");
        l3.setFont(new Font("Arial",Font.PLAIN,15));
        l3.setForeground(Color.white);
        l3.setBounds(325,210,100,30);
        f3=new TextField();
        f3.setBounds(450,210,100,30);
        add(f3);
        add(l2);
        add(l3);
        add(f2);
        l4=new Label("Euro");
        l4.setForeground(Color.white);
        l4.setFont(new Font("Arial",Font.PLAIN,15));
        l4.setBounds(50,260,100,30);
        f4=new TextField();
        f4.setBounds(175,260,100,30);
        l5=new Label("Hong Kong");
        l5.setForeground(Color.white);
        l5.setFont(new Font("Arial",Font.PLAIN,15));
        l5.setBounds(325,260,100,30);
        f5=new TextField();
        f5.setBounds(450,260,100,30);
        l6=new Label("Turkish Lira");
        l6.setForeground(Color.white);
        l6.setFont(new Font("Arial",Font.PLAIN,15));
        l6.setBounds(50,310,100,30);
        f6=new TextField();
        f6.setBounds(175,310,100,30);
        l7=new Label("Singapore");
        l7.setForeground(Color.white);
        l7.setFont(new Font("Arial",Font.PLAIN,15));
        l7.setBounds(325,310,100,30);
        f7=new TextField();
        f7.setBounds(450,310,100,30);
        l8=new Label("Indonesia");
        l8.setForeground(Color.white);
        l8.setFont(new Font("Arial",Font.PLAIN,15));
        l8.setBounds(50,360,100,30);
        f8=new TextField();
        f8.setBounds(175,360,100,30);
        l9=new Label("Japanese Yen");
        l9.setForeground(Color.white);
        l9.setFont(new Font("Arial",Font.PLAIN,15));
        l9.setBounds(325,360,100,30);
        f9=new TextField();
        f9.setBounds(450,360,100,30);
        l10=new Label("Taiwanese $");
        l10.setForeground(Color.white);
        l10.setFont(new Font("Arial",Font.PLAIN,15));
        l10.setBounds(50,410,100,30);
        f10=new TextField();
        f10.setBounds(175,410,100,30);
        l11=new Label("Chinese Yuan ");
        l11.setForeground(Color.white);
        l1.setFont(new Font("Arial",Font.PLAIN,15));
        l11.setBounds(325,410,100,30);
        l11.setFont(new Font("Arial",Font.PLAIN,15));
        f11=new TextField();
        f11.setBounds(450,410,100,30);
        l12=new Label("Bangladeshi Taka");
        l12.setForeground(Color.white);
        l12.setFont(new Font("Arial",Font.PLAIN,15));
        l12.setBounds(50,460,100,30);
        f12=new TextField();
        f12.setBounds(175,460,100,30);
        l13=new Label("Maldivian Rufuyaa");
        l13.setForeground(Color.white);
        l13.setFont(new Font("Arial",Font.PLAIN,15));
        l13.setBounds(325,460,100,30);
        f13=new TextField();
        f13.setBounds(450,460,100,30);
        b2=new Button("Close");
        b2.setFont(new Font("Arial",Font.PLAIN,15));
        b2.setBounds(300,530,250,30);
        b2.addActionListener(this);
        f1.addTextListener(this);
        add(b2);
        add(l4);
        add(f4);
        add(l5);
        add(f5);
        add(l6);
        add(f6);
        add(l7);
        add(f7);
        add(l8);
        add(f8);
        add(l9);
        add(f9);
        add(l10);
        add(f10);
        add(l11);
        add(f11);
        add(l12);
        add(f12);
        add(l13);
        add(f13);
        /* f1.addTextListener(this);
        f2.addTextListener(this);
        f3.addTextListener(this);
        f4.addTextListener(this);
        f5.addTextListener(this);
        f6.addTextListener(this);
        f7.addTextListener(this);
        f8.addTextListener(this);
        f9.addTextListener(this);
        f10.addTextListener(this);*/
        //ee1.setActionListener(this); 
        setSize(600,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ev)
    {
        String str=ev.getActionCommand();
        if(str.equals("Close"))
        {
            b2.setBackground(Color.red);
            System.exit(0);
            b2.setBackground(Color.red);
        }
    }
    public void textValueChanged(TextEvent ta)
    {
        if(ta.getSource()==f1)
        {
             /* b1.setBackground(Color.red);
             f2=copy(d1);
            f3=setText(d2);
            f4=setText(d3);
            f5=setText(d4);
            f6=setText(d5);
            f7=setText(d6);
            f8=setText(d7);
            f9=setText(d8);
            f10=setText(d9);
            f11=setText(d10);
            f12=setText(d11);
            f13=setText(d12);*/
            double base,b,c,d,e,fb,g,h,i,j,k,l,m;
            base=Double.parseDouble(f1.getText());
            b=base*3.89;
            c=base*3.58;
            d=base*0.011;
            e=base*0.094;
            fb=base*0.32;
            g=base*0.016;
            h=base*185.24;
            i=base*1.77;
            j=base*0.38;
            k=base*0.088;
            l=base*1.32;
            m=base*0.19;
            f2.setText(Double.toString(b));
            f3.setText(Double.toString(c));
            f4.setText(Double.toString(d));
            f5.setText(Double.toString(e));
            f6.setText(Double.toString(fb));
            f7.setText(Double.toString(g));
            f8.setText(Double.toString(h));
            f9.setText(Double.toString(i));
            f10.setText(Double.toString(j));
            f11.setText(Double.toString(k));
            f12.setText(Double.toString(l));
            f13.setText(Double.toString(m));
        }
    }
}

class T1 extends Frame implements ActionListener,TextListener
{
    Button b1;
    Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    T1()
    {
        setResizable(false);
        setLayout(null);
        setBackground(Color.black);
        b1=new Button("Exit");
        l4=new Label("        Enter the value in Celsius box");
        l1=new Label("      Celsius");
        l2=new Label("       Kelvin");
        l3=new Label("   Fahrenheit");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        b1.setBounds(110,350,80,40);
        b1.setBackground(Color.red);
        l1.setBounds(175,100,80,40);
        l2.setBounds(175,180,80,40);
        l3.setBounds(175,260,80,40);
        l4.setBounds(45,30,210,40);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        l1.setBackground(Color.blue);
        l2.setBackground(Color.blue);
        l3.setBackground(Color.blue);
        l4.setBackground(Color.green);
        t1.setBounds(45,100,80,40);
        t2.setBounds(45,180,80,40);
        t3.setBounds(45,260,80,40);
        t1.setBackground(Color.white);
        t2.setBackground(Color.white);
        t3.setBackground(Color.white);
        add(b1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t3);
        b1.addActionListener(this);
        t1.addTextListener(this);
        setSize(300,420);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.exit(0);
        }
    }
    public void textValueChanged(TextEvent ta)
    {
        if(ta.getSource()==t1)
        {
            double c,k,f;
            c=Double.parseDouble(t1.getText());
            k=(c+273);
            f=(9*c/5+32);
            t2.setText(Double.toString(k));
            t3.setText(Double.toString(f));
        }
    }
}
class T2 extends Frame implements ActionListener,TextListener
{
    Button b1;
    Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    T2()
    {
        setResizable(false);
        setLayout(null);
        setBackground(Color.black);
        b1=new Button("Exit");
        l4=new Label("         Enter the value in Kelvin box");
        l1=new Label("      Celsius");
        l2=new Label("       Kelvin");
        l3=new Label("   Fahrenheit");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        b1.setBounds(110,350,80,40);
        b1.setBackground(Color.red);
        l1.setBounds(175,100,80,40);
        l2.setBounds(175,180,80,40);
        l3.setBounds(175,260,80,40);
        l4.setBounds(45,30,210,40);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        l1.setBackground(Color.blue);
        l2.setBackground(Color.blue);
        l3.setBackground(Color.blue);
        l4.setBackground(Color.green);
        t1.setBounds(45,100,80,40);
        t2.setBounds(45,180,80,40);
        t3.setBounds(45,260,80,40);
        t1.setBackground(Color.white);
        t2.setBackground(Color.white);
        t3.setBackground(Color.white);
        add(b1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t3);
        b1.addActionListener(this);
        t2.addTextListener(this);
        setSize(300,420);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.exit(0);
        }
    }
    public void textValueChanged(TextEvent ta)
    {
        if(ta.getSource()==t2)
        {
            Double c,k,f;
            k=Double.parseDouble(t2.getText());
            c=(k-273);
            f=(9*c/5+32);
            t1.setText(Double.toString(c));
            t3.setText(Double.toString(f));
        }
    }
}
class T3 extends Frame implements ActionListener,TextListener
{
    Button b1;
    Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    T3()
    {
        setResizable(false);
        setLayout(null);
        setBackground(Color.black);
        b1=new Button("Exit");
        l4=new Label("    Enter the value in Fahrenheit box");
        l1=new Label("      Celsius");
        l2=new Label("       Kelvin");
        l3=new Label("   Fahrenheit");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        b1.setBounds(110,350,80,40);
        b1.setBackground(Color.red);
        l1.setBounds(175,100,80,40);
        l2.setBounds(175,180,80,40);
        l3.setBounds(175,260,80,40);
        l4.setBounds(45,30,210,40);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        l1.setBackground(Color.blue);
        l2.setBackground(Color.blue);
        l3.setBackground(Color.blue);
        l4.setBackground(Color.green);
        t1.setBounds(45,100,80,40);
        t2.setBounds(45,180,80,40);
        t3.setBounds(45,260,80,40);
        t1.setBackground(Color.white);
        t2.setBackground(Color.white);
        t3.setBackground(Color.white);
        add(b1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t3);
        b1.addActionListener(this);
        t3.addTextListener(this);
        setSize(300,420);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.exit(0);
        }
    }
    public void textValueChanged(TextEvent ta)
    {
        if(ta.getSource()==t3)
        {
            double c,k,f;
            f=Double.parseDouble(t3.getText());
            c=(5*(f-32)/9);
            k=(c+273);
            t2.setText(Double.toString(k));
            t1.setText(Double.toString(c));
        }
    }
}
class tempra extends Frame implements ActionListener
{
    Button b13,b14,b15,b16;
    Label l1,l2;
    tempra()
    {
        setLayout(null);
        setBackground(Color.black);
        l1=new Label("  Temperature Conversion");
        l1.setBounds(130,30,150,40);
        l1.setForeground(Color.white);
        l1.setBackground(Color.blue);
        l2=new Label("Click on Button in which you Enter the value");
        l2.setBounds(90,110,360,40);
        l2.setForeground(Color.white);
        b13=new Button("Celsius");
        b14=new Button("Kelvin");
        b15=new Button("Fahrenheit");
        b16=new Button("Exit");
        b13.setBounds(180,190,80,40);
        b14.setBounds(180,270,80,40);
        b15.setBounds(180,350,80,40);
        b16.setBounds(300,400,80,40);
        b13.setBackground(Color.green);
        b14.setBackground(Color.green);
        b15.setBackground(Color.green);
        b16.setBackground(Color.red);
        add(l1);
        add(l2);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        setSize(420,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent tem)
    {
        String str=tem.getActionCommand();
        if(str.equals("Celsius"))
        {
            T1 t=new T1();
        }
        if(str.equals("Kelvin"))
        {
            T2 t=new T2();
        }
        if(str.equals("Fahrenheit"))
        {
            T3 t=new T3();
        }
        if(tem.getSource()==b16)
        {
            System.exit(0);
        }
    }
}
class Ti1 extends Frame implements ActionListener,TextListener
{
    Button b1;
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Ti1()
    {
        setResizable(false);
        setLayout(null);
        setBackground(Color.black);
        b1=new Button("Exit");
        l8=new Label("         Enter the value in Year box");
        l1=new Label("       Year");
        l2=new Label("       Month");
        l3=new Label("       Week");
        l4=new Label("        Day");
        l5=new Label("       Hour");
        l6=new Label("      Minute");
        l7=new Label("     Second");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        t4=new TextField(20);
        t5=new TextField(20);
        t6=new TextField(20);
        t7=new TextField(20);
        b1.setBounds(110,680,80,40);
        b1.setBackground(Color.red);
        l1.setBounds(175,100,80,40);
        l2.setBounds(175,180,80,40);
        l3.setBounds(175,260,80,40);
        l4.setBounds(175,340,80,40);
        l5.setBounds(175,420,80,40);
        l6.setBounds(175,500,80,40);
        l7.setBounds(175,580,80,40);
        l8.setBounds(45,30,210,40);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        l5.setForeground(Color.black);
        l6.setForeground(Color.black);
        l7.setForeground(Color.black);
        l8.setForeground(Color.black);
        l1.setBackground(Color.blue);
        l2.setBackground(Color.blue);
        l3.setBackground(Color.blue);
        l4.setBackground(Color.blue);
        l5.setBackground(Color.blue);
        l6.setBackground(Color.blue);
        l7.setBackground(Color.blue);
        l8.setBackground(Color.green);
        t1.setBounds(45,100,80,40);
        t2.setBounds(45,180,80,40);
        t3.setBounds(45,260,80,40);
        t4.setBounds(45,340,80,40);
        t5.setBounds(45,420,80,40);
        t6.setBounds(45,500,80,40);
        t7.setBounds(45,580,80,40);
        t1.setBackground(Color.white);
        t2.setBackground(Color.white);
        t3.setBackground(Color.white);
        t4.setBackground(Color.white);
        t5.setBackground(Color.white);
        t6.setBackground(Color.white);
        t7.setBackground(Color.white);
        add(b1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        b1.addActionListener(this);
        t1.addTextListener(this);
        setSize(300,740);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.exit(0);
        }
    }
    public void textValueChanged(TextEvent ta)
    {
        if(ta.getSource()==t1)
        {
            double y,m,w,d,h,min,s;
            y=Double.parseDouble(t1.getText());
            m=y*12;
            w=y*52.179;
            d=y*365;
            h=y*8766;
            min=y*525960;
            s=y*31557600;
            t2.setText(Double.toString(m));
            t3.setText(Double.toString(w));
            t4.setText(Double.toString(d));
            t5.setText(Double.toString(h));
            t6.setText(Double.toString(min));
            t7.setText(Double.toString(s));
        }
    }
}
class Ti2 extends Frame implements ActionListener,TextListener
{
    Button b1;
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Ti2()
    {
        setResizable(false);
        setLayout(null);
        setBackground(Color.black);
        b1=new Button("Exit");
        l8=new Label("         Enter the value in Month box");
        l1=new Label("       Year");
        l2=new Label("       Month");
        l3=new Label("       Week");
        l4=new Label("        Day");
        l5=new Label("       Hour");
        l6=new Label("      Minute");
        l7=new Label("     Second");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        t4=new TextField(20);
        t5=new TextField(20);
        t6=new TextField(20);
        t7=new TextField(20);
        b1.setBounds(110,680,80,40);
        b1.setBackground(Color.red);
        l1.setBounds(175,100,80,40);
        l2.setBounds(175,180,80,40);
        l3.setBounds(175,260,80,40);
        l4.setBounds(175,340,80,40);
        l5.setBounds(175,420,80,40);
        l6.setBounds(175,500,80,40);
        l7.setBounds(175,580,80,40);
        l8.setBounds(45,30,210,40);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        l5.setForeground(Color.black);
        l6.setForeground(Color.black);
        l7.setForeground(Color.black);
        l8.setForeground(Color.black);
        l1.setBackground(Color.blue);
        l2.setBackground(Color.blue);
        l3.setBackground(Color.blue);
        l4.setBackground(Color.blue);
        l5.setBackground(Color.blue);
        l6.setBackground(Color.blue);
        l7.setBackground(Color.blue);
        l8.setBackground(Color.green);
        t1.setBounds(45,100,80,40);
        t2.setBounds(45,180,80,40);
        t3.setBounds(45,260,80,40);
        t4.setBounds(45,340,80,40);
        t5.setBounds(45,420,80,40);
        t6.setBounds(45,500,80,40);
        t7.setBounds(45,580,80,40);
        t1.setBackground(Color.white);
        t2.setBackground(Color.white);
        t3.setBackground(Color.white);
        t4.setBackground(Color.white);
        t5.setBackground(Color.white);
        t6.setBackground(Color.white);
        t7.setBackground(Color.white);
        add(b1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        b1.addActionListener(this);
        t2.addTextListener(this);
        setSize(300,740);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.exit(0);
        }
    }
    public void textValueChanged(TextEvent ta)
    {
        if(ta.getSource()==t2)
        {
            double y,m,w,d,h,min,s;
            m=Double.parseDouble(t2.getText());
            y=m/12;
            w=y*52.179;
            d=y*365;
            h=y*8766;
            min=y*525960;
            s=y*31557600;
            t1.setText(Double.toString(y));
            t3.setText(Double.toString(w));
            t4.setText(Double.toString(d));
            t5.setText(Double.toString(h));
            t6.setText(Double.toString(min));
            t7.setText(Double.toString(s));
        }
    }
}
class Ti3 extends Frame implements ActionListener,TextListener
{
    Button b1;
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Ti3()
    {
        setResizable(false);
        setLayout(null);
        setBackground(Color.black);
        b1=new Button("Exit");
        l8=new Label("         Enter the value in Week box");
        l1=new Label("       Year");
        l2=new Label("       Month");
        l3=new Label("       Week");
        l4=new Label("        Day");
        l5=new Label("       Hour");
        l6=new Label("      Minute");
        l7=new Label("     Second");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        t4=new TextField(20);
        t5=new TextField(20);
        t6=new TextField(20);
        t7=new TextField(20);
        b1.setBounds(110,680,80,40);
        b1.setBackground(Color.red);
        l1.setBounds(175,100,80,40);
        l2.setBounds(175,180,80,40);
        l3.setBounds(175,260,80,40);
        l4.setBounds(175,340,80,40);
        l5.setBounds(175,420,80,40);
        l6.setBounds(175,500,80,40);
        l7.setBounds(175,580,80,40);
        l8.setBounds(45,30,210,40);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        l5.setForeground(Color.black);
        l6.setForeground(Color.black);
        l7.setForeground(Color.black);
        l8.setForeground(Color.black);
        l1.setBackground(Color.blue);
        l2.setBackground(Color.blue);
        l3.setBackground(Color.blue);
        l4.setBackground(Color.blue);
        l5.setBackground(Color.blue);
        l6.setBackground(Color.blue);
        l7.setBackground(Color.blue);
        l8.setBackground(Color.green);
        t1.setBounds(45,100,80,40);
        t2.setBounds(45,180,80,40);
        t3.setBounds(45,260,80,40);
        t4.setBounds(45,340,80,40);
        t5.setBounds(45,420,80,40);
        t6.setBounds(45,500,80,40);
        t7.setBounds(45,580,80,40);
        t1.setBackground(Color.white);
        t2.setBackground(Color.white);
        t3.setBackground(Color.white);
        t4.setBackground(Color.white);
        t5.setBackground(Color.white);
        t6.setBackground(Color.white);
        t7.setBackground(Color.white);
        add(b1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        b1.addActionListener(this);
        t3.addTextListener(this);
        setSize(300,740);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.exit(0);
        }
    }
    public void textValueChanged(TextEvent ta)
    {
        if(ta.getSource()==t3)
        {
            double y,m,w,d,h,min,s;
            w=Double.parseDouble(t3.getText());
            y=w/52.179;
            m=y*12;
            d=y*365;
            h=y*8766;
            min=y*525960;
            s=y*31557600;
            t2.setText(Double.toString(m));
            t1.setText(Double.toString(y));
            t4.setText(Double.toString(d));
            t5.setText(Double.toString(h));
            t6.setText(Double.toString(min));
            t7.setText(Double.toString(s));
        }
    }
}
class Ti4 extends Frame implements ActionListener,TextListener
{
    Button b1;
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Ti4()
    {
        setResizable(false);
        setLayout(null);
        setBackground(Color.black);
        b1=new Button("Exit");
        l8=new Label("         Enter the value in Day box");
        l1=new Label("       Year");
        l2=new Label("       Month");
        l3=new Label("       Week");
        l4=new Label("        Day");
        l5=new Label("       Hour");
        l6=new Label("      Minute");
        l7=new Label("     Second");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        t4=new TextField(20);
        t5=new TextField(20);
        t6=new TextField(20);
        t7=new TextField(20);
        b1.setBounds(110,680,80,40);
        b1.setBackground(Color.red);
        l1.setBounds(175,100,80,40);
        l2.setBounds(175,180,80,40);
        l3.setBounds(175,260,80,40);
        l4.setBounds(175,340,80,40);
        l5.setBounds(175,420,80,40);
        l6.setBounds(175,500,80,40);
        l7.setBounds(175,580,80,40);
        l8.setBounds(45,30,210,40);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        l5.setForeground(Color.black);
        l6.setForeground(Color.black);
        l7.setForeground(Color.black);
        l8.setForeground(Color.black);
        l1.setBackground(Color.blue);
        l2.setBackground(Color.blue);
        l3.setBackground(Color.blue);
        l4.setBackground(Color.blue);
        l5.setBackground(Color.blue);
        l6.setBackground(Color.blue);
        l7.setBackground(Color.blue);
        l8.setBackground(Color.green);
        t1.setBounds(45,100,80,40);
        t2.setBounds(45,180,80,40);
        t3.setBounds(45,260,80,40);
        t4.setBounds(45,340,80,40);
        t5.setBounds(45,420,80,40);
        t6.setBounds(45,500,80,40);
        t7.setBounds(45,580,80,40);
        t1.setBackground(Color.white);
        t2.setBackground(Color.white);
        t3.setBackground(Color.white);
        t4.setBackground(Color.white);
        t5.setBackground(Color.white);
        t6.setBackground(Color.white);
        t7.setBackground(Color.white);
        add(b1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        b1.addActionListener(this);
        t4.addTextListener(this);
        setSize(300,740);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.exit(0);
        }
    }
    public void textValueChanged(TextEvent ta)
    {
        if(ta.getSource()==t4)
        {
            double y,m,w,d,h,min,s;
            d=Double.parseDouble(t4.getText());
            y=d/365;
            m=y*12;
            w=y*52.179;
            h=y*8766;
            min=y*525960;
            s=y*31557600;
            t2.setText(Double.toString(m));
            t3.setText(Double.toString(w));
            t1.setText(Double.toString(y));
            t5.setText(Double.toString(h));
            t6.setText(Double.toString(min));
            t7.setText(Double.toString(s));
        }
    }
}
class Ti5 extends Frame implements ActionListener,TextListener
{
    Button b1;
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Ti5()
    {
        setResizable(false);
        setLayout(null);
        setBackground(Color.black);
        b1=new Button("Exit");
        l8=new Label("         Enter the value in Hour box");
        l1=new Label("       Year");
        l2=new Label("       Month");
        l3=new Label("       Week");
        l4=new Label("        Day");
        l5=new Label("       Hour");
        l6=new Label("      Minute");
        l7=new Label("     Second");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        t4=new TextField(20);
        t5=new TextField(20);
        t6=new TextField(20);
        t7=new TextField(20);
        b1.setBounds(110,680,80,40);
        b1.setBackground(Color.red);
        l1.setBounds(175,100,80,40);
        l2.setBounds(175,180,80,40);
        l3.setBounds(175,260,80,40);
        l4.setBounds(175,340,80,40);
        l5.setBounds(175,420,80,40);
        l6.setBounds(175,500,80,40);
        l7.setBounds(175,580,80,40);
        l8.setBounds(45,30,210,40);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        l5.setForeground(Color.black);
        l6.setForeground(Color.black);
        l7.setForeground(Color.black);
        l8.setForeground(Color.black);
        l1.setBackground(Color.blue);
        l2.setBackground(Color.blue);
        l3.setBackground(Color.blue);
        l4.setBackground(Color.blue);
        l5.setBackground(Color.blue);
        l6.setBackground(Color.blue);
        l7.setBackground(Color.blue);
        l8.setBackground(Color.green);
        t1.setBounds(45,100,80,40);
        t2.setBounds(45,180,80,40);
        t3.setBounds(45,260,80,40);
        t4.setBounds(45,340,80,40);
        t5.setBounds(45,420,80,40);
        t6.setBounds(45,500,80,40);
        t7.setBounds(45,580,80,40);
        t1.setBackground(Color.white);
        t2.setBackground(Color.white);
        t3.setBackground(Color.white);
        t4.setBackground(Color.white);
        t5.setBackground(Color.white);
        t6.setBackground(Color.white);
        t7.setBackground(Color.white);
        add(b1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        b1.addActionListener(this);
        t5.addTextListener(this);
        setSize(300,740);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.exit(0);
        }
    }
    public void textValueChanged(TextEvent ta)
    {
        if(ta.getSource()==t5)
        {
            double y,m,w,d,h,min,s;
            h=Double.parseDouble(t5.getText());
            y=h/8766;
            m=y*12;
            w=y*52.179;
            d=y*365;
            min=y*525960;
            s=y*31557600;
            t2.setText(Double.toString(m));
            t3.setText(Double.toString(w));
            t4.setText(Double.toString(d));
            t1.setText(Double.toString(y));
            t6.setText(Double.toString(min));
            t7.setText(Double.toString(s));
        }
    }
}
class Ti6 extends Frame implements ActionListener,TextListener
{
    Button b1;
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Ti6()
    {
        setResizable(false);
        setLayout(null);
        setBackground(Color.black);
        b1=new Button("Exit");
        l8=new Label("         Enter the value in Minute box");
        l1=new Label("       Year");
        l2=new Label("       Month");
        l3=new Label("       Week");
        l4=new Label("        Day");
        l5=new Label("       Hour");
        l6=new Label("      Minute");
        l7=new Label("     Second");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        t4=new TextField(20);
        t5=new TextField(20);
        t6=new TextField(20);
        t7=new TextField(20);
        b1.setBounds(110,680,80,40);
        b1.setBackground(Color.red);
        l1.setBounds(175,100,80,40);
        l2.setBounds(175,180,80,40);
        l3.setBounds(175,260,80,40);
        l4.setBounds(175,340,80,40);
        l5.setBounds(175,420,80,40);
        l6.setBounds(175,500,80,40);
        l7.setBounds(175,580,80,40);
        l8.setBounds(45,30,210,40);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        l5.setForeground(Color.black);
        l6.setForeground(Color.black);
        l7.setForeground(Color.black);
        l8.setForeground(Color.black);
        l1.setBackground(Color.blue);
        l2.setBackground(Color.blue);
        l3.setBackground(Color.blue);
        l4.setBackground(Color.blue);
        l5.setBackground(Color.blue);
        l6.setBackground(Color.blue);
        l7.setBackground(Color.blue);
        l8.setBackground(Color.green);
        t1.setBounds(45,100,80,40);
        t2.setBounds(45,180,80,40);
        t3.setBounds(45,260,80,40);
        t4.setBounds(45,340,80,40);
        t5.setBounds(45,420,80,40);
        t6.setBounds(45,500,80,40);
        t7.setBounds(45,580,80,40);
        t1.setBackground(Color.white);
        t2.setBackground(Color.white);
        t3.setBackground(Color.white);
        t4.setBackground(Color.white);
        t5.setBackground(Color.white);
        t6.setBackground(Color.white);
        t7.setBackground(Color.white);
        add(b1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        b1.addActionListener(this);
        t6.addTextListener(this);
        setSize(300,740);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.exit(0);
        }
    }
    public void textValueChanged(TextEvent ta)
    {
        if(ta.getSource()==t6)
        {
            double y,m,w,d,h,min,s;
            min=Double.parseDouble(t6.getText());
            y=min/525960;
            m=y*12;
            w=y*52.179;
            d=y*365;
            h=y*8766;
            s=y*31557600;
            t2.setText(Double.toString(m));
            t3.setText(Double.toString(w));
            t4.setText(Double.toString(d));
            t5.setText(Double.toString(h));
            t1.setText(Double.toString(y));
            t7.setText(Double.toString(s));
        }
    }
}
class Ti7 extends Frame implements ActionListener,TextListener
{
    Button b1;
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Ti7()
    {
        setResizable(false);
        setLayout(null);
        setBackground(Color.black);
        b1=new Button("Exit");
        l8=new Label("         Enter the value in Second box");
        l1=new Label("       Year");
        l2=new Label("       Month");
        l3=new Label("       Week");
        l4=new Label("        Day");
        l5=new Label("       Hour");
        l6=new Label("      Minute");
        l7=new Label("     Second");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        t4=new TextField(20);
        t5=new TextField(20);
        t6=new TextField(20);
        t7=new TextField(20);
        b1.setBounds(110,680,80,40);
        b1.setBackground(Color.red);
        l1.setBounds(175,100,80,40);
        l2.setBounds(175,180,80,40);
        l3.setBounds(175,260,80,40);
        l4.setBounds(175,340,80,40);
        l5.setBounds(175,420,80,40);
        l6.setBounds(175,500,80,40);
        l7.setBounds(175,580,80,40);
        l8.setBounds(45,30,210,40);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        l5.setForeground(Color.black);
        l6.setForeground(Color.black);
        l7.setForeground(Color.black);
        l8.setForeground(Color.black);
        l1.setBackground(Color.blue);
        l2.setBackground(Color.blue);
        l3.setBackground(Color.blue);
        l4.setBackground(Color.blue);
        l5.setBackground(Color.blue);
        l6.setBackground(Color.blue);
        l7.setBackground(Color.blue);
        l8.setBackground(Color.green);
        t1.setBounds(45,100,80,40);
        t2.setBounds(45,180,80,40);
        t3.setBounds(45,260,80,40);
        t4.setBounds(45,340,80,40);
        t5.setBounds(45,420,80,40);
        t6.setBounds(45,500,80,40);
        t7.setBounds(45,580,80,40);
        t1.setBackground(Color.white);
        t2.setBackground(Color.white);
        t3.setBackground(Color.white);
        t4.setBackground(Color.white);
        t5.setBackground(Color.white);
        t6.setBackground(Color.white);
        t7.setBackground(Color.white);
        add(b1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        b1.addActionListener(this);
        t7.addTextListener(this);
        setSize(300,740);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.exit(0);
        }
    }
    public void textValueChanged(TextEvent ta)
    {
        if(ta.getSource()==t7)
        {
            double y,m,w,d,h,min,s;
            s=Double.parseDouble(t7.getText());
            y=s/31557600;
            m=y/12;
            w=y*52;
            d=y*365;
            h=y*8766;
            min=y*525960;
            t2.setText(Double.toString(m));
            t3.setText(Double.toString(w));
            t4.setText(Double.toString(d));
            t5.setText(Double.toString(h));
            t6.setText(Double.toString(min));
            t1.setText(Double.toString(y));
        }
    }
}
class tim extends Frame implements ActionListener
{
    Button b13,b14,b15,b16,b17,b18,b19,b20;
    Label l1,l2;
    tim()
    {
        setResizable(false);
        setLayout(null);
        setBackground(Color.black);
        l1=new Label("        Time Conversion");
        l1.setBounds(75,30,150,40);
        l1.setForeground(Color.white);
        l1.setBackground(Color.blue);
        l2=new Label("Click on Button in which you Enter the value");
        l2.setBounds(30,100,240,40);
        l2.setForeground(Color.white);
        b13=new Button("Year");
        b14=new Button("Month");
        b15=new Button("Week");
        b16=new Button("Day");
        b17=new Button("Hour");
        b18=new Button("Minute");
        b19=new Button("Second");
        b20=new Button("Exit");
        b13.setBounds(110,170,80,40);
        b14.setBounds(110,240,80,40);
        b15.setBounds(110,310,80,40);
        b16.setBounds(110,380,80,40);
        b17.setBounds(110,450,80,40);
        b18.setBounds(110,520,80,40);
        b19.setBounds(110,590,80,40);
        b20.setBounds(100,670,100,40);
        b13.setBackground(Color.green);
        b14.setBackground(Color.green);
        b15.setBackground(Color.green);
        b16.setBackground(Color.green);
        b17.setBackground(Color.green);
        b18.setBackground(Color.green);
        b19.setBackground(Color.green);
        b20.setBackground(Color.red);
        add(l1);
        add(l2);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(b17);
        add(b18);
        add(b19);
        add(b20);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        setSize(300,740);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent tm)
    {
        String str=tm.getActionCommand();
        if(str.equals("Year"))
        {
            Ti1 t=new Ti1();
        }
        if(str.equals("Month"))
        {
            Ti2 t=new Ti2();
        }
        if(str.equals("Week"))
        {
            Ti3 t=new Ti3();
        }
        if(str.equals("Day"))
        {
            Ti4 t=new Ti4();
        }
        if(str.equals("Hour"))
        {
            Ti5 t=new Ti5();
        }
        if(str.equals("Minute"))
        {
            Ti6 t=new Ti6();
        }
        if(str.equals("Second"))
        {
            Ti7 t=new Ti7();
        } 
        if(tm.getSource()==b20)
        {
            System.exit(0);
        }
    }
}
class age extends Frame implements ActionListener, TextListener
{
    Label l1,l2,l3,l4;
    TextField t2,t3,t4;
    Button b1,b2,b3,b4;
    age()
    {
        setLayout(null);
        setBackground(Color.black);
        l1=new Label("              Calculate Your Age");
        l1.setBounds(100,50,200,40);
        l1.setForeground(Color.white);
        l1.setBackground(Color.blue);
        add(l1);
        l2 =new Label("CURRENT DATE");
        l2.setBounds(50,150,100,50);
        l2.setForeground(Color.white);
        add(l2);
        t2=new TextField();
        t2.setBounds(250,150,100,50);
        //t2.setBackground(Color.white);
        add(t2);
        l3=new Label("DATE OF BIRTH");
        l3.setBounds(50,250,100,50);
        l3.setForeground(Color.white);
        add(l3);
        t3=new TextField();
        t3.setBounds(250,250,100,50);
        add(t3);
        b1 = new Button("SUBMIT");
        b1.setBounds(100,350,100,50);
        b1.setBackground(Color.green);
        add(b1); 
        l4=new Label("Your Age is");
        l4.setBounds(50,450,100,50);
        l4.setForeground(Color.white);
        add(l4);
        t4=new TextField();
        t4.setBounds(200,450,100,50);
        add(t4);
        b2=new Button("MENU");
        b2.setBounds(50,550,100,50);
        b2.setBackground(Color.pink);
        add(b2);
        b3=new Button("CLEAR");
        b3.setBounds(150,550,100,50);
        b3.setBackground(Color.red);
        add(b3);
        b4=new Button("EXIT");
        b4.setBounds(250,550,100,50);
        b4.setBackground(Color.blue);
        add(b4);

        setSize(400,650);
        setVisible(true);
        b4.addActionListener(this);
        t3.addTextListener(this);
        

    }
    public void actionPerformed(ActionEvent ev)
{
    if(ev.getSource()==b4)
    {
        System.exit(0);
    }
}


public void textValueChanged(TextEvent ab)
{
    
        if(ab.getSource()==t3)
    {
        int base,j;
        base=Integer.parseInt(t3.getText());
        j=(2023-base);
        t4.setText(Integer.toString(j));

}
}
}

class Utility_convertor
{
    public static void main(String args[])
    {
        chk_Main1 m=new chk_Main1();
    }
}