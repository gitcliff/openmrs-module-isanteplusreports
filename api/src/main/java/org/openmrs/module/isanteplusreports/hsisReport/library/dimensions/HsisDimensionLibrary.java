package org.openmrs.module.isanteplusreports.hsisReport.library.dimensions;

import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnantWomenCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pFClientsCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.customersInOralCareCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.otherAdultsCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.reducedMobilityEngineCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.reducedMobilitySensoryCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.microscopicTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.fastTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.testedForMalariaCohort;
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

    public static CohortDefinitionDimension positiveMicroscopicDimension(){
      CohortDefinitionDimension dim = new CohortDefinitionDimension();
        dim.setName("positive microscopic");
        dim.addCohortDefinition("microscopicTestPositive", ReportUtils.map(microscopicTestAndPositiveCohort()));
      return dim;				  		  
      }	

      public static CohortDefinitionDimension positiveFastDimension(){
        CohortDefinitionDimension dim = new CohortDefinitionDimension();
          dim.setName("positive fast");
          dim.addCohortDefinition("fastTestPositive", ReportUtils.map(fastTestAndPositiveCohort()));
        return dim;				  		  
        }	

        public static CohortDefinitionDimension positiveMicroscopicFastDimension(){
          CohortDefinitionDimension dim = new CohortDefinitionDimension();
            dim.setName("positive fastMicroscopicFast");
            dim.addCohortDefinition("fastTestPositiveMicroscopicFast", ReportUtils.map(positiveMicroscopicFastCohort()));
          return dim;				  		  
          }	  
      
      public static CohortDefinitionDimension microscopicTestDimension(){
        CohortDefinitionDimension dim = new CohortDefinitionDimension();
          dim.setName("microscopic test");
          dim.addCohortDefinition("microscopicTest", ReportUtils.map(microscopicTestCohort()));
        return dim;				  		  
      }	 

      public static CohortDefinitionDimension fastTestDimension(){
        CohortDefinitionDimension dim = new CohortDefinitionDimension();
          dim.setName("fast test");
          dim.addCohortDefinition("fastTest", ReportUtils.map(fastTestCohort()));
        return dim;				  		  
      }	 

}
