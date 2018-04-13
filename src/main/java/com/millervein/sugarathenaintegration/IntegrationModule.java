package com.millervein.sugarathenaintegration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import com.millervein.sugar.api.Authenticator;
import com.millervein.sugar.api.PingService;
import com.millervein.sugar.api.SugarAuthenticator;

public class IntegrationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Authenticator.class).annotatedWith(Names.named("Sugar")).to(SugarAuthenticator.class);
		bind(PingService.class);
	}
	
	@Provides
	ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		return mapper;
	}

}
