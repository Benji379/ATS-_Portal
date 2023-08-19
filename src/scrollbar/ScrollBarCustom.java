package scrollbar;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(10, 10));
        setForeground(new Color(253, 112, 117));
        int col = 255;
        setBackground(new Color(col, col, col));
    }
}
