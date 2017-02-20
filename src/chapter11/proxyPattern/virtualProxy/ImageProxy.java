package chapter11.proxyPattern.virtualProxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
	// imageIcon은 이미지 로딩이 끝났을 때 실제 이미지를 화면에 표시하기 위한 진짜 아이콘
	private ImageIcon imageIcon;
	private URL imageURL;
	private Thread retrievalThread;
	private boolean retrieving = false;
	
	/*
	 * 이미지의 URL을 생성자에 전달합니다.
	 * 로딩이 끝나면 이 URL에 있는 이미지가 화면에 표시됩니다.
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
		 * 가장 중요한 부분입니다. 이 코드에서는 (imageIcon에 메소드 호출을 전달하여)
		 * 아이콘을 화면에 표시해 줍니다. 하지만 imageIcon이 아직 완전히 생성되지 않았으면
		 * 이미지를 가져오고 있는 중이라는 메시지를 표시해줍니다.
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
