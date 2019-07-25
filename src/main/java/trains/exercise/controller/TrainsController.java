package trains.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import trains.exercise.exception.CalculateRoutesException;
import trains.exercise.model.RouteDistances;
import trains.exercise.service.TrainsService;

@RestController
public class TrainsController {

	@Autowired
	private TrainsService trainsService;

	/**
	 * User get routes distances using directed graph points and which routes he
	 * want calculate it.
	 * 
	 * @param routeDistances
	 * @return
	 */
	@RequestMapping(value = "/trains/distances", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	ResponseEntity<List<String>> getRouteDistances(@RequestBody RouteDistances routeDistances) throws CalculateRoutesException{
		return new ResponseEntity<>(
				trainsService.calculateDistances(routeDistances.getGraph(), routeDistances.getRoutes()), HttpStatus.OK);
	}

}