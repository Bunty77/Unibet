node('master') {


        stage 'Checkout'
        checkout scm
        
        stage 'Clean'
        sh 'mvn clean'
        
        stage 'Compile'
        sh 'mvn compile'
        
        stage 'Package'
        sh 'mvn  package'
        
        stage 'Install'
        sh 'mvn install'
        
        stage 'Test'
        sh 'mvn test'

		stage 'Archive Artifacts'
        archiveArtifacts artifacts: 'target\\*.jar'

       
              
    }