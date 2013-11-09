package com.amatellanes.android;

import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;

import android.app.Application;

@ReportsCrashes(
		formKey = "", 
		formUri = "https://adrianchaz.cloudant.com/acra-myapp/_design/acra-storage/_update/report", 
		reportType=org.acra.sender.HttpSender.Type.JSON,
		httpMethod=org.acra.sender.HttpSender.Method.PUT,
		formUriBasicAuthLogin = "ichadfusiondesessenedges", 
		formUriBasicAuthPassword = "XL5TaO11nEe4Wt4LC3IWWPJC")
public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();

		// The following line triggers the initialization of ACRA
		ACRA.init(this);
	}
}