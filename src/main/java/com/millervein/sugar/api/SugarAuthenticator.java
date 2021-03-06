package com.millervein.sugar.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.millervein.sugarathenaintegration.Authenticator;

public class SugarAuthenticator implements Authenticator {
	// TODO Turn these static strings into environment variables
	private final String TOKEN_REQUEST_URL = "https://sugar.millervein.com/sugar/rest/v10/oauth2/token";
	private ObjectMapper objectMapper;
	private AuthResponse authResponse;

	@Inject
	public SugarAuthenticator(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public String getToken() {
		if (this.authResponse == null) {
			requestToken();
		}
		return authResponse.getAccessToken();
	}

	private void requestToken() {
		try {
			// Create connections
			URL url = new URL(TOKEN_REQUEST_URL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);

			// Write Body
			OutputStream out = con.getOutputStream();
			objectMapper.writeValue(out, new AuthRequest());
			out.close();
			

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			this.authResponse = objectMapper.readValue(in, AuthResponse.class);
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
