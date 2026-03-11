package ejercicio12;

import java.util.List;
import java.util.ArrayList;
public class JobScheduler {
	private Strategy strategy;
	private List<JobDescription> jobs;
	
	public JobScheduler(Strategy strategy) {
		this.strategy= strategy;
		this.jobs = new ArrayList();
	}
	
	
	public void schedule( JobDescription job) {
		this.jobs.add(job);
	}
	
	public void unschedule( JobDescription job) {
		this.jobs.remove(job);
	}
	
	public  JobDescription next() {
		JobDescription nextJob= this.strategy.selectNext(jobs);
		if(nextJob!=null) {
			this.unschedule(nextJob);
		}
		return nextJob;
	}
	
}
