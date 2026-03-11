package ejercicio12;
import java.util.List;

public class LifoJobScheduler {
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
		nextJob = jobs.stream().max((j1, j2) -> Double.compare(j1.effort(), j2.effort())).orElse(null);
		return nextJob;
	}
}
