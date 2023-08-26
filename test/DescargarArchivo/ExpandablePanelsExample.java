package DescargarArchivo;

/**
 *
 * @author Benji
 */
import javax.swing.*;
import java.awt.*;

public class ExpandablePanelsExample extends JFrame {

    private JPanel title1Panel;
    private JPanel content1Panel;
    private JPanel title2Panel;

    public ExpandablePanelsExample() {
        setTitle("Expandable Panels Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        title1Panel = new JPanel(new BorderLayout());
        content1Panel = new JPanel();
        title2Panel = new JPanel();

        // Configure title panels
        title1Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        title1Panel.add(new JLabel("Titulo1"), BorderLayout.CENTER);
        title1Panel.addMouseListener(new MouseClickListener(content1Panel));

        title2Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        title2Panel.add(new JLabel("Titulo2"), BorderLayout.CENTER);
        title2Panel.addMouseListener(new MouseClickListener(null)); // You can implement this too

        // Configure content panel
        content1Panel.setLayout(new BorderLayout());
        content1Panel.add(new JLabel("Contenido de Titulo1"), BorderLayout.CENTER);

        // Add title panels to main frame
        add(title1Panel, BorderLayout.NORTH);
        add(content1Panel, BorderLayout.CENTER);
        add(title2Panel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    private class MouseClickListener implements java.awt.event.MouseListener {

        private final JPanel panelToToggle;

        public MouseClickListener(JPanel panelToToggle) {
            this.panelToToggle = panelToToggle;
        }

        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            if (panelToToggle != null) {
                panelToToggle.setVisible(!panelToToggle.isVisible());
                revalidate();
                repaint();
            }
        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ExpandablePanelsExample().setVisible(true));
    }
}
