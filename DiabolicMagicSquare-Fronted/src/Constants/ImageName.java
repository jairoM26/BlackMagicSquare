/**
 * 
 */
package Constants;

import javax.swing.ImageIcon;


/**
 * @author jairo-m
 *
 */
public class ImageName implements GuiConstants {

	private ImageIcon principalBackGroundImage = new ImageIcon(getClass().getResource(PRINCIPALBACKGROUND));
	private ImageIcon showAllButtonImage = new ImageIcon(getClass().getResource(SHOWALL));
	private ImageIcon playButtonImage = new ImageIcon(getClass().getResource(STARTBUTTONPATH));
	private ImageIcon askMe = new ImageIcon(getClass().getResource(ASKME));
	private ImageIcon Try = new ImageIcon(getClass().getResource(TRY));
	private ImageIcon emptyCheck = new ImageIcon(getClass().getResource(EMPTYCHECK));
	private ImageIcon checkImage = new ImageIcon(getClass().getResource(CHECK));
	private ImageIcon errorImage = new ImageIcon(getClass().getResource(ERROR));
	private ImageIcon home = new ImageIcon(getClass().getResource(HOME));
	private ImageIcon next = new ImageIcon(getClass().getResource(NEXT));
	
	public ImageName(){
	}
	
	public ImageIcon pringicalBG() { return principalBackGroundImage;}
	public ImageIcon showAllImage() { return showAllButtonImage;}
	public ImageIcon playImage() { return playButtonImage;}
	public ImageIcon checkImage() { return checkImage;}
	public ImageIcon errorImage() { return errorImage;}
	public ImageIcon emptyCheck() {return emptyCheck;}
	public ImageIcon home() { return home;}
	public ImageIcon Try() { return Try;}
	public ImageIcon askMe() { return askMe;}
	public ImageIcon next() { return next;}
}
