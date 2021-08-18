package org.openmrs.module.isanteplusreports.hsisReport.library.cohorts;

import static org.openmrs.module.isanteplusreports.hsisReport.utils.HsisReportUtils.cohortDefinitionFromSqlResource;

import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;

public class HsisReportCohortLibrary {

  private static final String DATE_PARAMS_MAPPINGS = "startDate=${startDate},endDate=${endDate}";

  public static CohortDefinition newVistCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("newVists.sql", "new Vists");
    return cohortDefinition;
  }

  public static CohortDefinition subsquentVistCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("subsquentVists.sql", "subsquent Vists");
    return cohortDefinition;
  }

  public static CohortDefinition pregnantWomenCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pregnnatWomen.sql", "Pregnant Women");
    return cohortDefinition;
  }

  public static CohortDefinition pFClientsCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("pfClients.sql", "PF Clients");
    return cohortDefinition;
  }

  public static CohortDefinition customersInOralCareCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("customersInOralCare.sql", "Customers in oral care");
    return cohortDefinition;
  }

  public static CohortDefinition otherAdultsCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("otherAdults.sql", "Other Adults");
    return cohortDefinition;
  }

  public static CohortDefinition totalCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("total.sql", "Total");
    return cohortDefinition;
  }

  public static CohortDefinition reducedMobilityEngineCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("reducedMobilityEngine.sql", "People with reduced mobility (engine)");
    return cohortDefinition;
  }

  public static CohortDefinition reducedMobilitySensoryCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("reducedMobilitySensory.sql", "People with reduced mobility (sensory)");
    return cohortDefinition;
  }

  public static CohortDefinition microscopicTestCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("microscopicTest.sql", "Malaria microscopic test");
    return cohortDefinition;
  }

  public static CohortDefinition  fastTestCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("fastTest.sql", "Malaria fast test");
    return cohortDefinition;
  }

  public static CohortDefinition  testedForMalariaCohort() {
    SqlCohortDefinition cohortDefinition = cohortDefinitionFromSqlResource("testedForMalaria.sql", "Number of people tested for Malaria");
    return cohortDefinition;
  }
}
