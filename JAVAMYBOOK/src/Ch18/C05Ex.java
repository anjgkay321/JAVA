package Ch18;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI extends JFrame {
	GUI(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(null);

		JTextArea area1 = new JTextArea();
//		area1.setBounds(10, 10, 300, 300);
		JTextField area2 = new JTextField();
		area2.setBounds(10, 380, 300, 50);

		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10, 10, 300, 350);

		JButton btn1 = new JButton("파일로 저장");
		btn1.setBounds(350, 10, 100, 50);

		JButton btn2 = new JButton("1 대 1 요청");
		btn2.setBounds(350, 110, 100, 50);

		JButton btn3 = new JButton("대화 기록 보기");
		btn3.setBounds(350, 210, 100, 50);

		JButton input = new JButton("입력");
		input.setBounds(350, 350, 100, 50);

//		panel.add(area1);
		panel.add(scroll1);
		panel.add(area2);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(input);

		add(panel);
		setVisible(true);
	}
}

public class C05Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI("Chatting Server");
		// Component 참조변수명
		// textarea = area1
		// textarea's scroll = scroll1
		// 파일로저장 : btn1
		// 1:1요청 : btn2
		// 대화기록보기 : btn3
		// 입력 : input
		// textfield : txt1

	}

}
