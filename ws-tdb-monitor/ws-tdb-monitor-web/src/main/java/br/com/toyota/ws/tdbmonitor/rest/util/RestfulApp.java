package br.com.toyota.ws.tdbmonitor.rest.util;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.com.toyota.ws.tdbmonitor.rest.web.StartUpIntegrationWS;
import br.com.toyota.ws.tdbmonitor.rest.web.WrapUpIntegrationWS;

@ApplicationPath("/rest")
public class RestfulApp extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public RestfulApp() {
		this.singletons.add(new StartUpIntegrationWS());
		this.singletons.add(new WrapUpIntegrationWS());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return this.empty;
	}

	@Override
	public Set<Object> getSingletons() {
		return this.singletons;
	}
}