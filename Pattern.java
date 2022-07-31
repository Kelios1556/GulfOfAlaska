import java.util.*;
import java.io.*;
import java.nio.*;
import java.awt.Color;

public class Pattern {
    private String text;
    private Color textColor;
    private Color background;
    private String type;
    private String jpgPath;

    private static final File CWD = new File(System.getProperty("user.dir"));
    private static final File JPG = Paths.get(CWD.getPath(), "images").toFile();
    
    private static final Color RED = new Color(235, 50, 50);
    private static final Color PINK = new Color(252, 152, 206);
    private static final Color VIOLET = new Color(210, 157, 255);
    private static final Color CERULEAN = new Color(46, 30, 255);
    private static final Color BLUE = new Color(103, 217, 255);
    private static final Color CYAN = new Color(9, 253, 253);
    private static final Color GREEN = new Color(50, 255, 93);
    private static final Color YELLOW = new Color(255, 246, 13);
    private static final Color ORANGE = new Color(249, 129, 1);


    public Pattern(String text, Color textColor, Color background, String type) {
        this.text = text;
        this.textColor = textColor;
        this.background = background;
        this.type = type;
        this jpgPath = null;
    }

    public void setPath(String jpgPath) {
        this.jpgPath = jpgPath;
    }

    /**
     * return a series of gradient blocks.
     */
    public Color[] gradientTool(int size, Color base) {
        Color[] colors = new Color[size];
        return null;
    }

    /**
     * return a series of blocks with mixed deep and light colors. 
     */
    public Color[] DeepLightCross(int size, Color base) {
        Color[] colors = new Color[size];
        return null;
    }

    public String text() {
        return text;
    }

    public Color textColor() {
        return textColor;
    }

    public Color background() {
        return background;
    }

    public String type() {
        return type;
    }
}



