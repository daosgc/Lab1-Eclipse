package org.mylab;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class Pedido extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtSize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido frame = new Pedido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pedido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{141, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 94, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblName = new JLabel("Nombre del medicamento");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.anchor = GridBagConstraints.EAST;
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 0;
		contentPane.add(lblName, gbc_lblName);
		
		txtName = new JTextField();
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		gbc_txtName.insets = new Insets(0, 0, 5, 0);
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.gridx = 1;
		gbc_txtName.gridy = 0;
		contentPane.add(txtName, gbc_txtName);
		txtName.setColumns(10);
		
		JLabel lblType = new JLabel("Tipo de medicamento");
		GridBagConstraints gbc_lblType = new GridBagConstraints();
		gbc_lblType.anchor = GridBagConstraints.EAST;
		gbc_lblType.insets = new Insets(0, 0, 5, 5);
		gbc_lblType.gridx = 0;
		gbc_lblType.gridy = 1;
		contentPane.add(lblType, gbc_lblType);
		
		JComboBox cmbxType = new JComboBox();
		cmbxType.setModel(new DefaultComboBoxModel(new String[] {"analgésico", "analéptico", "anestésico", "antiácido", "antidepresivo", "antibióticos"}));
		GridBagConstraints gbc_cmbxType = new GridBagConstraints();
		gbc_cmbxType.insets = new Insets(0, 0, 5, 0);
		gbc_cmbxType.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbxType.gridx = 1;
		gbc_cmbxType.gridy = 1;
		contentPane.add(cmbxType, gbc_cmbxType);
		
		JLabel lblSize = new JLabel("Cantidad");
		GridBagConstraints gbc_lblSize = new GridBagConstraints();
		gbc_lblSize.anchor = GridBagConstraints.EAST;
		gbc_lblSize.insets = new Insets(0, 0, 5, 5);
		gbc_lblSize.gridx = 0;
		gbc_lblSize.gridy = 2;
		contentPane.add(lblSize, gbc_lblSize);
		
		txtSize = new JTextField();
		GridBagConstraints gbc_txtSize = new GridBagConstraints();
		gbc_txtSize.insets = new Insets(0, 0, 5, 0);
		gbc_txtSize.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSize.gridx = 1;
		gbc_txtSize.gridy = 2;
		contentPane.add(txtSize, gbc_txtSize);
		txtSize.setColumns(10);
		
		JLabel lblDistributor = new JLabel("Distribuidor Farmacéutico");
		GridBagConstraints gbc_lblDistributor = new GridBagConstraints();
		gbc_lblDistributor.insets = new Insets(0, 0, 5, 5);
		gbc_lblDistributor.gridx = 0;
		gbc_lblDistributor.gridy = 3;
		contentPane.add(lblDistributor, gbc_lblDistributor);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 3;
		contentPane.add(panel_1, gbc_panel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cofarma");
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Empsephar");
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Cemefar");
		panel_1.add(rdbtnNewRadioButton_4);
		
		JLabel lblDeliverAddress = new JLabel("Lugar de entrega");
		GridBagConstraints gbc_lblDeliverAddress = new GridBagConstraints();
		gbc_lblDeliverAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblDeliverAddress.gridx = 0;
		gbc_lblDeliverAddress.gridy = 4;
		contentPane.add(lblDeliverAddress, gbc_lblDeliverAddress);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 4;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Principal");
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Secundaria");
		panel.add(chckbxNewCheckBox_1);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 5;
		contentPane.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Borrar");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		panel_2.add(btnNewButton_1);
	}

}
