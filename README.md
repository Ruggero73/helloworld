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