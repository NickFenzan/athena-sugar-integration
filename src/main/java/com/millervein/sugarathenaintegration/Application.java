package com.millervein.sugarathenaintegration;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.millervein.sugar.api.PingService;

public class Application {

	public static void main(String[] args) throws Exception {
		Injector injector = Guice.createInjector(new IntegrationModule());
//		Authenticator authenticator = injector.getInstance(Key.get(Authenticator.class, Names.named("Sugar")));
//		System.out.println(authenticator.getToken());
		PingService pinger = injector.getInstance(PingService.class);
		System.out.println(pinger.getPingResponse());
	}

}
