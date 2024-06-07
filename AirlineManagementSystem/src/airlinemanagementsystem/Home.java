package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    public Home() {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1560, 790);
        add(image);
        
        //JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
        //heading.setBounds(450, 50, 1000, 50);
        //heading.setForeground(Color.BLACK);
        //heading.setFont(new Font("Tahoma", Font.BOLD, 45));
        //image.add(heading);
        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        
        JMenu details = new JMenu("DETAILS");
        menubar.add(details);
        
        JMenuItem flightDetails = new JMenuItem("FLIGHT DETAILS");
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
        JMenuItem customerDetails = new JMenuItem("ADD CUSTOMER DETAILS");
        customerDetails.addActionListener(this);
        details.add(customerDetails);
        
        JMenuItem bookFlight = new JMenuItem("BOOK FLIGHT");
        bookFlight.addActionListener(this);
        details.add(bookFlight);
        
        JMenuItem journeyDetails = new JMenuItem("JOURNEY DETAILS");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenuItem("CANCEL TICKET");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);
        
        JMenu ticket = new JMenu("TICKET");
        menubar.add(ticket);
        
        JMenuItem boardingPass = new JMenuItem("BOARDING PASS");
        boardingPass.addActionListener(this);
        ticket.add(boardingPass);
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();
        
        if (text.equals("ADD CUSTOMER DETAILS")) 
        {
            new AddCustomer();
        }
        else if (text.equals("FLIGHT DETAILS")) 
        {
            new FlightInfo();
        }
        else if (text.equals("BOOK FLIGHT")) 
        {
            new BookFlight();
        }
        else if (text.equals("JOURNEY DETAILS")) 
        {
            new JourneyDetails();
        }
        else if (text.equals("CANCEL TICKET")) 
        {
            new Cancel();
        }
        else if(text.equals("BOARDING PASS"))
        {
            new BoardingPass();
        }
    }
    
    public static void main(String[] args) {
        new Home();
    }
}
