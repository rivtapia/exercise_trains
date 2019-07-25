package trains.exercise.model;

import java.util.List;

public class Route {
	private List<String> routeSteps;

	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Route(List<String> routeSteps) {
		super();
		this.routeSteps = routeSteps;
	}

	public List<String> getRouteSteps() {
		return routeSteps;
	}

	public void setRouteSteps(List<String> routeSteps) {
		this.routeSteps = routeSteps;
	}
	
	

}
