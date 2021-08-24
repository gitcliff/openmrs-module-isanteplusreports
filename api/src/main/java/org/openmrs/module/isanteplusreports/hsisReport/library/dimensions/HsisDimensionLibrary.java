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
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.hemogramCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.vihCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.rPRCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.sicklingTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.bloodGroupCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.urinesCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.otherSicklingTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.otherBloodGroupCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.positiveVihCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.positiveRPRCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.positiveSicklingTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.positiveOtherSicklingTestCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.zeroToThreeMonthsCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.fourToSixMonthsCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.sevenToNineMonthsCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyRiskCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyAnemiaCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyFolateIronCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyFerritiveCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.deliveryPlanCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyChloroquineCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.impregnantedMosquitoNetCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyPbCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.pregnancyMamCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.partogramCohort;
import static org.openmrs.module.isanteplusreports.hsisReport.library.cohorts.HsisReportCohortLibrary.managementCohort;


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
        dim.setName("malariaExam");
        dim.addCohortDefinition("microscopicTestPositive", ReportUtils.map(microscopicTestAndPositiveCohort()));
        dim.addCohortDefinition("fastTestPositive", ReportUtils.map(fastTestAndPositiveCohort()));
        dim.addCohortDefinition("fastTestPositiveMicroscopicFast", ReportUtils.map(positiveMicroscopicFastCohort()));
        dim.addCohortDefinition("microscopicTest", ReportUtils.map(microscopicTestCohort()));
        dim.addCohortDefinition("fastTest", ReportUtils.map(fastTestCohort()));
      return dim;				  		  
      }	

    public static CohortDefinitionDimension pregnantDimension(){
        CohortDefinitionDimension dim = new CohortDefinitionDimension();
          dim.setName("pregnantWomen");
          dim.addCohortDefinition("hemogram", ReportUtils.map(hemogramCohort()));
          dim.addCohortDefinition("vih", ReportUtils.map(vihCohort()));
          dim.addCohortDefinition("rPR", ReportUtils.map(rPRCohort()));
          dim.addCohortDefinition("sicklingTest", ReportUtils.map(sicklingTestCohort()));
          dim.addCohortDefinition("bloodGroup", ReportUtils.map(bloodGroupCohort()));
          dim.addCohortDefinition("urines", ReportUtils.map(urinesCohort()));
          dim.addCohortDefinition("otherUrines", ReportUtils.map(otherSicklingTestCohort()));
          dim.addCohortDefinition("otherBloodGroup", ReportUtils.map(otherBloodGroupCohort()));
          dim.addCohortDefinition("vihPositive", ReportUtils.map(positiveVihCohort()));
          dim.addCohortDefinition("rprPositive", ReportUtils.map(positiveRPRCohort()));
          dim.addCohortDefinition("sicklingPositive", ReportUtils.map(positiveSicklingTestCohort()));
          dim.addCohortDefinition("sicklingPositiveOthers", ReportUtils.map(positiveOtherSicklingTestCohort()));
        return dim;				  		  
        }	 
        
    public static CohortDefinitionDimension womenMotherDimension(){
        CohortDefinitionDimension dim = new CohortDefinitionDimension();
          dim.setName("womenMothers");
          dim.addCohortDefinition("zeroToThree", ReportUtils.map(zeroToThreeMonthsCohort()));
          dim.addCohortDefinition("fourToSix", ReportUtils.map(fourToSixMonthsCohort()));
          dim.addCohortDefinition("sevenToNine", ReportUtils.map(sevenToNineMonthsCohort()));
        return dim;				  		  
        }	   

    public static CohortDefinitionDimension deliveriesDimension(){
          CohortDefinitionDimension dim = new CohortDefinitionDimension();
            dim.setName("deliveriesMothers");
            dim.addCohortDefinition("partogram", ReportUtils.map(partogramCohort()));
            dim.addCohortDefinition("mgt", ReportUtils.map(managementCohort()));
          return dim;				  		  
          }	 
          
    public static CohortDefinitionDimension liveBirthsDimension(){
          CohortDefinitionDimension dim = new CohortDefinitionDimension();
            dim.setName("deliveriesMothers");
            dim.addCohortDefinition("undeveloped", ReportUtils.map(partogramCohort()));
            dim.addCohortDefinition("immediately", ReportUtils.map(managementCohort()));
          return dim;				  		  
          }	          
        
    public static CohortDefinitionDimension supportForPregnantWomenDimension(){
          CohortDefinitionDimension dim = new CohortDefinitionDimension();
            dim.setName("supportWomen");
            dim.addCohortDefinition("risk", ReportUtils.map(pregnancyRiskCohort()));
            dim.addCohortDefinition("anemia", ReportUtils.map(pregnancyAnemiaCohort()));
            dim.addCohortDefinition("folateIron", ReportUtils.map(pregnancyFolateIronCohort()));
            dim.addCohortDefinition("ferritive", ReportUtils.map(pregnancyFerritiveCohort()));
            dim.addCohortDefinition("deliveryPlan", ReportUtils.map(deliveryPlanCohort()));
            dim.addCohortDefinition("chloroquine", ReportUtils.map(pregnancyChloroquineCohort()));
            dim.addCohortDefinition("mosquitoNet", ReportUtils.map(impregnantedMosquitoNetCohort()));
            dim.addCohortDefinition("pregnancyPb", ReportUtils.map(pregnancyPbCohort()));
            dim.addCohortDefinition("pregnancyMam", ReportUtils.map(pregnancyMamCohort()));
          return dim;				  		  
          }	        
}
