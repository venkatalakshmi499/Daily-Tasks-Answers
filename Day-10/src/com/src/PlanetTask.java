package com.src;

public class PlanetTask {
	public enum Planet{
		MERCURY (0.38,50),
	    VENUS   (0.91,50),
	    EARTH   (1,50),
	    MARS    (0.38,50),
	    JUPITER (2.34,80),
	    SATURN  (1.06,50),
	    URANUS  (0.92,50),
	    NEPTUNE (1.19,60),
	    PLUTO   (0.06,50);
		 private final double mass;   //in kilograms
		    private final int weight; //in kilograms
			private Planet(double mass, int weight) {
				this.mass = mass;
				this.weight = weight;
			}
			public double weightOnEarth()
			{
				return mass*weight;
			}
		    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlanetTask pt=new PlanetTask();
		 for (Planet p : Planet.values()) {
		        System.out.printf("Your weight on %s is %f%n",
		                          p, p. weightOnEarth());

	}

	}

}
