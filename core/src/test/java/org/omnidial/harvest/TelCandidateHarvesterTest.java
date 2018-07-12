package org.omnidial.harvest;

import static org.junit.Assert.*;
import java.util.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.junit.Test;

public class TelCandidateHarvesterTest implements DialCandidateListener {
	
			List<DialCandidate>	dcArray = new ArrayList<DialCandidate>();
			Collection<DialCandidateListener> listeners =
					new ConcurrentLinkedQueue<DialCandidateListener>();
			
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
		assertFalse(false);
		
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
		assertNotNull(number);
		
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
		assertFalse(true);
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
		assertFlase("False", false);
	}
	private void assertFlase(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void test10()
	{
		TelCandidateHarvesterTest t10= new TelCandidateHarvesterTest();
		TelCandidateHarvester h10 = new TelCandidateHarvester();
		h10.addListener(t10);
		String number = "2505Dezi";
		h10.getCandidatesForNumber(number, "extra");
		assertEquals(1, t10.dcArray.size());
		assertEquals(number, t10.dcArray.get(0).address);
		assserNotNull("This object is not null",number);
		
	}
	private void assserNotNull(String string, String number) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testDial()
	{
		DialCandidate dc = new DialCandidate("+383", "Mother Teresa", "Dezi", "KS", 2);
		DialCandidateHarvester dch = DialCandidateHarvester(listeners);
		dch.addListener((DialCandidateListener) dc);
		String number = "00Dejzi";
		dch.getCandidatesForNumber(number, "Special");
		assertEquals(1, dc.getAddress());
		assertEquals(1, dc.toString());
		assertEquals(1, dc.getDomain());
		
	}
	@Test
	public void testDial1()
	{
		DialCandidate dc1 = new DialCandidate("+383", "Main Street", "Dejzi", "RKS", 3);
		DialCandidateHarvester dch1 = DialCandidateHarvester(listeners);
		dch1.addListener((DialCandidateListener) dc1);
		String number = "111Dejzi";
		dch1.getCandidatesForNumber(number, "Special");
		assertEquals(1, dc1.getAddress());
		assertEquals(1, dc1.toString());
		assertEquals(1, dc1.getDomain());
		assertFalse(true);
	}
	@Test
	public void testDial2()
	{
		DialCandidate dc2 = new DialCandidate("+383", "Prishtina Street", "Diellza", "RKS", 1);
		DialCandidateHarvester dch2 = DialCandidateHarvester(listeners);
		dch2.addListener((DialCandidateListener) dc2);
		String number = "222Dejzi";
		dch2.getCandidatesForNumber(number, "Special");
		assertEquals(1, dc2.getAddress());
		assertEquals(1, dc2.toString());
		assertEquals(1, dc2.getDisplayName());
		assertEquals(1, dc2.getSource());
		assertFalse(true);
	}
	@Test
	public void testDial3()
	{
		DialCandidate dc3 = new DialCandidate("+383", "Kosovo Street", "Diellza", "RKS", 1);
		DialCandidateHarvester dch3 = DialCandidateHarvester(listeners);
		dch3.addListener((DialCandidateListener) dc3);
		String number = "99Dejzi";
		dch3.getCandidatesForNumber(number, "Special");
		assertEquals(1, dc3.getAddress());
		assertEquals(1, dc3.toString());
		assertEquals(1, dc3.getDisplayName());
		assertEquals(1, dc3.getSource());
		assertSame(number, dc3);
		assertFalse(false);
	}
	@Test
	public void testDial4()
	{
		DialCandidate dc4 = new DialCandidate("+383", "Somewhere Street", "Diellza", "RKS", 1);
		DialCandidateHarvester dch4 = DialCandidateHarvester(listeners);
		dch4.addListener((DialCandidateListener) dc4);
		String number = "222Diellza";
		dch4.getCandidatesForNumber(number, "Special");
		assertEquals(1, dc4.getAddress());
		assertEquals(1, dc4.toString());
		assertEquals(1, dc4.getDisplayName());
		assertEquals(1, dc4.getScheme());
		assertSame(number,dc4);
		assertFalse(true);
	}
	//test4
	//assertEquals(schemevalue, object.getScheme)
	private DialCandidateHarvester DialCandidateHarvester(Collection<DialCandidateListener> listeners2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}
	


