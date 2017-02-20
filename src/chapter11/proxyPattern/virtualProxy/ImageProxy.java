package chapter11.proxyPattern.virtualProxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
	// imageIcon�� �̹��� �ε��� ������ �� ���� �̹����� ȭ�鿡 ǥ���ϱ� ���� ��¥ ������
	private ImageIcon imageIcon;
	private URL imageURL;
	private Thread retrievalThread;
	private boolean retrieving = false;
	
	/*
	 * �̹����� URL�� �����ڿ� �����մϴ�.
	 * �ε��� ������ �� URL�� �ִ� �̹����� ȭ�鿡 ǥ�õ˴ϴ�.
	 */
	public ImageProxy(URL url) {
		imageURL = url;
	}
	
	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		} else {
			return 800;
		}
	}

	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		} else {
			return 600;
		}
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		/*
		 * ���� �߿��� �κ��Դϴ�. �� �ڵ忡���� (imageIcon�� �޼ҵ� ȣ���� �����Ͽ�)
		 * �������� ȭ�鿡 ǥ���� �ݴϴ�. ������ imageIcon�� ���� ������ �������� �ʾ�����
		 * �̹����� �������� �ִ� ���̶�� �޽����� ǥ�����ݴϴ�.
		 */
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading CD cover, please wait...", x+300, y+190);
			if (!retrieving) {
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
							imageIcon = new ImageIcon(imageURL, "CD Cover");
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}



}
