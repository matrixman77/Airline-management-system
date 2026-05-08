import javax.swing.JOptionPane;

/**
 *
 * @author Caleb
 */
public class AdminMenu extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminMenu.class.getName());
    
    private PassengerManagment passengerManager = new PassengerManagment();
    private ScheduleManagement scheduleMgmt = new ScheduleManagement();
    private AirlineManagement airlineMgmt = new AirlineManagement();
    private StaffManagment staffManager = new StaffManagment();
    private TicketManagement ticketMgmt = new TicketManagement(scheduleMgmt, passengerManager);

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu(TicketManagement ticketMgmt, PassengerManagment passengerManager, ScheduleManagement scheduleMgmt, AirlineManagement airlineMgmt, StaffManagment staffManager) 
    { 
        this.ticketMgmt = ticketMgmt;
        this.passengerManager = passengerManager;
        this.scheduleMgmt = scheduleMgmt;
        this.staffManager = staffManager;
        this.airlineMgmt = airlineMgmt;
        
        initComponents();
        setLocationRelativeTo(null);

        this.passengerManager.loadPassengersFromFile();
        this.staffManager.loadStaffFromFile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnPassengerReport = new javax.swing.JButton();
        btnStaffReport = new javax.swing.JButton();
        btnSearchStaff = new javax.swing.JButton();
        btnDeleteStaff = new javax.swing.JButton();
        btnUpdateStaff = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24));
        lblTitle.setText("Admin Menu");

        btnPassengerReport.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnPassengerReport.setText("Print Passenger Report");
        btnPassengerReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassengerReportActionPerformed(evt);
            }
        });

        btnStaffReport.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnStaffReport.setText("Print Staff Report");
        btnStaffReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffReportActionPerformed(evt);
            }
        });

        btnSearchStaff.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnSearchStaff.setText("Search Staff");
        btnSearchStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStaffActionPerformed(evt);
            }
        });

        btnDeleteStaff.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnDeleteStaff.setText("Delete Staff");
        btnDeleteStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStaffActionPerformed(evt);
            }
        });

        btnUpdateStaff.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnUpdateStaff.setText("Update Staff");
        btnUpdateStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStaffActionPerformed(evt);
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle)
                    .addComponent(btnPassengerReport, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnStaffReport, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnSearchStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnDeleteStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnUpdateStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(btnPassengerReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStaffReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void btnPassengerReportActionPerformed(java.awt.event.ActionEvent evt) {
        passengerManager.loadPassengersFromFile();
        txtOutput.setText(
            "PASSENGER REPORT\n" +
            "Total Passengers: " + passengerManager.getPassengerCount() + "\n\n" +
            passengerManager.getAllPassengersText()
        );
    }

    private void btnStaffReportActionPerformed(java.awt.event.ActionEvent evt) {
        staffManager.loadStaffFromFile();
        txtOutput.setText(
            "STAFF REPORT\n" +
            "Total Staff Members: " + staffManager.getStaffCount() + "\n\n" +
            staffManager.getAllStaffText()
        );
    }

    private void btnSearchStaffActionPerformed(java.awt.event.ActionEvent evt) {
        String input = JOptionPane.showInputDialog(this, "Enter Staff ID:");
        if (input == null) {
            return;
        }

        int id = Integer.parseInt(input.trim());
        staffManager.loadStaffFromFile();
        Staff staff = staffManager.searchStaffById(id);

        if (staff != null) {
            txtOutput.setText("STAFF FOUND\n\n" + staff.toString());
        } else {
            txtOutput.setText("Staff member not found.");
        }
    }

    private void btnDeleteStaffActionPerformed(java.awt.event.ActionEvent evt) {
        String input = JOptionPane.showInputDialog(this, "Enter Staff ID to delete:");
        if (input == null) {
            return;
        }

        int id = Integer.parseInt(input.trim());
        boolean deleted = staffManager.deleteStaff(id);

        if (deleted) {
            staffManager.loadStaffFromFile();
            txtOutput.setText("Staff member deleted successfully.");
        } else {
            txtOutput.setText("Staff member not found.");
        }
    }

    private void btnUpdateStaffActionPerformed(java.awt.event.ActionEvent evt) {
        String idText = JOptionPane.showInputDialog(this, "Enter Staff ID to update:");
        if (idText == null) {
            return;
        }

        int id = Integer.parseInt(idText.trim());
        staffManager.loadStaffFromFile();
        Staff staff = staffManager.searchStaffById(id);

        if (staff == null) {
            txtOutput.setText("Staff member not found.");
            return;
        }

        String firstName = JOptionPane.showInputDialog(this, "Enter new first name:", staff.getFirstName());
        String lastName = JOptionPane.showInputDialog(this, "Enter new last name:", staff.getLastName());
        String role = JOptionPane.showInputDialog(this, "Enter new role:", staff.getRole());
        String salaryText = JOptionPane.showInputDialog(this, "Enter new salary:", staff.getSalary());

        if (firstName == null || lastName == null || role == null || salaryText == null) {
            return;
        }

        double salary = Double.parseDouble(salaryText.trim());

        boolean updated = staffManager.updateStaff(id, firstName.trim(), lastName.trim(), role.trim(), salary);

        if (updated) {
            staffManager.loadStaffFromFile();
            txtOutput.setText("Staff member updated successfully.\n\n" + staffManager.searchStaffById(id));
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        new MainMenu(ticketMgmt, passengerManager, scheduleMgmt, airlineMgmt, staffManager).setVisible(true);
        this.setVisible(false);
    }

    // Variables declaration
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteStaff;
    private javax.swing.JButton btnPassengerReport;
    private javax.swing.JButton btnSearchStaff;
    private javax.swing.JButton btnStaffReport;
    private javax.swing.JButton btnUpdateStaff;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration
}
