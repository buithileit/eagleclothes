/**
 * 
 */
package fashiontraditional.com.model.enumType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Win 8 32bit VS7
 *
 */
public enum StatusDeliver {

	NOT_YET(0), DELIVERED(1);

	private Integer value;

	private static Map<Integer, StatusDeliver> values = null;

	public Integer getValue() {
		return value;
	}

	StatusDeliver(Integer value) {
		this.value = value;
	}

	public static StatusDeliver parseValue(Integer value) {
		if (values == null) {
			values = new HashMap<Integer, StatusDeliver>(StatusDeliver.values().length);
			for (StatusDeliver e : StatusDeliver.values())
				values.put(e.getValue(), e);
		}
		return values.get(value);
	}

	@Override
	public String toString() {
		return this.value == null ? null : this.value.toString();
	}
}
