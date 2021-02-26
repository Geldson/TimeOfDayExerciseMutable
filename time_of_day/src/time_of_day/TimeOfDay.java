package time_of_day;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Each instance of this class represents a time of day.
 * 
 * abstract state invariants: (a.k.a. public invariants)
 * 
 * @invar The hours are nonnegative.
 *     | 0 <= getHours()
 * @invar The minutes are nonnegative.
 *     | 0 <= getMinutes()
 * 
 * @immutable
 */
public class TimeOfDay {
	
	// representation invariants a.k.a. private invariants
	/**
	 * @invar The hours are max 24.
	 *     | 24 >= hours
	 * @invar The minutes are max 60.
	 *     | 60 >= minutes
	 */
	private int hours;
	private int minutes;
	
	// getters or inspector methods --- defines the class's abstract state space = set of possible abstract values/states
	// immutable class -> the abstract value of an instance
	// mutable class -> the current abstract state of an instance
	
	/**
	 * @basic
	 */
	public int getHours() {
		return hours;
	}
	
	/**
	 * @basic
	 */
	public int getMinutes() {
		return minutes;
	}
	
	/**
	 * @post The result is not null
	 *     | result != null
	 * @post Check hours
     *     | result[0] == getHours()
	 * @post Check minutes
     *     | result[1] == getMinutes()
	 */
	public int[] getTime() {
		int[] result = new int[2];
		result[0] = hours;
		result[1] = minutes;
		return result;
		
		//return IntStream.range(upperBound - width, upperBound + 1).toArray();
	}

	/**
	 * Initializes this object so that it represents the interval
	 * specified by the given lower and upper bound.
	 * 
	 * @pre The given hours is greater than 0.
	 *     | 0 <= hours
	 * @pre The given minutes is greater than 0.
	 *     | 0 <= minutes
	 * @post This ToD lower bound equals the given lower bound.
	 *     | getHours() == hours
	 * @post This ToD upper bound equals the given upper bound.
	 *     | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	// no mutators --- no methods that change the object's abstract state
	
}
