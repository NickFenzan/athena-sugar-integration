package com.millervein.sugarathenaintegration;

import com.millervein.sugar.Organization;

public class ReferringProviderConverter {

	static public Object convert(com.millervein.athena.ReferringProvider athenaReferringProvider) {
		switch (athenaReferringProvider.getEntitytype()) {
		case PERSON:
			return convertToSugarReferringProvider(athenaReferringProvider);
		case NONPERSON:
			return convertToSugarOrganization(athenaReferringProvider);
		default:
			return null;
		}
	}

	static private com.millervein.sugar.ReferringProvider convertToSugarReferringProvider(
			com.millervein.athena.ReferringProvider a) {
		com.millervein.sugar.ReferringProvider s = new com.millervein.sugar.ReferringProvider();
		s.setAthenaId(a.getReferringproviderid());
		s.setNpiNumber(a.getNpinumber());
		s.setFirstName(a.getFirstname());
		s.setMiddleInitial(a.getMiddleinitial());
		s.setLastName(a.getLastname());
		s.setSuffix(a.getNamesuffix());
		s.setProviderType(a.getProvidertype());
		s.setSpecialty(a.getSpecialty());
		s.setPhone(a.getPhone());
		s.setFax(a.getFax());
		s.setEmail(a.getEmail());
		return s;

	}

	static private Organization convertToSugarOrganization(com.millervein.athena.ReferringProvider athenaReferringProvider) {
		Organization organization = new Organization();
		organization.setAthenaId(athenaReferringProvider.getReferringproviderid());
		organization.setName(athenaReferringProvider.getName());
		organization.setSpecialty(athenaReferringProvider.getSpecialty());
		return organization;
	}

}
