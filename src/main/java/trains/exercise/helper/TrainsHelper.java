package trains.exercise.helper;

import java.util.List;

import trains.exercise.constants.ApiConstants;
import trains.exercise.exception.CalculateRoutesException;
import trains.exercise.model.Point;
import trains.exercise.model.Route;

public class TrainsHelper {

	/**
	 * Get route distance about a route using a graph.
	 * 
	 * @param graph
	 * @param route
	 * @return
	 */
	public static String getDistance(List<Point> graph, Route route) throws CalculateRoutesException{
		int distance = 0;
		String origin = route.getRouteSteps().get(0);
		String destiny = new String();
		for (String routeStep : route.getRouteSteps()) {
			if (!routeStep.equals(origin)) {
				destiny = routeStep;
				// match points for every combination
				Point point = TrainsHelper.getPoint(graph, origin, destiny);
				// in case no combination, return this message
				if (point == null) {
					return ApiConstants.NO_SUCH_ROUTE;
				}
				distance = distance + (point != null ? point.getDistance() : 0);
				origin = destiny;
			}
		}
		return String.valueOf(distance);
	}

	/**
	 * Match point in graph
	 * 
	 * @param graph
	 * @param origin
	 * @param destiny
	 * @return
	 */
	private static Point getPoint(List<Point> graph, String origin, String destiny) throws CalculateRoutesException{
		return graph.stream().filter(p -> p.getOrigin().equals(origin) && p.getDestiny().equals(destiny)).findFirst()
				.orElse(null);
	}

}
