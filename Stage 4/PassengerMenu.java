import javax.swing.JOptionPane;

/**
 *
 * @author Caleb
 */
public class PassengerMenu extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PassengerMenu.class.getName());

    private PassengerManagment passengerManager = new PassengerManagment();
    private AirlineManagement airlineMgmt = new AirlineManagement();
    static StaffManagment staffManager = new StaffManagment();
    private ScheduleManagement scheduleMgmt = new ScheduleManagement();
    private TicketManagement ticketMgmt = new TicketManagement(scheduleMgmt, passengerManager);

    /**
     * Creates new form PassengerMenu
     */
    public PassengerMenu(TicketManagement ticketMgmt, PassengerManagment passengerManager, ScheduleManagement scheduleMgmt, AirlineManagement airlineMgmt, StaffManagment staffManager) 
    {    
        this.ticketMgmt = ticketMgmt;
        this.passengerManager = passengerManager;
        this.scheduleMgmt = scheduleMgmt;
        this.staffManager = staffManager;
        this.airlineMgmt = airlineMgmt;
    
        initComponents();
        setLocationRelativeTo(null);

        this.passengerManager.loadPassengersFromFile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnAddPassenger = new javax.swing.JButton();
        btnViewPassengers = new javax.swing.JButton();
        btnAirlineInfo = new javax.swing.JButton();
        btnSchedule = new javax.swing.JButton();
        btnBookingMenu = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24));
        lblTitle.setText("Passenger Menu");

        btnAddPassenger.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnAddPassenger.setText("Add Passenger");
        btnAddPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPassengerActionPerformed(evt);
            }
        });

        btnViewPassengers.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnViewPassengers.setText("View Passengers");
        btnViewPassengers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPassengersActionPerformed(evt);
            }
        });

        btnAirlineInfo.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnAirlineInfo.setText("Airline Information");
        btnAirlineInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlineInfoActionPerformed(evt);
            }
        });

        btnSchedule.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnSchedule.setText("Schedule");
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        btnBookingMenu.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnBookingMenu.setText("Booking Menu");
        btnBookingMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingMenuActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        txtOutput.setEditable(false);
        jScrollPane1.setViewportView(txtOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle)
                    .addComponent(btnAddPassenger, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnViewPassengers, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnAirlineInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnBookingMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(btnAddPassenger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewPassengers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAirlineInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSchedule)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBookingMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void btnAddPassengerActionPerformed(java.awt.event.ActionEvent evt) {
        String idText = JOptionPane.showInputDialog(this, "Enter passenger ID:");
        if (idText == null) {
            return;
        }

        String firstName = JOptionPane.showInputDialog(this, "Enter first name:");
        if (firstName == null) {
            return;
        }

        String lastName = JOptionPane.showInputDialog(this, "Enter last name:");
        if (lastName == null) {
            return;
        }

        String email = JOptionPane.showInputDialog(this, "Enter email:");
        if (email == null) {
            return;
        }

        String phoneNumber = JOptionPane.showInputDialog(this, "Enter phone number:");
        if (phoneNumber == null) {
            return;
        }

        int id = Integer.parseInt(idText.trim());

        Passenger passenger = new Passenger(
                id,
                firstName.trim(),
                lastName.trim(),
                email.trim(),
                phoneNumber.trim()
        );

        passengerManager.addPassenger(passenger);
        passengerManager.loadPassengersFromFile();

        txtOutput.setText("Passenger added successfully.\n\n" + passenger.toString());
    }

    private void btnViewPassengersActionPerformed(java.awt.event.ActionEvent evt) {
        passengerManager.loadPassengersFromFile();
        txtOutput.setText("PASSENGER LIST\n\n" + passengerManager.getAllPassengersText());
    }

    private void btnAirlineInfoActionPerformed(java.awt.event.ActionEvent evt) {
        txtOutput.setText("----- AIRLINE INFORMATION -----\n\n");

        txtOutput.append("Flight Numbers:\n");
        for (String f : airlineMgmt.getFlightNumber()) {
            txtOutput.append("- " + f + "\n");
        }

        txtOutput.append("\nTerminal Numbers:\n");
        for (String t : airlineMgmt.getTerminalNumber()) {
            txtOutput.append("- " + t + "\n");
        }

        txtOutput.append("\nAirline Name:\n");
        for (String a : airlineMgmt.getAirlineName()) {
            txtOutput.append("- " + a + "\n");
        }
    }

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {
        txtOutput.setText("----- SCHEDULE -----\n\n");
        txtOutput.append("Departure Time: " + scheduleMgmt.getDepartureTime() + "\n");
        txtOutput.append("Arrival Time: " + scheduleMgmt.getArrivalTime() + "\n");
        txtOutput.append("Delayed Flights: " + scheduleMgmt.getDelayedFlight() + "\n");
        txtOutput.append("Cancelled Flights: " + scheduleMgmt.getCancelledFlight() + "\n");
        txtOutput.append("Boarding Time: " + scheduleMgmt.getBoardingTime() + "\n");
    }

    private void btnBookingMenuActionPerformed(java.awt.event.ActionEvent evt) {
        new BookingMenu(ticketMgmt, passengerManager, scheduleMgmt, airlineMgmt, staffManager).setVisible(true);
        this.setVisible(false);
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        new MainMenu(ticketMgmt, passengerManager, scheduleMgmt, airlineMgmt, staffManager).setVisible(true);
        this.setVisible(false);
    }

    // Variables declaration
    private javax.swing.JButton btnAddPassenger;
    private javax.swing.JButton btnAirlineInfo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookingMenu;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnViewPassengers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration
}
