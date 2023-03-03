pipeline{
agent any
	stages{
		stage("Declarative Checkout SCM")
		{
			steps
			{ echo "this is checkout SCM"
			}
		}
		stage("Git pull")
		{
			steps
			{ echo "this is building stage"
			git url:'https://github.com/sheetal0797/devOps_pipeline_sci_calc.git',branch:'main'
			}
		}
		stage("Maven Build")
		{
			steps
			{ 
			    echo "this is build stage"
			sh "chmod u+x prog1.py"
			sh "python3 ./prog1.py"
			}
		}
		stage("Build Docker Images")
		{
			steps
			{ echo "this is test stage"
			sh "chmod u+x test.py"
			sh "python3 ./test.py"
			}
		}
		stage("Publish Docker Images")
		{
			steps
			{ echo "this is test stage"
			sh "chmod u+x test.py"
			sh "python3 ./test.py"
			}
		}
		stage("Clean Docker Images")
		{
			steps
			{ echo "this is test stage"
			sh "chmod u+x test.py"
			sh "python3 ./test.py"
			}
		}
		stage("Deploy and Run Images")
		{
			steps
			{ echo "this is test stage"
			sh "chmod u+x test.py"
			sh "python3 ./test.py"
			}
		}
		stage("Declarative: Post actions")
		{
			steps
			{ echo "this is test stage"
			sh "chmod u+x test.py"
			sh "python3 ./test.py"
			}
		}
	}
}

