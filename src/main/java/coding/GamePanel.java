package coding;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3; // Scale factor for the tile size
    final int tileSize = originalTileSize * scale; // 48x48 tile
    final int maxScreenCol = 16; // Maximum columns on the screen
    final int maxScreenRow = 12; // Maximum rows on the screen
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels wide
    final int screenHeight = tileSize * maxScreenRow; // 576 pixels tall

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black); // Set background color to black
        this.setDoubleBuffered(true); // Enable double buffering for smoother rendering
    }
}
