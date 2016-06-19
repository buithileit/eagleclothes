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
public enum StatusCheck {

	DISABLE(0), OK(1);

	private Integer value;

	private static Map<Integer, StatusCheck> values = null;

	public Integer getValue() {
		return value;
	}

	StatusCheck(Integer value) {
		this.value = value;
	}

	public static StatusCheck parseValue(Integer value) {
		if (values == null) {
			values = new HashMap<Integer, StatusCheck>(StatusCheck.values().length);
			for (StatusCheck e : StatusCheck.values())
				values.put(e.getValue(), e);
		}
		return values.get(value);
	}

	@Override
	public String toString() {
		return this.value == null ? null : this.value.toString();
	}
}
