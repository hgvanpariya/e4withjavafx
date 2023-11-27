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




//import javax.annotation.PostConstruct;
//
//import org.eclipse.jface.layout.GridDataFactory;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Canvas;
//import org.eclipse.swt.widgets.Text;
//import org.eclipse.swt.events.PaintEvent;
//import org.eclipse.swt.events.PaintListener;

/**
 * Using SWT Canvas as an alternative to FXCanvas.
 */
//public class FirstPart {
//
//    /**
//     * Create the controls for given parent.
//     * 
//     * @param parent where to place (layout) the controls.
//     */
//    @PostConstruct
//    public void createControls(final Composite parent) {
//        Canvas canvas = new Canvas(parent, SWT.NONE);
//        GridDataFactory.fillDefaults().grab(true, true).span(3, 1).applyTo(canvas);
//
//        canvas.addPaintListener(new PaintListener() {
//            @Override
//            public void paintControl(PaintEvent e) {
//                // Paint JavaFX-like content here using SWT drawing operations
//                e.gc.drawText("Hello from SWT Canvas!", 10, 10);
//            }
//        });
//
//        Text textArea = new Text(parent, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
//        GridDataFactory.fillDefaults().grab(true, true).span(3, 1).applyTo(textArea);
//
//        textArea.setText("Hello from SWT Text!");
//    }
//}








//import javax.annotation.PostConstruct;
//
//import javafx.application.Platform;
//import javafx.scene.Scene;
//import javafx.scene.control.TextArea;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.ColumnConstraints;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.Priority;
//import javafx.scene.paint.Color;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.widgets.Canvas;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Event;
//import org.eclipse.swt.widgets.Listener;
//
//public class FirstPart {
//
//    @PostConstruct
//    public void createControls(final Composite parent) {
//        Canvas swtCanvas = new Canvas(parent, SWT.NONE);
//        javafx.scene.canvas.Canvas fxCanvas = new javafx.scene.canvas.Canvas();
//
//        // Create a GridPane to apply layout constraints
//        GridPane layout = new GridPane();
//
//        // Column constraints to make the JavaFX Canvas span 3 columns
//        ColumnConstraints columnConstraints = new ColumnConstraints();
//        columnConstraints.setHgrow(Priority.ALWAYS);
//        layout.getColumnConstraints().addAll(columnConstraints, columnConstraints, columnConstraints);
//
//        // Add the JavaFX Canvas to the GridPane
//        layout.add(fxCanvas, 0, 0, 3, 1);
//
//        BorderPane borderPane = new BorderPane();
//        borderPane.setCenter(layout);
//
//        Scene scene = new Scene(borderPane, Color.rgb(
//                parent.getShell().getBackground().getRed(),
//                parent.getShell().getBackground().getGreen(),
//                parent.getShell().getBackground().getBlue()));
//
//        // Add JavaFX controls to the UI
//        TextArea textArea = new TextArea();
//        borderPane.setCenter(textArea);
//
//        // Platform.runLater is used to ensure that JavaFX operations are performed on the JavaFX application thread
//        Platform.runLater(() -> {
//            textArea.setText("Hello from JavaFX!");
//        });
//
//        // Add an SWT listener to handle Canvas resize events
//        swtCanvas.addListener(SWT.Resize, new Listener() {
//            @Override
//            public void handleEvent(Event event) {
//                double width = swtCanvas.getBounds().width;
//                double height = swtCanvas.getBounds().height;
//                fxCanvas.setWidth(width);
//                fxCanvas.setHeight(height);
//                fxCanvas.getGraphicsContext2D().clearRect(0, 0, width, height);
//                Platform.runLater(() -> {
//                    layout.requestLayout();
//                });
//            }
//        });
//    }
//}


