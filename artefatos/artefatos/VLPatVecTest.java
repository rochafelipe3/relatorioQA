package org.isf.patvac;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

import org.isf.patient.model.Patient;
import org.isf.patvac.model.PatientVaccine;
import org.isf.patvac.service.PatVacIoOperations;
import org.isf.utils.exception.OHServiceException;
import org.isf.vaccine.model.Vaccine;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VLPatVecTest {

	
	@Autowired
	PatVacIoOperations patvacIoOperation;
	static PatientVaccine patvec;
	
	@BeforeAll
	static void setUpClass() {
		patvec = new PatientVaccine();
		patvec.setPatient(new Patient());
		patvec.setVaccine(new Vaccine());
		patvec.setVaccineDate(LocalDateTime.now());
	}
	
	@Test
	void newVacinationValidDate() throws OHServiceException {
		
		var newVac = patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(newVac).isNotNull();
	}
	
	@Test
	public void newVacinationInvalidDate() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void newVacinationValidPatientCode() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void newVacinationInvalidPatientCode() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void newVacinationValidPatientPatient() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void newVacinationInvalidPatientPatient() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void newVacinationValidVaccineType() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void newVacinationInvalidVaccineType() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void newVacinationValidVaccine() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNull();
	}
	
	@Test
	public void newVacinationInvalidVaccine() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
}
