def buildNdeploy(branch,app_name,server_name,timestamp,role){
        dir('/home/ubuntu/ops_repo/bluegreen_deploy') {
        stage("Build for green ${role} & app name ${app_name}"){
            try{
               sh "ansible-plpaybook main.yml -e 'host=${server_name} role=${role}'"
            }
            catch(Exception e){
                echo "build failed"
//                stage("Revert back for ${server_name}"){
                 }
                throw e 
              }
            }
               }
               }
         
         
