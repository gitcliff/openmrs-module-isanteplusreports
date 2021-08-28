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

    //colums for PF Clients
    public static final String PC = "pc_";
    public static final String PP = "pp_";
    public static final String DROPPER = "dropper_";
    public static final String IUD = "iud_";
    public static final String IMPLANT = "implant_";
    public static final String NECKLACE = "necklace_";
    public static final String MAMA = "mama_";
    public static final String CONDOM = "condom_";
    public static final String CONDOM_WOMEN = "condom_women_";
    public static final String LIGATURE = "ligature_";
    public static final String VASECTOMY = "vasectomy_";
    public static final String TOTAL_WOMEN = "total_women_";

    //Post natal follow-up
    public static final String BF = "breastFeeding";
    public static final String PBN = "pb";
    public static final String NURSING_MAMA = "nursing_women";
    public static final String PNC = "postnatal_consultations_";
    public static final String HV = "homemade_visits_";

     //Support for the child
     public static final String TCH = "total_children_";
     public static final String FT = "children_first_time_";
     public static final String FTPB = "children_pb_";
     public static final String MEASURED = "children_measured_";
     public static final String SCREENED = "children_screening_";
     public static final String T_AGE = "children_screening_age_";
     public static final String TC_MAM = "children_first_time_mam_";
     public static final String TC_MAS = "children_first_time_mas_";
     public static final String TOTAL_SERVICES = "total_services_";

      //Live births
      public static final String UNDER = "under_1.5kg_";
      public static final String BETWEEN = "between_1.5kg&<2.5kg_";
      public static final String MORE = "2.5kg_more_";
      public static final String UNDEVELOPED = "undeveloped_";
      public static final String IMMEDIATELY = "immediately_";



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
        constructColumn(WOMEN_0_3 + "1st_visit", "women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "pregnancyPeriod=0-3|visit=first", dsd);
        constructColumn(WOMEN_0_3  + "2nd_visit", "women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "pregnancyPeriod=0-3|visit=second", dsd);
        constructColumn(WOMEN_0_3 + "3rd_visit", "women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "pregnancyPeriod=0-3|visit=third", dsd);
        constructColumn(WOMEN_0_3 + "4th_visit", "women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "pregnancyPeriod=0-3|visit=fourth", dsd);
        constructColumn(WOMEN_0_3 + "5th_visit", "women and mother with pregnancy period of 0 - 3 months", cohortIndicator, "pregnancyPeriod=0-3|visit=fifth", dsd);
        constructColumn(WOMEN_7_9 + "1st_visit", "women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "pregnancyPeriod=7-9|visit=first", dsd);
        constructColumn(WOMEN_7_9  + "2nd_visit", "women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "pregnancyPeriod=7-9|visit=second", dsd);
        constructColumn(WOMEN_7_9 + "3rd_visit", "women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "pregnancyPeriod=7-9|visit=third", dsd);
        constructColumn(WOMEN_7_9 + "4th_visit", "women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "pregnancyPeriod=7-9|visit=fourth", dsd);
        constructColumn(WOMEN_7_9 + "5th_visit", "women and mother with pregnancy period of 7 - 9 months", cohortIndicator, "pregnancyPeriod=7-9|visit=fifth", dsd);
        constructColumn(WOMEN_4_6 + "1st_visit", "women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "pregnancyPeriod=4-6|visit=first", dsd);
        constructColumn(WOMEN_4_6 + "2nd_visit", "women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "pregnancyPeriod=4-6|visit=second", dsd);
        constructColumn(WOMEN_4_6 + "3rd_visit", "women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "pregnancyPeriod=4-6|visit=third", dsd);
        constructColumn(WOMEN_4_6 + "4th_visit", "women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "pregnancyPeriod=4-6|visit=fourth", dsd);
        constructColumn(WOMEN_4_6 + "5th_visit", "women and mother with pregnancy period of 4 - 6 months", cohortIndicator, "pregnancyPeriod=4-6|visit=fifth", dsd);
        constructColumn(TOTAL_VISITS + "0-3months" , "Total women and mother with pregnancy period", cohortIndicator, "pregnancyPeriod=0-3", dsd);
        constructColumn(TOTAL_VISITS + "4-6months" , "Total women and mother with pregnancy period", cohortIndicator, "pregnancyPeriod=4-6", dsd);
        constructColumn(TOTAL_VISITS + "7-9months" , "Total women and mother with pregnancy period", cohortIndicator, "pregnancyPeriod=7-9", dsd);
        constructColumn(TOTAL_TOURS + "1st_visit", "Total women and mother with pregnancy period during first visit", cohortIndicator, "visit=first", dsd);   
        constructColumn(TOTAL_TOURS + "2nd_visit", "Total women and mother with pregnancy period during second visit", cohortIndicator, "visit=second", dsd);   
        constructColumn(TOTAL_TOURS + "3rd_visit", "Total women and mother with pregnancy period during third visit", cohortIndicator, "visit=third", dsd);   
        constructColumn(TOTAL_TOURS + "4th_visit", "Total women and mother with pregnancy period during fourth visit", cohortIndicator, "visit=fourth", dsd);   
        constructColumn(TOTAL_TOURS + "5th_visit", "Total women and mother with pregnancy period during fifth visit", cohortIndicator, "visit=fifth", dsd);   
        constructColumn(TOTAL_TOURS + "all_visits", "Total women and mother with pregnancy period during all visits", cohortIndicator, "", dsd);   
    }

    public static void addColumsForSupportForLiveBirth(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator, String liveBirths) {
        constructColumn(UNDER + liveBirths, "Live births", cohortIndicator, "birth=under", dsd); 
        constructColumn(BETWEEN + liveBirths, "Live births", cohortIndicator, "birth=between", dsd);   
        constructColumn(MORE + liveBirths, "Live births", cohortIndicator, "birth=plus", dsd);   
        constructColumn(UNDEVELOPED + liveBirths, "Live births", cohortIndicator, "birth=undeveloped", dsd);   
        constructColumn(IMMEDIATELY + liveBirths, "Live births", cohortIndicator, "birth=immediately", dsd);   
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
        constructColumn(PARTOGRAM  + mode, "Deliveries for age of mothers ", cohortIndicator, "ageOfMothers=partogram", dsd);  
        constructColumn(MGT + mode, "Deliveries for age of mothers active management of the 3rd phase of work ", cohortIndicator, "ageOfMothers=mgt", dsd);
    }

    public static void addColumsForPfClient(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator) {
        constructColumn(PC + "acc_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=pc|age25=<25", dsd);
        constructColumn(PC + "acc_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=pc|age25+=25", dsd);
        constructColumn(PC + "total_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=pc|age25=<25", dsd);
        constructColumn(PC + "total_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=pc|age25+=25", dsd);
        constructColumn(PP + "acc_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=pp|age25=<25", dsd);
        constructColumn(PP + "acc_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=pp|age25+=25", dsd);
        constructColumn(PP + "total_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=pp|age25=<25", dsd);
        constructColumn(PP + "total_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=pp|age25+=25", dsd);
        constructColumn(DROPPER + "acc_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=dropper|age25=<25", dsd);
        constructColumn(DROPPER + "acc_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=dropper|age25+=25", dsd);
        constructColumn(DROPPER + "total_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=dropper|age25=<25", dsd);
        constructColumn(DROPPER + "total_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=dropper|age25+=25", dsd);
        constructColumn(IUD + "acc_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=iud|age25=<25", dsd);
        constructColumn(IUD + "acc_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=iud|age25+=25", dsd);
        constructColumn(IUD + "total_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=iud|age25=<25", dsd);
        constructColumn(IUD + "total_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=iud|age25+=25", dsd);
        constructColumn(IMPLANT + "acc_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=implant|age25=<25", dsd);
        constructColumn(IMPLANT + "acc_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=implant|age25+=25", dsd);
        constructColumn(IMPLANT + "total_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=implant|age25=<25", dsd);
        constructColumn(IMPLANT + "total_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=implant|age25+=25", dsd);
        constructColumn(NECKLACE + "acc_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=necklace|age25=<25", dsd);
        constructColumn(NECKLACE + "acc_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=necklace|age25+=25", dsd);
        constructColumn(NECKLACE + "total_under25yrs"  , "PF clients methods", cohortIndicator, "clientWomen=necklace|age25=<25", dsd);
        constructColumn(NECKLACE + "total_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=necklace|age25+=25", dsd);
        constructColumn(MAMA + "acc_under25yrs", "PF clients methods", cohortIndicator, "clientWomen=mama|age25=<25", dsd);
        constructColumn(MAMA + "acc_25yrs_and_above", "PF clients methods", cohortIndicator, "clientWomen=mama|age25+=25", dsd);
        constructColumn(MAMA + "total_under25yrs", "PF clients methods", cohortIndicator, "clientWomen=mama|age25=<25", dsd);
        constructColumn(MAMA + "total_25yrs_and_above", "PF clients methods", cohortIndicator, "clientWomen=mama|age25+=25", dsd);
        constructColumn(CONDOM +  "acc_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=condomMen|age25=<25", dsd);
        constructColumn(CONDOM +  "acc_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=condomMen|age25+=25", dsd);
        constructColumn(CONDOM +   "total_under25yrs", "PF clients methods", cohortIndicator, "clientWomen=condomMen|age25=<25", dsd);
        constructColumn(CONDOM +  "total_25yrs_and_above", "PF clients methods", cohortIndicator, "clientWomen=condomMen|age25+=25", dsd);
        constructColumn(CONDOM_WOMEN +  "acc_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=condomWomen|age25=<25", dsd);
        constructColumn(CONDOM_WOMEN +  "acc_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=condomWomen|age25+=25", dsd);
        constructColumn(CONDOM_WOMEN +  "total_under25yrs", "PF clients methods", cohortIndicator, "clientWomen=condomWomen|age25=<25", dsd);
        constructColumn(CONDOM_WOMEN +  "total_25yrs_and_above" , "PF clients methods", cohortIndicator, "clientWomen=condomWomen|age25+=25", dsd);
        constructColumn(LIGATURE + "acc_under25yrs"  , "PF clients methods", cohortIndicator, "clientWomen=ligature|age25=<25", dsd);
        constructColumn(LIGATURE + "acc_25yrs_and_above"   , "PF clients methods", cohortIndicator, "clientWomen=ligature|age25+=25", dsd);
        constructColumn(LIGATURE + "total_under25yrs"  , "PF clients methods", cohortIndicator, "clientWomen=ligature|age25=<25", dsd);
        constructColumn(LIGATURE + "total_25yrs_and_above", "PF clients methods", cohortIndicator, "clientWomen=ligature|age25+=25", dsd);
        constructColumn(VASECTOMY + "acc_under25yrs" , "PF clients methods", cohortIndicator, "clientWomen=vasectomy|age25=<25", dsd);
        constructColumn(VASECTOMY + "acc_25yrs_and_above", "PF clients methods", cohortIndicator, "clientWomen=vasectomy|age25+=25", dsd);
        constructColumn(VASECTOMY + "total_under25yrs", "PF clients methods", cohortIndicator, "clientWomen=vasectomy|age25=<25", dsd);
        constructColumn(VASECTOMY + "total_25yrs_and_above", "PF clients methods", cohortIndicator, "clientWomen=vasectomy|age25+=25", dsd);
        constructColumn(TOTAL_WOMEN + "acc_under25yrs" , "PF clients methods", cohortIndicator, "age25=<25", dsd);
        constructColumn(TOTAL_WOMEN + "acc_25yrs_and_above", "PF clients methods", cohortIndicator, "age25+=25", dsd);
        constructColumn(TOTAL_WOMEN +  "total_under25yrs", "PF clients methods", cohortIndicator, "age25=<25", dsd);
        constructColumn(TOTAL_WOMEN + "total_25yrs_and_above", "PF clients methods", cohortIndicator, "age25+=25", dsd);
    }

    public static void addColumsForPostNatalFollowUp(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator) {
        constructColumn(BF, "Post natal follow-up", cohortIndicator, "postnatal=breastFeeding", dsd);
        constructColumn(PBN, "Post natal follow-up", cohortIndicator, "postnatal=nursingWomenPb", dsd);
        constructColumn(NURSING_MAMA , "Post natal follow-up", cohortIndicator, "postnatal=nursingWomenMam", dsd);
        constructColumn(PNC + "0 - 6 hours" , "Post natal follow-up", cohortIndicator, "postnatal=0-6", dsd);
        constructColumn(PNC + "7am - 6 days" , "Post natal follow-up", cohortIndicator, "postnatal=7am-6days", dsd);
        constructColumn(PNC + "7 - 42 days" , "Post natal follow-up", cohortIndicator, "postnatal=7-42days", dsd);
        constructColumn(HV + "0 - 3 days" , "Post natal follow-up", cohortIndicator, "postnatal=homemade", dsd);
    }

    public static void addColumsForChildSupport(CohortIndicatorDataSetDefinition dsd, CohortIndicator cohortIndicator) {
        constructColumn(TCH + "m_6months", "Support for the child services", cohortIndicator, "childSupport=totalChildrenSeen|gender=M", dsd);
        constructColumn(TCH + "f_6months", "Support for the child services", cohortIndicator, "childSupport=totalChildrenSeen|gender=F", dsd);
        constructColumn(TCH + "m_6-23", "Support for the child services", cohortIndicator, "childSupport=totalChildrenSeen|gender=M", dsd);
        constructColumn(TCH + "f_6-23", "Support for the child services", cohortIndicator, "childSupport=totalChildrenSeen|gender=F", dsd);
        constructColumn(TCH + "f_24-59", "Support for the child services", cohortIndicator, "childSupport=totalChildrenSeen|gender=F", dsd);
        constructColumn(TCH + "m_24-59", "Support for the child services", cohortIndicator, "childSupport=totalChildrenSeen|gender=M", dsd);
        constructColumn(TOTAL_SERVICES + "totalChildren", "Support for the child services", cohortIndicator, "childSupport=totalChildrenSeen", dsd);
        constructColumn(FT + "m_6months", "Support for the child services", cohortIndicator, "childSupport=firstTimeChildren|gender=M", dsd);
        constructColumn(FT + "f_6months", "Support for the child services", cohortIndicator, "childSupport=firstTimeChildren|gender=F", dsd);
        constructColumn(FT + "m_6-23", "Support for the child services", cohortIndicator, "childSupport=firstTimeChildren|gender=M", dsd);
        constructColumn(FT + "f_6-23", "Support for the child services", cohortIndicator, "childSupport=firstTimeChildren|gender=F", dsd);
        constructColumn(FT + "f_24-59", "Support for the child services", cohortIndicator, "childSupport=firstTimeChildren|gender=F", dsd);
        constructColumn(FT + "m_24-59", "Support for the child services", cohortIndicator, "childSupport=firstTimeChildren|gender=M", dsd);
        constructColumn(TOTAL_SERVICES + "firstTime", "Support for the child services", cohortIndicator, "childSupport=firstTimeChildren", dsd);
        constructColumn(FTPB + "m_6months", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPb|gender=M", dsd);
        constructColumn(FTPB + "f_6months", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPb|gender=F", dsd);
        constructColumn(FTPB + "m_6-23", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPb|gender=M", dsd);
        constructColumn(FTPB + "f_6-23", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPb|gender=F", dsd);
        constructColumn(FTPB + "f_24-59", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPb|gender=F", dsd);
        constructColumn(FTPB + "m_24-59", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPb|gender=M", dsd);
        constructColumn(TOTAL_SERVICES + "pb", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPb", dsd);
        constructColumn(MEASURED + "m_6months", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPdst|gender=M", dsd);
        constructColumn(MEASURED + "f_6months", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPdst|gender=F", dsd);
        constructColumn(MEASURED + "m_6-23", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPdst|gender=M", dsd);
        constructColumn(MEASURED + "f_6-23", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPdst|gender=F", dsd);
        constructColumn(MEASURED + "f_24-59", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPdst|gender=F", dsd);
        constructColumn(MEASURED + "m_24-59", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPdst|gender=M", dsd);
        constructColumn(TOTAL_SERVICES + "measured", "Support for the child services", cohortIndicator, "childSupport=timeMeasuredPdst", dsd);
        constructColumn(SCREENED + "m_6months", "Support for the child services", cohortIndicator, "childSupport=screen|gender=M", dsd);
        constructColumn(SCREENED + "f_6months", "Support for the child services", cohortIndicator, "childSupport=screen|gender=F", dsd);
        constructColumn(SCREENED + "m_6-23", "Support for the child services", cohortIndicator, "childSupport=screen|gender=M", dsd);
        constructColumn(SCREENED + "f_6-23", "Support for the child services", cohortIndicator, "childSupport=screen|gender=F", dsd);
        constructColumn(SCREENED + "f_24-59", "Support for the child services", cohortIndicator, "childSupport=screen|gender=F", dsd);
        constructColumn(SCREENED + "m_24-59", "Support for the child services", cohortIndicator, "childSupport=screen|gender=M", dsd);
        constructColumn(TOTAL_SERVICES+ "screening", "Support for the child services", cohortIndicator, "childSupport=screen", dsd);
        constructColumn(T_AGE  + "m_6months", "Support for the child services", cohortIndicator, "childSupport=t_age|gender=M", dsd);
        constructColumn(T_AGE  + "f_6months", "Support for the child services", cohortIndicator, "childSupport=t_age|gender=F", dsd);
        constructColumn(T_AGE  + "m_6-23", "Support for the child services", cohortIndicator, "childSupport=t_age|gender=M", dsd);
        constructColumn(T_AGE  + "f_6-23", "Support for the child services", cohortIndicator, "childSupport=t_age|gender=F", dsd);
        constructColumn(T_AGE  + "f_24-59", "Support for the child services", cohortIndicator, "childSupport=t_age|gender=F", dsd);
        constructColumn(T_AGE  + "m_24-59", "Support for the child services", cohortIndicator, "childSupport=t_age|gender=M", dsd);
        constructColumn(TOTAL_SERVICES  + "age", "Support for the child services", cohortIndicator, "childSupport=t_age", dsd);
        constructColumn(TC_MAM  + "m_6months", "Support for the child services", cohortIndicator, "childSupport=firstTimeMam|gender=M", dsd);
        constructColumn(TC_MAM  + "f_6months", "Support for the child services", cohortIndicator, "childSupport=firstTimeMam|gender=F", dsd);
        constructColumn(TC_MAM  + "m_6-23", "Support for the child services", cohortIndicator, "childSupport=firstTimeMam|gender=M", dsd);
        constructColumn(TC_MAM  + "f_6-23", "Support for the child services", cohortIndicator, "childSupport=firstTimeMam|gender=F", dsd);
        constructColumn(TC_MAM  + "f_24-59", "Support for the child services", cohortIndicator, "childSupport=firstTimeMam|gender=F", dsd);
        constructColumn(TC_MAM  + "m_24-59", "Support for the child services", cohortIndicator, "childSupport=firstTimeMam|gender=M", dsd);
        constructColumn(TOTAL_SERVICES  + "mam", "Support for the child services", cohortIndicator, "childSupport=firstTimeMam", dsd);
        constructColumn(TC_MAS  + "m_6months", "Support for the child services", cohortIndicator, "childSupport=firstTimeMas|gender=M", dsd);
        constructColumn(TC_MAS  + "f_6months", "Support for the child services", cohortIndicator, "childSupport=firstTimeMas|gender=F", dsd);
        constructColumn(TC_MAS  + "m_6-23", "Support for the child services", cohortIndicator, "childSupport=firstTimeMas|gender=M", dsd);
        constructColumn(TC_MAS  + "f_6-23", "Support for the child services", cohortIndicator, "childSupport=firstTimeMas|gender=F", dsd);
        constructColumn(TC_MAS  + "f_24-59", "Support for the child services", cohortIndicator, "childSupport=firstTimeMas|gender=F", dsd);
        constructColumn(TC_MAS  + "m_24-59", "Support for the child services", cohortIndicator, "childSupport=firstTimeMas|gender=M", dsd);
        constructColumn(TOTAL_SERVICES  + "mas", "Support for the child services", cohortIndicator, "childSupport=firstTimeMas", dsd);
    }



}
