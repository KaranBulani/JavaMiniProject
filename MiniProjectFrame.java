import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class MiniProjectFrame extends Frame implements ActionListener
{
 Button b1,b2,b3,b4,b5;
 City1 frm1;
 City2 frm2;
 City3 frm3;
 City4 frm4;
 City5 frm5;
 MiniProjectFrame()
 {
 b1=new Button("DARJEELING");
 b2=new Button("Varanasi");
 b3=new Button("ANDAMAN AND NICOBAR ISLANDS");
 b4=new Button("JODHPUR");
 b5=new Button("LADAKH");
 setLayout(null);
 b1.setBounds(130,40,100,30);
 b2.setBounds(130,80,100,30);
 b3.setBounds(105,120,200,30);
 b4.setBounds(130,160,100,30);
 b5.setBounds(130,200,100,30);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 add(b5);
 setSize(400,400);
 setVisible(true);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
   {
    case "DARJEELING":  setVisible(false);
                 frm1=new City1();break;
    case "Varanasi": setVisible(false);
				 frm2=new City2();break;
    case "ANDAMAN AND NICOBAR ISLANDS": setVisible(false);
				 frm3=new City3();break;
    case "JODHPUR": setVisible(false);
				 frm4=new City4();break;
    case "LADAKH": setVisible(false);
				frm5=new City5();break;
    }

 }

 public static void main(String args[])
 {
 MiniProjectFrame frm;
 frm=new MiniProjectFrame();
 }
}
class City1 extends Frame implements ActionListener
{
Button b1,b2,b3,b4;
Itenary1 frm1;
HotelList1 frm2;
Booking1 frm3;
Back1 frm4;
City1()
{

 b1=new Button("Itenary");
 b2=new Button("Hotel List");
 b3=new Button("Booking");
 b4=new Button("Back");
 setLayout(null);
 b1.setBounds(130,40,100,30);
 b2.setBounds(130,80,100,30);
 b3.setBounds(130,120,100,30);
 b4.setBounds(130,160,100,30);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 setSize(400,400);
 setVisible(true);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "Itenary":setVisible(false);frm1=new Itenary1();break;
   case "Hotel List":setVisible(false);frm2=new HotelList1();break;
   case "Booking":setVisible(false);frm3=new Booking1();break;
   case "Back":setVisible(false);Back1 frm=new Back1();break;

  }
 }
}
class Itenary1 extends Frame implements ActionListener
{
 City1 frm1;
 Label l1,l2,l3,l4;
 Button b1;
 Itenary1()
 {

  l1=new Label("Day1 Check-in");
  l2=new Label("Day2 local sight seeing");
  l3=new Label("Day3 Excursion to Mirik");
  l4=new Label("Day4 Departure Darjeeling to Siliguri");
  b1=new Button("OK");
  setLayout(null);

  l1.setBounds(130,40,100,30);
  l2.setBounds(130,80,100,30);
  l3.setBounds(130,120,100,30);
  l4.setBounds(130,160,100,30);
  b1.setBounds(200,240,30,40);
  add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(b1);

  setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);

 }
 public void actionPerformed(ActionEvent ae)
 {
 String str = ae.getActionCommand();
 switch(str)
  {
   case "OK":setVisible(false);
             frm1=new City1();
             break;

  }

 }

}
class HotelList1 extends Frame implements ActionListener
{
 City1 frm1;
 Label l1,l2,l3,l4;
 Button b1;
 HotelList1()
 {
  l1=new Label("Day1: a1 hotel");
  l2=new Label("Day2: a1 hotel");
  l3=new Label("Day3: a1 hotel");
  l4=new Label("Day4: a1 hotel");
  b1=new Button("OK");
  setLayout(null);
  l1.setBounds(130,40,100,30);
  l2.setBounds(130,80,100,30);
  l3.setBounds(130,120,100,30);
  l4.setBounds(130,160,100,30);
  b1.setBounds(200,240,30,40);
  add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(b1);
  setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "OK":setVisible(false);
             frm1=new City1();
             break;

  }
 }
 public void windowClosing(WindowEvent ae)
 {
     // Terminate the program after the close button is clicked.
     System.exit(0);
 }
}

class Booking1 extends Frame implements ActionListener
{
 Star3 frm3;
  Star4 frm4;

 Button b1,b2,b3,b4;
 TextField t1,t2;
 Label l1,l2,l3,l4;
 Booking1()
 {

  l1=new Label("Select the type of Hotel");

  b1=new Button("3 Star");
  b2=new Button("4 Star");
  setLayout(null);
  l1.setBounds(100,30,180,30);
  b1.setBounds(20,70,50,30);
  b2.setBounds(90,70,50,30);

  add(l1);
  add(b1);
  add(b2);setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);
  b2.addActionListener(this);
 }
  public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "3 Star":setVisible(false);
                 frm3=new Star3();

                break;


  case "4 Star":setVisible(false);
                 frm4=new Star4();break;



  }
 }
}
class Star3 extends Frame implements ActionListener
 {
 Button b4;
 TextField t1,t2;
 Label l2,l3,l4;

 Star3()
  {
  l2=new Label("Enter the number of adults");
  l3=new Label("Enter the number of children");

  t1=new TextField();
  t2=new TextField();
  b4=new Button("Calculate");
   setLayout(null);
  l2.setBounds(30,60,150,40);
  t1.setBounds(230,60,50,40);
  l3.setBounds(30,110,150,50);
  t2.setBounds(230,110,50,50);
  b4.setBounds(250,350,60,20);
  add(l2);add(t1);add(l3);add(t2);add(b4);
  setSize(400,400);
  setVisible(true);
  b4.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {double intial3=450;
 double exta3=150;
 double extc3=75;
 double amount;
 int c,a;int flaga=0;int flagc=0;
   String str = ae.getActionCommand();
    switch(str)
    {
    case "Calculate":
        a = Integer.parseInt(t1.getText()) ;
                 c = Integer.parseInt(t2.getText()) ;

                 if(a>3)
                flaga=1;
                if(c>4)
                flagc=1;
                amount=intial3+((a-3)*exta3*flaga)+((c-4)*extc3*flagc);
                l4=new Label("The selected hotel is a 3 star hotel.You have to pay "+amount+"$");
                l4.setBounds(20,200,350,30);
                add(l4);
   }

  }
 }
class Star4 extends Frame implements ActionListener
 {
 Button b4;
 TextField t1,t2;
 Label l2,l3,l4;

 Star4()
  {
  l2=new Label("Enter the number of adults");
  l3=new Label("Enter the number of children");

  t1=new TextField();
  t2=new TextField();
  b4=new Button("Calculate");
   setLayout(null);
  l2.setBounds(30,60,150,40);
  t1.setBounds(230,60,50,40);
  l3.setBounds(30,110,150,50);
  t2.setBounds(230,110,50,50);
  b4.setBounds(250,350,60,20);
  add(l2);add(t1);add(l3);add(t2);add(b4);
  setSize(400,400);
  setVisible(true);
  b4.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
 double intial4=600;
 double exta4=300;
 double extc4=125;
 double amount;
 int c,a;int flaga=0;int flagc=0;
   String str = ae.getActionCommand();
    switch(str)
    {
    case "Calculate":
        a = Integer.parseInt(t1.getText()) ;
                 c = Integer.parseInt(t2.getText()) ;

                 if(a>3)
                flaga=1;
                if(c>4)
                flagc=1;
                amount=intial4+((a-3)*exta4*flaga)+((c-4)*extc4*flagc);
                l4=new Label("The selected hotel is a 3 star hotel.You have to pay "+amount+"$");
                l4.setBounds(20,200,350,30);
                add(l4);
   }

  }
 }
class Back1
{
 Back1()
 {
  MiniProjectFrame frm=new MiniProjectFrame();
 }
}
class City2 extends Frame implements ActionListener
{
Button b1,b2,b3,b4;
Itenary2 frm1;
HotelList2 frm2;
Booking2 frm3;
Back2 frm4;
City2()
{

 b1=new Button("Itenary");
 b2=new Button("Hotel List");
 b3=new Button("Booking");
 b4=new Button("Back");
 setLayout(null);
 b1.setBounds(130,40,100,30);
 b2.setBounds(130,80,100,30);
 b3.setBounds(130,120,100,30);
 b4.setBounds(130,160,100,30);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 setSize(400,400);
 setVisible(true);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "Itenary":setVisible(false);frm1=new Itenary2();break;
   case "Hotel List":setVisible(false);frm2=new HotelList2();break;
   case "Booking":setVisible(false);frm3=new Booking2();break;
   case "Back":setVisible(false);Back2 frm=new Back2();break;

  }
 }
}
class Itenary2 extends Frame implements ActionListener
{
 City2 frm1;
 Label l1,l2;
 Button b1;
 Itenary2()
 {

  l1=new Label("Day1 visiting famous ghats");
  l2=new Label("Day2 visiting famous temples");
  b1=new Button("OK");
  setLayout(null);

  l1.setBounds(130,40,200,30);
  l2.setBounds(130,80,200,30);
  b1.setBounds(200,240,30,40);
  add(l1);
  add(l2);
  add(b1);

  setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);

 }
 public void actionPerformed(ActionEvent ae)
 {
 String str = ae.getActionCommand();
 switch(str)
  {
   case "OK":setVisible(false);
             frm1=new City2();
             break;

  }

 }

}
class HotelList2 extends Frame implements ActionListener
{
 City2 frm1;
 Label l1,l2;
 Button b1;
 HotelList2()
 {
  l1=new Label("Day1 Awesome Hotels");
  l2=new Label("Day2 Awesome Hotels");
  b1=new Button("OK");
  setLayout(null);
  l1.setBounds(130,40,150,30);
  l2.setBounds(130,80,150,30);
  b1.setBounds(200,240,30,40);
  add(l1);
  add(l2);
  add(b1);
  setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "OK":setVisible(false);
             frm1=new City2();
             break;

  }
 }
 public void windowClosing(WindowEvent ae)
 {
     // Terminate the program after the close button is clicked.
     System.exit(0);
 }
}

class Booking2 extends Frame implements ActionListener
{
 Star3 frm3;
  Star4 frm4;

 Button b1,b2,b3,b4;
 TextField t1,t2;
 Label l1,l2,l3,l4;
 Booking2()
 {

  l1=new Label("Select the type of Hotel");

  b1=new Button("3 Star");
  b2=new Button("4 Star");
  setLayout(null);
  l1.setBounds(100,30,180,30);
  b1.setBounds(20,70,50,30);
  b2.setBounds(90,70,50,30);

  add(l1);
  add(b1);
  add(b2);setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);
  b2.addActionListener(this);
 }
  public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "3 Star":setVisible(false);
                 frm3=new Star3();

                break;


  case "4 Star":setVisible(false);
                 frm4=new Star4();break;



  }
 }
}
class Back2
{
 Back2()
 {
  MiniProjectFrame frm=new MiniProjectFrame();
 }
}
class City3 extends Frame implements ActionListener
{
Button b1,b2,b3,b4;
Itenary3 frm1;
HotelList3 frm2;
Booking3 frm3;
Back3 frm4;
City3()
{

 b1=new Button("Itenary");
 b2=new Button("Hotel List");
 b3=new Button("Booking");
 b4=new Button("Back");
 setLayout(null);
 b1.setBounds(130,40,100,30);
 b2.setBounds(130,80,100,30);
 b3.setBounds(130,120,100,30);
 b4.setBounds(130,160,100,30);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 setSize(400,400);
 setVisible(true);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "Itenary":setVisible(false);frm1=new Itenary3();break;
   case "Hotel List":setVisible(false);frm2=new HotelList3();break;
   case "Booking":setVisible(false);frm3=new Booking3();break;
   case "Back":setVisible(false);Back3 frm=new Back3();break;

  }
 }
}
class Itenary3 extends Frame implements ActionListener
{
 City3 frm1;
 Label l1,l2,l3,l4,l5;
 Button b1;
 Itenary3()
 {

  l1=new Label("Day: 01 Portblair");
  l2=new Label("Day 02: Portblair- Havelock");
  l3=new Label("Day 03: Havelock");
  l4=new Label("Day 04: Havelock to Portblair");
  l5=new Label("Day 05:Portblair-Three island cruise");
  b1=new Button("OK");
  setLayout(null);

  l1.setBounds(130,40,150,30);
  l2.setBounds(130,80,150,30);
  l3.setBounds(130,120,150,30);
  l4.setBounds(130,160,150,30);
  l5.setBounds(130,200,150,30);
  b1.setBounds(200,280,30,40);
  add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(l5);
  add(b1);

  setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);

 }
 public void actionPerformed(ActionEvent ae)
 {
 String str = ae.getActionCommand();
 switch(str)
  {
   case "OK":setVisible(false);
             frm1=new City3();
             break;

  }

 }

}
class HotelList3 extends Frame implements ActionListener
{
 City3 frm1;
 Label l1,l2,l3,l4,l5;
 Button b1;
 HotelList3()
 {
  l1=new Label("Day1 hotel a1");
  l2=new Label("Day2 hotel a1");
  l3=new Label("Day3 hotel a2");
  l4=new Label("Day4 hotel a2");
  l5=new Label("Day5 leaving");
  b1=new Button("OK");
  setLayout(null);
  l1.setBounds(130,40,100,30);
  l2.setBounds(130,80,100,30);
  l3.setBounds(130,120,100,30);
  l4.setBounds(130,160,100,30);
  l5.setBounds(130,200,100,30);
  b1.setBounds(200,260,30,40);
  add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(l5);
  add(b1);
  setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "OK":setVisible(false);
             frm1=new City3();
             break;

  }
 }
 public void windowClosing(WindowEvent ae)
 {
     // Terminate the program after the close button is clicked.
     System.exit(0);
 }
}
class Booking3 extends Frame implements ActionListener
{
 Star3 frm3;
  Star4 frm4;

 Button b1,b2,b3,b4;
 TextField t1,t2;
 Label l1,l2,l3,l4;
 Booking3()
 {

  l1=new Label("Select the type of Hotel");

  b1=new Button("3 Star");
  b2=new Button("4 Star");
  setLayout(null);
  l1.setBounds(100,30,180,30);
  b1.setBounds(20,70,50,30);
  b2.setBounds(90,70,50,30);

  add(l1);
  add(b1);
  add(b2);setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);
  b2.addActionListener(this);
 }
  public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "3 Star":setVisible(false);
                 frm3=new Star3();

                break;


  case "4 Star":setVisible(false);
                 frm4=new Star4();break;



  }
 }
}
class Back3
{
 Back3()
 {
  MiniProjectFrame frm=new MiniProjectFrame();
 }
}
class City4 extends Frame implements ActionListener
{
Button b1,b2,b3,b4;
Itenary4 frm1;
HotelList4 frm2;
Booking4 frm3;
Back4 frm4;
City4()
{

 b1=new Button("Itenary");
 b2=new Button("Hotel List");
 b3=new Button("Booking");
 b4=new Button("Back");
 setLayout(null);
 b1.setBounds(130,40,100,30);
 b2.setBounds(130,80,100,30);
 b3.setBounds(130,120,100,30);
 b4.setBounds(130,160,100,30);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 setSize(400,400);
 setVisible(true);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "Itenary":setVisible(false);frm1=new Itenary4();break;
   case "Hotel List":setVisible(false);frm2=new HotelList4();break;
   case "Booking":setVisible(false);frm3=new Booking4();break;
   case "Back":setVisible(false);Back4 frm=new Back4();break;

  }
 }
}
class Itenary4 extends Frame implements ActionListener
{
 City4 frm1;
 Label l1,l2,l3,l4;
 Button b1;
 Itenary4()
 {

  l1=new Label("Day 01: Jaipur Jodhpur");
  l2=new Label("Day 02: Jodhpur");
  l3=new Label("Day 03: Jodhpur Jaipur");
  l4=new Label("Day4 departure");
  b1=new Button("OK");
  setLayout(null);

  l1.setBounds(130,40,150,30);
  l2.setBounds(130,80,150,30);
  l3.setBounds(130,120,150,30);
  l4.setBounds(130,160,150,30);
  b1.setBounds(200,240,30,40);
  add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(b1);

  setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);

 }
 public void actionPerformed(ActionEvent ae)
 {
 String str = ae.getActionCommand();
 switch(str)
  {
   case "OK":setVisible(false);
             frm1=new City4();
             break;

  }

 }

}
class HotelList4 extends Frame implements ActionListener
{
 City4 frm1;
 Label l1,l2,l3,l4;
 Button b1;
 HotelList4()
 {
  l1=new Label("Day1 hotel karan");
  l2=new Label("Day2 travelling");
  l3=new Label("Day3 hotel sachin");
  l4=new Label("Day4 your home");
  b1=new Button("OK");
  setLayout(null);
  l1.setBounds(130,40,150,30);
  l2.setBounds(130,80,150,30);
  l3.setBounds(130,120,150,30);
  l4.setBounds(130,160,150,30);
  b1.setBounds(200,240,30,40);
  add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(b1);
  setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "OK":setVisible(false);
             frm1=new City4();
             break;

  }
 }
 public void windowClosing(WindowEvent ae)
 {
     // Terminate the program after the close button is clicked.
     System.exit(0);
 }
}
class Booking4 extends Frame implements ActionListener
{
 Star3 frm3;
  Star4 frm4;

 Button b1,b2,b3,b4;
 TextField t1,t2;
 Label l1,l2,l3,l4;
 Booking4()
 {

  l1=new Label("Select the type of Hotel");

  b1=new Button("3 Star");
  b2=new Button("4 Star");
  setLayout(null);
  l1.setBounds(100,30,180,30);
  b1.setBounds(20,70,50,30);
  b2.setBounds(90,70,50,30);

  add(l1);
  add(b1);
  add(b2);setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);
  b2.addActionListener(this);
 }
  public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "3 Star":setVisible(false);
                 frm3=new Star3();

                break;


  case "4 Star":setVisible(false);
                 frm4=new Star4();break;



  }
 }
}
class Back4
{
 Back4()
 {
  MiniProjectFrame frm=new MiniProjectFrame();
 }
}
class City5 extends Frame implements ActionListener
{
Button b1,b2,b3,b4;
Itenary5 frm1;
HotelList5 frm2;
Booking5 frm3;
Back5 frm4;
City5()
{

 b1=new Button("Itenary");
 b2=new Button("Hotel List");
 b3=new Button("Booking");
 b4=new Button("Back");
 setLayout(null);
 b1.setBounds(130,40,100,30);
 b2.setBounds(130,80,100,30);
 b3.setBounds(130,120,100,30);
 b4.setBounds(130,160,100,30);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 setSize(400,400);
 setVisible(true);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "Itenary":setVisible(false);frm1=new Itenary5();break;
   case "Hotel List":setVisible(false);frm2=new HotelList5();break;
   case "Booking":setVisible(false);frm3=new Booking5();break;
   case "Back":setVisible(false);Back5 frm=new Back5();break;

  }
 }
}
class Itenary5 extends Frame implements ActionListener
{
 City5 frm1;
 Label l1,l2,l3,l4,l5,l6;
 Button b1;
 Itenary5()
 {

  l1=new Label("Day1 visiting stupas");
  l2=new Label("Day2 sight seeing of khardung la");
  l3=new Label("Day3 drive towards leh");
  l4=new Label("Day4 Pangong Tso.");
  l5=new Label("DAY 5 Back to leh");
  l6=new Label("DAY 6 tso moriri");
  b1=new Button("OK");
  setLayout(null);

  l1.setBounds(130,40,200,30);
  l2.setBounds(130,80,200,30);
  l3.setBounds(130,120,200,30);
  l4.setBounds(130,160,200,30);
  l5.setBounds(130,200,200,30);
  l6.setBounds(130,240,200,30);
  b1.setBounds(200,320,30,40);
  add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(l5);
  add(l6);
  add(b1);

  setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);

 }
 public void actionPerformed(ActionEvent ae)
 {
 String str = ae.getActionCommand();
 switch(str)
  {
   case "OK":setVisible(false);
             frm1=new City5();
             break;

  }

 }

}
class HotelList5 extends Frame implements ActionListener
{
 City5 frm1;
 Label l1,l2,l3,l4,l5,l6;
 Button b1;
 HotelList5()
 {
  l1=new Label("Day1 famous hotel");
  l2=new Label("Day2 famous hotel");
  l3=new Label("Day3 travelling");
  l4=new Label("Day4 camp");
  l5=new Label("Day5 famous hotel");
  l6=new Label("Day6 not so famous hotel");
  b1=new Button("OK");
  setLayout(null);
  l1.setBounds(130,40,200,30);
  l2.setBounds(130,80,200,30);
  l3.setBounds(130,120,200,30);
  l4.setBounds(130,160,200,30);
  l5.setBounds(130,200,200,30);
  l6.setBounds(130,240,200,30);
  b1.setBounds(200,320,30,40);
  add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(l5);
  add(l6);
  add(b1);
  setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "OK":setVisible(false);
             frm1=new City5();
             break;

  }
 }
 public void windowClosing(WindowEvent ae)
 {
     // Terminate the program after the close button is clicked.
     System.exit(0);
 }
}
class Booking5 extends Frame implements ActionListener
{
 Star3 frm3;
  Star4 frm4;

 Button b1,b2,b3,b4;
 TextField t1,t2;
 Label l1,l2,l3,l4;
 Booking5()
 {

  l1=new Label("Select the type of Hotel");

  b1=new Button("3 Star");
  b2=new Button("4 Star");
  setLayout(null);
  l1.setBounds(100,30,180,30);
  b1.setBounds(20,70,50,30);
  b2.setBounds(90,70,50,30);

  add(l1);
  add(b1);
  add(b2);setSize(400,400);
  setVisible(true);
  b1.addActionListener(this);
  b2.addActionListener(this);
 }
  public void actionPerformed(ActionEvent ae)
 {
  String str = ae.getActionCommand();
  switch(str)
  {
   case "3 Star":setVisible(false);
                 frm3=new Star3();

                break;


  case "4 Star":setVisible(false);
                 frm4=new Star4();break;



  }
 }
}
class Back5
{
 Back5()
 {
  MiniProjectFrame frm=new MiniProjectFrame();
 }
}
