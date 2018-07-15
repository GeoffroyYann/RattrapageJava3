package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

import model.IModel;

/**
 * <h1>The class EasyFrame</h1>
 * @author Lisa
 *
 */
public class EasyFrame extends JFrame implements IEasyFrame, KeyListener {

    private static final long     serialVersionUID = 1L;
    public static final int       ZOOM             = 1;
    private final IEventPerformer eventPerformer;

    /**
     * Instantiates a new Frame
     * @param title
     * 				the title
     * @param eventPerformer
     * 				the event performed
     * @param tronGraphicsBuilder
     * 				the tronGraphicsBuilder
     * @param model
     * 				the model
     * @param observable
     * 				the object observable
     */
    public EasyFrame(final String title, final EventPerformer eventPerformer,
            final TronGraphicsBuilder tronGraphicsBuilder, final IModel model, final Observable observable) {
        this.eventPerformer = eventPerformer;

        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.addKeyListener(this);
        this.setVisible(true);

        final EasyPanel easyPanel = new EasyPanel(new TronGraphicsBuilder(model));
        this.setContentPane(easyPanel);
        this.setBackground(Color.RED);
        this.setSize((model.getWidth() * EasyFrame.ZOOM) + this.getInsets().left + this.getInsets().right,
                (model.getHeight() * EasyFrame.ZOOM) + this.getInsets().top + this.getInsets().bottom);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        observable.addObserver(easyPanel);
    }

    @Override
    public void keyTyped(final KeyEvent keyEvent) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(final KeyEvent keyEvent) {
        this.eventPerformer.eventPerform(keyEvent);
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(final KeyEvent keyEvent) {
        // TODO Auto-generated method stub

    }
}
