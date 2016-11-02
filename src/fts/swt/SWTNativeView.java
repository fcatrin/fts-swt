package fts.swt;

import org.eclipse.swt.widgets.Composite;

import fts.core.NativeView;
import fts.graphics.Point;

public class SWTNativeView extends NativeView {

	private SWTCustomWidget widget;

	public SWTNativeView(Composite parent) {
		widget = new SWTCustomWidget(parent, 0);
	}

	@Override
	public Point getTextSize(String s) {
		return widget.getTextSize(s);
	}

}
