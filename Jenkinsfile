pipeline{
agent any
environment{
dockerhub=credentials('dockerhub')}
	stages{
		stage("Gitt pull")
		{
			steps
			{ 
			git url:'https://github.com/sheetal0797/devOps_pipeline_sci_calc.git',branch:'main'
			}
		}
		stage("Maven Build")
		{
			steps
			{ 
			    sh "mvn clean package"
			}
		}
		stage("Build Docker Images")
		{
			steps
			{ sh "docker build -t sheetalagarwal/devops_pipeline_scical_img ."	}
		}
		stage("Publish Docker Images")
		{
			steps
			{ sh "docker logout"
			  sh "echo $dockerhub_PSW | docker login -u $dockerhub_USR --password-stdin"
sh "docker push sheetalagarwal/devops_pipeline_scical_img"	}
		}
		stage("Clean Docker Images")
		{
			steps
			{ sh "docker rmi sheetalagarwal/devops_pipeline_scical_img"	}
		}
		stage("Deploy and Run Images")
		{
			steps
			{ ansiblePlaybook(credentialsId: 'devops_ansible', inventory: 'inventory', playbook:'playbook.yml')}
		}
		stage("Declarative: Post actions")
		{
			steps
			{ echo "Postt Actions Stage"
			}
		}
	}
}

