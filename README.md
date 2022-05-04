# MyHomeWorkEbay
Steps to run the automation script:

*Note: The development of the code is done on Windows10 OS, but it can be executed on any platform.

1. Download the  file 'mavenproject'.

2. Required softwares- Google Chrome webrowser, Eclipse IDE, Selenium jar file(selenium-server-standalone-4.1.3.jar) and java jdk 1.8 installed on the system.

Selenium jar file can downloaded from here: https://www.seleniumhq.org/download/ 

Java can be downloaded from here: https://java.com/en/download/

Chrome browser can be downloaded from here: https://www.google.com/chrome/

Eclipse IDE can be downloaded from here: https://www.eclipse.org/downloads/


3. Download 'chromedriver.exe' file from this link: http://chromedriver.chromium.org/downloads

4. Place this chrome driver at any location (place it at 'C:\ProgramFiles\chromedriver.exe')

5. Open Eclipse IDE-> click on File -> Click on Import -> select General - Existing Projects into Workspace and click Next-> in Select root directory, click browse and select the unziped file 'TechnicalChallenge' and click on Finish Button.

6. The 'mavenproject' will open under Package explorer on the left side panel and expand it.

7. Right click on the 'mavenproject'-> select Build Path -> select Configure Build Path -> 'Properties for mavenproject' dialogue box will open up

8. Under the Java Build Path-> select Libraries Tab-> Click on add external JARS button-> and add the already downloaded selenium (selenium-server-standalone-4.1.3.jar) file

9. Under the same Libraries tab, select and remove the already added 'selenium-server-standalone-4.1.3.jar - 

10. Click Apply and OK on the 'Properties for mavenproject' dialogue box

11. Expand the 'mavenproject' project-> click and expand src folder-> click and expand Pack1->double click on AnnotationTest.java

12. The AnnotationTest.java file will open in the right window of eclipse. 

13. On the top tools bar, click on Run button(green button)->click Run As-> click TestNG Test -> Click OK on the Save and Launch dialogue box

14. The entire testing of the Annotation tool will start automatically on the chrome browser.

15. The test results can be seen in the console of the eclipse IDE.
