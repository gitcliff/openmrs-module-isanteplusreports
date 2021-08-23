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
    public static final String MOTHERS_0_15 = "mothers0_1_";
    public static final String MOTHERS_15_19 = "mothers5_9_";
    public static final String MOTHERS_20_24 = "mothers10_14_";
    public static final String MOTHERS_25_29 = "mothers15_19_";
    public static final String MOTHERS_30_ABOVE = "mothers20_24_";
    public static final String UNKNOWN = "unkown_";
    public static final String WORKMANSHIP = "workmanship_";
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

    public static void addColumsForWomenMothers(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator) {
        constructColumn(WOMEN_0_3 + "1st_visit" , "women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "womenMothers=zeroToThree", dsd);
        constructColumn(WOMEN_0_3 + "2nd_visit" , "women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "womenMothers=zeroToThree", dsd);
        constructColumn(WOMEN_0_3 + "3rd_visit" , "women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "womenMothers=zeroToThree", dsd);
        constructColumn(WOMEN_0_3 + "4th_visit" , "women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "womenMothers=zeroToThree", dsd);
        constructColumn(WOMEN_0_3 + "5th_visit" , "women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "womenMothers=zeroToThree", dsd);
        constructColumn(TOTAL_VISITS + "0-3months", "Total women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "", dsd);

        constructColumn(WOMEN_4_6 + "1st_visit" , "women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "womenMothers=fourToSix", dsd);
        constructColumn(WOMEN_4_6 + "2nd_visit" , "women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "womenMothers=fourToSix", dsd);
        constructColumn(WOMEN_4_6 + "3rd_visit" , "women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "womenMothers=fourToSix", dsd);
        constructColumn(WOMEN_4_6 + "4th_visit" , "women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "womenMothers=fourToSix", dsd);
        constructColumn(WOMEN_4_6 + "5th_visit" , "women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "womenMothers=fourToSix", dsd);
        constructColumn(TOTAL_VISITS + "4-6months" , "Total women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "", dsd);

        constructColumn(WOMEN_7_9 + "1st_visit" , "women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "womenMothers=sevenToNine", dsd);
        constructColumn(WOMEN_7_9 + "2nd_visit" , "women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "womenMothers=sevenToNine", dsd);
        constructColumn(WOMEN_7_9 + "3rd_visit" , "women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "womenMothers=sevenToNine", dsd);
        constructColumn(WOMEN_7_9 + "4th_visit" , "women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "womenMothers=sevenToNine", dsd);
        constructColumn(WOMEN_7_9 + "5th_visit" , "women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "womenMothers=sevenToNine", dsd);
        constructColumn(TOTAL_VISITS + "7-9months", "Total women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "", dsd);

        constructColumn(TOTAL_TOURS + "1st_visit" , "Total women and mother with pregnancy period during first visit", cohortIndicator, "", dsd);
        constructColumn(TOTAL_TOURS + "2nd_visit" , "Total women and mother with pregnancy period during second visit", cohortIndicator, "", dsd);
        constructColumn(TOTAL_TOURS + "3rd_visit" , "Total women and mother with pregnancy period during third visit", cohortIndicator, "", dsd);
        constructColumn(TOTAL_TOURS + "4th_visit" , "Total women and mother with pregnancy period during fourth visit", cohortIndicator, "", dsd);
        constructColumn(TOTAL_TOURS + "5th_visit"  , "Total women and mother with pregnancy period during fifth visit", cohortIndicator, "", dsd);
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

    public static void addColumsForDeliveriesOnAgeOfMothers(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator) {
        constructColumn(MOTHERS_0_15, "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_0_15 + "normal", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_0_15 + "cs", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_0_15 + "inst", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_0_15 + "mid", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_0_15 + "comp", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);

        constructColumn(MOTHERS_15_19, "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_15_19 + "normal", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_15_19 + "cs", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_15_19 + "inst", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_15_19 + "mid", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_15_19 + "comp", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);

        constructColumn(MOTHERS_20_24, "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_20_24 + "normal", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_20_24 + "cs", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_20_24 + "inst", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_20_24 + "mid", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_20_24 + "comp", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);

        constructColumn(MOTHERS_25_29, "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_25_29 + "normal", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_25_29 + "cs", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_25_29 + "inst", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_25_29 + "mid", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_25_29 + "comp", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);

        constructColumn(MOTHERS_30_ABOVE, "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_30_ABOVE + "normal", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_30_ABOVE + "cs", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_30_ABOVE + "inst", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_30_ABOVE  + "mid", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MOTHERS_30_ABOVE + "comp", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);

        constructColumn(UNKNOWN, "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(UNKNOWN + "normal", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(UNKNOWN + "cs", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(UNKNOWN + "inst", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(UNKNOWN  + "mid", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(UNKNOWN  + "comp", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);

        constructColumn(WORKMANSHIP, "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(WORKMANSHIP + "normal", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(WORKMANSHIP + "cs", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(WORKMANSHIP + "inst", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(WORKMANSHIP + "mid", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(WORKMANSHIP + "comp", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);

        constructColumn(PARTOGRAM, "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(PARTOGRAM  + "normal", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(PARTOGRAM  + "cs", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(PARTOGRAM  + "inst", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(PARTOGRAM  + "mid", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(PARTOGRAM  + "comp", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);

        constructColumn(MGT, "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MGT + "normal", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MGT + "cs", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MGT + "inst", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MGT + "mid", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
        constructColumn(MGT + "comp", "Deliveries for age of mothers ", cohortIndicator, "deliveries=bloodGroup", dsd);
    }


}
