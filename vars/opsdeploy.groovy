def buildNdeploy(branch,app_name,server_name,timestamp){
        dir('/home/ubuntu/github/tt.devops/ansible_deploy') {
        stage("Build for ${role} & app name ${app_name}"){
            try{}
            catch(Exception e){
                echo "build failed"
                stage("Revert back for ${server_name}"){
                 }
                throw e 
              }
            }
               }
               }
         
         
