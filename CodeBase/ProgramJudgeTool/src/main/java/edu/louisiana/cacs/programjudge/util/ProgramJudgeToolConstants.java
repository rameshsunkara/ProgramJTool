package edu.louisiana.cacs.programjudge.util;

import java.text.SimpleDateFormat;

public class ProgramJudgeToolConstants {

	public static final String SYSTEM_PROPERTY_FILE = "dealerexercise.properties";
	
	public static final SimpleDateFormat S_D_F = new SimpleDateFormat("MMDDYYYYhhmmss");
	
	public static final String KEY_COUNT_OUTPUT_FILE = "KEYCOUNT_"+ S_D_F.format(new java.util.Date());
}
