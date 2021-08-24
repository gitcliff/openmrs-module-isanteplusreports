package org.openmrs.module.isanteplusreports.hsisReport.library.columns;

import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.utils.HsisReportUtils.constructColumn;

public class HsisReportColumns {

    //colums for the Vist Dataset
    public static final String CHILD_0_1 = "children0_1_";
    public static final String CHILD_1_4 = "children1_4_";
    public static final String CHILD_5_9 = "children5_9_";
    public static final String CHILD_10_14 = "children10_14_";
    public static final String CHILD_15_19 = "children15_19_";
    public static final String CHILD_20_24 = "children20_24_";
    public static final String PREGNANT = "pregnant_";
    public static final String PF = "pf_";
    public static final String CIOC = "customersInOralCare_";
    public static final String OA = "otherAdults_";
    public static final String TOTAL = "total_";
    public static final String ENGINE = "reducedMobilityEngine_";
    public static final String SENSORY = "reducedMobilitySensory_";

    //colums for the Malaria Dataset
    public static final String MICROSCOPIC = "microscopicTest";
    public static final String FAST = "fastTest";
    public static final String MALARIA = "testedForMalaria";
    public static final String PSMALARIA = "testedForMalariaPositive";
 
    //colums for the Pregnant Women Dataset
    public static final String HEMOGRAM = "hemogram";
    public static final String VIH = "vih";
    public static final String RPR = "rpr";
    public static final String SICKLING = "sicklingTest";
    public static final String BLOOD = "bloodGroup";
    public static final String URINES = "urines";
    public static final String OTHER_SICKLING = "otherSicklingTest";
    public static final String OTHER_BLODD = "otherBlood";

    //colums for Women and mother pregnancy period Dataset
    public static final String WOMEN_0_3 = "women0_3_";
    public static final String WOMEN_4_6 = "women4_6_";
    public static final String WOMEN_7_9 = "women7_9_";
    public static final String TOTAL_TOURS = "total_tours_";
    public static final String TOTAL_VISITS = "total_visits_";

     //colums for spport for pregnant women Dataset
     public static final String RISK = "risk";
     public static final String ANEMIA = "anemia";
     public static final String FOLATE = "folate";
     public static final String FERRIFIVE = "ferrifive";
     public static final String DELIVERY_PLAN = "delivery_plan";
     public static final String CHLOROQUINE = "chloroquine";
     public static final String NET = "mosquito_net";
     public static final String PB = "Pb";
     public static final String MAM = "mam";

     //colums for deliveries age of mothers
    public static final String MOTHERS_0_15 = "mothers0_15_";
    public static final String MOTHERS_15_19 = "mothers15_19_";
    public static final String MOTHERS_20_24 = "mothers20_24_";
    public static final String MOTHERS_25_29 = "mothers25_29_";
    public static final String MOTHERS_30_ABOVE = "mothers30_above_";
    public static final String UNKNOWN = "unknown_";
    public static final String PARTOGRAM = "partogram_";
    public static final String MGT = "management_";


    public static void addAgeColumnsforVists(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator ,String vistType) {
        constructColumn(CHILD_0_1 + vistType, "0-1 Years", cohortIndicator, "age=0_1", dsd);
        constructColumn(CHILD_1_4 + vistType, "1-4 Years", cohortIndicator, "age=1_4", dsd);
        constructColumn(CHILD_5_9 + vistType, "5-9 Years", cohortIndicator, "age=5_9", dsd);
        constructColumn(CHILD_10_14 + vistType, "10-14 Years", cohortIndicator, "age=10_14", dsd);
        constructColumn(CHILD_15_19 + vistType, "15-19 Years", cohortIndicator, "age=15_19", dsd);
        constructColumn(CHILD_20_24 + vistType, "20-24 Years", cohortIndicator, "age=20_24", dsd);
        constructColumn(PREGNANT + vistType, "Pregnant", cohortIndicator, "general=pregnant", dsd);
        constructColumn(PF + vistType, "PF clients", cohortIndicator, "general=pf", dsd);
        constructColumn(CIOC + vistType, "Customers in oral care", cohortIndicator, "general=customersInOralCare", dsd);
        constructColumn(OA + vistType, "Other Adults", cohortIndicator, "general=otherAdults", dsd);
        constructColumn(TOTAL + vistType, "Total", cohortIndicator, "", dsd);
        constructColumn(ENGINE + vistType, "People with reduced mobility (engine)", cohortIndicator, "general=reducedMobilityEngine", dsd);
        constructColumn(SENSORY + vistType, "People with reduced mobility (sensory)", cohortIndicator, "general=reducedMobilitySensory", dsd);   
    }

    public static void addTypesOfExaminationsColumsForMalaria(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator) {
        constructColumn(MICROSCOPIC + "Positive", "Malaria microscopic positive test", cohortIndicator, "malariaExam=microscopicTestPositive", dsd);
        constructColumn(FAST + "Positive", "Malaria fast positive test", cohortIndicator, "malariaExam=fastTestPositive", dsd);
        constructColumn(MICROSCOPIC, "Malaria microscopic test", cohortIndicator, "malariaExam=microscopicTest", dsd);
        constructColumn(FAST, "Malaria fast test", cohortIndicator, "malariaExam=fastTest", dsd);
        constructColumn(PSMALARIA , "Positive number of people tested for Malaria", cohortIndicator, "malariaExam=fastTestPositiveMicroscopicFast", dsd);
        constructColumn(MALARIA, "Number of people tested for Malaria", cohortIndicator, "", dsd);
    }

    public static void addColumsForPregnantWomen(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator) {
        constructColumn(HEMOGRAM , "Pregnant women hemogram", cohortIndicator, "pregnantWomen=hemogram", dsd);
        constructColumn(VIH , "Pregnant women vih", cohortIndicator, "pregnantWomen=vih", dsd);
        constructColumn(VIH + "Positive" , "Pregnant women with positive vih", cohortIndicator, "pregnantWomen=vihPositive", dsd);
        constructColumn(RPR, "Pregnant women rpr", cohortIndicator, "pregnantWomen=rPR", dsd);
        constructColumn(RPR + "Positive", "Pregnant women with positive rpr", cohortIndicator, "pregnantWomen=rprPositive", dsd);
        constructColumn(SICKLING, "Pregnant women sickling test", cohortIndicator, "pregnantWomen=sicklingTest", dsd);
        constructColumn(SICKLING + "Positive", "positive pregnant women sickling test", cohortIndicator, "pregnantWomen=sicklingPositive", dsd);
        constructColumn(BLOOD, "Pregnant women blood group", cohortIndicator, "pregnantWomen=bloodGroup", dsd);
        constructColumn(URINES, "Pregnant women urines", cohortIndicator, "pregnantWomen=urines", dsd);
        constructColumn(OTHER_SICKLING, "Pregnant women sickling test", cohortIndicator, "pregnantWomen=sicklingTest", dsd);
        constructColumn(OTHER_SICKLING + "Positive", "Other groups of pregnant women sickling test", cohortIndicator, "pregnantWomen=sicklingPositiveOthers", dsd);
        constructColumn(OTHER_BLODD, "Other groups of pregnant women blood groups", cohortIndicator, "pregnantWomen=otherBloodGroup", dsd);
    }

    public static void addColumsForWomenMothers(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator, String visitPosition) {
        constructColumn(WOMEN_0_3 + visitPosition , "women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "womenMothers=zeroToThree", dsd);
        constructColumn(WOMEN_7_9 + visitPosition , "women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "womenMothers=sevenToNine", dsd);
        constructColumn(WOMEN_4_6 + visitPosition , "women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "womenMothers=fourToSix", dsd);
        constructColumn(TOTAL_VISITS + visitPosition , "Total women and mother with pregnancy period", cohortIndicator, "", dsd);
        constructColumn(TOTAL_TOURS + visitPosition , "Total women and mother with pregnancy period during first visit", cohortIndicator, "", dsd);   
    }

    public static void addColumsForSupportForPregnantWomen(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator) {
        constructColumn(RISK , "Support for pregnant women", cohortIndicator, "supportWomen=risk", dsd);
        constructColumn(ANEMIA , "Support for pregnant women", cohortIndicator, "supportWomen=anemia", dsd);
        constructColumn(FOLATE , "Support for pregnant women", cohortIndicator, "supportWomen=folateIron", dsd);
        constructColumn(FERRIFIVE , "Support for pregnant women", cohortIndicator, "supportWomen=ferritive", dsd);
        constructColumn(DELIVERY_PLAN , "Support for pregnant women", cohortIndicator, "supportWomen=deliveryPlan", dsd);
        constructColumn(CHLOROQUINE, "Support for pregnant women", cohortIndicator, "supportWomen=chloroquine", dsd);
        constructColumn(NET , "Support for pregnant women", cohortIndicator, "supportWomen=mosquitoNet", dsd);
        constructColumn(PB , "Support for pregnant women", cohortIndicator, "supportWomen=pregnancyPb", dsd);
        constructColumn(MAM , "Support for pregnant women", cohortIndicator, "supportWomen=pregnancyMam", dsd);
    }

    public static void addColumsForDeliveriesOnAgeOfMothers(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator,String mode) {
        constructColumn(MOTHERS_0_15 + mode , "Deliveries for age of mothers <15 years", cohortIndicator, "age=<15", dsd);
        constructColumn(MOTHERS_15_19 + mode, "Deliveries for age of mothers 15 – 19years", cohortIndicator, "age=15_19", dsd); 
        constructColumn(MOTHERS_20_24 + mode, "Deliveries for age of mothers 20 - 24 years", cohortIndicator, "age=20_24", dsd);
        constructColumn(MOTHERS_25_29 + mode, "Deliveries for age of mothers 25 - 29 years", cohortIndicator, "age=25_29", dsd); 
        constructColumn(MOTHERS_30_ABOVE + mode, "Deliveries for age of mothers 30 years and over", cohortIndicator, "age=30", dsd);  
        constructColumn(UNKNOWN + mode, "Deliveries for age of mothers unknown ", cohortIndicator, "age=unknown", dsd);  
        constructColumn(PARTOGRAM  + mode, "Deliveries for age of mothers ", cohortIndicator, "deliveryMother=partogram", dsd);  
        constructColumn(MGT + mode, "Deliveries for age of mothers active management of the 3rd phase of work ", cohortIndicator, "deliveryMother=mgt", dsd);
    }
}
