package org.openmrs.module.isanteplusreports.hsisReport;

import org.openmrs.module.reporting.dataset.definition.SqlDataSetDefinition;
import static org.openmrs.module.isanteplusreports.util.IsantePlusReportsConstants.REPORTS_SQL_PATH;

import org.openmrs.module.isanteplusreports.IsantePlusReportsUtil;

public class HsisReportDatasets {

    public static final String PATH = REPORTS_SQL_PATH + "hsisReports/";

    public static final String PATH_DISTRIBUTION_OF_VISTS_SQL = PATH + "distributionOfVists.sql";
    
    private static String resourceName = "distributionOfVists.sql";

    public static SqlDataSetDefinition getDistributionOfVistsDataset() {
		return IsantePlusReportsUtil.sqlDataSetDefinitionWithResourcePath(resourceName, "Distribution Of Vists", "description", PATH);
	}   
}
