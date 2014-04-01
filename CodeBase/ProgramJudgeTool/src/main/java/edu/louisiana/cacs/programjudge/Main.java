package edu.louisiana.cacs.programjudge;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.louisiana.cacs.programjudge.util.Configurator;
import edu.louisiana.cacs.programjudge.util.ProgramJudgeToolConstants;

/**
 * <p>
 * Main class which calls required methods.
 * </p>
 * <p>
 * It also configures the system by reading the programjudgetool.properties
 * <p>
 * 
 * @author rsunkara
 * @since April 1,2014
 * 
 */
public class Main {

	private static Log m_logger = LogFactory.getLog(Main.class);
	//private static Configurator m_Configurator;

	static {
		//m_Configurator = loadSystemConfig();
	}

	/**
	 * Reads the system properties and loads them.
	 * 
	 * Will exit the system if any errors occurs while loading the system config.
	 */
	public static Configurator loadSystemConfig() {
		Configurator xConfigurator = new Configurator();
		String xPropertiesFilePath = ProgramJudgeToolConstants.SYSTEM_PROPERTY_FILE;
		if (!xConfigurator.loadConfigValues(xPropertiesFilePath)) {
			m_logger.fatal("Unable to configure the system.Exiting it.");
			System.exit(0);
		}
		return xConfigurator;
	}

	public static void main(String[] args) {

	}
}
