package fashiontraditional.com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component("systemInfo")
@Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SystemInfo {

	private Set<String> sessions = new LinkedHashSet<String>();
	private int nuUserAccess;

	public int getNuPeopleAccess() {
		return sessions.size();
	}

	public int getNuUserAccess() {
		return nuUserAccess;
	}

	public void addSession(String sessionid) {
		this.sessions.add(sessionid);
	}

	public void addNuUserAccess() {
		this.nuUserAccess++;
	}

}
