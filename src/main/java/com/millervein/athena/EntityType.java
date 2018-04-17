package com.millervein.athena;

public enum EntityType {
	PERSON("Person"),
	NONPERSON("Non-Person");
	private final String name;

	EntityType(final String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
