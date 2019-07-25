package trains.exercise.constants;

import static java.util.Arrays.asList;

import java.util.List;

import trains.exercise.model.Point;
import trains.exercise.model.Route;

public class ApiConstants {
	
	public static String NO_SUCH_ROUTE="NO SUCH ROUTE";
	//Test Directed Graph points
	public static List<Point> TEST_GRAPH = asList(	new Point("A","B",5),new Point("B","C",4),
				new Point("C","D",8),new Point("D","C",8),
				new Point("D","E",6),new Point("A","D",5),
				new Point("C","E",2),new Point("E","B",3),
				new Point("A","E",7));
	//Test Routes
	public static List<Route> TEST_ROUTES = asList(new Route(asList("A", "B", "C")), new Route(asList("A", "D")),
			new Route(asList("A", "D", "C")), new Route(asList("A", "E", "B", "C", "D")),
			new Route(asList("A", "E", "D")));
	//Test Distances
	public static List<String> TEST_DISTANCES = asList("9", "5", "13", "22", "NO SUCH ROUTE");

}
