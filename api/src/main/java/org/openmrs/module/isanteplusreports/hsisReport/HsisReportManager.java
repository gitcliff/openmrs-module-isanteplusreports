package org.openmrs.module.isanteplusreports.hsisReport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.isanteplusreports.hsisReport.library.datasets.HsisReportDatasetLibrary;
import org.openmrs.module.reporting.common.MessageUtil;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.report.ReportDesign;
import org.openmrs.module.reporting.report.definition.ReportDefinition;
import org.openmrs.module.reporting.report.manager.BaseReportManager;
import org.openmrs.module.reporting.report.manager.ReportManagerUtil;
import org.springframework.stereotype.Component;

@Component("hsisReportManager")
public class HsisReportManager extends BaseReportManager{

    private final Log log = LogFactory.getLog(getClass());
	
    @Override
    public String getUuid() {
        return HsisReportConstants.HSIS_REPORT_UUID;
    }

    @Override
	public String getName() {
        return translate("label.report.name");
	}

    @Override
	public List<Parameter> getParameters() {
		List<Parameter> l = new ArrayList<Parameter>();
		l.add(new Parameter("startDate", MessageUtil.translate("isanteplusreports.parameters.startdate"), Date.class));
		l.add(new Parameter("endDate", MessageUtil.translate("isanteplusreports.parameters.enddate"), Date.class));
		return l;
	}

	@Override
	public String getDescription() {
		return translate("label.report.name");
	}

    @Override
    public ReportDefinition constructReportDefinition() {
        ReportDefinition rd = new ReportDefinition();
		
		rd.setName(getName());
		rd.setDescription(getDescription());
		rd.setParameters(getParameters());
		rd.setUuid(getUuid());
		
		CohortIndicatorDataSetDefinition cdv = HsisReportDatasetLibrary.getVistsDataset();
		CohortIndicatorDataSetDefinition cdm = HsisReportDatasetLibrary.getMalariaDataset();
		CohortIndicatorDataSetDefinition cdp = HsisReportDatasetLibrary.getPregnantWomenDataset();
		CohortIndicatorDataSetDefinition cdw = HsisReportDatasetLibrary.getWomenMotherDataset();



		Map<String, Object> parameterMappings = new HashMap<String, Object>();
		parameterMappings.put("startDate", "${startDate}");
		parameterMappings.put("endDate", "${endDate}");	
		rd.addDataSetDefinition("visits", cdv, parameterMappings);
		rd.addDataSetDefinition("malaria", cdm, parameterMappings);	
		rd.addDataSetDefinition("pregnant", cdp, parameterMappings);
		rd.addDataSetDefinition("women", cdw, parameterMappings);			
			
		return rd;
    }

	@Override
	public List<ReportDesign> constructReportDesigns(ReportDefinition reportDefinition) {
		ReportDesign reportDesign = ReportManagerUtil.createExcelTemplateDesign("c51fc24f-50ba-48f8-9678-90462f7cff80",
		    reportDefinition, "org/openmrs/module/isanteplusreports/reportTemplates/hsisReportTemplate.xls");
		
		Properties designProperties = new Properties();		
		designProperties.put("label.report.title", translate("label.report.title"));
		designProperties.put("label.institution.code",translate("label.institution.code"));
		designProperties.put("label.municipality",translate("label.municipality"));
		designProperties.put("label.institution.name",translate("label.institution.name"));
		designProperties.put("label.department", translate("label.department"));
		designProperties.put("label.month", translate("label.month"));
		designProperties.put("label.vists.distribution", translate("label.vists.distribution"));
		designProperties.put("label.exams.labaratory", translate("label.exams.labaratory"));
		designProperties.put("label.institutional", translate("label.institutional"));
		designProperties.put("label.institutional.none", translate("label.institutional.none"));
		designProperties.put("label.exams.type", translate("label.exams.type"));
		designProperties.put("label.Total", translate("label.Total"));
		designProperties.put("label.positive", translate("label.positive"));
		designProperties.put("label.categories", translate("label.categories"));
		designProperties.put("label.new", translate("label.new"));
		designProperties.put("label.subsquent",translate("label.subsquent"));
		designProperties.put("label.children.under1", translate("label.children.under1"));	
		designProperties.put("label.children.under1", translate("label.children.under1"));	
		designProperties.put("label.children.between.1-4years", translate("label.children.between.1-4years"));
		designProperties.put("label.children.between.5-9years", translate("label.children.between.5-9years"));
		designProperties.put("label.children.between.10-14years", translate("label.children.between.10-14years"));
		designProperties.put("label.young.adults.between.15-19years", translate("label.young.adults.between.15-19years"));
		designProperties.put("label.young.adults.between.20-24years", translate("label.young.adults.between.20-24years"));
		designProperties.put("label.month", translate("label.month"));
		designProperties.put("label.pregnant.women", translate("label.pregnant.women"));
		designProperties.put("label.pf.clients", translate("label.pf.clients"));
		designProperties.put("label.customers.in.oral.care", translate("label.customers.in.oral.care"));
		designProperties.put("label.other.adults", translate("label.other.adults"));
		designProperties.put("label.other.groups", translate("label.other.groups"));
		designProperties.put("label.people.with.reduced.mobility.engine", translate("label.people.with.reduced.mobility.engine"));
		designProperties.put("label.people.with.reduced.mobility.sensory", translate("label.people.with.reduced.mobility.sensory"));
		designProperties.put("label.malaria", translate("label.malaria"));
		designProperties.put("label.malaria.microscopic.test", translate("label.malaria.microscopic.test"));
		designProperties.put("label.malaria.fast.test", translate("label.malaria.fast.test"));
		designProperties.put("label.number.of.people.tested.for.malaria", translate("label.number.of.people.tested.for.malaria"));
		designProperties.put("label.hemogram", translate("label.hemogram"));
		designProperties.put("label.vih", translate("label.vih"));
		designProperties.put("label.Midwives", translate("label.Midwives"));
		designProperties.put("label.rpr", translate("label.rpr"));
		designProperties.put("label.undeveloped", translate("label.undeveloped"));
		designProperties.put("label.sickling.test", translate("label.sickling.test"));
		designProperties.put("label.blood.group", translate("label.blood.group"));
		designProperties.put("label.support.for.women.and.mother", translate("label.support.for.women.and.mother"));
		designProperties.put("label.pregnacy.period", translate("label.pregnacy.period"));
		designProperties.put("label.visits", translate("label.visits"));
		designProperties.put("label.1stvisit", translate("label.1stvisit"));
		designProperties.put("label.2ndvisit", translate("label.2ndvisit"));
		designProperties.put("label.3rdvisit", translate("label.3rdvisit"));
		designProperties.put("label.4thvisit", translate("label.4thvisit"));
		designProperties.put("label.5thvisit", translate("label.5thvisit"));
		designProperties.put("label.0-3months", translate("label.0-3months"));
		designProperties.put("label.4-6months", translate("label.4-6months"));
		designProperties.put("label.7-9months", translate("label.7-9months"));
		designProperties.put("label.total.tours", translate("label.total.tours"));
		designProperties.put("label.support.for.pregnant.women", translate("label.support.for.pregnant.women"));
		designProperties.put("label.number.of.pregnancies.at.risk", translate("label.number.of.pregnancies.at.risk"));
		designProperties.put("label.case.of.anemia.in.pregnant.women", translate("label.case.of.anemia.in.pregnant.women"));
		designProperties.put("label.pregnant.women.receiving.folate.iron", translate("label.pregnant.women.receiving.folate.iron"));
		designProperties.put("label.pregnant.women.treated.for.ferrifive.anemia", translate("label.pregnant.women.treated.for.ferrifive.anemia"));
		designProperties.put("label.pregnant.women.with.a.delivery.plan", translate("label.pregnant.women.with.a.delivery.plan"));
		designProperties.put("label.pregnant.women.with.malaria.confirmed.treated.with.chloroquine", translate("label.pregnant.women.with.malaria.confirmed.treated.with.chloroquine"));
		designProperties.put("label.pregnant.women.who.received.an.impregnated.mosquito.net", translate("label.pregnant.women.who.received.an.impregnated.mosquito.net"));
		designProperties.put("label.pregnant.women.pb", translate("label.pregnant.women.pb"));
		designProperties.put("label.pregnant.women.mam", translate("label.pregnant.women.mam"));
		designProperties.put("label.number", translate("label.number"));
		designProperties.put("label.deliveries", translate("label.deliveries"));
		designProperties.put("label.age.of.mothers", translate("label.age.of.mothers"));
		designProperties.put("label.Others", translate("label.Others"));
		designProperties.put("label.Normal", translate("label.Normal"));
		designProperties.put("label.caesarean.section", translate("label.caesarean.section"));
		designProperties.put("label.Instrumentalised", translate("label.Instrumentalised"));
		designProperties.put("label.Community", translate("label.Community"));
		designProperties.put("label.mothers.under.15years", translate("label.mothers.under.15years"));
		designProperties.put("label.mothers.between.15-19years", translate("label.mothers.between.15-19years"));
		designProperties.put("label.mothers.between.20-24years", translate("label.mothers.between.20-24years"));
		designProperties.put("label.mothers.between.25-29years", translate("label.mothers.between.25-29years"));
		designProperties.put("label.mothers.30years.and.over", translate("label.mothers.30years.and.over"));
		designProperties.put("label.unknown", translate("label.unknown"));
		designProperties.put("label.work.man.ship", translate("label.work.man.ship"));
		designProperties.put("label.use.of.partogram", translate("label.use.of.partogram"));
		designProperties.put("label.active.management.of.the.3rd.phase.of.work", translate("label.active.management.of.the.3rd.phase.of.work"));
		designProperties.put("label.live.birth", translate("label.live.birth"));
		designProperties.put("label.weight.under1.5kg", translate("label.weight.under1.5kg"));
		designProperties.put("label.weight.15.under.2.5kg", translate("label.weight.15.under.2.5kg"));
		designProperties.put("label.weight.more.than.2.5kg", translate("label.weight.more.than.2.5kg"));
		designProperties.put("label.underdeveloped", translate("label.underdeveloped"));
		designProperties.put("label.put.within.immediately", translate("label.put.within.immediately"));
		designProperties.put("label.kangaroo.method.beneficiaries", translate("label.kangaroo.method.beneficiaries"));
		designProperties.put("label.post.natal.follow-up", translate("label.post.natal.follow-up"));
		designProperties.put("label.breastfeeding.women.receiving.vitamin.A", translate("label.breastfeeding.women.receiving.vitamin.A"));
		designProperties.put("label.nursing.women.with.pb", translate("label.nursing.women.with.pb"));
		designProperties.put("label.nursing.women.with.mam", translate("label.nursing.women.with.mam"));
		designProperties.put("label.postnatal.consultations", translate("label.postnatal.consultations"));
		designProperties.put("label.homemade.visits", translate("label.homemade.visits"));
		designProperties.put("label.number.of.recorded.obstetric.complications", translate("label.number.of.recorded.obstetric.complications"));
		designProperties.put("label.between.0-6hours", translate("label.between.0-6hours"));
		designProperties.put("label.from.7am-6days", translate("label.from.7am-6days"));
		designProperties.put("label.between.7-42days", translate("label.between.7-42days"));
		designProperties.put("label.between.0-3days", translate("label.between.0-3days"));
		designProperties.put("label.methods", translate("label.methods"));
		designProperties.put("label.women", translate("label.women"));
		designProperties.put("label.pc", translate("label.pc"));
		designProperties.put("label.pp", translate("label.pp"));
		designProperties.put("label.dropper", translate("label.dropper"));
		designProperties.put("label.implant", translate("label.implant"));
		designProperties.put("label.iud", translate("label.iud"));
		designProperties.put("label.necklace", translate("label.necklace"));
		designProperties.put("label.mama", translate("label.mama"));
		designProperties.put("label.Condom", translate("label.Condom"));
		designProperties.put("label.ligature", translate("label.ligature"));
		designProperties.put("label.total.women", translate("label.total.women"));
		designProperties.put("label.men", translate("label.men"));
		designProperties.put("label.vasectomy", translate("label.vasectomy"));
		designProperties.put("label.total.men", translate("label.total.men"));
		designProperties.put("label.ccv.operations", translate("label.ccv.operations"));
		designProperties.put("label.accepting", translate("label.accepting"));
		designProperties.put("label.under.25years", translate("label.under.25years"));
		designProperties.put("label.25years.and.above", translate("label.25years.and.above"));
		designProperties.put("label.26years.and.above", translate("label.26years.and.above"));
		designProperties.put("label.total.users", translate("label.total.users"));
		designProperties.put("label.support.for.the.child", translate("label.support.for.the.child"));
		designProperties.put("label.services.provided", translate("label.services.provided"));
		designProperties.put("label.children.under.6months", translate("label.children.under.6months"));
		designProperties.put("label.children.between.6-23months", translate("label.children.between.6-23months"));
		designProperties.put("label.children.between.24-59months", translate("label.children.between.24-59months"));
		designProperties.put("label.M", translate("label.M"));
		designProperties.put("label.F", translate("label.F"));
		designProperties.put("label.total.children.seen", translate("label.total.children.seen"));
		designProperties.put("label.children.seen.for.the.first.time", translate("label.children.seen.for.the.first.time"));
		designProperties.put("label.children.seen.for.the.first.time.measured", translate("label.children.seen.for.the.first.time.measured"));
		designProperties.put("label.children.seen.for.the.first.time.weighed", translate("label.children.seen.for.the.first.time.weighed"));
		designProperties.put("label.children.seen.for.the.first.time.screening", translate("label.children.seen.for.the.first.time.screening"));
		designProperties.put("label.children.seen.for.the.first.time.screening.Malnutri-chronic", translate("label.children.seen.for.the.first.time.screening.Malnutri-chronic"));
		designProperties.put("label.children.seen.for.the.first.time.MAM", translate("label.children.seen.for.the.first.time.MAM"));
		designProperties.put("label.children.seen.for.the.first.time.mas", translate("label.children.seen.for.the.first.time.mas"));
		designProperties.put("label.new.episodes.of.diseases", translate("label.new.episodes.of.diseases"));
		designProperties.put("label.diseases.and.symptoms", translate("label.diseases.and.symptoms"));
		designProperties.put("label.under.year", translate("label.under.year"));
		designProperties.put("label.under.10years", translate("label.under.10years"));
		designProperties.put("label.between.1-4years", translate("label.between.1-4years"));
		designProperties.put("label.between.5-9years", translate("label.between.5-9years"));
		designProperties.put("label.between.10-14years", translate("label.between.10-14years"));
		designProperties.put("label.between.20-24years", translate("label.between.20-24years"));
		designProperties.put("label.between.25-49years", translate("label.between.25-49years"));
		designProperties.put("label.50years.and.above", translate("label.50years.and.above"));
		designProperties.put("label.between.15-19years", translate("label.between.15-19years"));
		designProperties.put("label.total.cases.referred", translate("label.total.cases.referred"));
		designProperties.put("label.number.of.people.deceased", translate("label.number.of.people.deceased"));
		designProperties.put("label.disaggregation.per.age", translate("label.disaggregation.per.age"));
		designProperties.put("label.aggression.by.suspected.animal.rage", translate("label.aggression.by.suspected.animal.rage"));
		designProperties.put("label.cutaneous.coal", translate("label.cutaneous.coal"));
		designProperties.put("label.chikungunya", translate("label.chikungunya"));
		designProperties.put("label.cholera", translate("label.cholera"));
		designProperties.put("label.pertussis", translate("label.pertussis"));
		designProperties.put("label.dengue", translate("label.dengue"));
		designProperties.put("label.aqueous.diarrhea", translate("label.aqueous.diarrhea"));
		designProperties.put("label.bloody.diarrhea", translate("label.bloody.diarrhea"));
		designProperties.put("label.diphtheria", translate("label.diphtheria"));
		designProperties.put("label.epilepsy", translate("label.epilepsy"));
		designProperties.put("label.indeterminate.fever", translate("label.indeterminate.fever"));
		designProperties.put("label.haemorrhagic.fever", translate("label.haemorrhagic.fever"));
		designProperties.put("label.lymphatic.filariasis", translate("label.lymphatic.filariasis"));
		designProperties.put("label.acute.respiratory.infections", translate("label.acute.respiratory.infections"));
		designProperties.put("label.stand", translate("label.stand"));
		designProperties.put("label.population served", translate("label.population served"));
		designProperties.put("label.collective.food.infection", translate("label.collective.food.infection"));
		designProperties.put("label.meadow", translate("label.meadow"));
		designProperties.put("label.leptospirosis", translate("label.leptospirosis"));
		designProperties.put("label.malaria.confirmed.treated", translate("label.malaria.confirmed.treated"));
		designProperties.put("label.malnutrition", translate("label.malnutrition"));
		designProperties.put("label.bacterial.meningitis", translate("label.bacterial.meningitis"));
		designProperties.put("label.mumps", translate("label.mumps"));
		designProperties.put("label.PARALYSY.FLASK.AIGUE", translate("label.PARALYSY.FLASK.AIGUE"));
		designProperties.put("label.intestinal.parasitosis", translate("label.intestinal.parasitosis"));
		designProperties.put("label.abnormal.phenomenon", translate("label.abnormal.phenomenon"));
		designProperties.put("label.human.rage", translate("label.human.rage"));
		designProperties.put("label.measles.rubella", translate("label.measles.rubella"));
		designProperties.put("label.congenital.rubella", translate("label.congenital.rubella"));
		designProperties.put("label.febrile.icteric.syndrome", translate("label.febrile.icteric.syndrome"));
		designProperties.put("label.severe.acute.respiratory.syndrome", translate("label.severe.acute.respiratory.syndrome"));
		designProperties.put("label.syphilis", translate("label.syphilis"));
		designProperties.put("label.congenital.syphilis", translate("label.congenital.syphilis"));
		designProperties.put("label.tetanus", translate("label.tetanus"));
		designProperties.put("label.urines", translate("label.urines"));
		designProperties.put("label.neonatal.tetanus", translate("label.neonatal.tetanus"));
		designProperties.put("label.respiratory.symptoms", translate("label.respiratory.symptoms"));
		designProperties.put("label.bacteriological.pulmonary.tuberculosis", translate("label.bacteriological.pulmonary.tuberculosis"));
		designProperties.put("label.bacteriological.pulmonary.tuberculosis.no.confirmed", translate("label.bacteriological.pulmonary.tuberculosis.no.confirmed"));
		designProperties.put("label.total.case.of.tuberculosis", translate("label.total.case.of.tuberculosis"));
		designProperties.put("label.typhoid", translate("label.typhoid"));
		designProperties.put("label.hiv", translate("label.hiv"));
		designProperties.put("label.xerophthalmia", translate("label.xerophthalmia"));
		designProperties.put("label.other.diseases", translate("label.other.diseases"));
		designProperties.put("label.chronic.diseases", translate("label.chronic.diseases"));
		designProperties.put("label.disaggregation.by.age.and.sex", translate("label.disaggregation.by.age.and.sex"));
		designProperties.put("label.diabetes", translate("label.diabetes"));
		designProperties.put("label.old", translate("label.old"));
		designProperties.put("label.hta", translate("label.hta"));
		designProperties.put("label.burkitt.tumor", translate("label.burkitt.tumor"));
		designProperties.put("label.cervical.cancer", translate("label.cervical.cancer"));
		designProperties.put("label.breast.cancer", translate("label.breast.cancer"));
		designProperties.put("label.prostate.cancer", translate("label.prostate.cancer"));
		designProperties.put("label.obesity", translate("label.obesity"));
		designProperties.put("label.glaucoma", translate("label.glaucoma"));
		designProperties.put("label.cataract", translate("label.cataract"));
		designProperties.put("label.renal.failure", translate("label.renal.failure"));
		designProperties.put("label.vaccination", translate("label.vaccination"));
		designProperties.put("label.vaccines", translate("label.vaccines"));
		designProperties.put("label.bcg", translate("label.bcg"));
		designProperties.put("label.vpo.polio", translate("label.vpo.polio"));
		designProperties.put("label.vpo1", translate("label.vpo1"));
		designProperties.put("label.vpo2", translate("label.vpo2"));
		designProperties.put("label.vpo.reminder", translate("label.vpo.reminder"));
		designProperties.put("label.vpi", translate("label.vpi"));
		designProperties.put("label.penta1", translate("label.penta1"));
		designProperties.put("label.penta2", translate("label.penta2"));
		designProperties.put("label.penta3", translate("label.penta3"));
		designProperties.put("label.rota1", translate("label.rota1"));
		designProperties.put("label.rota2", translate("label.rota2"));
		designProperties.put("label.rr1", translate("label.rr1"));
		designProperties.put("label.rr2", translate("label.rr2"));
		designProperties.put("label.Used", translate("label.Used"));
		designProperties.put("label.pneumo1", translate("label.pneumo1"));
		designProperties.put("label.pneumo2", translate("label.pneumo2"));
		designProperties.put("label.pneumo3", translate("label.pneumo3"));
		designProperties.put("label.dtp.reminder", translate("label.dtp.reminder"));
		designProperties.put("label.pregnant.women", translate("label.pregnant.women"));
		designProperties.put("label.Inst", translate("label.Inst"));
		designProperties.put("label.Comm", translate("label.Comm"));
		designProperties.put("label.vaccine", translate("label.vaccine"));
		designProperties.put("label.Administered", translate("label.Administered"));
		designProperties.put("label.between.12-23months", translate("label.between.12-23months"));
		designProperties.put("label.between.0-11months", translate("label.between.0-11months"));
		designProperties.put("label.boys", translate("label.boys"));
		designProperties.put("label.girls", translate("label.girls"));
		designProperties.put("label.doses.vaccines", translate("label.doses.vaccines"));
		designProperties.put("label.dt", translate("label.dt"));
	
		reportDesign.setProperties(designProperties);
		return Arrays.asList(reportDesign);
	}

    @Override
    public String getVersion() {
        return "1.00";
    }

    protected String translate(String code) {
		String messageCode = "isanteplusreports.hsis." + code;
		String translation = MessageUtil.translate(messageCode);
		return translation;
	}
}
