def call(){
    sh 'ls'
    sh 'cd target/'
    sh 'curl -X PUT -u admin:Thug@12345 -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://20.235.242.133:8082/artifactory/example-repo-local/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar'
    sh 'ls'
}
