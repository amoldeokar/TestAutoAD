package TestNG;

// Download jenkins war file
// run command in cmd prompt: 
//C:\Users\admin>java -jar D:\jenkins.war
//open browser: run localhost:8080
//go to location file:///C:/Users/admin/.jenkins/secrets/initialAdminPassword for the password


//// Copy Project folder to local , create batch file as 
/*
 * D:
cd D:\amol\MyProject
java -cp D:\eclipse\eclipse-jee-luna-SR2-win32-x86_64\eclipse\plugins\org.testng.eclipse_6.9.5.201505260426\lib\*;D:\amol\MyProject\bin org.testng.TestNG testng.xml
pause

<<here path of TestNG lib in Eclips folder of project then org.testng.TestNG testng.xml>>
 *
 */



//Run above batch file to check if it's running 



//Check whether Jenkins is installed :  http://localhost:8080
// It's CI CD (Continuous Integrarion Continuous delivery tool
//Install it , configure it (for TestNG project e.g. , like libraries of eclipse (in eclipse Plugins folder)
//and the Class files)  , Create a BAT file for this config and give the path of this bat file into Jenkins JOB config under Advanced > Directory text box
//Build Config: select first option execute bat command , Save
//In Jenkins click on "Build Now" link to run that job



Step1: Run  //C:\Users\admin>java -jar D:\jenkins.war (keep this running) & then http://localhost:8080
Step2: New Item - give job name > select Freestyle project > Ok 
Step3: Go to Advanced >Use Custom workspace & give directory path of bat file (C:\Users\admin\Desktop)
Display Name: jenkinjob1.bat

Step4:goto Build option give build name (i.e name of batch file here as -  jenkinjob1.bat)
Step 5:Also verify JDK path under Manage Jenkins > Global Tool Configuration> > JDK > Set JAVA_HOME (plz see attached screenshot)
Step 6: Then click on Build now and see console path, build history
 

public class Jenkins {

}
