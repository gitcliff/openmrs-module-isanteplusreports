package org.openmrs.module.isanteplusreports.hsisReport.library.columns;

import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.utils.HsisReportUtils.constructColumn;

public class HsisReportColumns {

    public static final String CHILD_0_1 = "children0_1_";
    public static final String CHILD_1_4 = "children1_4_";
    public static final String CHILD_5_9 = "children5_9_";
    public static final String CHILD_10_14 = "children10_14_";
    public static final String CHILD_15_19 = "children15_19_";
    public static final String CHILD_20_24 = "children20_24_";
	
    
    public static void addAgeColumnsforVists(CohortIndicatorDataSetDefinition dsd, CohortIndicator CohortIndicator ,String vistType) {
        constructColumn(CHILD_0_1 + vistType, "0-1 Years", CohortIndicator, "age=0_1", dsd);
        constructColumn(CHILD_1_4 + vistType, "1-4 Years", CohortIndicator, "age=1_4", dsd);
        constructColumn(CHILD_5_9 + vistType, "5-9 Years", CohortIndicator, "age=5_9", dsd);
        constructColumn(CHILD_10_14 + vistType, "10-14 Years", CohortIndicator, "age=10_14", dsd);
        constructColumn(CHILD_15_19 + vistType, "15-19 Years", CohortIndicator, "age=15_19", dsd);
        constructColumn(CHILD_20_24 + vistType, "20-24 Years", CohortIndicator, "age=20_24", dsd);
    }

}
