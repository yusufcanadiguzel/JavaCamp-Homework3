package javaCampHomework3.core.logging;

public class SmsLogger implements ILogger {

	@Override
	public void Log() {
		System.out.println("Action is logged with SmsLogger!");
	}
	
}
