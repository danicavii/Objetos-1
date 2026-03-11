package ejercicio12;

import java.util.List;
public class PriorityJobScheduler extends Strategy {
	
	public JobDescription selectNext(List<JobDescription> jobs) {
		JobDescription nextJob= null;
		nextJob = jobs.stream().max((j1, j2) -> Double.compare(j1.priority(), j2.priority())).orElse(null);
		return nextJob;
	}
	

}
