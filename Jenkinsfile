pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
				bat 'mvn clean install' 
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying to PCF'
				
				pushToCloudFoundry(
    target: 'api.run.pivotal.io',
    organization: 'com.rajan',
    cloudSpace: 'development',
    credentialsId: 'fadb8f49-9599-4967-8f7a-d65fb6ee72d1'
   
)
            }
        } 
    }
}