package pathexamplejava.service;

import com.google.inject.Inject;

import pathexamplejava.server.json.JsonHelper;
import pathexamplejava.server.json.JsonTransformer;

public abstract class AbstractRestService {

	@Inject
	JsonHelper jsonHelper;

	public abstract void init();
	
	protected <C> C fromJson(String json, Class<C> classOfC) {
		return jsonHelper.fromJson(json, classOfC);
	}

	protected JsonTransformer getJsonTransformer() {
		return jsonHelper.getJsonTransformer();
	}
	
}
