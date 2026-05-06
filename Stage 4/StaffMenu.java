import javax.swing.JOptionPane;

/**
 *
 * @author Caleb
 */
public class StaffMenu extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StaffMenu.class.getName());

    private PassengerManagment passengerManager = new PassengerManagment();
    private StaffManagment staffManager = new StaffManagment();
    private TicketManagement ticketMgmt = new TicketManagement();
    private AirlineManagement airlineMgmt = new AirlineManagement();
    private ScheduleManagement scheduleMgmt = new ScheduleManagement();

    /**
     * Creates new form StaffMenu
     */
    public StaffMenu() {
        initComponents();
        setLocationRelativeTo(null);
        loadDummyData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnAddStaff = new javax.swing.JButton();
        btnViewStaff = new javax.swing.JButton();
        btnViewTickets = new javax.swing.JButton();
        btnDeleteTicket = new javax.swing.JButton();
        btnAirlineInfo = new javax.swing.JButton();
        btnScheduleMenu = new javax.swing.JButton();
        btnAirlineMenu = new javax.swing.JButton();
        btnSearchPassenger = new javax.swing.JButton();
        btnDeletePassenger = new javax.swing.JButton();
        btnUpdatePassenger = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24));
        lblTitle.setText("Staff Menu");

        btnAddStaff.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnAddStaff.setText("Add Staff");
        btnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffActionPerformed(evt);
            }
        });

        btnViewStaff.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnViewStaff.setText("View Staff");
        btnViewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStaffActionPerformed(evt);
            }
        });

        btnViewTickets.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnViewTickets.setText("View Passenger Tickets");
        btnViewTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTicketsActionPerformed(evt);
            }
        });

        btnDeleteTicket.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnDeleteTicket.setText("Delete Passenger Ticket");
        btnDeleteTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTicketActionPerformed(evt);
            }
        });

        btnAirlineInfo.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnAirlineInfo.setText("Airline Information");
        btnAirlineInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlineInfoActionPerformed(evt);
            }
        });

        btnScheduleMenu.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnScheduleMenu.setText("Schedule Menu");
        btnScheduleMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleMenuActionPerformed(evt);
            }
        });

        btnAirlineMenu.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnAirlineMenu.setText("Airline Menu");
        btnAirlineMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlineMenuActionPerformed(evt);
            }
        });

        btnSearchPassenger.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnSearchPassenger.setText("Search Passenger");
        btnSearchPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPassengerActionPerformed(evt);
            }
        });

        btnDeletePassenger.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnDeletePassenger.setText("Delete Passenger");
        btnDeletePassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePassengerActionPerformed(evt);
            }
        });

        btnUpdatePassenger.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnUpdatePassenger.setText("Update Passenger");
        btnUpdatePassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePassengerActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 16));
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
                    .addComponent(btnAddStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnViewStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnViewTickets, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnDeleteTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnAirlineInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnScheduleMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnAirlineMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnSearchPassenger, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnDeletePassenger, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnUpdatePassenger, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addGap(12, 12, 12)
                .addComponent(btnAddStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewTickets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteTicket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAirlineInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnScheduleMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAirlineMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchPassenger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletePassenger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdatePassenger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void btnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {
        String idText = JOptionPane.showInputDialog(this, "Enter staff ID:");
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

        String role = JOptionPane.showInputDialog(this, "Enter role:");
        if (role == null) {
            return;
        }

        String salaryText = JOptionPane.showInputDialog(this, "Enter salary:");
        if (salaryText == null) {
            return;
        }

        int id = Integer.parseInt(idText.trim());
        double salary = Double.parseDouble(salaryText.trim());

        Staff staff = new Staff(id, firstName.trim(), lastName.trim(), role.trim(), salary);
        staffManager.addStaff(staff);

        txtOutput.setText("Staff member added successfully.\n\n" + staff.toString());
    }

    private void btnViewStaffActionPerformed(java.awt.event.ActionEvent evt) {
        txtOutput.setText("");

        Staff s1 = staffManager.searchStaffById(201);
        Staff s2 = staffManager.searchStaffById(202);
        Staff s3 = staffManager.searchStaffById(203);

        if (s1 == null && s2 == null && s3 == null) {
            txtOutput.setText("No staff members found.");
            return;
        }

        txtOutput.append("STAFF LIST\n\n");

        if (s1 != null) {
            txtOutput.append(s1.toString() + "\n-------------------------\n");
        }
        if (s2 != null) {
            txtOutput.append(s2.toString() + "\n-------------------------\n");
        }
        if (s3 != null) {
            txtOutput.append(s3.toString() + "\n-------------------------\n");
        }
    }

    private void btnViewTicketsActionPerformed(java.awt.event.ActionEvent evt) {
        txtOutput.setText("LIST OF TICKETS\n\n");

        if (ticketMgmt.getTickets().size() == 0) {
            txtOutput.append("No tickets found.");
            return;
        }

        for (Ticket t : ticketMgmt.getTickets()) {
            txtOutput.append("Ticket #" + t.getTicketNumber() + "\n");
            txtOutput.append("Price: " + t.getPrice() + "\n");
            txtOutput.append("Class: " + t.getFlightClass() + "\n");
            txtOutput.append("Date: " + t.getFlightDate() + "\n");
            txtOutput.append("Passenger: " + t.getPassenger().getFirstName() + " " + t.getPassenger().getLastName() + "\n");
            txtOutput.append("Flight: " + t.getFlight().getStartLocal() + " -> " + t.getFlight().getDestination() + "\n");
            txtOutput.append("-------------------------\n");
        }
    }

    private void btnDeleteTicketActionPerformed(java.awt.event.ActionEvent evt) {
        String input = JOptionPane.showInputDialog(this, "Enter ticket number to delete:");
        if (input == null) {
            return;
        }

        int num = Integer.parseInt(input.trim());
        boolean removed = ticketMgmt.removeTicket(num);

        if (removed) {
            txtOutput.setText("Ticket removed.");
        } else {
            txtOutput.setText("Ticket not found.");
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

    private void btnScheduleMenuActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Connect this button to your groupmate's ScheduleMenu GUI.");
    }

    private void btnAirlineMenuActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Connect this button to your groupmate's AirlineMenu GUI.");
    }

    private void btnSearchPassengerActionPerformed(java.awt.event.ActionEvent evt) {
        String input = JOptionPane.showInputDialog(this, "Enter passenger ID:");
        if (input == null) {
            return;
        }

        int id = Integer.parseInt(input.trim());
        Passenger passenger = passengerManager.searchPassengerById(id);

        if (passenger != null) {
            txtOutput.setText("PASSENGER FOUND\n\n" + passenger.toString());
        } else {
            txtOutput.setText("Passenger not found.");
        }
    }

    private void btnDeletePassengerActionPerformed(java.awt.event.ActionEvent evt) {
        String input = JOptionPane.showInputDialog(this, "Enter passenger ID to delete:");
        if (input == null) {
            return;
        }

        int id = Integer.parseInt(input.trim());
        boolean deleted = passengerManager.deletePassenger(id);

        if (deleted) {
            txtOutput.setText("Passenger deleted successfully.");
        } else {
            txtOutput.setText("Passenger not found.");
        }
    }

    private void btnUpdatePassengerActionPerformed(java.awt.event.ActionEvent evt) {
        String idText = JOptionPane.showInputDialog(this, "Enter passenger ID to update:");
        if (idText == null) {
            return;
        }

        int id = Integer.parseInt(idText.trim());
        Passenger passenger = passengerManager.searchPassengerById(id);

        if (passenger == null) {
            txtOutput.setText("Passenger not found.");
            return;
        }

        String firstName = JOptionPane.showInputDialog(this, "Enter new first name:", passenger.getFirstName());
        String lastName = JOptionPane.showInputDialog(this, "Enter new last name:", passenger.getLastName());
        String email = JOptionPane.showInputDialog(this, "Enter new email:", passenger.getEmail());
        String phoneNumber = JOptionPane.showInputDialog(this, "Enter new phone number:", passenger.getPhoneNumber());

        if (firstName == null || lastName == null || email == null || phoneNumber == null) {
            return;
        }

        boolean updated = passengerManager.updatePassenger(
                id,
                firstName.trim(),
                lastName.trim(),
                email.trim(),
                phoneNumber.trim()
        );

        if (updated) {
            txtOutput.setText("Passenger updated successfully.\n\n" + passengerManager.searchPassengerById(id));
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        new MainMenu().setVisible(true);
        this.dispose();
    }

    private void loadDummyData() {
        passengerManager.loadDummyPassengers();
        staffManager.loadDummyStaff();

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
        java.awt.EventQueue.invokeLater(() -> new StaffMenu().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JButton btnAddStaff;
    private javax.swing.JButton btnAirlineInfo;
    private javax.swing.JButton btnAirlineMenu;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeletePassenger;
    private javax.swing.JButton btnDeleteTicket;
    private javax.swing.JButton btnScheduleMenu;
    private javax.swing.JButton btnSearchPassenger;
    private javax.swing.JButton btnUpdatePassenger;
    private javax.swing.JButton btnViewStaff;
    private javax.swing.JButton btnViewTickets;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration
}
