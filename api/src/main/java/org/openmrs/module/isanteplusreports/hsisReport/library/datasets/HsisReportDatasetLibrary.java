package org.openmrs.module.isanteplusreports.hsisReport.library.datasets;

import static org.openmrs.module.isanteplusreports.hsisReport.HsisReportConstants.HSIS_REPORTS_SQL_RESOURCE_PATH;
import static org.openmrs.module.isanteplusreports.hsisReport.utils.HsisReportUtils.cohortIndicatorFromSqlResource;
import static org.openmrs.module.isanteplusreports.hsisReport.utils.HsisReportUtils.getDateParameters;

import java.sql.Date;

import org.openmrs.module.isanteplusreports.IsantePlusReportsUtil;
import org.openmrs.module.isanteplusreports.hsisReport.library.columns.HsisReportColumns;
import org.openmrs.module.isanteplusreports.library.dimension.CommonDimension;
import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.SqlDataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.indicator.CohortIndicator;;

public class HsisReportDatasetLibrary {

  private final static Parameter START_DATE = new Parameter("startDate", "isanteplusreports.parameters.startdate",
      Date.class);

  private final static Parameter END_DATE = new Parameter("endDate", "isanteplusreports.parameters.enddate",
      Date.class);

  public static SqlDataSetDefinition getDistributionOfVistsDataset() {
    return IsantePlusReportsUtil.sqlDataSetDefinitionWithResourcePath("distributionOfVists.sql",
        "Distribution Of Vists", "description", HSIS_REPORTS_SQL_RESOURCE_PATH);
  }

  public static CohortIndicatorDataSetDefinition getVistsDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("new vists");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("age", ReportUtils.map(new CommonDimension().ageZone(), "effectiveDate=${endDate}"));
    CohortIndicator newVists = cohortIndicatorFromSqlResource("newVists.sql", "new Vists", getDateParameters());
    CohortIndicator susquentVists = cohortIndicatorFromSqlResource("subsquentVists.sql", "subsquent Vists",
        getDateParameters());
    HsisReportColumns.addAgeColumnsforVists(dsd, newVists, "new");
    HsisReportColumns.addAgeColumnsforVists(dsd, susquentVists, "sub");
    return dsd;
  }

}
