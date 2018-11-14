package com.java.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyApp extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {SecurityWebConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {MyWebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	    df.setLenient(false);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(df, true));
	}
	
}
