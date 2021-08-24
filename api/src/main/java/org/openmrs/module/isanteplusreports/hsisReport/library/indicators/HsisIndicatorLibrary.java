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

   public static CohortIndicator  getNormalDeliveryIndicator() {
      return cohortIndicatorFromSqlResource("normal.sql", "Delivery institutional normal",getDateParameters());
   
    }
  
    public static CohortIndicator  getCaesareanDeliveryIndicator() {
      return cohortIndicatorFromSqlResource("caesarean.sql", "Delivery institutional Caesarean section",getDateParameters());
    }
  
    public static CohortIndicator   getInstrumentaisedDeliveryIndicator() {
      return cohortIndicatorFromSqlResource("instrumentalised.sql", "Delivery institutional instrumentalised",getDateParameters());
      
    }
  
    public static CohortIndicator  getMidwivesDeliveryIndicator() {
      return cohortIndicatorFromSqlResource("midwives.sql", "Delivery community Midwives",getDateParameters());
      
    }
  
    public static CohortIndicator  getComplicationsDeliveryIndicator() {
      return cohortIndicatorFromSqlResource("complications.sql", "Delivery community Number of obstetric complications referred",getDateParameters());
    }

    public static CohortIndicator  getNormalBirthIndicator() {
      return cohortIndicatorFromSqlResource("normalBirth.sql", "Live births institutional normal",getDateParameters());
   
    }
  
    public static CohortIndicator  getCaesareanBirthIndicator() {
      return cohortIndicatorFromSqlResource("caesareanBirth.sql", "Live births institutional Caesarean section",getDateParameters());
    }
  
    public static CohortIndicator   getInstrumentaisedBirthIndicator() {
      return cohortIndicatorFromSqlResource("instrumentalisedBirth.sql", "Live births institutional instrumentalised",getDateParameters());
      
    }
  
    public static CohortIndicator  getMidwivesBirthIndicator() {
      return cohortIndicatorFromSqlResource("midwivesBirth.sql", "Live births community Midwives",getDateParameters());
      
    }
  
    public static CohortIndicator  getComplicationsBirthIndicator() {
      return cohortIndicatorFromSqlResource("complicationsBirth.sql", "Live births community Number of obstetric complications referred",getDateParameters());
    }
}
