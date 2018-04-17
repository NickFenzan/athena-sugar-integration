package com.millervein.sugar.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.millervein.sugarathenaintegration.Authenticator;

public class RestService {

	private Authenticator auth;
	private ObjectMapper om;
	private static final String REST_URI = "http://sugar.millervein.com/sugar/rest/v10";

	@Inject
	public RestService(@Named("Sugar") Authenticator auth, ObjectMapper om) {
		this.auth = auth;
		this.om = om;
	}
	


}
