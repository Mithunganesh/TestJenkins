pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                echo "====++++Building the Project++++===="
                withMaven(
                    // Maven installation declared in the Jenkins "Global Tool Configuration"
                    maven: 'MAVEN_HOME') {
                              // Run the maven build
                              if(isUnix()){
                                  sh 'mvn clean install -Dmaven.test.skip=true'
                              }
                              else{
                                  bat 'mvn clean install -Dmaven.test.skip=true'
                              }
                   }
            }
        }
    }
    
}