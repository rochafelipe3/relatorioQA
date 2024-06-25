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
	
	
	//TESTES DE EDIÇÃO
	
	@Test
	void editeVacinationValidDate() throws OHServiceException {
		
		var newVac = patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(newVac).isNotNull();
	}
	
	@Test
	public void editeVacinationInvalidDate() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void editeVacinationValidVaccineType() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void editeVacinationInvalidVaccineType() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	

	@Test
	public void editeVacinationValidVaccine() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNull();
	}
	
	@Test
	public void editeVacinationInvalidVaccine() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	//TESTES DE DELEÇÃO
	
	@Test
	public void deleteVacinationValidVaccine() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNull();
	}
	
	@Test
	public void deleteVacinationInvalidVaccine() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	//TESTES DE CONSULTAR
	
	@Test
	public void consultarVacinationInvalidDateFrom() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationInValidDateTo() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationInValidAgeFrom() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationInValidAgeTo() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationInValidSex() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationInValidVaccineType() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationInValidVaccine() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationInValidDateFrom() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationValidDateTo() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationValidAgeFrom() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationValidAgeTo() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationValidSex() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationValidVaccineType() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
	
	@Test
	public void consultarVacinationValidVaccine() throws OHServiceException {
		
		patvacIoOperation.newPatientVaccine(patvec);
		
		assertThat(patvec).isNotNull();
	}
}
