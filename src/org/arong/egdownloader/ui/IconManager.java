package org.arong.egdownloader.ui;

import javax.swing.ImageIcon;
/**
 * 图标管理器
 * @author dipoo
 * @since 2015-05-16
 *
 */
public class IconManager {
	private static ImageIcon loadingImage;
	private static ImageIcon folderImage;
	private static ImageIcon artistcgImage;
	private static ImageIcon asianpornImage;
	private static ImageIcon cosplayImage;
	private static ImageIcon doujinshiImage;
	private static ImageIcon gamecgImage;
	private static ImageIcon imagesetImage;
	private static ImageIcon mangaImage;
	private static ImageIcon miscImage;
	private static ImageIcon non_hImage;
	private static ImageIcon westernImage;
	
	public static ImageIcon getIcon(String name){
		if("loading".equals(name)){
			if(loadingImage == null){
				loadingImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + "loading.gif"));
			}
			return loadingImage;
		}else if("folder".equals(name)){
			if(folderImage == null){
				folderImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + ComponentConst.SKIN_NUM + ComponentConst.SKIN_ICON.get("folder")));
			}
			return folderImage;
		}else if("artistcg".equals(name)){
			if(artistcgImage == null){
				artistcgImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + "ARTISTCG.png"));
			}
			return artistcgImage;
		}else if("asianporn".equals(name)){
			if(asianpornImage == null){
				asianpornImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + "ASIANPORN.png"));
			}
			return asianpornImage;
		}else if("cosplay".equals(name)){
			if(cosplayImage == null){
				cosplayImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + "COSPLAY.png"));
			}
			return cosplayImage;
		}else if("doujinshi".equals(name)){
			if(doujinshiImage == null){
				doujinshiImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + "DOUJINSHI.png"));
			}
			return doujinshiImage;
		}else if("gamecg".equals(name)){
			if(gamecgImage == null){
				gamecgImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + "GAMECG.png"));
			}
			return gamecgImage;
		}else if("imageset".equals(name)){
			if(imagesetImage == null){
				imagesetImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + "IMAGESET.png"));
			}
			return imagesetImage;
		}else if("manga".equals(name)){
			if(mangaImage == null){
				mangaImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + "MANGA.png"));
			}
			return mangaImage;
		}else if("misc".equals(name)){
			if(miscImage == null){
				miscImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + "MISC.png"));
			}
			return miscImage;
		}else if("non-h".equals(name)){
			if(non_hImage == null){
				non_hImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + "NON-H.png"));
			}
			return non_hImage;
		}else if("western".equals(name)){
			if(westernImage == null){
				westernImage = new ImageIcon(IconManager.class.getResource(ComponentConst.ICON_PATH + "WESTERN.png"));
			}
			return westernImage;
		}
		return null;
	}
}
