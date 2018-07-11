package org.omnidial.harvest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TelCandidateHarvesterTest implements DialCandidateListener {
	
			List<DialCandidate>	dcArray = new ArrayList<DialCandidate>();
			
	public void onDialCandidate(DialCandidateHarvester h, DialCandidate dc)
	{
			dcArray.add(dc);
	}
	public void onHarvestCompletion(DialCandidateHarvester h, final int resultCount)
	{
		
	}
	
	@Test
	public void test() {
		TelCandidateHarvesterTest t= new TelCandidateHarvesterTest();
		TelCandidateHarvester h = new TelCandidateHarvester();
		h.addListener(t);
		String number = "997180330";
		h.getCandidatesForNumber(number,"extra");
		assertEquals(t.dcArray.size(),1);
		assertEquals(number, t.dcArray.get(0).address);
		
	}
	@Test
	public void test1() {
		TelCandidateHarvesterTest t1= new TelCandidateHarvesterTest();
		TelCandidateHarvester h1 = new TelCandidateHarvester();
		h1.addListener(t1);
		String number = "pranav";
		h1.getCandidatesForNumber(number,"extra");
		assertEquals(t1.dcArray.size(),1);
		assertEquals(number, t1.dcArray.get(0).address);
		
	}
	@Test
	public void test2() {
		TelCandidateHarvesterTest t2= new TelCandidateHarvesterTest();
		TelCandidateHarvester h2 = new TelCandidateHarvester();
		h2.addListener(t2);
		String number = "9971pranav";
		h2.getCandidatesForNumber(number,"extra");
		assertEquals(1,t2.dcArray.size());
		assertEquals(number, t2.dcArray.get(0).address);
		
	}
	@Test
	public void test3()
	{
		TelCandidateHarvesterTest t3= new TelCandidateHarvesterTest();
		TelCandidateHarvester h3 = new TelCandidateHarvester();
		h3.addListener(t3);
		String number = "1122Dezi";
		h3.getCandidatesForNumber(number, "extra");
		assertEquals(1, t3.dcArray.size());
		assertEquals(number, t3.dcArray.get(0).displayName);
		
		
	}
	
	@Test
	public void test4()
	{
		TelCandidateHarvesterTest t4= new TelCandidateHarvesterTest();
		TelCandidateHarvester h4 = new TelCandidateHarvester();
		h4.addListener(t4);
		String number = "1100Dezi";
		h4.getCandidatesForNumber(number, "extra");
		assertEquals(1, t4.dcArray.size());
		assertEquals(number, t4.dcArray.get(0).displayName);
		
	}
	
	@Test
	public void test5()
	{
		TelCandidateHarvesterTest t5= new TelCandidateHarvesterTest();
		TelCandidateHarvester h5 = new TelCandidateHarvester();
		h5.addListener(t5);
		String number = "0101Dezi";
		h5.getCandidatesForNumber(number, "extra");
		assertEquals(1, t5.dcArray.size());
		assertEquals(number, t5.dcArray.get(0).displayName);
		
	}
	@Test
	public void test6()
	{
		TelCandidateHarvesterTest t6= new TelCandidateHarvesterTest();
		TelCandidateHarvester h6 = new TelCandidateHarvester();
		h6.addListener(t6);
		String number = "1100Dezi";
		h6.getCandidatesForNumber(number, "extra");
		assertEquals(1, t6.dcArray.size());
		assertEquals(number, t6.dcArray.get(0).displayName);
	}
	
	@Test
	public void test7()
	{
		TelCandidateHarvesterTest t7= new TelCandidateHarvesterTest();
		TelCandidateHarvester h7 = new TelCandidateHarvester();
		h7.addListener(t7);
		String number = "1010Dezi";
		h7.getCandidatesForNumber(number, "extra");
		assertEquals(1, t7.dcArray.size());
		assertEquals(number, t7.dcArray.get(0).address);
	}
	
	@Test
	public void test8()
	{
		TelCandidateHarvesterTest t8= new TelCandidateHarvesterTest();
		TelCandidateHarvester h8 = new TelCandidateHarvester();
		h8.addListener(t8);
		String number = "123Dezi";
		h8.getCandidatesForNumber(number, "extra");
		assertEquals(1, t8.dcArray.size());
		assertEquals(number, t8.dcArray.get(0).address);
	}
	
	@Test
	public void test9()
	{
		TelCandidateHarvesterTest t9= new TelCandidateHarvesterTest();
		TelCandidateHarvester h9 = new TelCandidateHarvester();
		h9.addListener(t9);
		String number = "321Dezi";
		h9.getCandidatesForNumber(number, "extra");
		assertEquals(1, t9.dcArray.size());
		assertEquals(number, t9.dcArray.get(0).address);
	}
	//test4
	
	//assertEquals(schemevalue, object.getScheme)
	
	
	}
	


