package com.millervein.athena;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.entity.ContentType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.millervein.sugarathenaintegration.Authenticator;

public class AthenaAuthenticator implements Authenticator {

	// TODO Turn these static strings into environment variables
	private final String CLIENT_ID = "b7ubjbe2y7udsr2ynefxv6ae";
	private final String CLIENT_SECRET = "aneVXrEUJz6NjTq";
	private final String TOKEN_REQUEST_URL = "https://api.athenahealth.com/oauthpreview/token";
	private ObjectMapper objectMapper;
	private AuthResponse authResponse;

	@Inject
	public AthenaAuthenticator(ObjectMapper objectMapper) {
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
			con.setRequestProperty("Content-Type", ContentType.APPLICATION_FORM_URLENCODED.toString());
			con.setRequestProperty("Authorization", getAuthString());
			con.setDoOutput(true);

			// Write Body
			OutputStream out = con.getOutputStream();
			out.write("grant_type=client_credentials".getBytes());
			out.close();
			

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			this.authResponse = objectMapper.readValue(in, AuthResponse.class);
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private String getAuthString() {
		String unencoded = CLIENT_ID + ":" + CLIENT_SECRET;
		String encoded = Base64.encodeBase64String(unencoded.getBytes());
		return "Basic " + encoded;
	}

}
