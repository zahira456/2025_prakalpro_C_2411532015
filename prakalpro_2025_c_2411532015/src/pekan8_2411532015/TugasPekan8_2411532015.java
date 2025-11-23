package pekan8_2411532015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TugasPekan8_2411532015 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHasil;
	private JTextField txtBil2;
	private JTextField txtBil1;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasPekan8_2411532015 frame = new TugasPekan8_2411532015();
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
	public TugasPekan8_2411532015() {
		setTitle("Operator Relasional");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operator Relasional");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(78, 11, 182, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Bilangan 1");
		lblNewLabel_1_2.setBounds(28, 36, 84, 17);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1_1.setBounds(28, 67, 84, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Operator");
		lblNewLabel_1_2_1.setBounds(30, 106, 84, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setBounds(36, 153, 44, 14);
		contentPane.add(lblNewLabel_1_3);
		
		txtHasil = new JTextField();
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setColumns(10);
		txtHasil.setBounds(137, 149, 84, 20);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {">", "<", ">=", "<=", "==", "!="}));
		cbOperator.setBounds(134, 102, 84, 22);
		contentPane.add(cbOperator);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(134, 64, 84, 20);
		contentPane.add(txtBil2);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setColumns(10);
		txtBil1.setBounds(134, 33, 84, 20);
		contentPane.add(txtBil1);
		
		JButton btnCek = new JButton("Cek");
		btnCek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
                    pesanPeringatan("Bilangan 1 harus diisi");
                    return;
                }
                if (txtBil2.getText().trim().isEmpty()) {
                    pesanPeringatan("Bilangan 2 harus diisi");
                    return;
                }

                try {
                    int a = Integer.parseInt(txtBil1.getText());
                    int b = Integer.parseInt(txtBil2.getText());
                    int c = cbOperator.getSelectedIndex();
                    boolean hasil = false;

                  
                    if (c==0) {
						hasil = a > b;
					}
					if (c==1) {
						hasil = a < b;					
					}
					if (c==2) {
						hasil = a >= b;
					}
					if (c==3) {
						hasil = a <= b;
					}
					if (c==4) {
						hasil = a == b;
					}
					if (c==5) {
						hasil = a != b;
					}
					
					txtHasil.setText(String.valueOf(hasil));
        

                } catch (NumberFormatException ex) {
                    pesanError("Input harus berupa angka");
                }
			}
						
						
		});
		btnCek.setBounds(246, 103, 78, 22);
		contentPane.add(btnCek);

	}
}
