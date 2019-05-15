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
    }
    
}