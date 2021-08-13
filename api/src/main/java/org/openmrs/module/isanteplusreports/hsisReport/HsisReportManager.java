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
		
		CohortIndicatorDataSetDefinition cd = HsisReportDatasetLibrary.getVistsDataset();
		Map<String, Object> parameterMappings = new HashMap<String, Object>();
		parameterMappings.put("startDate", "${startDate}");
		parameterMappings.put("endDate", "${endDate}");	
		rd.addDataSetDefinition(getName(), cd, parameterMappings);		
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
		designProperties.put("label.total", translate("label.total"));
		designProperties.put("label.postive", translate("label.postive"));
		designProperties.put("label.categories", translate("label.categories"));
		designProperties.put("label.new", translate("label.new"));
		designProperties.put("label.subsquent",translate("label.subsquent"));
		designProperties.put("label.children.under1", translate("label.children.under1"));		
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
