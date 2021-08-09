SELECT COUNT(p.patient_id) AS childrenUnder1
FROM openmrs.patient p INNER JOIN openmrs.person ps ON p.patient_id = ps.person_id 
    WHERE TIMESTAMPDIFF(MONTH, ps.birthdate, :startDate) >= 1
    AND TIMESTAMPDIFF(MONTH, ps.birthdate, :endDate) <=12;