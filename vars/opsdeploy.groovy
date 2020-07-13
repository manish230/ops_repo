def buildNdeploy(branch,app_name,server_name,timestamp,role){
        dir('/home/ubuntu/ops_repo/bluegreen_deploy') {
        stage("Build for green ${role} & app name ${app_name}"){
            try{
               sh "ansible-playbook main.yml -e 'host=localhost role=${role} timestamp=${timestamp}' -i dynamic-inventory/ec2.py"
            }
            catch(Exception e){
                echo "build failed"
//                stage("Revert back for ${server_name}"){
                 }
                throw e 
              }
            }
               }
               //}
         
         
