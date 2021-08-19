package org.openmrs.module.isanteplusreports.hsisReport.library.columns;

import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.utils.HsisReportUtils.constructColumn;

public class HsisReportColumns {

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
    public static final String MICROSCOPIC = "microscopicTest_";
    public static final String FAST = "fastTest_";
    public static final String MALARIA = "testedForMalaria_";
    public static final String PSMALARIA = "testedForMalariaPositive_";



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
        constructColumn(MICROSCOPIC + "positive", "Malaria microscopic positive test", cohortIndicator, "malariaExam=microscopicTestPositive", dsd);
        constructColumn(FAST + "positive", "Malaria fast positive test", cohortIndicator, "malariaExam=fastTestPositive", dsd);
        constructColumn(MICROSCOPIC, "Malaria microscopic test", cohortIndicator, "malariaExam=microscopicTest", dsd);
        constructColumn(FAST, "Malaria fast test", cohortIndicator, "malariaExam=fastTest", dsd);
        constructColumn(PSMALARIA + "positive", "Positive number of people tested for Malaria", cohortIndicator, "malariaExam=fastTestPositiveMicroscopicFast", dsd);
        constructColumn(MALARIA, "Number of people tested for Malaria", cohortIndicator, "", dsd);
    }

}
