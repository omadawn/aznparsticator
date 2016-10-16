# FROM defines a base docker image from which to build a new docker image
FROM frolvlad/alpine-oraclejdk8:slim
#maybe switch to vancepym/alpine-oraclejdk8_unlimited-jce
# OR just build my own adding JCE. Adding JCE is not going to be a big deal in a docker image because it's not a concern that it might not be installed on a target machine.
# ENV defines an environment variable. The following creates the variable $foo with the value "/bar" (inside the quotes.)
#ENV foo /bar
# $foo can now be used later in the Dockerfile such as 
#WORKDIR $foo
# I _BELIEVE_ these variables will be set in the running container as well which fits well with the config as environment variables concept.
# EXPOSE exposes a port from the resulting container to other containers running on the same docker host. This does not make them available on the network or even to the host the container is running on.
EXPOSE 8080
# Volume mounts a filesystem from the host in a docker container.
# I don't think we want to do this here.
VOLUME /tmp
# Adds a file to the docker image. The syntax is ADD <real file name> <new file name within the image>
ADD aznparsticator-0.0.2-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
