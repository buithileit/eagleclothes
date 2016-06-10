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
public enum TypeUser {

	ADMIN(0), NORMAL(1);

	private Integer value;

	private static Map<Integer, TypeUser> values = null;

	public Integer getValue() {
		return value;
	}

	TypeUser(Integer value) {
		this.value = value;
	}

	public static TypeUser parseValue(Integer value) {
		if (values == null) {
			values = new HashMap<Integer, TypeUser>(TypeUser.values().length);
			for (TypeUser e : TypeUser.values())
				values.put(e.getValue(), e);
		}
		return values.get(value);
	}

	@Override
	public String toString() {
		return this.value == null ? null : this.value.toString();
	}
}
