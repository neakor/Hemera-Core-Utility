package hemera.core.utility.data;

import java.util.concurrent.TimeUnit;

/**
 * <code>TimeData</code> defines an immutable data
 * structure implementation that contains a time
 * value in the specified <code>TimeUnit</code>.
 *
 * @author Yi Wang (Neakor)
 * @version 1.0.0
 */
public final class TimeData {
	/**
	 * The <code>long</code> time value in the
	 * time unit.
	 */
	public final long value;
	/**
	 * The <code>TimeUnit</code> the value is in.
	 */
	public final TimeUnit unit;
	
	/**
	 * Constructor of <code>TimeData</code>.
	 * @param value The <code>String</code> value to
	 * parse.
	 */
	public TimeData(final String value) {
		final String[] array = value.split(" ");
		this.value = Long.valueOf(array[0]);
		this.unit = TimeUnit.valueOf(array[1]);
	}
	
	/**
	 * Constructor of <code>TimeData</code>.
	 * @param value The <code>long</code> time value
	 * in the time unit.
	 * @param unit The <code>TimeUnit</code> the value
	 * is in.
	 */
	public TimeData(final long value, final TimeUnit unit) {
		this.value = value;
		this.unit = unit;
	}
}
