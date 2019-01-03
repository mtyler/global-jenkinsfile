// Dynamically include a jenkins library
library identifier: 'global-jenkinsfile@master', retriever: modernSCM(
  [$class: 'GitSCMSource',
   remote: 'git://github.com/mtyler/global-jenkinsfile.git'])

// Call groovy method containing shared pipeline.
// Argument should be the name of the cookbook
node {
  //this is a reference to the globalJenkinsfile.groovy
  globalJenkinsfile 'global-jenkinsfile'
}
