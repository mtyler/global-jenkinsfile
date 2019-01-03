# Global Jenkinsfile example

A demonstration of how to go about having a single Jenkinsfile for multiple repos.

## Prerequisites

- Jenkins 2.2+
- Blue Ocean plugin with git set up

## Explanation

This is only a reference. To use this pattern you would:

1. Create a Jenkins Library that contains your global/master pipeline. It would be a functional version of the [Jenkinsfile](./vars/globalJenkinsfile.groovy) from this repo. That would be this repo without the ./Jenkinsfile

1. Once you have a library, import it through your child Jenkinsfiles. You can see how that is done in this [Jenkinsfile](./Jenkinsfile).

## Notes
For a more in-depth look at how this is used in a cookbook pipeline. You can refer to https://github.com/mtyler/jenkins-cookbook-pipeline and https://github.com/mtyler/chef-infra-base

