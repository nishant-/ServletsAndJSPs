package com.nishant.customtag;

import java.util.ResourceBundle;
public class Implementation {

	public static final String BUNDLE_NAME = Implementation.class.getName();
	public static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
	public static final String KEY1=RESOURCE_BUNDLE.getString("KEY1");
	public static final String KEY2=RESOURCE_BUNDLE.getString("KEY2");
	public static final String getString(String key)
	{
		return RESOURCE_BUNDLE.getString(key);
	}
}