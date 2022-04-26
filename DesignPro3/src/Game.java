
public abstract class Game {
	abstract void initializer();
	abstract void start();
	abstract void end();
	public final void play()
	{
		initializer();
		start();
		end();
	}

}
