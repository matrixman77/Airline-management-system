import javax.swing.JOptionPane;

/**
 *
 * @author Caleb
 */
public class PassengerMenu extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PassengerMenu.class.getName());

    private PassengerManagment passengerManager = new PassengerManagment();
    private AirlineManagement airlineMgmt = new AirlineManagement();
    private ScheduleManagement scheduleMgmt = new ScheduleManagement();
    private TicketManagement ticketMgmt = new TicketManagement();

    /**
     * Creates new form PassengerMenu
     */
    public PassengerMenu() {
        initComponents();
        setLocationRelativeTo(null);
        loadDummyData();
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

        txtOutput.setText("Passenger added successfully.\n\n" + passenger.toString());
    }

    private void btnViewPassengersActionPerformed(java.awt.event.ActionEvent evt) {
        txtOutput.setText("");

        Passenger p1 = passengerManager.searchPassengerById(101);
        Passenger p2 = passengerManager.searchPassengerById(102);
        Passenger p3 = passengerManager.searchPassengerById(103);

        if (p1 == null && p2 == null && p3 == null) {
            txtOutput.setText("No passengers found.");
            return;
        }

        txtOutput.append("PASSENGER LIST\n\n");

        if (p1 != null) {
            txtOutput.append(p1.toString() + "\n-------------------------\n");
        }
        if (p2 != null) {
            txtOutput.append(p2.toString() + "\n-------------------------\n");
        }
        if (p3 != null) {
            txtOutput.append(p3.toString() + "\n-------------------------\n");
        }
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
        new BookingMenu().setVisible(true);
        this.dispose();
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        new MainMenu().setVisible(true);
        this.dispose();
    }

    private void loadDummyData() {
        passengerManager.loadDummyPassengers();

        airlineMgmt.addAirlineName("Eduardo Airlines");
        airlineMgmt.addTerminalNumber("T1");
        airlineMgmt.addTerminalNumber("T2");
        airlineMgmt.addFlightNumber("SW123");
        airlineMgmt.addFlightNumber("DL456");

        scheduleMgmt.updateDepartureTime((short) 900);
        scheduleMgmt.updateArrivalTime((short) 1400);
        scheduleMgmt.updateBoardingTime((short) 830);

        scheduleMgmt.updateDepartureTime((short) 1100);
        scheduleMgmt.updateArrivalTime((short) 1600);
        scheduleMgmt.updateBoardingTime((short) 1030);

        scheduleMgmt.updateDelayedFlight((short) 15);
        scheduleMgmt.updateCancelledFlight((short) 12);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new PassengerMenu().setVisible(true));
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
