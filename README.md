# fj-doc-quarkus-service

Sample rest service to generate docs with Venus Doc Generation Framework

[![Keep a Changelog v1.1.0 badge](https://img.shields.io/badge/changelog-Keep%20a%20Changelog%20v1.1.0-%23E05735)](https://github.com/fugerit-org/fj-doc-quarkus-service/blob/master/CHANGELOG.md)
[![license](https://img.shields.io/badge/License-Apache%20License%202.0-teal.svg)](https://opensource.org/licenses/Apache-2.0)
[![code of conduct](https://img.shields.io/badge/conduct-Contributor%20Covenant-purple.svg)](https://github.com/fugerit-org/fj-universe/blob/main/CODE_OF_CONDUCT.md)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_fj-doc-quarkus-service&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=fugerit-org_fj-doc-quarkus-service)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_fj-doc-quarkus-service&metric=coverage)](https://sonarcloud.io/summary/new_code?id=fugerit-org_fj-doc-quarkus-service)
[![Docker images](https://img.shields.io/badge/dockerhub-images-important.svg?logo=Docker)](https://hub.docker.com/repository/docker/fugeritorg/fj-doc-quarkus-service/general)

[![Java runtime version](https://img.shields.io/badge/run%20on-java%208+-%23113366.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://universe.fugerit.org/src/docs/versions/java8.html)
[![Java build version](https://img.shields.io/badge/build%20on-java%2021+-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://universe.fugerit.org/src/docs/versions/java21.html)
[![Apache Maven](https://img.shields.io/badge/Apache%20Maven-3.9.0+-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://universe.fugerit.org/src/docs/versions/maven3_9.html)

## Project creation script

```shell script
mvn io.quarkus:quarkus-maven-plugin:3.8.1:create \
-DprojectGroupId=org.fugerit.java.service \
-DprojectArtifactId=fj-doc-quarkus-service \
-Dextensions='resteasy-reactive-jackson,arc,config-yaml,smallrye-health,junit5'
```

[Original quarkus project README](README_QUARKUS.md)
