package it.univaq.disim.mde.course.plugin.development.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import it.univaq.disim.mde.course.plugin.devepment.business.Calculator;

import org.eclipse.jface.dialogs.MessageDialog;

public class CommandTwo extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		Calculator calc = new Calculator();
		MessageDialog.openInformation(
				window.getShell(),
				"Ui",
				"Hello, Command two:" + calc.sub());
		return null;
	}
}
