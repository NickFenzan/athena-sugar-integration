package com.millervein.sugarathenaintegration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import com.millervein.athena.AthenaAuthenticator;
import com.millervein.sugar.api.OrganizationService;
import com.millervein.sugar.api.PingService;
import com.millervein.sugar.api.RestService;
import com.millervein.sugar.api.SugarAuthenticator;

public class IntegrationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Authenticator.class).annotatedWith(Names.named("Sugar")).to(SugarAuthenticator.class);
		bind(Authenticator.class).annotatedWith(Names.named("Athena")).to(AthenaAuthenticator.class);
		bind(PingService.class);
		bind(RestService.class);
		bind(OrganizationService.class);
	}

	@Provides
	ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
		mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		return mapper;
	}
	

}
