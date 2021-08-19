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

}
