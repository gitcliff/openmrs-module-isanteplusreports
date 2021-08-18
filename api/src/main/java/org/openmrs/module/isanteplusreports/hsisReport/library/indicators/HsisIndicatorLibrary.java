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

    public static CohortIndicator getTotalMalariaIndicator(){
        return cohortIndicatorFromSqlResource("totalMalaria.sql", "Total examinations for malaria",getDateParameters()); 
     }

    public static CohortIndicator getPositiveMalariaIndicator(){
      return cohortIndicatorFromSqlResource("positiveMalaria.sql", "Positive examinations for malaria",getDateParameters()); 
     }

}
