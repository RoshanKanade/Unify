package com.matchingnonmatchingelementsbothagents.test;

import org.testng.annotations.Test;

import com.matchingnonmatchingelementsbothagents.base.Base;
import com.matchingnonmatchingelementsbothagents.pom.FCPermission;
import com.matchingnonmatchingelementsbothagents.pom.LogInPage;
import com.matchingnonmatchingelementsbothagents.pom.NAPermission;
import com.matchingnonmatchingelementsbothagents.pom.ROPermission;
import com.matchingnonmatchingelementsbothagents.pom.RWPermission;

public class EndToEndTest extends Base
{
	@Test
	public void ExceptionalCaseTest() 
	{
		try 
		{
			Base base=new Base();
			base.initialization();
			LogInPage log=new LogInPage(driver);
			
			log.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
			
			NAPermission nap=new NAPermission(driver); 
			nap.NAPermissionFields();
			nap.NewTabShifting(); 
			log.Logfield(prop.getProperty("em"),prop.getProperty("ps")); 
			nap.NAScreenshootField();
		
			ROPermission rop=new ROPermission(driver);
			rop.ROPermissionFields();rop.ROScreenshootField(); rop.ROEditStuentFields();
			rop.ROSubEditStuentFields();
			rop.ROEducationalFields(); rop.ROSubEducationalFields();
			rop.ROTestScoreFields(); rop.ROSubTestScoreFields();
			rop.RODocumentFields();rop.ROSubDocumentFields();			  
			rop.ROVisaFields(); rop.ROSubVisaFields(); rop.ROInterestFields();
			rop.ROSubInterestFields(); rop.ROActivityFields(); rop.ROSubActivityFields();
			 
			RWPermission rwp=new RWPermission(driver);
			rwp.RWPermissionFields();rwp.RWScreenshootField(); rwp.RWEditStuentFields();
			rwp.RWSubEditStuentFields(); rwp.RWEducationalFields();
			rwp.RWSubEducationalFields(); rwp.RWTestScoreFields();
			rwp.RWSubTestScoreFields(); rwp.RWDocumentFields();
			rwp.RWSubDocumentFields(); rwp.RWVisaFields(); rwp.RWSubVisaFields();
			rwp.RWInterestFields(); rwp.RWSubInterestFields(); rwp.RWActivityFields();
			rwp.RWSubActivityFields();
				
			FCPermission fcp=new FCPermission(driver);
			fcp.FCPermissionFields();fcp.FCScreenshootField(); fcp.FCEditStuentFields();
			fcp.FCSubEditStuentFields(); fcp.FCEducationalFields();
			fcp.FCSubEducationalFields(); fcp.FCTestScoreFields();
			fcp.FCSubTestScoreFields(); fcp.FCDocumentFields();
			fcp.FCSubDocumentFields(); fcp.FCVisaFields(); fcp.FCSubVisaFields();
			fcp.FCInterestFields(); fcp.FCSubInterestFields(); fcp.FCActivityFields();
			fcp.FCSubActivityFields();
				 
			 	
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}

}
