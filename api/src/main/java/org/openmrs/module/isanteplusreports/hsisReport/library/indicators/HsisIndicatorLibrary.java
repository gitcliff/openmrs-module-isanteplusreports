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
   
   public static CohortIndicator getFirstVisitIndicator(){
      return cohortIndicatorFromSqlResource("firstVisit.sql", "First visit for women and mothers",getDateParameters()); 
   }   

   public static CohortIndicator getSecondVisitIndicator(){
      return cohortIndicatorFromSqlResource("secondVisit.sql", "Second visit for women and mothers",getDateParameters()); 
   }   

   public static CohortIndicator getThirdVisitIndicator(){
      return cohortIndicatorFromSqlResource("thirdVisit.sql", "Third visit for women and mothers",getDateParameters()); 
   }   

   public static CohortIndicator getFourthVisitIndicator(){
      return cohortIndicatorFromSqlResource("fourthVisit.sql", "Fourth visit for women and mothers",getDateParameters()); 
   }   

   public static CohortIndicator getFifthVisitIndicator(){
      return cohortIndicatorFromSqlResource("fifthVisit.sql", "Fifth visit for women and mothers",getDateParameters()); 
   }  
   
   public static CohortIndicator getSupportForPregnantWomenIndicator(){
      return cohortIndicatorFromSqlResource("supportForPregnantWomen.sql", "Support For Pregnant Women",getDateParameters()); 
   }   
}
