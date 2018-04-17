package com.millervein.athena;

public class AuthResponse {
	String tokenType;
	String mapi;
	String accessToken;
	Integer expiresIn;
	String refreshToken;

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public String getMapi() {
		return mapi;
	}

	public void setMapi(String mapi) {
		this.mapi = mapi;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Integer getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	@Override
	public String toString() {
		return "AuthResponse [tokenType=" + tokenType + ", mapi=" + mapi + ", accessToken=" + accessToken
				+ ", expiresIn=" + expiresIn + ", refreshToken=" + refreshToken + "]";
	}

}
