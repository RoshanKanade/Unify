package com.matchingnonmatchingelementsbothagents.test;

import org.testng.annotations.Test;

import com.matchingnonmatchingelementsbothagents.apppom.FCPermission;
import com.matchingnonmatchingelementsbothagents.apppom.NAPermission;
import com.matchingnonmatchingelementsbothagents.apppom.ROPermission;
import com.matchingnonmatchingelementsbothagents.apppom.RWPermission;
import com.matchingnonmatchingelementsbothagents.base.Base;
import com.matchingnonmatchingelementsbothagents.pom.LogInPage;

public class AppEndToEndTest extends Base
{
	@Test
	public void ApplicationExceptionalCaseTest() 
	{
		try 
		{
			Base base=new Base();
			base.initialization();
			LogInPage log=new LogInPage(driver);
	
			log.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
			  NAPermission nap=new NAPermission(driver); nap.NAPermissionFields();
				log.Logfield(prop.getProperty("em"),prop.getProperty("ps"));
			  nap.NASubPermissionField();
			 
			
			ROPermission rop=new ROPermission(driver);
			rop.ROPermissionFields();
			rop.ROSubPermissionFields();
			rop.RORecruiterAgentFields();
			rop.ROProgramtFields();
			rop.ROEducationalFields();
			rop.ROTestScoreFields();
			rop.ROStudyPermitFields();
			rop.ROSubStudyPermitFields();
			rop.RODocumentFields(); 
			rop.ROSubDocumentFields();
			rop.ROInstitutionDocFields();
			rop.ROSubInstitutionDocFields();
			rop.ROFeeFields();
			rop.ROSubFeeFields(); 
			rop.ROTaskFields(); 
			rop.ROSubTaskFields();
			
			
			
			 
			  RWPermission rwp=new RWPermission(driver);
			  rwp.RWPermissionFields();
			  rwp.RWSubPermissionFields();
			  rwp.RWRecruiterAgentFields();
			  rwp.RWProgramtFields();
			  rwp.RWEducationalFields();
			  rwp.RWTestScoreFields();
			  rwp.RWStudyPermitFields();
			  rwp.RWSubStudyPermitFields();
			  rwp.RWDocumentFields(); 
			  rwp.RWSubDocumentFields();
			  rwp.RWInstitutionDocFields();
			  rwp.RWSubInstitutionDocFields();
			  rwp.RWFeeFields();
			  rwp.RWSubFeeFields(); 
			  rwp.RWTaskFields(); 
			  rwp.RWSubTaskFields();
			  
			  FCPermission fcp=new FCPermission(driver);
			  fcp.FCPermissionFields();
			  fcp.FCSubPermissionFields();
			  fcp.FCRecruiterAgentFields();
			  fcp.FCProgramtFields();
			  fcp.FCEducationalFields();
			  fcp.FCTestScoreFields();
			  fcp.FCStudyPermitFields();
			  fcp.FCSubStudyPermitFields();
			  fcp.FCDocumentFields(); 
			  fcp.FCSubDocumentFields();
			  fcp.FCInstitutionDocFields();
			  fcp.FCSubInstitutionDocFields();
			  fcp.FCFeeFields();
			  fcp.FCSubFeeFields(); 
			  fcp.FCTaskFields(); 
			  fcp.FCSubTaskFields();
			 		
			} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}

}
