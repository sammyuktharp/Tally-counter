import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Tally extends Frame
{
	TextField count;
	Button increment;
	Button reset;
	tally()
	{
		count=new TextField("0");
		count.setBounds(250,100,80,40);
		increment=new Button("Increment");
		increment.setBounds(200,180,50,30);
		increment.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					int num=Integer.parseInt(count.getText());
					count.setText(String.valueOf(++num));
				}
		});
		reset=new Button("Reset");
		reset.setBounds(300,180,50,30);
		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				count.setText("0");
			}
		});	
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	
		add(count);
		add(increment);
		add(reset);
		setTitle("Tally counter");
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
				
	
	public static void main(String[] args)
	{
		new tally();
	}
}
