pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                echo "====++++Building the Project++++===="
                bat 'mvn clean install -Dmaven.test.skip=true'
                }
            }
        stage('Archiving War'){
            steps{
                echo "====++++Archiving Results++++===="
                archiveArtifacts artifacts: 'target/*.war', onlyIfSuccessful: true
                }
            }
        stage('Copy war to Docker Container'){
            steps{
                echo "====++++Copying WAR to Container++++===="
                 echo "$WORKSPACE"
                 bat "docker cp $WORKSPACE/target/GetInventory.war getInventoryService:/opt/temp/GetInventory.war"
                }
            }
        stage('Backup and Deploy WAR'){
            steps{
                echo "====++++Backuping and Deploying WAR to Container++++===="
                 bat "docker exec getInventoryService java DeployWar"
                }
            }
        }
}
    