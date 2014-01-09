package com.levelup.tutorials;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;

public class State {

	private String stateCode;
	private String name;
	private String regionCode;
	private int population;
	
	public State(String stateCode, String name, String regionCode,
			int population) {
		super();
		this.stateCode = stateCode;
		this.name = name;
		this.regionCode = regionCode;
		this.population = population;
	}
	
	/**
	 * Predicate should return true if region code 
	 * is equal to MDW
	 */
	static Predicate<State> byMdwRegion = new Predicate<State>() {
		public boolean apply(State input) {
			return input.getRegionCode().equals("MDW");
		}
	};
	
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this)
				.add("stateCode", stateCode)
				.add("name", name)
				.toString();
	
	}
	
	
}
