stage 'Build'
node ('git&&maven') {
  checkout scm
  step([$class: 'StashNotifier'])
  if (env.BRANCH_NAME == 'master') {
    // Set the version number
    sh "mvn -DnewVersion='0.1.0-${BUILD_NUMBER}' versions::set"
  }
  try {
    sh 'mvn clean package'
    currentBuild.result = 'SUCCESS'
  } catch(err) {
    currentBuild.result = 'FAILED'
  }

  step([$class: 'StashNotifier'])
}

// Only continue if we are on the primary branch
if (env.BRANCH_NAME == 'develop') {
   stage 'IntDeploy'
   node ('linux') {
     echo "Deploying to Integration"
   }

   stage 'ProdDeploy'
   node ('linux') {
     echo "Deploying to Production"
   }
}
