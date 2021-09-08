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
   
   public static CohortIndicator getWomenVisitIndicator(){
      return cohortIndicatorFromSqlResource("womenVisit.sql", "Visit for women and mothers",getDateParameters()); 
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

    public static CohortIndicator  getAcceptingIndicator() {
      return cohortIndicatorFromSqlResource("accepting.sql", "Accepting methods",getDateParameters());
    }

    public static CohortIndicator  getTotalUsersIndicator() {
      return cohortIndicatorFromSqlResource("totalUsers.sql", "Total users",getDateParameters());
    }

    public static CohortIndicator  getPostnatalFollowUpIndicator() {
      return cohortIndicatorFromSqlResource("postnatalFollowUp.sql", "Post natal follow-up",getDateParameters());
    }
 
    public static CohortIndicator  getChildrenUnderSixMonthsIndicator() {
      return cohortIndicatorFromSqlResource("childrenUnderSixMonths.sql", "Support for the child male Children <6 months",getDateParameters());
    }

    public static CohortIndicator  getChildrenBetweenSixAndTwentyThreeMonthsIndicator() {
      return cohortIndicatorFromSqlResource("childrenBetweenSixAndTwentyThreeMonths.sql", "Support for the child male Children 6 - 23 months",getDateParameters());
    }

    public static CohortIndicator  getChildrenBetweenTwentyFourAndFiftyNineMonthsIndicator() {
      return cohortIndicatorFromSqlResource("childrenBetweenTwentyFourAndFiftyNineMonths.sql", "Support for the child male Children 24 - 59 months",getDateParameters());
    }

   public static CohortIndicator getDiseasesDisaggregationIndicator(){
      return cohortIndicatorFromSqlResource("diseasesDisaggregation.sql", "Diseases Disaggregation Per Age",getDateParameters()); 
   } 

   public static CohortIndicator getChronicDiseasesIndicator(){
    return cohortIndicatorFromSqlResource("chronicDiseases.sql", "Diseases Disaggregation Per Age and Sex",getDateParameters()); 
  } 

  public static CohortIndicator getGirlsUnderElevenMonthsInstIndicator(){
    return cohortIndicatorFromSqlResource("girlsUnderElevenMonthsInst.sql", "Vaccines",getDateParameters()); 
  } 

  public static CohortIndicator getGirlsUnderElevenMonthsCommIndicator(){
    return cohortIndicatorFromSqlResource("girlsUnderElevenMonthsComm.sql", "Vaccines",getDateParameters()); 
  } 

  public static CohortIndicator getBoysUnderElevenMonthsInstIndicator(){
    return cohortIndicatorFromSqlResource("boysUnderElevenMonthsInst.sql", "Vaccines",getDateParameters()); 
  } 

  public static CohortIndicator getBoysUnderElevenMonthsCommIndicator(){
    return cohortIndicatorFromSqlResource("boysUnderElevenMonthsComm.sql", "Vaccines",getDateParameters()); 
  } 



  public static CohortIndicator getGirlsBetweenTwelveToTwentyThreeMonthsInstIndicator(){
    return cohortIndicatorFromSqlResource("girlsBetweenTwelveToTwentyThreeMonthsInstInst.sql", "Vaccines",getDateParameters()); 
  } 

  public static CohortIndicator getGirlsBetweenTwelveToTwentyThreeMonthsInstCommIndicator(){
    return cohortIndicatorFromSqlResource("girlsBetweenTwelveToTwentyThreeMonthsComm.sql", "Vaccines",getDateParameters()); 
  } 

  public static CohortIndicator getBoysBetweenTwelveToTwentyThreeMonthsInstInstIndicator(){
    return cohortIndicatorFromSqlResource("boysBetweenTwelveToTwentyThreeMonthsInstInst.sql", "Vaccines",getDateParameters()); 
  } 

  public static CohortIndicator getBoysBetweenTwelveToTwentyThreeMonthsInstCommIndicator(){
    return cohortIndicatorFromSqlResource("boysBetweenTwelveToTwentyThreeMonthsInstComm.sql", "Vaccines",getDateParameters()); 
  } 
   
}
