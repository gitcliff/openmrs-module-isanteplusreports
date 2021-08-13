SELECT p.patient_id 
FROM openmrs.patient p INNER JOIN openmrs.visit v ON p.patient_id = v.patient_id 
    WHERE v.date_started = (SELECT MAX(v2.date_started) FROM openmrs.visit v2 WHERE v2.patient_id = p.patient_id AND v2.date_started BETWEEN :startDate AND :endDate)
    AND v.date_started > (SELECT MIN(v2.date_started) FROM openmrs.visit v2 WHERE v2.patient_id = p.patient_id)
    AND v.date_started IS NOT NULL
    AND v.date_started BETWEEN :startDate AND :endDate;