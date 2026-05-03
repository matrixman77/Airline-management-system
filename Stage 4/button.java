JPanel pagePanel = new JPanel(new BorderLayout());

JLabel titleLabel = new JLabel("Page Title", SwingConstants.CENTER);

JPanel buttonPanel = new JPanel();

JTextArea outputArea = new JTextArea();
JScrollPane scrollPane = new JScrollPane(outputArea);

pagePanel.add(titleLabel, BorderLayout.NORTH);
pagePanel.add(buttonPanel, BorderLayout.CENTER);
pagePanel.add(scrollPane, BorderLayout.SOUTH);
