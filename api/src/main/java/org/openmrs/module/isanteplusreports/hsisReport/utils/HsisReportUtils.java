package org.openmrs.module.isanteplusreports.hsisReport.utils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.openmrs.module.isanteplusreports.IsantePlusReportsUtil;
import static org.openmrs.module.isanteplusreports.hsisReport.HsisReportConstants.HSIS_REPORTS_SQL_RESOURCE_PATH;
import org.openmrs.module.isanteplusreports.reporting.utils.EmrReportingUtils;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;

public class HsisReportUtils {

    public static void constructColumn(String columnName, String ColumnDescription, CohortIndicator CohortIndicator,
	        String dimension, CohortIndicatorDataSetDefinition dsd) {
		dsd.addColumn(columnName, ColumnDescription, Mapped.mapStraightThrough(CohortIndicator), dimension);
	}

	public static CohortIndicator cohortIndicatorFromSqlResource(String sql, String name, List<Parameter> parameters) {
		return EmrReportingUtils.cohortIndicator(name, parameters,
		    Mapped.mapStraightThrough(cohortDefinitionFromSqlResource(sql, name)));
	}

	public static SqlCohortDefinition cohortDefinitionFromSqlResource(String sqlResourceName, String cohortDefinitionName) {
        String sql = IsantePlusReportsUtil
                .getStringFromResource(HSIS_REPORTS_SQL_RESOURCE_PATH + sqlResourceName);
        SqlCohortDefinition definition = IsantePlusReportsUtil.sqlCohortDefinition(sql, cohortDefinitionName,cohortDefinitionName);
        return definition;
    }

	public static List<Parameter> getDateParameters() {
		return Arrays.asList(new Parameter("startDate", "Start Date", Date.class),
		    new Parameter("endDate", "End Date", Date.class));
	}
	
}
