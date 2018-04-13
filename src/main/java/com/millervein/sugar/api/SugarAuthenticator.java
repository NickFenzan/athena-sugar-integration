package com.millervein.sugar.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;

public class SugarAuthenticator implements Authenticator {
	// TODO Turn these static strings into environment variables
	private final String TOKEN_REQUEST_URL = "https://sugar.millervein.com/sugar/rest/v10/oauth2/token";
	private ObjectMapper objectMapper;
	private AuthResponse authResponse;

	@Inject
	public SugarAuthenticator(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public String getToken() throws Exception {
		if (this.authResponse == null) {
			requestToken();
		}
		return authResponse.getAccessToken();
	}

	private void requestToken() throws Exception {
		// Create connections
		URL url = new URL(TOKEN_REQUEST_URL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json");
		con.setDoOutput(true);

		// Write Body
		OutputStream out = con.getOutputStream();
		String requestBody = objectMapper.writeValueAsString(new AuthRequest());
		out.write(requestBody.getBytes("UTF-8"));
		out.close();

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
		in.close();

		this.authResponse = objectMapper.readValue(content.toString(), AuthResponse.class);
	}

}
