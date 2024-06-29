/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 29 20:16:34 GMT 2024
 */

package org.isf.vaccine.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.isf.vaccine.model.Vaccine;
import org.isf.vaccine.service.VaccineIoOperations;
import org.isf.vactype.model.VaccineType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VaccineIoOperations_ESTest extends VaccineIoOperations_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VaccineIoOperations vaccineIoOperations0 = new VaccineIoOperations();
      // Undeclared exception!
      try { 
        vaccineIoOperations0.findVaccine("QlV{6O!D-`");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.vaccine.service.VaccineIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VaccineIoOperations vaccineIoOperations0 = new VaccineIoOperations();
      // Undeclared exception!
      try { 
        vaccineIoOperations0.findVaccine((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // code must not be null
         //
         verifyException("org.isf.vaccine.service.VaccineIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VaccineIoOperations vaccineIoOperations0 = new VaccineIoOperations();
      // Undeclared exception!
      try { 
        vaccineIoOperations0.getVaccine("Pv|yne*1j@bSr][)[");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.vaccine.service.VaccineIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VaccineIoOperations vaccineIoOperations0 = new VaccineIoOperations();
      // Undeclared exception!
      try { 
        vaccineIoOperations0.getVaccine((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.vaccine.service.VaccineIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VaccineIoOperations vaccineIoOperations0 = new VaccineIoOperations();
      Vaccine vaccine0 = new Vaccine();
      // Undeclared exception!
      try { 
        vaccineIoOperations0.deleteVaccine(vaccine0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.vaccine.service.VaccineIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vaccine vaccine0 = new Vaccine();
      VaccineIoOperations vaccineIoOperations0 = new VaccineIoOperations();
      // Undeclared exception!
      try { 
        vaccineIoOperations0.newVaccine(vaccine0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.vaccine.service.VaccineIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VaccineIoOperations vaccineIoOperations0 = new VaccineIoOperations();
      // Undeclared exception!
      try { 
        vaccineIoOperations0.isCodePresent("r0mqxe>q'G/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.vaccine.service.VaccineIoOperations", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      VaccineIoOperations vaccineIoOperations0 = new VaccineIoOperations();
      VaccineType vaccineType0 = new VaccineType("", "");
      Vaccine vaccine0 = new Vaccine("", "", vaccineType0);
      // Undeclared exception!
      try { 
        vaccineIoOperations0.updateVaccine(vaccine0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.vaccine.service.VaccineIoOperations", e);
      }
  }
}