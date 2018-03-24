package head.first.design.pattern.rule.observer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 사용법 예시
 */
public class SwingObserverExample {

	/**
	 * 자바 Swing 프레임 생성
	 */
	JFrame frame;

	/**
	 * 메인문
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	/**
	 * 실 비즈니스 로직
	 */
	public void go() {
		frame = new JFrame();

		JButton button = new JButton("내가 개발을 할수 있을까?");
		button.addActionListener(new AngelListener()); // 엔젤 리스너
		button.addActionListener(new DevilListener()); // 악마 리스너
		frame.getContentPane().add(BorderLayout.CENTER, button); // 버튼 생성

		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	/**
	 * The type Angel listener.
	 */
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("하지마, 넌 그걸 할수 없어!!");
		}
	}

	/**
	 * The type Devil listener.
	 */
	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("힘내! 넌 할수 있어!");
		}
	}
}
