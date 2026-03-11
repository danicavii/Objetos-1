package ejercicio12;
import java.util.List;

public abstract class Strategy {

	public abstract JobDescription selectNext(List<JobDescription> jobs);
}
