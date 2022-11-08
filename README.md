# Employee
1. curl -v localhost:8080/employees/99
2. curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'
3. curl -X PUT localhost:8080/employees/3 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'
4. curl -v localhost:8080/employees/1 | json_pp
5. curl -v localhost:8080/employees | json_pp
6. curl -X DELETE localhost:8080/employees/3 | json_pp

# Employee HEROKU
0. curl -v https://ancient-castle-40172.herokuapp.com/employees | json_pp
1. curl -v https://ancient-castle-40172.herokuapp.com/employees/99
2. curl -X POST https://ancient-castle-40172.herokuapp.com/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'
3. curl -X PUT https://ancient-castle-40172.herokuapp.com/employees/3 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'
4. curl -v https://ancient-castle-40172.herokuapp.com/employees/1 | json_pp
5. curl -X DELETE https://ancient-castle-40172.herokuapp.com/employees/1

# Cross Origin
@CrossOrigin(origins = {"http://localhost:4200", "https://ancient-castle-40172-ui.herokuapp.com"})

# Docker
1. FROM openjdk:8-jdk-alpine
2. ARG JAR_FILE=target/*.jar
3. COPY ${JAR_FILE} app.jar
4. ENTRYPOINT ["java","-jar","/app.jar"]

5. docker build --no-cache -t helloworld:0.0.1 .

6. docker run -p 8080:8080 helloworld:0.0.1

7. docker run -e "SPRING_PROFILES_ACTIVE=local" -p 8080:8080 -t helloworld:0.0.1
8. docker run -e "SPRING_PROFILES_ACTIVE=prod" -p 8080:8080 -t helloworld:0.0.1

9. docker tag helloworld:0.0.1 sonsiamese/helloworld:0.0.1
10. docker push sonsiamese/helloworld:0.0.1

# Koyeb
1. koyeb app init helloworld-app --docker sonsiamese/helloworld:0.0.1 --ports 8080:http --routes /:8080 --docker-private-registry-secret
2. koyeb service redeploy helloworld-app/helloworld-app

# Source command
1. echo "export SENDGRID_API_KEY='your_api_key'" > sendgrid.env
2. echo "sendgrid.env" >> .gitignore
3. source ./sendgrid.env
4. printenv | grep SENDGRID

