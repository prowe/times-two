node {
    stage('Build') {
        checkout scm
        
        def app = docker.build("prowe/times-two")
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }
    }
}