package org.openmrs.module.isanteplusreports.hsisReport.library.datasets;

import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getNewVistsIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getSubsquentVistsIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getMalariaIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getPregnantWomenMalariaIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getOtherGroupsMalariaIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getFirstVisitIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getSecondVisitIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getThirdVisitIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getFourthVisitIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getFifthVisitIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getSupportForPregnantWomenIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getNormalDeliveryIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getMidwivesDeliveryIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getInstrumentaisedDeliveryIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getCaesareanDeliveryIndicator;
import static org.openmrs.module.isanteplusreports.hsisReport.library.indicators.HsisIndicatorLibrary.getComplicationsDeliveryIndicator;

import java.sql.Date;
import org.openmrs.module.isanteplusreports.hsisReport.library.columns.HsisReportColumns;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.generalDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.deliveriesDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.malariaDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.pregnantDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.womenMotherDimension;
import static org.openmrs.module.isanteplusreports.hsisReport.library.dimensions.HsisDimensionLibrary.supportForPregnantWomenDimension;



import org.openmrs.module.isanteplusreports.library.dimension.CommonDimension;
import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;;

public class HsisReportDatasetLibrary {

  private final static Parameter START_DATE = new Parameter("startDate", "isanteplusreports.parameters.startdate",
      Date.class);

  private final static Parameter END_DATE = new Parameter("endDate", "isanteplusreports.parameters.enddate",
      Date.class);

  public static CohortIndicatorDataSetDefinition getVistsDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("visits");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("age", ReportUtils.map(new CommonDimension().ageZone(), "effectiveDate=${endDate}"));
    dsd.addDimension("general", ReportUtils.map(generalDimension()));
    HsisReportColumns.addAgeColumnsforVists(dsd,getNewVistsIndicator(), "new");
    HsisReportColumns.addAgeColumnsforVists(dsd, getSubsquentVistsIndicator(), "sub");
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getLaboratoryDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("laboratory");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("malariaExam", ReportUtils.map(malariaDimension()));
    dsd.addDimension("pregnantWomen", ReportUtils.map(pregnantDimension()));
    HsisReportColumns.addColumsForPregnantWomen(dsd, getPregnantWomenMalariaIndicator());
    HsisReportColumns.addColumsForPregnantWomen(dsd, getOtherGroupsMalariaIndicator());
    HsisReportColumns.addTypesOfExaminationsColumsForMalaria(dsd, getMalariaIndicator());
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getWomenMotherDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("women");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("womenMothers", ReportUtils.map(womenMotherDimension()));
    HsisReportColumns.addColumsForWomenMothers(dsd, getFirstVisitIndicator(), "1st_visit");
    HsisReportColumns.addColumsForWomenMothers(dsd, getSecondVisitIndicator(),"2nd_visit");
    HsisReportColumns.addColumsForWomenMothers(dsd, getThirdVisitIndicator(), "3rd_visit");
    HsisReportColumns.addColumsForWomenMothers(dsd, getFourthVisitIndicator(),"4th_visit");
    HsisReportColumns.addColumsForWomenMothers(dsd, getFifthVisitIndicator(),"5th_visit");
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getSupportDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("support");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("supportWomen", ReportUtils.map(supportForPregnantWomenDimension()));
    HsisReportColumns.addColumsForSupportForPregnantWomen(dsd, getSupportForPregnantWomenIndicator());
    return dsd;
  }

  public static CohortIndicatorDataSetDefinition getDeliveriesDataset() {
    CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
    dsd.setName("delivery");
    dsd.addParameter(START_DATE);
    dsd.addParameter(END_DATE);
    dsd.addDimension("age", ReportUtils.map(new CommonDimension().ageZone(), "effectiveDate=${endDate}"));
    dsd.addDimension("deliveryMother", ReportUtils.map(deliveriesDimension()));
    HsisReportColumns.addColumsForDeliveriesOnAgeOfMothers(dsd, getNormalDeliveryIndicator(),"normal");
    HsisReportColumns.addColumsForDeliveriesOnAgeOfMothers(dsd, getMidwivesDeliveryIndicator(),"cs");
    HsisReportColumns.addColumsForDeliveriesOnAgeOfMothers(dsd, getInstrumentaisedDeliveryIndicator(), "inst");
    HsisReportColumns.addColumsForDeliveriesOnAgeOfMothers(dsd, getComplicationsDeliveryIndicator(), "mid");
    HsisReportColumns.addColumsForDeliveriesOnAgeOfMothers(dsd, getCaesareanDeliveryIndicator(), "comp");
    return dsd;
  }

}
