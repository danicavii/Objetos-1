package ejercicio12;

import java.util.List;
public class FifoJobScheduler extends Strategy {

	
	public JobDescription selectNext(List<JobDescription> jobs) {
		return jobs.get(0);
	}
}
