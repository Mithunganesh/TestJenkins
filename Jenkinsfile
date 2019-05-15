pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                echo "====++++Building the Project++++===="
                
                              // Run the maven build
                            //   if(isUnix()){
                            //       sh 'mvn clean install -Dmaven.test.skip=true'
                            //   }
                            //   else{
                                  bat 'mvn clean install -Dmaven.test.skip=true'
                            //   }
                   }
            }
        stage('Archiving War'){
            steps{
                archiveArtifacts artifacts: 'target/*.war', onlyIfSuccessful: true
                }
            }
        stage('Copy war to Docker Container'){
            steps{
                 echo "$WORKSPACE"
                }
            }
        }
}
    