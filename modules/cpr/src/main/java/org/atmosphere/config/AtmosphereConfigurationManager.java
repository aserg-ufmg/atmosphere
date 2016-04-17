package org.atmosphere.config;

public class AtmosphereConfigurationManager {

	protected String paramName;
	protected String paramValue;

	public AtmosphereConfigurationManager() {
		super();
	}

	public String getParamName() {
	    return paramName;
	}

	public void setParamName(String paramName) {
	    this.paramName = paramName;
	}

	public String getParamValue() {
	    return paramValue;
	}

	public void setParamValue(String paramValue) {
	    this.paramValue = paramValue;
	}

}