package org.atmosphere.cpr;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public interface FrameworkInitializer {

	AtmosphereFrameworkInitializer configureFramework(ServletConfig sc) throws ServletException;

	AtmosphereFrameworkInitializer configureFramework(ServletConfig sc, boolean init, boolean useNative,
			Class<? extends AtmosphereFramework> frameworkClass) throws ServletException;

}