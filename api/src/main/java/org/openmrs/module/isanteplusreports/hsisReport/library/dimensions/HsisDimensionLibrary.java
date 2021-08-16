package org.openmrs.module.isanteplusreports.hsisReport.library.dimensions;

import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnantWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pFClientsCohort;
import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.indicator.dimension.CohortDefinitionDimension;


public class HsisDimensionLibrary {
    
    public static CohortDefinitionDimension generalDimension(){		  
        CohortDefinitionDimension dim = new CohortDefinitionDimension();		  		  
        dim.setName("general");
        dim.addCohortDefinition("pregnant", ReportUtils.map(pregnantWomenCohort()));
        dim.addCohortDefinition("pf", ReportUtils.map(pFClientsCohort()));
      return dim;		
    };
}
