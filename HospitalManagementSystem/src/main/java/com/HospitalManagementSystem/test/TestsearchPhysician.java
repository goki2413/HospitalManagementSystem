package com.HospitalManagementSystem.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.HospitalManagementSystem.Service.HospitalManagementSystemService;
import com.HospitalManagementSystem.model.Physician;
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestsearchPhysician {
	@Autowired
	HospitalManagementSystemService hospitalManagementSystemService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void search( ) {
		List<Physician> list=null;
	/*List<Physician> physician = this.hospitalManagementSystemService
				.searchPhysician("Urology", "Tamil nadu", "Star Health Insurance");
		assertNull(physician);
		//fail("Not yet implemented");
	}*/
	Mockito.when(hospitalManagementSystemService.searchPhysician("Urology","Tamil nadu","Star Health Insurance")).thenReturn(list);
	List<Physician> list1=hospitalManagementSystemService.searchPhysician("Urology","Tamil nadu","Star Health Insurance");
    Assert.assertNotNull(list1);
 }

}
