package javaCampHomework3.core.logging;

public class MailLogger implements ILogger{

	@Override
	public void Log() {
		System.out.println("Action is logged by MailLogger!");
	}

}
