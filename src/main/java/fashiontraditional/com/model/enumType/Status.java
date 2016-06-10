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
public enum Status {

	DISABLE(0), ABLE(1);

	private Integer value;

	private static Map<Integer, Status> values = null;

	public Integer getValue() {
		return value;
	}

	Status(Integer value) {
		this.value = value;
	}

	public static Status parseValue(Integer value) {
		if (values == null) {
			values = new HashMap<Integer, Status>(Status.values().length);
			for (Status e : Status.values())
				values.put(e.getValue(), e);
		}
		return values.get(value);
	}

	@Override
	public String toString() {
		return this.value == null ? null : this.value.toString();
	}
}
