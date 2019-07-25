package trains.exercise.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import trains.exercise.exception.NoGraphDataException;
import trains.exercise.exception.NoRoutesDataException;
import trains.exercise.helper.TrainsHelper;
import trains.exercise.model.Point;
import trains.exercise.model.Route;

@Service
public class TrainsService {

	/**
	 * Calculate distances for every route
	 * 
	 * @param graph
	 * @param routes
	 * @return
	 */
	public List<String> calculateDistances(List<Point> graph, List<Route> routes) {
		if (graph == null || graph.size() == 0)
			throw new NoGraphDataException();
		if (routes == null || routes.size() == 0)
			throw new NoRoutesDataException();
		List<String> distances = new ArrayList<String>();
		routes.forEach(r -> distances.add(TrainsHelper.getDistance(graph, r)));
		return distances;
	}

}
