import java.awt.Frame;
import java.awt.Graphics;

public class GameFrame extends Frame{
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.drawRect(100, 100, 200, 100);
	}
}
