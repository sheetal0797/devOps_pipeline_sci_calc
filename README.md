# DevOps-Pipeline-CalSci
Devops Pipeline for Scientific Calculator

create github repo named "DevOps-Pipeline-CalSci"

mkdir DevOpsCalc in local machine which will contain the code.
run below commands in this directory:
git init
git add .
git commit -m "Basic Program for test"
git remote add origin git@github.com:sahilkhatri/DevOps-Pipeline-CalSci.git
git branch -M main
git push -u origin main


create a Jenkinsfile for pipeline and push it to the repository
	- currently the Jenkins file contains stage names and echo statements


create a jenkins pipeline project:
	- for pipeline definition select : Pipeline scripte from SCM
					 : give the github repo link
					 : also specify the branch "main"

Build the project and check if the pipeline is working or not and check for the echo statements


Github Hook Trigger for GITSCM polling
ngrok http 8080

copy the link https://bab3-119-161-98-68.in.ngrok.io


In github go to Settings>Developer Settings>Tokens(classic)>Generate new token
Under Select scopes check the "admin:repo_hook" and generate token
copy the token generated : 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

In Github DevOpos-Pipeline-CalSci goto settings > webhooks > add webhook
In Payload URL give the ngrok forwarding url https://f712-103-156-19-229.in.ngrok.io
In Secret give the token generated earlier
					 
					 
			
Error faced while running mvn -v command
The JAVA_HOME environment variable is not defined correctly. This environment variable is
needed to run this program. NB: JAVA_HOME should point to a JDK not a JRE

echo $JAVA_HOME
/usr/lib/jvm/java-11-openjdk-amd64/bin/java

changed it to
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/

sudo vi ~/.bashrc
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/

mvn -v worked
https://www.baeldung.com/maven-java-home-jdk-jre
https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/
					 

create maven project
class files and test class files
make desired changes in the pom file

mvn compiler:compile	(to compile the project, this will create the target directory)
mvn test		(this will test the unit tests)
mvn clean package	(this will build the jar file of the project)

push the src code and pom file in github

create a maven project in jenkins
use github for scm
give maven home path in the jenkins maven configuration 

su jenkins
sudo usermod -a -G docker jenkins
jenkins restart
sudo systemctl restart jenkins


dockerhub push commands
https://stackoverflow.com/questions/41984399/denied-requested-access-to-the-resource-is-denied-docker


docker plugins for jenkins
https://iot4beginners.com/how-to-push-a-docker-image-to-the-docker-hub-using-jenkins-pipeline-2022-ci-cd/

jenkins credentials for dockerhub
https://www.liatrio.com/blog/building-with-docker-using-jenkins-pipelines

Jenkinsfile docker build, push, remove image
 - create credentials in the jenkins credentials manage for dockerhub and use it in the Jenkinsfile

        stage('Build Docker Images') {
            steps{
                sh "docker build -t ascay/devopsimg ."
            }
        }

        stage('Publish Docker Images') {
            steps{
                withCredentials([usernamePassword(credentialsId: "dockerhub_ascay", passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')])
                {
                        sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
                        sh "docker push ascay/devopsimg"
                }
            }
        }

        stage('Clean Docker Images') {
            steps{
                sh "docker rmi ascay/devopsimg"
                echo 'This is Clean Docker Images stage'
            }
        }

to run the CMD of Dockerfile don't add /bin/bash at the end of run command
https://stackoverflow.com/questions/35270493/dockerfile-cmd-not-running-at-container-start

sudo docker run -it ascay/devopsimg

docker attach container-name


ansible plugin jenkins
https://plugins.jenkins.io/ansible/
set env variable in jenkins if utf-8 error occurs
https://www.linkedin.com/pulse/how-resolve-utf-8-encoding-issue-jenkins-ajuram-salim/



inside ansible use this for auto opening of terminal and running the code:
docker run -it -d --name devopspipelinecalsci ascay/devopsimg && gnome-terminal -- bash -c "docker attach devopspipelinecalsci; exec bash"

sudo gpasswd -a ansible_usr docker
sudoxhost + local:

https://askubuntu.com/questions/1404492/accessibility-bus-error-permission-denied-warning-when-opening-pdf-documents
this is giving permission issues:
great
export NO_AT_BRIDGE=1



					 
