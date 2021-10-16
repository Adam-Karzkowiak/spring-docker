# To build docker image
Go to main directory and execute
```
docker build -f Dockerfile -t test:v1 .
```
Check list of images with 
```
docker images
```
define ports and run (we are talking on port 8000 with a container. The container provides us with an application placed inside it on port 8080)
```
docker run -p 8000:8080 [image id - you dont need to provide whole hashcode, just unique begining]
```

# Lets have some fun
First - stop this docker image
```
docker stop [image id]
```
and build test + prod containers:
```
docker build -f Dockerfile_test -t test_env:v1 .
docker build -f Dockerfile_prod -t prod_env:v1 .
```
run it with 
```
docker run -p 7000:8080 [id]
docker run -p 7001:8080 [id]
```
and hit http://localhost:7000/hello and http://localhost:7001/hello