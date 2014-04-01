package edu.louisiana.cacs.programjudge.util;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Contains utility methods used in this application.
 * @author rsunkara
 *
 */
public class MyUtilities {
	
	private static Log m_logger = LogFactory.getLog(MyUtilities.class);
	
	/**
	 * Loads the given properties file into Properties object.
	 * @param p_PropertiesFilePath
	 * @return
	 */
	public static Properties loadProperties(String p_PropertiesFilePath) {
		m_logger.debug("Enter loadProperties()");
		if (m_logger.isTraceEnabled()) {
			m_logger.trace("File passed:" + p_PropertiesFilePath);
		}
		Properties xProperties = null;
		InputStream xPropertiesStream = null;
		try {
			xPropertiesStream = MyUtilities.class.getClassLoader().getResourceAsStream(p_PropertiesFilePath);
			xProperties = new Properties();
			xProperties.load(xPropertiesStream);
		} catch (FileNotFoundException e) {
			m_logger.error("FileNotFoundException caught while loading:"
					+ p_PropertiesFilePath, e);
			return null;
		} catch (IOException e) {
			m_logger.error("IOException caught while loading:"
					+ p_PropertiesFilePath, e);
			return null;
		} finally {
			if (xPropertiesStream != null)
				try {
					xPropertiesStream.close();
				} catch (IOException e) {
					m_logger.error(
							"Potential Memory leak, Exception occured while closing stream",
							e);
				}
		}
		if(m_logger.isTraceEnabled()){
			m_logger.trace("No.of properties loaded:"+xProperties.size());
		}
		m_logger.debug("Exit loadProperties()");
		return xProperties;
	}
	
}
