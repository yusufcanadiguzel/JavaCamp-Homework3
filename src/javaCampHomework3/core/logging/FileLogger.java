package javaCampHomework3.core.logging;

public class FileLogger implements ILogger{

	@Override
	public void Log() {
		System.out.println("Action is logged by FileLogger!");
	}

}
