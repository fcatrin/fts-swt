package fts.swt;

import fts.core.ComponentFactory;
import fts.core.Window;

public class SWTFactory implements ComponentFactory {
	public Window createWindow() {
		return new SWTWindow();
	}
}
