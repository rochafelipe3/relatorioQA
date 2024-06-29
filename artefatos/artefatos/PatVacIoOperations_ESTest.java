/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 29 20:03:48 GMT 2024
 */

package org.isf.patvac.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.isf.patvac.model.PatientVaccine;
import org.isf.patvac.service.PatVacIoOperations;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PatVacIoOperations_ESTest extends PatVacIoOperations_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PatVacIoOperations patVacIoOperations0 = new PatVacIoOperations();
      // Undeclared exception!
      try { 
        patVacIoOperations0.getProgYear(1487);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/joda/time/DateTime
         //
         verifyException("org.isf.patvac.service.PatVacIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PatVacIoOperations patVacIoOperations0 = new PatVacIoOperations();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        patVacIoOperations0.getPatientVaccine("", "", (GregorianCalendar) mockGregorianCalendar0, (GregorianCalendar) null, 'U', (-3066), (-3066));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.service.PatVacIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PatVacIoOperations patVacIoOperations0 = new PatVacIoOperations();
      PatientVaccine patientVaccine0 = new PatientVaccine();
      // Undeclared exception!
      try { 
        patVacIoOperations0.updatePatientVaccine(patientVaccine0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.service.PatVacIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PatVacIoOperations patVacIoOperations0 = new PatVacIoOperations();
      PatientVaccine patientVaccine0 = new PatientVaccine();
      // Undeclared exception!
      try { 
        patVacIoOperations0.newPatientVaccine(patientVaccine0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.service.PatVacIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PatVacIoOperations patVacIoOperations0 = new PatVacIoOperations();
      // Undeclared exception!
      try { 
        patVacIoOperations0.getPatientVaccine(true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/joda/time/ReadableInstant
         //
         verifyException("org.isf.patvac.service.PatVacIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PatVacIoOperations patVacIoOperations0 = new PatVacIoOperations();
      // Undeclared exception!
      try { 
        patVacIoOperations0.getProgYear(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.service.PatVacIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PatVacIoOperations patVacIoOperations0 = new PatVacIoOperations();
      PatientVaccine patientVaccine0 = new PatientVaccine();
      // Undeclared exception!
      try { 
        patVacIoOperations0.deletePatientVaccine(patientVaccine0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.service.PatVacIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PatVacIoOperations patVacIoOperations0 = new PatVacIoOperations();
      // Undeclared exception!
      try { 
        patVacIoOperations0.getProgYear((-1));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/joda/time/DateTime
         //
         verifyException("org.isf.patvac.service.PatVacIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PatVacIoOperations patVacIoOperations0 = new PatVacIoOperations();
      Integer integer0 = Integer.valueOf(47);
      // Undeclared exception!
      try { 
        patVacIoOperations0.isCodePresent(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.service.PatVacIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PatVacIoOperations patVacIoOperations0 = new PatVacIoOperations();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 0);
      // Undeclared exception!
      try { 
        patVacIoOperations0.getPatientVaccine("", "", (GregorianCalendar) mockGregorianCalendar0, (GregorianCalendar) mockGregorianCalendar0, 'j', 371, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.service.PatVacIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PatVacIoOperations patVacIoOperations0 = new PatVacIoOperations();
      // Undeclared exception!
      try { 
        patVacIoOperations0.findForPatient(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.service.PatVacIoOperations", e);
      }
  }
}
