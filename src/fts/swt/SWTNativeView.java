package fts.swt;

import org.eclipse.swt.widgets.Composite;

import fts.core.NativeView;

public class SWTNativeView extends NativeView {

	private SWTCustomWidget widget;

	public SWTNativeView(Composite parent) {
		widget = new SWTCustomWidget(parent, 0);
	}

}
