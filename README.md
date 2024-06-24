# LoanApplication
A Java desktop application built using JavaSE(business logic), JavaFx(GUI), MySQL(backend database). The design pattern used is the infamous MVC(Model View Controller). This is, by no means, a serious attempt in building an actual loan management system. But it can serve as a nice starting point for understanding software development. It also makes one appreciate how big of a difference a good design pattern can make in the ease of developing an application. This  project was given to me by the course instructor as a part of the Java course during my 6th semester of college

Visual Studio and EclipsIDE is used for building the project. Using the same to run the project could turn out to be of great help!<br/>

Dependency information is included in the file pom.xml. Since it is a maven project, the user will not have to go through the hassle of downloading all the dependency jars. VisualStudio Code will do that for us by parsing the pom.xml file and downloading all dependencies from the mvn repository.<br/>



## Database Integration<br/>

The app is configured to use a MySQL Backend database.

Modifications will be needed on the files:-

src/Launch.java<br/>
src/DataStore.java<br/>
src/controllers/RegistrationScreenController.java<br/>
src/controllers/LoginScreenController.java<br/><br/>

Launch.java --> Assign appropriate values to string constants <b>DATABASE</b>, <b>USERNAME</b>, <b>PASSWORD</b>.<br/>
<b>DATABASE</b> = It should be a jdbc URL of the form jdbc:mysql://server/database.
<b>USERNAME</b> = It should be the username for the mysql server provided above.<br/>
<b>PASSWORD</b> = It should be the password for the username above.<br/><br/>

## Execute the app by running the Launch.java file from the VisualStudioCode IDE.

