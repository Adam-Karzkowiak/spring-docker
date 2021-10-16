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