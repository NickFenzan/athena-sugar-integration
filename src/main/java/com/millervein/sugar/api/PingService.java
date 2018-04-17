package com.millervein.sugar.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.millervein.sugarathenaintegration.Authenticator;

public class PingService {
	
	Authenticator auth;

	@Inject
	public PingService(@Named("Sugar") Authenticator auth) {
		this.auth = auth;
	}
	
	public String getPingResponse() throws Exception {
		URL url = new URL("https://sugar.millervein.com/sugar/rest/v10/ping");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("oauth-token", auth.getToken());
		
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
		in.close();
		
		return content.toString();
	}
}
