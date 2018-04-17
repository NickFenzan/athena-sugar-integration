package com.millervein.sugar.api;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.millervein.sugar.Organization;
import com.millervein.sugarathenaintegration.Authenticator;

public class OrganizationService {
	Authenticator auth;
	ObjectMapper om;
	
	@Inject
	public OrganizationService(@Named("Sugar") Authenticator auth, ObjectMapper om) {
		this.auth = auth;
		this.om = om;
	}
	
	public Organization get(String id) throws Exception {
		URL url = new URL("https://sugar.millervein.com/sugar/rest/v10/MVOR_Organizations/"+id);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("oauth-token", auth.getToken());
		con.setRequestMethod("GET");
		
		return om.readValue(con.getInputStream(), Organization.class);
		
	}
	
	public void save(Organization organization) {
		
	}
	
	public void delete(String id) {
		
	}

}
