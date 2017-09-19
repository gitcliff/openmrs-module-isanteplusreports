SELECT
    COUNT(DISTINCT CASE WHEN (
            p.gender = 'F'
	    AND p.patient_id IN (SELECT pv.patient_id FROM isanteplus.patient_visit pv
                                 WHERE pv.adherence_evaluation IS NOT NULL
                                 AND pv.visit_date BETWEEN SUBDATE(:currentDate, INTERVAL 3 MONTH) AND :currentDate)
        ) THEN p.patient_id ELSE null END
    ) AS 'femaleNumerator',
    COUNT(DISTINCT CASE WHEN (
            p.gender = 'M'
            AND p.patient_id IN (SELECT pv.patient_id FROM isanteplus.patient_visit pv
                                 WHERE pv.adherence_evaluation IS NOT NULL
                                 AND pv.visit_date BETWEEN SUBDATE(:currentDate, INTERVAL 3 MONTH) AND :currentDate)
        ) THEN p.patient_id ELSE null END
    ) AS 'maleNumerator',
    COUNT(DISTINCT CASE WHEN (p.gender = 'F') THEN p.patient_id ELSE null END) AS 'femaleDenominator',
    COUNT(DISTINCT CASE WHEN (p.gender = 'M') THEN p.patient_id ELSE null END) AS 'maleDenominator'
FROM
        isanteplus.patient p
WHERE
        p.vih_status = '1'
	AND p.patient_id IN (
		SELECT pv.patient_id
		FROM isanteplus.patient_visit pv
		LEFT JOIN isanteplus.patient_prescription pp
		ON pv.patient_id = pp.patient_id
		WHERE
			DATE(pv.visit_date) BETWEEN SUBDATE(:currentDate, INTERVAL 3 MONTH) AND :currentDate
			OR DATE(pp.visit_date) BETWEEN SUBDATE(:currentDate, INTERVAL 3 MONTH) AND :currentDate)
    	AND p.patient_id IN (SELECT poa.patient_id FROM isanteplus.patient_on_arv poa)
	AND p.patient_id NOT IN (
			SELECT discon.patient_id
		        FROM isanteplus.discontinuation_reason discon
		        WHERE discon.reason IN ('159', '1667', '159492'));