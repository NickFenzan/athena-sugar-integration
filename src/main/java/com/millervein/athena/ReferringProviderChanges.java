package com.millervein.athena;

import java.util.Arrays;

public class ReferringProviderChanges {
	Integer totalcount;
	ReferringProvider[] referringproviders;

	public Integer getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(Integer totalcount) {
		this.totalcount = totalcount;
	}

	public ReferringProvider[] getReferringproviders() {
		return referringproviders;
	}

	public void setReferringproviders(ReferringProvider[] referringproviders) {
		this.referringproviders = referringproviders;
	}

	@Override
	public String toString() {
		return "ReferringProviderChanges [totalcount=" + totalcount + ", referringproviders="
				+ Arrays.toString(referringproviders) + "]";
	}

}
