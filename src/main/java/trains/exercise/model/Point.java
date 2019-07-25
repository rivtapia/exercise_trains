package trains.exercise.model;

public class Point {
	
	private String origin;
	private String destiny;
	private int distance;
	

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point(String origin, String destiny, int distance) {
		super();
		this.origin = origin;
		this.destiny = destiny;
		this.distance = distance;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestiny() {
		return destiny;
	}
	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	

}
