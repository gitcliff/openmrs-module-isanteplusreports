package org.openmrs.module.isanteplusreports.hsisReport.library.indicators;

import org.openmrs.module.reporting.indicator.CohortIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.utils.HsisReportUtils.getDateParameters;
import static org.openmrs.module.isanteplusreports.hsisReport.utils.HsisReportUtils.cohortIndicatorFromSqlResource;

public class HsisIndicatorLibrary {
    
    public static CohortIndicator getNewVistsIndicator(){
       return cohortIndicatorFromSqlResource("newVists.sql", "new Vists", getDateParameters()); 
    }

    public static CohortIndicator getSubsquentVistsIndicator(){
      return cohortIndicatorFromSqlResource("subsquentVists.sql", "subsquent Vists",getDateParameters()); 
   }

    public static CohortIndicator getMalariaIndicator(){
        return cohortIndicatorFromSqlResource("malaria.sql", "Examinations for malaria",getDateParameters()); 
     }

     public static CohortIndicator getPregnantWomenMalariaIndicator(){
      return cohortIndicatorFromSqlResource("pregnantWomenMalaria.sql", "Pregnant women under malaria",getDateParameters()); 
   } 
   
   public static CohortIndicator getOtherGroupsMalariaIndicator(){
      return cohortIndicatorFromSqlResource("pregnantOtherGroups.sql", "Other groups pregnant women under malaria",getDateParameters()); 
   }   

}
