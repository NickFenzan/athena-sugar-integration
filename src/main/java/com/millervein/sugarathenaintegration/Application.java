package com.millervein.sugarathenaintegration;

import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;
import com.millervein.athena.EntityType;
import com.millervein.athena.ReferringProviderChanges;

public class Application {

	public static void main(String[] args) throws Exception {
		Injector injector = Guice.createInjector(new IntegrationModule());
		Authenticator authenticator = injector.getInstance(Key.get(Authenticator.class, Names.named("Sugar")));
		System.out.println(authenticator.getToken());
		ObjectMapper om = injector.getInstance(ObjectMapper.class);
		
		
		
//		URL url = new URL("https://api.athenahealth.com/preview1/195900/referringproviders/changed?leaveunprocessed=true");
//		HttpURLConnection con = (HttpURLConnection) url.openConnection();
//		con.setRequestProperty("Content-Type", "application/json");
//		con.setRequestProperty("Authorization", "Bearer " + authenticator.getToken());
//		con.setRequestMethod("GET");
//		
//		ReferringProviderChanges response = om.readValue(con.getInputStream(), ReferringProviderChanges.class);
//		for (Integer i = 0; i < response.getReferringproviders().length; i++) {
//			System.out.println(ReferringProviderConverter.convert(response.getReferringproviders()[i]));
//			
//		}
		
		
//		System.out.println(response);
		
	}
	
	private static void processAthenaChanges() {
		Injector injector = Guice.createInjector(new IntegrationModule());
	}
	

}
