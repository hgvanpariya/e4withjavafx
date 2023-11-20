package rcp.demo.plugin.application;

import javax.annotation.PostConstruct;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

/**
 * Using a browser.
 */
public class FirstPart
{

    /**
     * Create the controls for given parent.
     * 
     * @param parent where to place (layout) the controls.
     */
    @PostConstruct
    public void createControls(final Composite parent)
    {
//        parent.setLayout(new GridLayout(2, false));
//
//        final Browser browser = new Browser(parent, SWT.NONE);
//        browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
//        browser.setUrl("https://www.google.de/");
    	FXCanvas canvas = new FXCanvas(parent, SWT.NONE);
		GridDataFactory
		    .fillDefaults()
		    .grab(true, true)
		    .span(3, 1)
		    .applyTo(canvas);

		// create the root layout pane
		BorderPane layout = new BorderPane();

		// create a Scene instance
		// set the layout container as root
		// set the background fill to the background color of the shell
//		Scene scene = new Scene(layout, Color.rgb(
//		    parent.getShell().getBackground().getRed(),
//		    parent.getShell().getBackground().getGreen(),
//		    parent.getShell().getBackground().getBlue()));
//
//		// set the Scene to the FXCanvas
//		canvas.setScene(scene);
		
		// add FXCanvas for adding JavaFX controls to the UI
		TextArea textArea = new TextArea();
//		FXCanvas canvas = new FXCanvas(parent, SWT.NONE);
//		GridDataFactory
//		    .fillDefaults()
//		    .grab(true, true)
//		    .span(3, 1)
//		    .applyTo(canvas);
//
//		// create the root layout pane
//		BorderPane layout = new BorderPane();
//
//		// create a Scene instance
//		// set the layout container as root
//		// set the background fill to the background color of the shell
		Scene scene = new Scene(textArea, Color.rgb(
		    parent.getShell().getBackground().getRed(),
		    parent.getShell().getBackground().getGreen(),
		    parent.getShell().getBackground().getBlue()));
//
//		
//		// set the Scene to the FXCanvas
		canvas.setScene(scene);
    }
}
