package org.arong.egdownloader.ui.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JDialog;
import javax.swing.JMenu;

import org.arong.egdownloader.ui.ComponentConst;
import org.arong.egdownloader.ui.window.AboutMenuWindow;
import org.arong.egdownloader.ui.window.EgDownloaderWindow;
import org.arong.egdownloader.ui.window.MainWindow;
import org.arong.egdownloader.ui.window.ToolsMenuWindow;

/**
 * 用于监听菜单的鼠标事件，主要是菜单单击事件<br>
 * 请带上主窗口的实例，这是为了使主菜单中的弹出窗口位于主窗口的中央
 * 
 * @author 阿荣
 * @since 2013-8-25
 * 
 */
public class MenuMouseListener implements MouseListener {
	private MainWindow mainWindow;
	private EgDownloaderWindow egDownloaderWindow;

	public MenuMouseListener() {

	}

	public MenuMouseListener(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}
	public MenuMouseListener(EgDownloaderWindow egDownloaderWindow) {
		this.egDownloaderWindow = egDownloaderWindow;
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() instanceof JMenu) {
			JMenu menu = (JMenu) e.getSource();
			String menuName = menu.getName();
			// 如果点击的是工具菜单，则将关于窗口显示出来，倘若关于窗口为null就先实例化
			if (ComponentConst.TOOLS_MENU_NAME.equals(menuName)) {
				if (mainWindow.toolsMenuWindow == null) {
					ToolsMenuWindow aboutWindow = new ToolsMenuWindow(mainWindow);
					mainWindow.toolsMenuWindow = aboutWindow;
				}
				mainWindow.toolsMenuWindow.setLocationRelativeTo(mainWindow);
				// 设置关于窗口置于最顶层
				mainWindow.toolsMenuWindow.toFront();
				mainWindow.toolsMenuWindow.setVisible(true);
			}
			// 如果点击的是关于菜单，则将关于窗口显示出来，倘若关于窗口为null就先实例化
			else if (ComponentConst.ABOUT_MENU_NAME.equals(menuName)) {
				if (mainWindow.aboutMenuWindow == null) {
					JDialog aboutWindow = new AboutMenuWindow(mainWindow);
					mainWindow.aboutMenuWindow = aboutWindow;
				}
				mainWindow.aboutMenuWindow.setLocationRelativeTo(mainWindow);
				// 设置关于窗口置于最顶层
				mainWindow.aboutMenuWindow.toFront();
				mainWindow.aboutMenuWindow.setVisible(true);
			}
		}

	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

}