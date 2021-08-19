package org.openmrs.module.isanteplusreports.hsisReport.library.dimensions;

import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnantWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pFClientsCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.customersInOralCareCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.otherAdultsCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.reducedMobilityEngineCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.reducedMobilitySensoryCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.microscopicTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.fastTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.microscopicTestAndPositiveCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.fastTestAndPositiveCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.positiveMicroscopicFastCohort;


import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.indicator.dimension.CohortDefinitionDimension;


public class HsisDimensionLibrary {
    
    public static CohortDefinitionDimension generalDimension(){		  
        CohortDefinitionDimension dim = new CohortDefinitionDimension();		  		  
        dim.setName("general");
        dim.addCohortDefinition("pregnant", ReportUtils.map(pregnantWomenCohort()));
        dim.addCohortDefinition("pf", ReportUtils.map(pFClientsCohort()));
        dim.addCohortDefinition("customersInOralCare", ReportUtils.map(customersInOralCareCohort()));
        dim.addCohortDefinition("otherAdults", ReportUtils.map(otherAdultsCohort()));
        dim.addCohortDefinition("reducedMobilityEngine", ReportUtils.map(reducedMobilityEngineCohort()));
        dim.addCohortDefinition("reducedMobilitySensory", ReportUtils.map(reducedMobilitySensoryCohort()));
      return dim;		
    };

    public static CohortDefinitionDimension malariaDimension(){
      CohortDefinitionDimension dim = new CohortDefinitionDimension();
        dim.setName("malariaExams");
        dim.addCohortDefinition("microscopicTestPositive", ReportUtils.map(microscopicTestAndPositiveCohort()));
        dim.addCohortDefinition("fastTestPositive", ReportUtils.map(fastTestAndPositiveCohort()));
        dim.addCohortDefinition("fastTestPositiveMicroscopicFast", ReportUtils.map(positiveMicroscopicFastCohort()));
        dim.addCohortDefinition("microscopicTest", ReportUtils.map(microscopicTestCohort()));
        dim.addCohortDefinition("fastTest", ReportUtils.map(fastTestCohort()));
      return dim;				  		  
      }	
}
