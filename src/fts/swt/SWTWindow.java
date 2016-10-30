package fts.swt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import fts.core.Window;

public class SWTWindow extends Window {
	
	Shell shell;
	public SWTWindow() {
		shell = new Shell(Display.getDefault());
	}
	@Override
	public void setTitle(String title) {
		shell.setText(title);
	}
	@Override
	public void open() {
		shell.open();
	}

	public void mainLoop() {
		Display display = shell.getDisplay();
		while (!shell.isDisposed()) {
			 if (!display.readAndDispatch()) display.sleep();
		}
	}
	
}
